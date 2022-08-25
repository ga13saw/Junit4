package com.code4you.junit4;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class AssertArrayEqualsDemo {

	
	@Test
	public void testArraysDiffer() {
		int[] numbers = {12,4,3,1};
		int[] expected = {1,4,3,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
		
		//arrays first differed at element [1]; expected:<4> but was:<3>
		
	}
	
	@Test
	public void testArraysMathced() {
		int[] numbers = {12,4,3,1};
		int[] expected = {1,3,4,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
		
		
	}

}
