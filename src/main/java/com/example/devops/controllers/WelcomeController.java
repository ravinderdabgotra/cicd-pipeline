package com.example.devops.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	@Autowired
	TodoService todoService;
	
	@GetMapping
	public String getMessage() {
		int x = 1+(int) (Math.random()*10);
		return "Welcome message from DevOps:"+x;
	}
	@GetMapping("/bye")
	public String getByeMessage() {
		return "Good Bye from DevOps";
	}
	
	@PostMapping(value = "/add-todo")
	public String showAddTodoPage() {
		
		todoService.addTodo("Some Data", "Some description", new Date(), true);
		return "todo";
	}
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos(){
		return todoService.getAllTodos();
	}
}
