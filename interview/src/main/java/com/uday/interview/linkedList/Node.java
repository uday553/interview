package com.uday.interview.linkedList;

public class Node<T> {

	T value;
	Node<T> next;
	
	Node(T value)
	{
		this.value=value;
		this.next=null;
	}
	Node()
	{
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
