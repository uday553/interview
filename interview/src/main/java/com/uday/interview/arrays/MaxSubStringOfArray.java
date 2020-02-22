package com.uday.interview.arrays;

public class MaxSubStringOfArray {

	public static void maxSubstring (String str)
	{
		if(str==null)
			System.out.println("It's empty");
		if(str.length()==1)
		{
			System.out.println(str);
		}
		int start=0;
		int maxSize=0;
		for(int i=1;i<str.length();i++)
		{
			System.out.println();
			/// this is for finding even palindram
			int low=i-1;
			int high=i;
			if(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high))
			{
				while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high))
				{
					System.out.println(str.charAt(low) +" -- " +str.charAt(high));

					if((maxSize-start)<(high-low))
					{
						start=low;
						maxSize=high;
					}
					low--;
					high++;
				}
			}

			low=i-1;
			high=i+1;
			if(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high))
			{
				while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high))
				{
					System.out.println(str.charAt(low) +" --- " +str.charAt(high));
					if((maxSize-start)<(high-low))
					{
						start=low;
						maxSize=high;
					}
					low--;
					high++;
				}
			}
		}
		System.out.println(start);
		System.out.println(maxSize);
		System.out.println("==> "+str.substring(start,maxSize+1));

	}
	public static int maxSubstringLength (String str)
	{
		if(str==null )
			return -1;
		if(str.length()<=1 )
		{
			return str.length();
		}
		int [][]substringMatch = new int[str.length()][str.length()];
		for(int i=0;i<str.length();i++)
		{
			substringMatch[i][i]=1;
		}
		for(int i=1;i<str.length();i++)
		{
			int row=0;
			for(int j=i;j<str.length();j++)
			{
				while(row<str.length()-1)
				{
					if(str.charAt(row)==str.charAt(j))
					{
						if(i==1)
							substringMatch[row][j]=2;
						else 
							substringMatch[row][j]=2+substringMatch[row+1][j-1];
					}
					else {
						substringMatch[row][j] = Math.max(substringMatch[row][j-1], substringMatch[row+1][j]);
					}
					row++;
				}
			}
		}
		for(int i=0; i<str.length();i++)
		{
			for(int j=0; j<str.length();j++)
			{
				System.out.print(" "+substringMatch[i][j]);
			}
			System.out.println();
		}
		return substringMatch[0][str.length()-1];
	}
	public static void main(String args[])
	{

		//		maxSubstring("forgeeksskeegfor");
		//		maxSubstring("babad");
		//		maxSubstring("ba");
		//maxSubstring("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		//System.out.println(maxSubstringLength("babad"));

		int k[][]= {{1,2,3,99},{4,5,6,88},{7,8,9,66},{70,80,90,616}};
		for(int i=1;i<4;i++)
		{
			int row=0;
			for(int j=i;j<4;)
			{

				System.out.println(k[row][j]+" ");

				row++;
				j++;

			}
			System.out.println();
		}
	}
}
