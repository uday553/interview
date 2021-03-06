package com.uday.interview;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.awt.image.SampleModel;
import java.util.Arrays;

import org.junit.Test;

import com.uday.interview.dynamicprogramming.MaxSumInArrayWithNoAdjacentValues;
import com.uday.interview.dynamicprogramming.MaximumNumbuerOfJumps;
import com.uday.interview.dynamicprogramming.Sample;

public class DynamicProgramming {

	@Test
	public void FibTest()
	{
		Sample s = new Sample();
		assertEquals(5, s.getNthFibonacciNumber(4));
		assertEquals(8, s.getNthFibonacciNumber(5));
		assertEquals(5, s.getNthFibonacciNumber(4));
	}
	
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        int input[] = {4,3,5,200,70,10,2};
		MaxSumInArrayWithNoAdjacentValues msa = new MaxSumInArrayWithNoAdjacentValues();
		assertEquals(214, msa.getMaxSumArray(input));
    }
    
    @Test
    public void maximumNumberOfJumpsToReachEndOfArray() {
    	int a[]  = {3,4,2,1,2,3,7,1,1,1,3};
		assertEquals(4, MaximumNumbuerOfJumps.getMaximumNumberOfJumpsToReachEndOfArray(a));
    }
    
    @Test
    public void SubArraySort() {
    	int a[]  = {1,2,4,7,10,11,7,12,6,7,16,18,19};
		int expected[]= {3,9};
		assertArrayEquals(expected, com.uday.interview.arrays.SubArraySort.subArraySort(a));
    }
    
}
