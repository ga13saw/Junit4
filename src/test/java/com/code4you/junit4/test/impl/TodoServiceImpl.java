package com.code4you.junit4.test.impl;

import java.util.Arrays;
import java.util.List;

import com.code4you.junit4.interfaces.TodoService;

public class TodoServiceImpl implements TodoService {

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Shopping","Study","movie");
	}

	@Override
	public void deleteTodoList(String user) {
		// TODO Auto-generated method stub
		
	}

}
