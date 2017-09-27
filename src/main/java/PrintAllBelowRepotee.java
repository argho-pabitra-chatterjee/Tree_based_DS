import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
The tree consist of more multi child nodes per parent.
It resembles reporting structure of any Organization with CEO at the root and VP,AVP and managers following them.

This code takes as input one Employee and all its direct and indirect repotee
*/

public class PrintAllBelowRepotee {

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
