package dataStructures.trees;

public class PerfectBinaryTree {
	
	static int depth(Node node) {
		int d = 0;
		while(node != null) {
			d++;
			node = node.left;
		}
		return d;
	}
	
	static boolean isPerfect(Node root, int d, int level) {
		if(root == null) {
			return true;
		}
		
		if(root.left == null && root.right == null) {
			return (d == level + 1);
		}
		
		if(root.left == null || root.right == null) {
			return false;
		}
		
		return isPerfect(root.left, d, level+1) && isPerfect(root.right, d, level+1);
		
	}
	
	static boolean isPerfect(Node root) {
		int d = depth(root);
		return isPerfect(root, d, 0);
	}
	
	static Node newNode(int k) {
		Node node = new Node(k);
		return node;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(12);
		root.right = new Node(9);
		root.left.left = new Node(5);
		root.left.right = new Node(6);
		
		System.out.println(isPerfect(root));
		
	}

}
