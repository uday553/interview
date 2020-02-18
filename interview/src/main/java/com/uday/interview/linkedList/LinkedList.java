package com.uday.interview.linkedList;

public class LinkedList<T> {
	Node<T> head=null;

	LinkedList()
	{
	}

	public void add(T value)
	{
		Node<T> newNode = new Node<T>(value);
		newNode.next=this.head;
		this.head=newNode;
	}

	public void remove(T value)
	{
		if(this.head.value==value)
		{
			this.head=this.head.next;
			return;
		}
		Node<T> currentNode = this.head.next;
		Node<T> previousNode = this.head;
		while(currentNode!=null)
		{
			if(currentNode.value==value)
			{
				previousNode.next=currentNode.next;
				break;
			}
			previousNode=currentNode;
			currentNode=currentNode.next;
		}
	}

	public void printList()
	{
		if(this.head!=null)
		{
			Node<T> current = this.head; 
			while(current!=null)
			{
				System.out.print(" -> "+current.value);
				current=current.next;
			}
			System.out.println();
		}
	}

	public void reverseList()
	{
		if(this.head==null || this.head.next==null)
		{
			return ;	
		}
		Node<T> n1=null;
		Node<T> n2=head;
		while(n2!=null)
		{
			Node<T> n3 = n2.next;
			n2.next=n1;
			n1=n2;
			n2=n3;
		}
		this.head=n1;
	}
	public static void main(String args[])
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(5);
		ll.add(7);
		ll.add(10);
		ll.add(8);
		ll.add(3);
		ll.add(7);
		ll.printList();
		ll.remove(3);
		ll.printList();
		ll.remove(7);
		ll.printList();
		ll.reverseList();
		ll.printList();
	}
}
