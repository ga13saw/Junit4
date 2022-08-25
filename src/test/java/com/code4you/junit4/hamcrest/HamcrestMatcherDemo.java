package com.code4you.junit4.hamcrest;


import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestMatcherDemo {

	@Test
	public void hamcrestMatcher() {
		//given
		List<Integer> numbers = Arrays.asList(1,20,17);
		
		//then
		assertThat(numbers, hasSize(3));
		assertThat(numbers, hasItem(20));
		assertThat(numbers, hasItems(1,17));
		
		assertThat(numbers, everyItem(greaterThan(0)));
		assertThat(numbers, everyItem(lessThan(100)));
		
		//String
		assertThat(null, isEmptyOrNullString());
		assertThat("", isEmptyString());
		
		//array
		Integer[] nums = {20,100,50};
		
		assertThat(nums, arrayWithSize(3));
		assertThat(nums, arrayContaining(20,100,50));
		assertThat(nums, arrayContainingInAnyOrder(50,20,100));
	}

}
