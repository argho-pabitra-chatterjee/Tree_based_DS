
public class CreateBinaryTree {

	/*
							   10   <--- root
	              5                                    90                            <--- Level 1
	   1                8                   4                   85                 <--- Level 2
14	     3    15      18         1                33        58            <--- Level 3
                                                       44        67         <--- Level 4
                                                                72           <--- Level 5
*/
public static BinaryNode get(){            
		BinaryNode root = new BinaryNode(10);
		
		// setting left tree
		root.setLeft(5).setLeft(1).setLeft(14);
		root.left.left.setRight(3);
		root.left.setRight(8).setLeft(15);
		root.left.right.setRight(18);
		
		//setting right tree
		root.setRight(90).setLeft(4).setLeft(1);
		root.right.setRight(85).setLeft(33).setLeft(44);
		root.right.right.setRight(58).setRight(67).setLeft(72);
		
		return root;
	}
	
}
