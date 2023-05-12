package dataStructures.trees;

import java.util.*;


public class BinaryTreeTopView {
	
	static class Pair{
		Node node;
		int hd;
		
		Pair(Node node, int hd){
			this.node = node;
			this.hd = hd;
		}
	}
	
    public static void printTopView(Node root) {
        if (root == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<Pair>();
        
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
        	Pair current = queue.remove();
        	int hd = current.hd;
        	Node temp = current.node;
        	
            if (!map.containsKey(hd)) {
                map.put(hd, temp.item);
            }

            if (temp.left != null) {
                queue.add(new Pair(temp.left, hd - 1));
            }

            if (temp.right != null) {
                queue.add(new Pair(temp.right, hd + 1));
            }
        }

//        for (int val : map.values()) {
//            System.out.print(val + " ");
//        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	System.out.print(entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                   \   \
                    4   5
                     \
                      6
        */
    	Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        root.left.right.right = new Node(6);

        System.out.println("Top view of the binary tree:");
        printTopView(root);
    } 
}