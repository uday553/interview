package com.uday.interview.dynamicprogramming;

/**
 * Hello world!
 *
 */
public class MaxSumInArrayWithNoAdjacentValues 
{
	public   int getMaxSumArray(int[] array)
	{
		if(array.length==0)
			return 0;
		else if(array.length==1)
			return array[0];
		else if(array.length==2)
			return Math.max(array[0],array[1]);
		else
		{
			int result[] = new int[array.length];
			result[0]=array[0];
			result[1]=Math.max(array[0], array[1]);
			for(int i=2;i<array.length;i++)
			{
				result[i] = Math.max(result[i-1], result[i-2]+array[i]);
			}
			System.out.println(result[array.length-1]);
			return result[array.length-1];
		}
	}
    public static void main( String[] args )
    {
    	MaxSumInArrayWithNoAdjacentValues msa = new MaxSumInArrayWithNoAdjacentValues();
    	int a[] = {4,3,5,200,70,10,2};
        System.out.println( "Max sum "+msa.getMaxSumArray(a));
    }
}
