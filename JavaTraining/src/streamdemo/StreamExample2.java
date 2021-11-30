package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java.train.ForEachDemo;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		
		names.stream().filter((s)-> s.startsWith("A")).map(String::toUpperCase).
		forEach(System.out::println);
		
		//Reducing everything to one .. so can be used to sum of all
		Optional<String> red = names.stream().reduce((s1,s2)-> s1 +"#"+ s2);
		red.ifPresent(System.out::println);

	}

}
