public class BinaryNode {
	
	int value;
	BinaryNode left = null;
	BinaryNode right = null;
	
	
	BinaryNode(int val) {
		this.value = val;
	}


	public BinaryNode setLeft(int i) {
		return left = new BinaryNode(i);
	}


	public BinaryNode setRight(int i) {
		return right = new BinaryNode(i);		
	}
}
