package com.uday.interview.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/*
 * // The Fibonacci series is defined as F( N ) = F(N-1) + F(N-2)
// The series of N starts with 0, and F(0) == F(1) == 1
// Hence the Fibonacci series is: 1,1,2,3,5,8,13,....

// Write a method fib( n ) which returns the nth Fibonacci 
 * Number where n is a natural number (non-negative integer)
***************************************************
 */

public class Fibonacci {
	public Map<Integer,Integer> fibMap = new HashMap<Integer,Integer>();
	public int lastIteration= 1;
	public  int getNthFibonacciNumber(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
			return n;
		else {
			if(fibMap.containsKey(n))
			{
				return fibMap.get(n);
			}
			for(int i=lastIteration;i<=n ;i++)
			{
				fibMap.put(n,fibMap.get(i-1) + fibMap.get(i-1));
				lastIteration++;
			}
			return fibMap.get(n);
		}
	}
	
	public static void main(String args[])
	{
		Fibonacci s = new Fibonacci();
		System.out.println(s.getNthFibonacciNumber(9));
		System.out.println(s.getNthFibonacciNumber(4));
	}
}
