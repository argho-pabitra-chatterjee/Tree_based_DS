import java.util.LinkedList;
import java.util.Stack;

/**
 * Computes the largest Breath of the tree
 * @author Argho
 *
 */
public class FindLargestBreath {

	private static LinkedList<BinaryNode> node = new LinkedList<>(); 
	private static Stack<LinkedList<BinaryNode>> stack = new Stack<>();
	
	public static void main(String[] args) {
		
		BinaryNode root = CreateBinaryTree.get();
		traverse(root);
	}

	
	private static void traverse(BinaryNode node) {
		
	}
}
