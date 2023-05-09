package dataStructures.stack;

public class StackClass {
	
	private int arr[];
	private int top;
	private int capacity;
	
	// Create a stack
	StackClass(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	// Add the value to stack
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack is Overflown, programming is terminated");
			System.exit(1);
		}
		System.out.println("Inserting " + x);
		arr[++top] = x;
	}
	
	public boolean isFull() {
		return top == capacity-1;
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, programming is terminated");
			System.exit(1);
		}
		return arr[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public void printStack() {
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		StackClass st = new StackClass(5);
		st.push(7);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		st.printStack();
	}

}
