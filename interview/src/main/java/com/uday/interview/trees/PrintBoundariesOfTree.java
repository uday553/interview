package com.uday.interview.trees;

public class PrintBoundariesOfTree {
	
	public static void printBoundaries(Node n)
	{
		if(n==null)
			return;
		System.out.println(n.value);
		printLeftBoundariesOfTree(n.left);
		printLeavesOfTree(n.left);
		printLeavesOfTree(n.right);
		printRightBoundariesOfTree(n.right);
	}
	public static void printLeftBoundariesOfTree(Node n)
	{
		if(n==null)
			return;
		
		if(n.left!=null)
		{
			System.out.println(n.value);
			printLeftBoundariesOfTree(n.left);
		}
		else
			if(n.right!=null) {
				System.out.println(n.value);
				printLeftBoundariesOfTree(n.right);
			}
	}
	public static void printRightBoundariesOfTree(Node n)
	{
		if(n==null)
			return;
		
		if(n.right!=null) {
			printRightBoundariesOfTree(n.right);
			System.out.println(n.value);
		}
		else
			if(n.left!=null) {
				printRightBoundariesOfTree(n.left);
				System.out.println(n.value);
			}
	}
	public static void printLeavesOfTree(Node n)
	{
		if(n==null)
			return;
		if(n.left==null && n.right==null)
			System.out.println(n.value);
		printLeavesOfTree(n.left);
		printLeavesOfTree(n.right);
	}

}
