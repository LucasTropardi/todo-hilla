package com.ltsoftwaresupport.todo.ednpoints;

import java.util.List;

import com.ltsoftwaresupport.todo.Todo;
import com.ltsoftwaresupport.todo.TodoRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import dev.hilla.Endpoint;


@Endpoint
@AnonymousAllowed
public class TodoEndpoint {
	
	private TodoRepository repository;
	
	TodoEndpoint(TodoRepository repository) {
		this.repository = repository;
	}
	
	public List<Todo> findAll() {
		return repository.findAll();
	}
	
	public Todo add(String task) {
		return repository.save(new Todo(task));
	}
	
	public Todo update(Todo todo) {
		return repository.save(todo);
	}
	
}
