package dataStructures.linkedList;

public class LinkedListClass {
	
	Node head = null;
	
	static class Node{
		int value;
		Node next;
		
		public Node(int n) {
			value = n;
			next = null;
		}
		
	}
	
	// insert at end
	public void insertAtEnd(int element) {
		if(head == null) {
			head = new Node(element);
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(element);
		}
	}
	
	// insert at beginning
	public void insertAtBeg(int element) {
		if(head == null) {
			head = new Node(element);
		}
		else {
			Node newNode = new Node(element);
			newNode.next = head;
			head = newNode;
		}
	}
	
	// insert at middle
	public void insertAtPos(int element, int pos) {
		if(head == null) {
			head = new Node(element);
		}
		else {
			Node newNode = new Node(element);
			int count = 0;
			if(pos == 1) {
				insertAtBeg(element);
			}
			else {
				Node temp = head;
				while(temp != null) {
					count++;
					if(count == pos-1) {
						newNode.next = temp.next;
						temp.next = newNode;
						break;
					}
					temp = temp.next;
				}
			}
		}
	}
	
	// delete from end
	public void deleteFromEnd() {
		if(head == null) {
			System.out.println("Head is empty");
		}
		else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	// delete from beginning
	public void deleteFromBeg() {
		if(head == null) {
			System.out.println("Head is empty");
		}
		else {
			head = head.next;
		}
	}
	
	// delete from middle
	public void deleteFromPos(int pos) {
		if(head == null) {
			System.out.println("Head is empty");
		}
		else {
			int count = 0;
			if(pos == 1) {
				deleteFromBeg();
			}
			else {
				Node temp = head;
				while(temp != null) {
					count++;
					if(count == pos-1) {
						temp.next = temp.next.next;
						break;
					}
					temp = temp.next;
				}
			}
		}
	}
	
	// print linked list
	public void print() {
		while(head != null) {
			System.out.println(head.value + " ");
			head = head.next;
		}
	}
	
	// search node by key
	public void sort() {
		Node curr = head;
		Node index = null;
		int temp;
		
		if(head == null) {
			return;
		}
		else {
			while(curr != null) {
				index = curr.next;
				while(index != null) {
					if(curr.value > index.value) {
						curr.value = index.value;
						temp = curr.value;
						index.value = temp;
					}
					index = index.next;
				}
				curr = curr.next;
			}
		}
		
	}
	
	// sort the linked list
	public void searchin(int key) {
		Node temp = head;
		while(temp != null) {
			if(temp.value == key) {
				System.out.println("Present");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Not present");
	}
	
	public static void main(String[] args) {
		LinkedListClass ll = new LinkedListClass();
		
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		ll.head.next = second;
		second.next = third;
		
		ll.insertAtEnd(7);
		ll.insertAtEnd(9);
		ll.insertAtEnd(10);
		ll.insertAtEnd(11);
		ll.insertAtBeg(8);
		ll.insertAtPos(6, 2);
		ll.deleteFromEnd();
		ll.deleteFromBeg();
		ll.deleteFromPos(2);
		ll.searchin(2);
		ll.sort();
		
		ll.print();
	}

}
