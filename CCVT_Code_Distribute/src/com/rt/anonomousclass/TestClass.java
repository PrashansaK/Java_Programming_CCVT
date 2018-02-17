package com.rt.anonomousclass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		Greeting obj=new Greeting(){
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Hello World");
				
			}
		};
		
		/* Removed the class Temp which implemented the interface. Since, here we have
		made an anonymous class which is implementing the interface and overriding its
		method print.
		Output:-
		Hello
		Hello World */
		
		
		obj.print();
		
	}

}
