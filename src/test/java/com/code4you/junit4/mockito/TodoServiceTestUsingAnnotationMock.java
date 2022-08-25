package com.code4you.junit4.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.code4you.junit4.impl.TodoBusinessImpl;
import com.code4you.junit4.interfaces.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoServiceTestUsingAnnotationMock {
	
	@Mock
	TodoService todoServiceMock;
	
	@InjectMocks
	TodoBusinessImpl businessImpl;
	
	
	@Test
	public void testRetrieveTodosUsingMock() {
		List<String> todos = todoServiceMock.retrieveTodos("Dudi");
		assertEquals(0, todos.size());
		
	}
	
	@Test
	public void testRetrieveTodosUsingMock2() {
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		when(todoServiceMock.retrieveTodos("Dudi")).thenReturn(allTodoList);
		List<String> relatedToSpring = businessImpl.retrieveTodosRelatedToSpring("Dudi");
		
		assertEquals(1, relatedToSpring.size());
		
	}

}
