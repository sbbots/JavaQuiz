package com.sbbots.test.javaQuiz;

public class Tree {

	int leaves = 100;
	
	public static void main(String[] args) {
		Tree tree1 = new Tree();
		
		tree1.leaves= 200;
		Tree tree2 = doubleTreeLeaves(tree1);
		System.out.println(tree1 == tree2);
		System.out.println(tree1.leaves);
		System.out.println(tree2.leaves);
		
	}

	private static Tree doubleTreeLeaves(Tree tree1) {
		tree1 = new Tree();
		tree1.leaves = 2*tree1.leaves;
		return tree1;
	}

}
