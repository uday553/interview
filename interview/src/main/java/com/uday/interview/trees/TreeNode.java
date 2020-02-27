package com.uday.interview.trees;

public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	TreeNode(int value)
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
