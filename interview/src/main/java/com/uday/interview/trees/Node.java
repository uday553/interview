package com.uday.interview.trees;

public class Node {
	int value;
	Node left;
	Node right;
	Node(int value)
	{
		this.value=value;
		left=null;
		right=null;
	}
	@Override
    public String toString() { 
        return String.valueOf(value) +" left "+((left==null)?"null":left.toString() +" right "+((right==null)?"null":right.toString())); 
    } 
}
