package collections;

import java.util.Stack;

public class ListStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> obj = new Stack<>();
		
		obj.push(null);
		obj.push(13);
		obj.push(11);
		obj.push(12);
		obj.push(14);
		obj.push(15);
		obj.push(16);
		obj.push(null);
		
		System.out.println(obj);
		System.out.println(obj.peek());
		
		System.out.println(obj.isEmpty());
//		
		int popped = obj.pop();
		System.out.println(obj.pop());     
		System.out.println(obj.search(12));
		
		
	}

}
