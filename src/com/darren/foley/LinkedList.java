package com.darren.foley;


public class LinkedList<T> {

	private Node<T> head;
	private int total_counter;
	
	public LinkedList() {
		//Empty Constructor
	}
	
	public LinkedList(T[] array) {
		Node<T> current = null;
		for(int i=0; i < array.length; i++) {
			if(i==0) {
				this.head = new Node<T>(array[i]);
				current = this.head;
				this.incrementTotalCounter();
				continue;
			}
			Node<T> new_node = new Node<T>(array[i]);
			current.setNext(new_node);
			current = new_node;
			this.incrementTotalCounter();
		}
	}
	
	private int getTotalCounter() {
		return this.total_counter;
	}
	
	private void incrementTotalCounter() {
		this.total_counter++;
	}
	
	private void decrementTotalCounter() {
		this.total_counter--;
	}
	
	public int size() {
		return this.getTotalCounter();
	}
	
	public String toString() {
		String result = "";
		
		if(this.head!=null) {
			Node<T> current = this.head.getNext();
			while(current != null) {
				result += "("+ current.getData().toString() + "), ";
				current = current.getNext();
			}
		}
		return result;
	}
	
	
	public void add(T item) {
		// Add to the end of the list
		Node<T> new_node = new Node<T>(item);
		
		if(this.head == null){
			this.head = new_node;
		}
		else {
			this.getLastItem().setNext(new_node);
		}
		this.incrementTotalCounter();
	}
	
	
	public boolean add(T item, int index) {
		//add item to specific index location
		// Takes the index value and removes the Node
		//Index out of Range
		if(index < 0 || index > this.size()) {
			return false;
		}
		
		Node<T> current = this.head;
		
		if(current==null) {
			this.add(item);
			return true;
		}
		
		else if(current != null) {
			Node<T> new_node = new Node<T>(item);
			for(int i = 0; i < this.size(); i++) {
				if(i == 0 && i == index) {
					new_node.setNext(current);
					current.setNext(null);
					this.incrementTotalCounter();
					return true;
				}
				else if (i == index-1) {
					new_node.setNext(current.getNext());
					current.setNext(new_node);
					this.incrementTotalCounter();
					return true;
				}
				current = current.getNext();
			}
		}
		return false;
	}
	
	
	public Node<T> getLastItem() {
		Node<T> current = this.head;
		if(current == null) {
			return null;
		}
		
		if(current != null) {
			while(current.getNext() != null) {
				current = current.getNext();
			}
		}
		return current;
	}
	
	
	public Node<T> get(int index){
		
		//Index out of Range
		if(index < 0 || index > this.size()) {
			return null;
		}
		
		Node<T> current = this.head;
		
		if(current != null) {
			for(int i = 0; i < this.size(); i++) {
				if(i == index) {
					return current;
				}
				current = current.getNext();
			}
		}
		return current;
	}
	
	
	public void print() {
		Node<T> current = this.head;
		if(current == null) {
			System.out.println("Empty Linked-List");
		}
		
		else if(current != null) {
			while(true) {
				System.out.println(current.getData());
				current = current.getNext();
				if(current == null) {
					break;
				}
			}
			
		}
	}
	
	
	public boolean remove() {
		// With no argument it will remove the last Node in the list
		// Get second last item in list and point to null
		Node<T> current = this.head;
		
		if(current == null) {
			System.out.println("The list is empty!");
			return false;
		}
		
		else if(current != null) {
			while(current.getNext() != null) {
				if(current.getNext().getNext() == null) {
					current.setNext(null);
					this.decrementTotalCounter();
					return true;
				}
				current = current.getNext();
			}
		}
		current = null;
		this.decrementTotalCounter();
		return true;
	}
	
	
	public boolean remove(int index) {
		// Takes the index value and removes the Node
		Node<T> previous = null;
		Node<T> current = this.head;
		
		// If index out of range (Can't remove head node)
		if(index < 0 || index > this.size()) {
			return false;
		}
		
		if(current==null) {
			// No nodes to remove
			return false;
		}
		
		else if(current != null) {
			for(int i=0; i < this.size(); i++) {
				if(i == index && i == 0) {
					current = null;
					this.decrementTotalCounter();
					return true;
				}
				else if(i == index) {
					previous.setNext(current.getNext());
					current.setNext(null);
					this.decrementTotalCounter();
					return true;
				}
				previous = current;
				current = current.getNext();
			}
		}
		return false;
	}
}
