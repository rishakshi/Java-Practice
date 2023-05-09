package dataStructures.trees;

public class CompleteBinaryTree {
	
	Node root;
	
	int countNumOfNodes(Node root) {
		if(root == null) return 0;
		return (1 + countNumOfNodes(root.left) + countNumOfNodes(root.right));
	}
	
	boolean checkComplete(Node root, int index, int numberOfNod) {
		if(root == null) return true;
		if(index >= numberOfNod) return false;
		
		return checkComplete(root.left, 2*index+1, numberOfNod) && checkComplete(root.right, 2*index+2, numberOfNod);
	}
	
	public static void main(String[] args) {
		CompleteBinaryTree tree = new CompleteBinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		System.out.println(tree.checkComplete(tree.root, 0, tree.countNumOfNodes(tree.root)));
	}

}
