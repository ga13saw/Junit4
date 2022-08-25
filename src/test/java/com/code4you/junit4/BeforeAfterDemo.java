package com.code4you.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterDemo {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@Before
	public void setUpBefore() {
		System.out.println("Before executing method");
	}

	@After
	public void tearDownAfter(){
		System.out.println("After executing method");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("executing test logic2");
	}
	
	@Test
	public void testMethod() {
		System.out.println("executing test logic");
	}
	
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

}
