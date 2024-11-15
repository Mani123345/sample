package org.basic;

public class Child extends Parent {

	//to check the push action is done or not
	public Child() {
		this(10);
		System.out.println("default Child");
	}
	
	public Child(int a) {
		this("Mani");
		System.out.println("Child "+a);
	}
	
	public Child(String b) {
		super();
		System.out.println("Child "+b);
	}
	
	public static void main(String[] args) {
		
		
		Child c = new Child();
	}
	//again pushing process


	//final psuhing process
	
}
