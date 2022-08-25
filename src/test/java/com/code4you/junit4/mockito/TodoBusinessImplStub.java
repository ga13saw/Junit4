package com.code4you.junit4.mockito;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.code4you.junit4.interfaces.TodoService;
import com.code4you.junit4.test.impl.TodoServiceImpl;

public class TodoBusinessImplStub {
	
	TodoService todoService = new TodoServiceImpl();
	
	@Test
	public void testRetrieveTodos_size() {
		List<String> retrieveTodos = todoService.retrieveTodos("ganesh");
		assertEquals(3,retrieveTodos.size());
	}
	
	@Test
	public void testRetrieveTodos_list() {
		List<String> retrieveTodos = todoService.retrieveTodos("ganesh");
		assertTrue(retrieveTodos.contains("mopping"));
	}

}
