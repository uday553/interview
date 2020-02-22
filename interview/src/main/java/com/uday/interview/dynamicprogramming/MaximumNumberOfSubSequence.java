package com.uday.interview.dynamicprogramming;

import java.util.Arrays;

public class MaximumNumberOfSubSequence {

	
	public int[] longestIncreasingSubSequence(int[] arr)
	{
		int length=arr.length;
		if(length==1)
		{
			return arr;
		}
		int longInc[] = new int[arr.length];
		int longIncIndex[] = new int[arr.length];
		for(int i=0;i<length;i++)
		{
			longInc[i]=1;
		}
		for(int i=1;i<length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && longInc[i] <=longInc[j]+1)
				{
					longInc[i] = longInc[j]+1;
					longIncIndex[i] = j;
				}
			}
		}
		
		int maxSize = 0;
		int index=0;
		for(int i=0;i<length;i++)
		{
			if(maxSize<longInc[i])
			{
				maxSize=longInc[i];
				index=i;
			}
		}
		
		int[] result = new int[maxSize];
		result[maxSize-1]=arr[index];
		index=longIncIndex[index];
		for(int i=maxSize-2;i>=0;i--)
		{
			result[i] =  arr[index];
			index=longIncIndex[index];
		}
		
		System.out.println("longest Increasing SubSequence length  :: " +maxSize +"  ->> "+Arrays.toString(result));
		return result;
		
	}
	public static void main (String args[])
	{
		MaximumNumberOfSubSequence mnoss = new  MaximumNumberOfSubSequence();
		
		int arr[]= {0,4,12,2,10,6,9,13,3,11,7,15};
		mnoss.longestIncreasingSubSequence(arr);
	}
}
