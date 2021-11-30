package com.java.train;

class ConstructorReference{
	public ConstructorReference(String msg) {
		System.out.println(msg);
	}
}

//FI
interface ICR{
	ConstructorReference display(String msg);
}

public class MethodReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Invoking Constructor and for mehtod refren we need fi <<< in collections we dont need fi		
		ICR obj = ConstructorReference::new;
		obj.display("hey I am IN");

	}

}
