package com.java.train;

import java.util.*;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable
that can iterate over the elements in the collection.

“forEach” is a default method defined in the Iterable interface. It is 
used by the Collection classes that extend the Iterable interface to iterate elements.


The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
 */
public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String> ();
		
		languages.add("Java");
		languages.add("Ruby");
		languages.add("C");
		languages.add("Python");

		System.out.println("****** Programming Languages ********");
		
		//for(String i : languages) {
		//	System.out.println(i);
		//}
		languages.forEach(i -> System.out.println(i));
		
		Map <Integer,String> customer = new HashMap<Integer,String>();
		
		customer.put(101, "Nanu");
		customer.put(102, "Kartik");
		customer.put(103, "Akash");
		customer.forEach((k,v) -> System.out.println("K -- " + k +"  Value -- " + v));
		
	}

}
