package com.uday.interview.arrays;

import java.util.Arrays;

public class SubArraySort {

	public static void main(String args[])
	{
		int a[] = {1,2,4,7,10,11,7,12,6,7,16,18,19};
		System.out.println(Arrays.toString(subArraySort(a)));
	}
	public static int[] subArraySort(int[] a)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

		for(int i=1;i<a.length-1;i++)
		{
			if(isOutOfOrder(i,a))
			{
				min = Math.min(min, a[i]);
				max = Math.max(max, a[i]);
			}
		}
		if(min==Integer.MAX_VALUE)
			return new int[] {-1,-1};

		int minIndex=0;
		int maxIndex=a.length-1;

		while(min>a[minIndex])
		{
			minIndex++;
		}
		while(max<a[maxIndex])
		{
			maxIndex--;
		}

		return new int[] {minIndex,maxIndex};
	}
	public static boolean isOutOfOrder(int i,int[] a)
	{
		if(i==0) {
			return a[i+1]<a[0];
		}
		if(i==a.length-1) {
			return a[i-1]>a[a.length-1];
		} 
		return a[i]>a[i+1] || a[i]<a[i-1];
	}


}
