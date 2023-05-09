package dataStructures.trees;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	// POSTORDER
	void postOrder(Node node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.item + "-->");
	}
	
	//INORDER
	void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.item + "-->");
		inOrder(node.right);
	}
	
	// PREORDER
	void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.item + "-->");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
		
		System.out.println("\nInOrder :: ");
		tree.inOrder(tree.root);
		
		System.out.println("\nPostOrder :: ");
		tree.postOrder(tree.root);
		
		System.out.println("\nPreOrder :: ");
		tree.preOrder(tree.root);
		
	}

}
