package com.sbbots.test.javaQuiz;

import java.util.HashMap;
import java.util.Map;

public class TodoList {

	public static void main(String[] args) {
		Map<Todo, String> todos = new HashMap<Todo, String>();

		Todo t1;

		todos.put(t1 = new Todo("Monday"), "Task1");
		todos.put(new Todo("Monday"), "Task2");
		todos.put(new Todo("Tuesday"), "Task3");
		
		System.out.println("Size: " + todos.size()+ ", t1 :" + todos.get(t1));
		
	}

}
