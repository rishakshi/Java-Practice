package dataStructures.trees;

public class FullBinaryTree {
	
	Node root;
	
	boolean ifFullBinary(Node node) {
		if(node == null) {
			return true;
		}
		
		if(node.left == null && node.right == null) {
			return true;
		}
		
		if(node.left != null && node.right != null) {
			return (ifFullBinary(node.left) && ifFullBinary(node.right));
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		FullBinaryTree tree = new FullBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
		
		System.out.println(tree.ifFullBinary(tree.root));
		
	}

}
