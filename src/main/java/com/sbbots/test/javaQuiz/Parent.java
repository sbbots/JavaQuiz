package com.sbbots.test.javaQuiz;

public class Parent {

//	{
//		System.out.println("A");
//	}
//	static {
//		System.out.println("B");
//	}
	
	public Parent(){
		System.out.println("constructor Parent");
	}
	
	public void privateMethod(){
		System.out.println("Parent.privateMethod");
	}
	public void protectedMethod(){
		System.out.println("Parent.protectedMethod");
		privateMethod();
	}
	public void publicMethod(){
		System.out.println("Parent.publicMethod");
		protectedMethod();
	}
	
	
}
