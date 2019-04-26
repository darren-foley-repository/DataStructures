package com.darren.foley;

/*import com.darren.foley.Node;*/

public class LinkedList<T> {

	public Node<T> head;
	
	
	public LinkedList() {
		//Empty Constructor
		System.out.println("Empty Linked list");
	}
	
	
	public LinkedList(T[] array) {
		Node<T> previous = null;
		Node<T> current;
		for(int i=0; i < array.length; i++) {
			if(i==0) {
				this.head = new Node(array[i]);
				previous = this.head;
				continue;
			}
			current = new Node(array[i]);
			previous.setNext(current);
			previous = current;
		}
	}
	
	
	public void add(T item) {
		// Add to the end of the list
		Node<T> new_node = new Node(item);
		// If the linked_list is empty
		if(this.head == null){
			this.head = new_node;
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
	
	
	public Node<T> get(int index){
		int counter = 0;
		Node<T> previous = head;
		if(head == null) {
			System.out.println("Empty List");
			return null;
		}
		Node<T> current = head.getNext();
		
		if(index==0) {
			return head;
		}
		
		while(index != counter) {
			counter+=1;
			if(index == counter) {
				return current;
			}
			previous = current;
			current = current.getNext();
		}
		System.out.println("Error, Something went wrong!");
		return null;
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
		int counter = 0;
		Node<T> previous = head;
		
		if(this.head==null) {
			System.out.println("No nodes to remove");
			return;
		}
		
		if(index == counter) {
			this.head = null;
		}
		
		Node<T> current = head.getNext();
		
		while(index != counter) {
			counter+=1;
			if(index == counter) {
				Node<T> next_value = current.getNext();
				previous.setNext(next_value);
				current.setNext(null);
				return;
			}
			previous = current;
			current = current.getNext();
		}
		return;
	}
}
