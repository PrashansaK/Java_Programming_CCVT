package com.rt.exceptionexamples;

class Exception1 {
public static void main(String args[]) {

	try{
	int d = 0;
	int a = 42 / d;
	}
	catch(ArithmeticException e){
		System.out.println("Division by zero exception!!");
	}
	//Changes made: Added try catch block to handle the exception
}
}