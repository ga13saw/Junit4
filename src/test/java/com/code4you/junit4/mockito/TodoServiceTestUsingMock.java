package com.code4you.junit4.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import com.code4you.junit4.impl.TodoBusinessImpl;
import com.code4you.junit4.interfaces.TodoService;

public class TodoServiceTestUsingMock {
	
	
	
	@Test
	public void testRetrieveTodosUsingMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = todoServiceMock.retrieveTodos("Dudi");
		assertEquals(0, todos.size());
		
	}
	
	@Test
	public void testRetrieveTodosUsingMock2() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		when(todoServiceMock.retrieveTodos("Dudi")).thenReturn(allTodoList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> relatedToSpring = businessImpl.retrieveTodosRelatedToSpring("Dudi");
		
		assertEquals(1, relatedToSpring.size());
		
	}

}
