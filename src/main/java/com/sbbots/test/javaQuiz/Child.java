package com.sbbots.test.javaQuiz;

public class Child extends Parent {
//	{
//		System.out.println("C");
//	}
//	static {
//		System.out.println("D");
//	}
//

	public Child(){
		System.out.println("constructor child");
	}
	
	public void privateMethod(){
		System.out.println("Child.privateMethod");
	}
	@Override
	public void protectedMethod(){
		System.out.println("Child.protectedMethod");
		privateMethod();
	}
	@Override
	public void publicMethod(){
		System.out.println("Child.publicMethod");
		protectedMethod();
	}
}
