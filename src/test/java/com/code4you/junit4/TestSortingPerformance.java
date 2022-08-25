package com.code4you.junit4;

import java.util.Arrays;

import org.junit.Test;

public class TestSortingPerformance {

	@Test(timeout = 12)
	public void testSortingPerformance() {
		int[] numbers = {20,1,10};
		for(int i=0;i<100000;i++) {
			numbers[0]=i;
			Arrays.sort(numbers);
		}
	}

}
