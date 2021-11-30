package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Java program to filter collection of user defined objects using Stream
//Stream doesn't store elements and supports iteration
public class StreamDemo4 {

	public static void main(String[] args) {

//Creating list of Books
		List<Book> list=new ArrayList<Book>();

//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		Book b4=new Book(104,"Java Programming","James Gosling","Wiley",15);
		Book b5=new Book(105,"Spring Framework","Rod Jhonson","BPB",5);



//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		//list.stream().forEach(i-> System.out.println(i.getName() + " " + i.getAuthor() + " "+i.getQuantity()));
		//Printing quantity greater than 7
		List<Object> ans = list.stream().filter(i->i.getQuantity()>7).map(b->b.quantity).collect(Collectors.toList());
		//ans.stream().forEach(i-> System.out.println(i));
		System.out.println(ans);
		
		//Book details with quantity grtr thn 7
		list.stream().filter(i->i.getQuantity()>7).forEach(i-> System.out.println(i.getId() +" "+i.getName()+" "+i.getAuthor()+" "+i.getQuantity()+" "+i.getPublisher()));
		
		//Total Quantity of books
		int res = list.stream().map(b->b.quantity).reduce(0,(a,b)-> a+b);
		System.out.println(res);
		
		//Max Quantity of books
		Book max1 = list.stream().max((a,b)->a.quantity>b.quantity?1:-1).get();
		System.out.println(max1.quantity);
		
		Optional<Integer> min1 = list.stream().map(a->a.quantity).min((a,b)->a.compareTo(b));
		System.out.println(min1.get());
	}
}