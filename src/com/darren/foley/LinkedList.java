package com.darren.foley;

/*import com.darren.foley.Node;*/

public class LinkedList<T> {

	public Node<T> head;
	
	public LinkedList() {
		//Empty Constructor
	}
	
	public LinkedList(T[] array) {
		Node<T> headNode;
		Node<T> previous;
		Node<T> current;
		for(int i=0; i< array.length; i++) {
			if(i==0) {
				headNode = new Node(array[i]);
				previous = headNode;
				continue;
			}
			
		}
	}
	
	
	public void add(T item) {
		// Add to the end of the list
		Node<T> new_node = new Node(item);
		// If the linked_list is empty
		if(head == null){
			head = new_node;
		}
		else {
			this.getLastItem().setNext(new_node);
		}
	}
	
	
	public void add(T item, int index) {
		//add item to specific index location
	}
	
	public Node<T> getLastItem() {
		Node<T> previous = head;
		if(previous == null) {
			System.out.println("No items in the list!");
			return null;
		}
		Node<T> current = head.getNext();
		if(current == null){
			return head;
		}
		while(true) {
			if(current.getNext() == null) {
				return current;
			}
			previous = current;
			current = current.getNext();
		}
	}
	
	// Not finished
	public Node<T> getItem(int index){
		int counter = 0;
		Node<T> previous = head;
		Node<T> current = head.getNext();
		return previous;	
	}
	
	
	public void print() {
		Node<T> previous = head;
		Node<T> current = head.getNext();
		if(current == null) {
			System.out.println(head.getData());
			return;
		}
		else {
			System.out.println(head.getData());
		}
		
		while(true) {
			System.out.println(current.getData());
			
			previous = current;
			current = current.getNext();
			
			if(current == null) {
				return;
			}
		}
	}
	
	
	public void remove() {
		// With no argument it will remove the last Node in the list
		// Get second last item in list and point to null
		Node<T> previous = head;
		
		if(previous == null) {
			System.out.println("The list is empty!");
			return;
		}
		// Delete list with only one node
		Node<T> current = head.getNext();
		
		if(current == null){
			this.head = null;
			return;
		}
		
		while(true) {
			if(current.getNext() == null) {
				previous.setNext(null);
				return;
			}
			previous = current;
			current = current.getNext();
		}
	}
	
	
	public void remove(int index) {
		// Takes the index value and removes the Node
		
	}
	
	
	public void update(int index, T newValue) {
		
	}
	
}
