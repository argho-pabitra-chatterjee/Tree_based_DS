import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
The tree consist of two child nodes per parent.[Binary tree]

This code takes as input an integer value 'k' and prints all the nodes which are at a distance of 'k' nodes in the hierarchy
from each of the leaf node of the tree
*/


*/
public class PrintNodeAboveLeafNodes {
	
	private static Set<Integer> answer = new HashSet<>();
	
	public static void main(String[] args) {
		List<Integer> parentNodes = new ArrayList<>();
		BinaryNode root = CreateBinaryTree.get();
		
		traverseNodes(root, 3, parentNodes);
		
		System.out.println(answer);
	}
	
	private static void traverseNodes(BinaryNode node, int i, List<Integer> parentNodes) {
		
		parentNodes.add(node.value);
		
		if(node.left!=null) {
			traverseNodes(node.left, i, parentNodes);
			parentNodes.remove(parentNodes.size()-1);
		} else {
			if(parentNodes.size()>=i) {
				answer.add(parentNodes.get(parentNodes.size()-i));

			}
		}
		
		if(node.right!=null) {
			traverseNodes(node.right,i, parentNodes);
			parentNodes.remove(parentNodes.size()-1);
		} else {
			if(parentNodes.size()>=i) {
				answer.add(parentNodes.get(parentNodes.size()-i));
			}
		}
		
		
	}		
}
