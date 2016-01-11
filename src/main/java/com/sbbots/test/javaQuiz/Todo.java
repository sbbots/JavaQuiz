package com.sbbots.test.javaQuiz;

public class Todo {

	String day;
	
	Todo(String d){
		day= d;
		
	}
	
	
	public boolean equals(Object o) {
		return ((Todo)o).day ==this.day;
		
	}

	public int hashCode(){
		return 0;
	}
}
