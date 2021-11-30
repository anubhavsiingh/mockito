package com.java.train;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("John","Klaus","Elijah");
		
		Consumer<String> toUpper = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
			
		};
		
		names.forEach(toUpper);
		
		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(10); //display is a consumer interface method
		
	}

}
