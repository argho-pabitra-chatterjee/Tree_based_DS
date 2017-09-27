import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
The tree consist of more multi child nodes per parent.
It resembles reporting structure of any Organization with CEO at the root and VP,AVP and managers following them.

This code takes as input one Employee and prints all Collegues of the Employee at same level
*/
public class PrintAllCollegues {

	
private static Stack<NodeStr> stack = new Stack<NodeStr>();
		
	public static void main(String[] arg) {
		NodeStr root = CreateMultiChildNodeTree.get();

		equalCollegues(root, "VP3");
	}

	private static void equalCollegues(NodeStr ceoNode, String nm) {
		traverse(ceoNode, null, nm);
	}

	private static int traverse(NodeStr empNode, NodeStr managerNode, String nm) {
		
		if(empNode.name.equals(nm)) {
			if(managerNode!=null) {
				System.out.println(managerNode.reportingNamesMap.values());				
			}
			return 1;
		}
		
		if(empNode.hasRepotee()) {
			stack.addAll(empNode.reportingNamesMap.values());
			for(int i=0; i<empNode.reportingNamesMap.size(); i++) {
				int found = traverse(stack.pop(), empNode, nm);
			
				if(found==1) {
					return 1;
				}
			}
		}
		
		return 0;
	}
	
}
