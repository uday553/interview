package com.uday.interview.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	TreeNode root = null;

	public void add(int value)
	{
		if(root==null)
		{
			root = new TreeNode(value);
			return;
		}

		TreeNode current = root;
		while(true)
		{
			if(current.value>value)
			{
				if(current.left==null)
				{
					current.left= new TreeNode(value);
					break;
				}
				else {
					current=current.left;
				}
			}
			if(current.value<=value)
			{
				if(current.right==null)
				{
					current.right= new TreeNode(value);
					break;
				}
				else {
					current=current.right;
				}
			}
		}
	}
	public void printTreeDFS()
	{
		if(root==null )
		{
			System.out.println("Empty Tree");
			return;
		}
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(current!=null)
		{
			if(current.left!=null)
			{
				stack.push(current.left);
			}
			if(current.right!=null)
			{
				stack.push(current.right);
			}
			System.out.println("-> "+current.value);
			if(stack.isEmpty())
				break;
			current=stack.pop();
		}
	}
	public void printTreeBFS()
	{
		if(root==null )
		{
			System.out.println("Empty Tree");
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode current = root;
		while(current!=null)
		{
			if(current.left!=null)
			{
				queue.add(current.left);
			}
			if(current.right!=null)
			{
				queue.add(current.right);
			}
			System.out.println("-> "+current.value);
			current=queue.poll();
		}
	}
	public void printTreeInOrder()
	{
		printTreeInOrder(root);
	}
	public void printTreePreOrder()
	{
		printTreePreOrder(root);
	}
	public void printTreePostOrder()
	{
		printTreePostOrder(root);
	}
	public void printTreePostOrder(TreeNode current)
	{
		if(current!=null)
		{
			if(current.left!=null)
			{
				printTreePostOrder(current.left);
			}
			if(current.right!=null)
			{
				printTreePostOrder(current.right);
			}
			System.out.println("-> "+current.value);
		}
	}
	public void printTreeInOrder(TreeNode current)
	{
		if(current!=null)
		{
			if(current.left!=null)
			{
				printTreeInOrder(current.left);
			}
			System.out.println("-> "+current.value);
			if(current.right!=null)
			{
				printTreeInOrder(current.right);
			}
		}
	}
	public void printTreePreOrder(TreeNode current)
	{
		if(current!=null)
		{
			System.out.println("-> "+current.value);
			if(current.left!=null)
			{
				printTreeInOrder(current.left);
			}
			if(current.right!=null)
			{
				printTreeInOrder(current.right);
			}
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("----");
		BinaryTree bt = new  BinaryTree();
		bt.add(3);
		bt.add(4);
		bt.add(6);
		bt.add(2);
		bt.add(9);
		bt.add(5);
		bt.add(0);
		bt.add(-2);
		System.out.println(bt.root);
		System.out.println("--BFS--");
		bt.printTreeBFS();
		System.out.println("--DFS--");
		bt.printTreeDFS();
		System.out.println("--Inorder--");
		bt.printTreeInOrder();
		System.out.println("--PostOrder--");
		bt.printTreePostOrder();
		System.out.println("--PreOrder--");
		bt.printTreePreOrder();
		System.out.println("PrintBoundariesOfTree");
		PrintBoundariesOfTree pbt = new PrintBoundariesOfTree();
		pbt.printBoundaries(bt.root);
		
		BinaryTree bt1 = new  BinaryTree();
		bt1.root=new TreeNode(5);
		bt1.root.left=new TreeNode(1);
		bt1.root.right=new TreeNode(1);
		bt1.root.left.left=new TreeNode(1);
		bt1.root.left.right=new TreeNode(1);
		bt1.root.right.left=new TreeNode(1);
		bt1.root.right.right=new TreeNode(1);
		bt1.root.left.left.left=new TreeNode(1);
		bt1.root.left.left.right=new TreeNode(1);
		bt1.root.left.right.left=new TreeNode(1);
		bt1.root.left.right.right=new TreeNode(1);
		bt1.root.right.left.left=new TreeNode(1);
		bt1.root.right.left.right=new TreeNode(1);
		bt1.root.right.right.left=new TreeNode(1);
		bt1.root.right.right.right=new TreeNode(1);
		
		
		PrintMaxSumLevelOfTree pmsl = new PrintMaxSumLevelOfTree();
		System.out.println("maxSum Level : "+pmsl.getMaxSumLevel(bt1.root));
	}
}
