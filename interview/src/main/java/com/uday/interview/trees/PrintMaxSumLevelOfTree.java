package com.uday.interview.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintMaxSumLevelOfTree {

	public int getMaxSumLevel(Node root)
	{
		if (root==null)
			return -1;
		else {
			List<Node> nodeList = new ArrayList<Node>();
			if(root.left!=null)
			{
				nodeList.add(root.left);
			}
			if(root.right!=null)
			{
				nodeList.add(root.right);
			}
			return getMaxSumLevel(nodeList,0,root.value,0);
		}
	}
	
	public int getMaxSumLevel(List<Node> nodeList, int level, int maxSum,int maxSumLevel)
	{
		
		if(nodeList==null || nodeList.size()==0)
		{
			return maxSumLevel;
		}else {
			level++;
			Iterator<Node> it = nodeList.iterator();
			int currentLevelSum=0;
			List<Node> nextNodeList = new ArrayList<Node>();
			
			while (it.hasNext()) {
				Node n = it.next();
				currentLevelSum = currentLevelSum+n.value;
				if(n.left!=null)
				{
					nextNodeList.add(n.left);
				}
				if(n.right!=null)
				{
					nextNodeList.add(n.right);
				}
			}
			
			if(currentLevelSum>maxSum)
			{
				maxSum=currentLevelSum;
				maxSumLevel=level;
			}
			return getMaxSumLevel(nextNodeList,level,maxSum,maxSumLevel);
			
		}
	}
}
