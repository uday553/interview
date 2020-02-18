package com.uday.interview.arrays;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

/*
 * Date 30/01/2020
 * @author Udayaram
 * Given an array of numbers, each value points to maximum jump it can make from that position,
 * find minimum number of jumps to reach end of array.
 */
public class MinimumNumberOfJumpsToReachEndOfArray {

	
	public int getMinimumNoOfJumpsToReachEOA(int[] arr)
	{
		if(arr.length<1)
			return 0;
		int[] res = new int[arr.length];
		Arrays.fill(res, Integer.MAX_VALUE);
		for(int i=0;i<arr.length;i++)
		{
			
		}
		
		return res[arr.length-1];
	}
	public static void main(String... args)
	{
		MinimumNumberOfJumpsToReachEndOfArray minJumps = new MinimumNumberOfJumpsToReachEndOfArray();
		int[] nums = {3, 2, 3, 0, 2, 1};
		System.out.println(minJumps.getMinimumNoOfJumpsToReachEOA(nums));
	}
}
