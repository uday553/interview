package com.uday.interview.arrays;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumNumberOfAllSubArrays {

	public static void peekElementsInSubArray(int arr[], int k)
	{
		if(arr==null || arr.length==0)
			return;
		int i=0;
		Deque<Integer> q = new LinkedList<Integer>();
		for(;i<k;i++)
		{
			while(!q.isEmpty() && arr[i] >=arr[q.peekLast()])
				q.removeLast();
			q.addLast(i);
		}
		for(;i<arr.length;i++)
		{
			System.out.print(arr[q.peek()]+" ");
			while(!q.isEmpty() && q.peek()<(i-k))
			{
				q.removeFirst();
			}
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
			{
				q.removeLast();
			}
			q.addLast(i);
		}
		System.out.print(arr[q.peek()]);
	}
	public static void main(String[] args) {
		int [] arr = {1,3,2,6,8,0,9};
		int[] arr1= {78, 90 ,90, 90, 89};
		int[] arr2 = { 12, 1, 78, 90, 57, 89, 56 };
		int k=3;
		peekElementsInSubArray(arr,k);
	}

}
