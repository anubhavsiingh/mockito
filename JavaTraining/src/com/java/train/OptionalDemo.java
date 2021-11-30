package com.java.train;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		//Integer a=null;
		//System.out.println(a+2); // Gives Nullpointer Exception Bcs A is pointing to Null
		
		
		String s = null;
		//Optional object is a container for not null objects
		Optional<String> chknl = Optional.ofNullable(s);
		
		if(chknl.isPresent()) {
			System.out.println("S length"+s.length());
		}
		else {
			System.out.println("String not present");
		}
	}

}
