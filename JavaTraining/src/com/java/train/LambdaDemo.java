package com.java.train;

//Functional Interface
interface lambda{
	
	public String display();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we use lambda expression to provoke interface method
		// lambda exp is stored as the instance of functional interface
		// func intfc FI is intrfc having just one abstract method
		
		//Without Parameter
		
		lambda msg = () -> { return "Hello";}; 
		System.out.println(msg.display());
		
		//Single Parameter
		
		MyStringInt name = n-> {return "hey" + n;};
		System.out.println(name.disp("Arthur"));
		
		//Multiple Parameter
		Adding op1 = (a,b) -> { System.out.println("Sum is " + (a+b));};
		
		op1.add(8, 110);
	}

}
