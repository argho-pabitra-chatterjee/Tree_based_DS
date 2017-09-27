import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintAboveManagerStack {
	
	private static Stack<NodeStr> stack = new Stack<NodeStr>();
	
	private static List<String> aboveManagerLst = new ArrayList<String>();
	
	public static void main(String[] arg) {
		NodeStr root = CreateMultiChildNodeTree.get();

		findAboveManagers(root, "CEO");
		
		System.out.println(aboveManagerLst);
	}

	private static void findAboveManagers(NodeStr ceoNode, String nm) {
		traverse(ceoNode,nm);
	}

	private static int traverse(NodeStr empNode, String nm) {
		
		if(empNode.name.equals(nm)) {
			return 1;
		}
		
		
		if(!empNode.hasRepotee()) {
			return 0;
		}
		
		stack.addAll(empNode.reportingNamesMap.values());
		
		for(int i=0; i<empNode.reportingNamesMap.size(); i++) {
			int found = traverse(stack.pop(), nm);
			if(found==1) {
				aboveManagerLst.add(empNode.name);
				return 1;
			}
		}
		
		return 0;
		
		
	}
}
