package com.code4you.junit4.interfaces;

import java.util.List;

public interface TodoService {
	public List<String> retrieveTodos(String user);
	public void deleteTodoList(String todo);
}
