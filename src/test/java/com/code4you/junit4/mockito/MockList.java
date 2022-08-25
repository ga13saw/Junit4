package com.code4you.junit4.mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class MockList {

	@Test
	public void sizeMethod() {
		List listMock = mock(List.class);
		
		//when(listMock.size()).thenReturn(2);
		when(listMock.size()).thenReturn(2).thenReturn(10);
		
		assertEquals(2, listMock.size());
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void argumentMatcher() {
		List listMock = mock(List.class);
		//argument matcher
		//when(listMock.get(0)).thenReturn("Code4You");
		when(listMock.get(anyInt())).thenReturn("Code4You");
		
		
		assertEquals("Code4You", listMock.get(0));
		//assertEquals(null, listMock.get(10));
		assertEquals("Code4You", listMock.get(10));
	}
	
	@Test(expected = RuntimeException.class)
	public void exceptionHandling() {
		List listMock = mock(List.class);
		//argument matcher
		//when(listMock.get(0)).thenReturn("Code4You");
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("exception from exceptionhandling class"));
		
		
		assertEquals("Code4You", listMock.get(0));
		
	}
	

}
