package dataStructures.trees;

public class BalancedBinaryTree {

	Node root;

	public BalancedBinaryTree() {
		root = null;
	}

	void postOrder(Node node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);

		System.out.print(node.item + " ");
	}

	void preOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.item + " ");

		preOrder(node.left);
		preOrder(node.right);

	}

	void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);

		System.out.print(node.item + " ");

		inOrder(node.right);

	}

	public static void main(String[] args) {

		BalancedBinaryTree tree = new BalancedBinaryTree();

		tree.root = new Node(1);

		tree.root.left = new Node(2);

		tree.root.right = new Node(3);

		tree.root.left.left = new Node(4);

		tree.root.left.right = new Node(5);

		System.out.print("Inorder traversal  -> ");

		tree.inOrder(tree.root);

		System.out.println();

		System.out.print("Preorder traversal  -> ");

		tree.preOrder(tree.root);

		System.out.println();

		System.out.print("Postorder traversal  -> ");

		tree.postOrder(tree.root);

		System.out.println();

	}

}