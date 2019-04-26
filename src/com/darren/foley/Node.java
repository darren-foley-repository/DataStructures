package com.darren.foley;

public class Node<T> {
	
	public T data;
	public Node<T> next;
	
	public Node(T dataField) {
		this.data = dataField;
		this.next = null;
	}
	
	public Node(T dataField, Node<T> nextNode){
		this.next = nextNode;
		this.data = dataField;
	}
	
	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> nextNode) {
		this.next = nextNode;
	}
}
