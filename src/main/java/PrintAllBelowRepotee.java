import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintAllBelowRepotee {

	/*
	 * inorder traversal
	 */
	public static void main(String[] arg) {
		NodeStr root = CreateMultiChildNodeTree.get();

		findbelowRepotee(root, "AVP23");
		
		System.out.println(repoteeNamesLst);
	}

	private static void findbelowRepotee(NodeStr root, String nm) {
		traverse(root,nm, false);
	}

	
	private static List<String> repoteeNamesLst = new ArrayList<String>();
	
	private static Stack<NodeStr> STACK = new Stack<>();
	private static void traverse(NodeStr repotee, String nm, boolean print) {
		
		if(print) {
			repoteeNamesLst.add(repotee.name);
		}
		
		if(!repotee.hasRepotee()) {
			return;
		}
		
		STACK.addAll(repotee.reportingNamesMap.values());
		if(repotee.name.equals(nm)) {
			print = true;
		} 
		
		int noOfRepotee= 0;
		while(true) {
			traverse(STACK.pop(), nm, print);
			noOfRepotee++;
			if(noOfRepotee == repotee.reportingNamesMap.size()) {
				break;
			}
		}
		
		if(repotee.name.equals(nm)) {
			print = false;
		}
		
		
	}

}
