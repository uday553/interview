package com.uday.interview;

import static org.junit.Assert.assertEquals;

import com.uday.interview.dynamicprogramming.MaxSumInArrayWithNoAdjacentValues;

public class DynamicProgramming {

    @org.junit.Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        int input[] = {4,3,5,200,70,10,2};
		MaxSumInArrayWithNoAdjacentValues msa = new MaxSumInArrayWithNoAdjacentValues();
		assertEquals(214, msa.getMaxSumArray(input));
    }
    
}
