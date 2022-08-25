package com.code4you.junit4.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.code4you.junit4.impl.TodoBusinessImpl;
import com.code4you.junit4.interfaces.TodoService;

//@RunWith(MockitoJUnitRunner.class)
public class BDDAnnotationStyle {
	
	/* runWith is only for single class
	 *  For multiple class we have rules now
	 *  */
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Mock
	TodoService todoService;
	
	@InjectMocks
	TodoBusinessImpl businessImpl;
	
	@Captor
	ArgumentCaptor<String> stringArgCaptor;
	
	
	@Test
	public void retrieveTodos_BDD() {
		//given
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		given(todoService.retrieveTodos(anyString())).willReturn(allTodoList);
		
		//when
		List<String> retrieveTodosRelatedToSpring = businessImpl.retrieveTodosRelatedToSpring("dudi");
		
		//then
		assertThat(retrieveTodosRelatedToSpring.size(), is(1));
		
	}
	
	@Test
	public void deleteTodosRelatedToSpringBDD() {
		//given
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		given(todoService.retrieveTodos(anyString())).willReturn(allTodoList);
		
		//when
		businessImpl.deleteTodosRelatedToSpring("dudi");
		
		//then
		verify(todoService).deleteTodoList("Springmovie");
		
		
	}
	
	@Test
	public void deleteTodosRelatedToSpringBDD_argumentCaptor() {
		//given
		List<String> allTodoList = Arrays.asList("Shopping","Study","Springmovie");
		given(todoService.retrieveTodos(anyString())).willReturn(allTodoList);
		
		//when
		businessImpl.deleteTodosRelatedToSpring("dudi");
		
		//then
		then(todoService).should().deleteTodoList("Springmovie");
		
		then(todoService).should().deleteTodoList(stringArgCaptor.capture());
		
		assertThat(stringArgCaptor.getValue(), is("Springmovie"));
		
	}
	
}
