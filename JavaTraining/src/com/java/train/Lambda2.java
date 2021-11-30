package com.java.train;

import java.util.ArrayList;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		//Use lamdba exp to filter or check something from a ArrayList Eg
		
		arrL.forEach((i)-> {if (i>2) System.out.println(i);});
		
	}

}
