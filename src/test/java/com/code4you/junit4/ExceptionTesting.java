package com.code4you.junit4;

import java.util.Arrays;

import org.junit.Test;

public class ExceptionTesting {

	@Test(expected = NullPointerException.class)
	public void testNullPointerException() {
		int[] number = null;
		
		Arrays.sort(number);
	}

}
