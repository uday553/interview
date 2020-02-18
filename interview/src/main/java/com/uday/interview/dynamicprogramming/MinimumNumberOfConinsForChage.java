package com.uday.interview.dynamicprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumNumberOfConinsForChage {

	public static int getMinimumNumberOfCoinsRequiredForChange(int denoms[], int n)
	{
		int change[] = new int[n];
		Arrays.sort(denoms);

		if(denoms[0]>n)
			return 0;
		for(int counter=0;counter<denoms.length;counter++)
		{
			System.out.println(Arrays.toString(denoms));
			for(int i=0;i<change.length;i++)
			{
				if((i+1)%denoms[counter]==0)
				{
					change[i]=(i+1)/denoms[counter];
					System.out.println("i -> "+i+"   denoms["+counter+"] -> "+denoms[counter]+"  change["+i+"]  -> "+change[i]);
				}else {
					int noOfcoins=(i+1)/denoms[counter];
					int noOfcoinsRem=(i+1)%denoms[counter];
					System.out.println("i -> "+i+"   denoms["+counter+"] -> "+denoms[counter]+"  change["+i+"]  -> "+change[i]+" NoOfCoins -> "+noOfcoins +" noOfcoinsRem -> "+noOfcoinsRem);
					if(noOfcoinsRem!=0 && change[noOfcoinsRem-1]!=0)
						change[i]= Math.min(change[i], noOfcoins+change[noOfcoinsRem-1]);

				}
			};
			System.out.println("-----------  change before -> "+Arrays.toString(change));
		}
		System.out.println("-----------  change -> "+Arrays.toString(change));
		return change[n-1];
	}
	public static void main(String args[])
	{

		int a[] = {39,45,130,40,4,2};
		//int[] a = {3,5};
		System.out.println(getMinimumNumberOfCoinsRequiredForChange(a, 6));
	}






}
