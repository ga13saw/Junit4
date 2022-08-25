package com.code4you.junit4.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.code4you.junit4.impl.TodoBusinessImpl;
import com.code4you.junit4.interfaces.TodoService;

public class BDDStyle {

	@Test
	public void retrieveTodos_BDD() {
		//given
		TodoService todoService = mock(TodoService.class);
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		given(todoService.retrieveTodos(anyString())).willReturn(allTodoList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		
		//when
		List<String> retrieveTodosRelatedToSpring = businessImpl.retrieveTodosRelatedToSpring("dudi");
		
		//then
		assertThat(retrieveTodosRelatedToSpring.size(), is(1));
		
	}
	
	@Test
	public void deleteTodosRelatedToSpringBDD() {
		//given
		TodoService todoService = mock(TodoService.class);
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		given(todoService.retrieveTodos(anyString())).willReturn(allTodoList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		
		//when
		businessImpl.deleteTodosRelatedToSpring("dudi");
		
		//then
		verify(todoService).deleteTodoList("Springmovie");
		
		
	}
	
	@Test
	public void deleteTodosRelatedToSpringBDD_argumentCaptor() {
		//given
		ArgumentCaptor<String> stringArgCaptor = ArgumentCaptor.forClass(String.class);
		TodoService todoService = mock(TodoService.class);
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		given(todoService.retrieveTodos(anyString())).willReturn(allTodoList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		
		//when
		businessImpl.deleteTodosRelatedToSpring("dudi");
		
		//then
		then(todoService).should().deleteTodoList("Springmovie");
		
		then(todoService).should().deleteTodoList(stringArgCaptor.capture());
		
		assertThat(stringArgCaptor.getValue(), is("Springmovie"));
		
	}
	
}
