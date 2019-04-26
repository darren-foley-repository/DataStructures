package com.darren.foley;

/*import com.darren.foley.Node;*/

public class LinkedList<T> {

	public Node<T> head;
	
	public LinkedList() {
		//Empty Constructor
	}
	
	
	public void add(T item) {
		
		Node<T> new_node = new Node(item);
		// If the linked_list is empty
		if(head == null){
			head = new_node;
		}
		else {
			this.getLastItem().setNext(new_node);
		}
	}
	
	
	public Node<T> getLastItem() {
		Node<T> previous = head;
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
		if(head == null) {
			System.out.println("The list is empty!");
			return;
		}
		Node<T> node = this.getLastItem();
		node = null;
	}
	
	public void remove(int index) {
		// Takes the index value and removes the Node
	}
	
	public void update(int index, T newValue) {
		
	}
	
}
