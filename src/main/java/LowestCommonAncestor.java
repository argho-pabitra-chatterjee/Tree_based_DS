import java.util.ArrayList;
import java.util.List;

/*
The tree consist of two child nodes per parent.[Binary tree]

This code takes as input two Node values and prints the lowest common ancestor of the nodes.
*/

public class LowestCommonAncestor {

private static List<Integer> path1; 
private static List<Integer> path2; 

	public static void main(String[] args) {
		
		List<Integer> currPath = new ArrayList<>();
		
		BinaryNode root = CreateBinaryTree.get();
		
		traverseNodes(root, 72,44, currPath);
		
		System.out.println(path1);
		System.out.println(path2);

		for(int i = 0; i < (path1.size() > path2.size() ? path1.size() : path2.size()); i++) {
			
			if(i < path1.size() && i < path2.size() && (path2.get(i)-path1.get(i))!=0) {
				System.out.println(path1.get(i-1));
				break;
			}
			
			if(path1.size() == (i+1)) {
				System.out.println(path1.get(i)); 
				break;
			}
			
			if(path2.size() == (i+1)) {
				System.out.println(path2.get(i)); 
				break;
			}
			
		}
		
	}

	private static int traverseNodes(BinaryNode node, int i, int j, List<Integer> currPath) {
		currPath.add(node.value);
		
		if(node.value == i) {
			path1 = new ArrayList<Integer>(currPath);
			if(path2!=null) {
				return 1;
			}
		}
		
		if(node.value == j) {
			path2 = new ArrayList<Integer>(currPath);
			if(path1!=null) {
				return 1;
			}
		}
		
		if(node.left!=null) {
			int done = traverseNodes(node.left, i, j, currPath);
			currPath.remove(currPath.size()-1);
			if(done==1) {
				return 1;
			}
		}
		
		if(node.right!=null) {
			int done = traverseNodes(node.right, i, j, currPath);
			currPath.remove(currPath.size()-1);
			if(done==1) {
				return 1;
			}
		}
		
		return 0;
	}
	
}
