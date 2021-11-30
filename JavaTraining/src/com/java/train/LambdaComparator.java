package com.java.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Nanu",(double) 300);
		Student s2 = new Student(102,"Amit",(double) 150);
		Student s3 = new Student(103,"john",(double) 200);
		
		List<Student> stu = new ArrayList<Student>();
		
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		
		//to sort in descending order change st1 and st2 .. write st2 frst then st1
		
		Collections.sort(stu, (st1,st2)-> {
			return st1.marks.compareTo(st2.marks);
		});
		
		for(Student s: stu) {
			System.out.println(s.rollno + " " +s.name + " " +s.marks);
		}
	}

}
 