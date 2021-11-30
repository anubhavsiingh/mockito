package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Stream Api -- To handle Collections 
		Integer[] marks = {20,30,50,80}; // Integer type array
		
		Stream <Integer> s = Stream.of(marks); // Stream type
		s.forEach(System.out::println);
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(5);
		li.add(6);
		li.add(8);
		li.add(9);
		
		Stream<Integer> cube = li.stream().map(x->x*x*x);
		cube.forEach(System.out::println);
		
		List<Integer> ans = li.stream().map(m->m*m).collect(Collectors.toList());
		System.out.println(ans);
		
		List<Integer> ans1 = ans.stream().filter(n -> n>30).collect(Collectors.toList());
		System.out.println(ans1);
		
		Integer sum1 = li.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum1);
}}
