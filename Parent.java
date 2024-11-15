package org.basic;

public class Parent{
	public Parent() {
		this("Manicom");
		System.out.println("default Parent");
	}
	
	public Parent(int a) {
		
		System.out.println("Parent "+a);
	}
	
	public Parent(String b) {
		this(20);
		System.out.println("Parent "+b);
	}
	

}
