package com.uday.interview.dynamicprogramming;

public class MaximumNumbuerOfJumps {
	
	public static int getMaximumNumberOfJumpsToReachEndOfArray(int a[])
	{
		int jumps=0;
		if(a.length==0)
		{
			return jumps;
		}
		
			int steps= a[0];
			int maxReach = a[0];
			for (int i=1;i<a.length-1;i++)
			{
				maxReach = Math.max(maxReach, a[i]+i);
				steps--;
				if(steps==0)
				{
					jumps++;
					steps=maxReach-i;
				}
			}
		
		return jumps+1;
	}
	
	public static void main(String args[])
	{
		int a[]  = {3,4,2,1,2,3,7,1,1,1,3};
		System.out.println(getMaximumNumberOfJumpsToReachEndOfArray(a));
	}
}
