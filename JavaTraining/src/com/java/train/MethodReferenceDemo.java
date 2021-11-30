package com.java.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order ord1 = new Order(3000,"GOOG.IN",5400.20,Order.Side.BUY);
		Order ord2 = new Order(2000,"MIN.IN",5600.20,Order.Side.SELL);
		Order ord3 = new Order(4000,"MIN.IN",5200.20,Order.Side.SELL);
		
		List<Order> OrderBook = new ArrayList<Order>();
		
		OrderBook.add(ord1);
		OrderBook.add(ord2);
		OrderBook.add(ord3);
		
		System.out.println(OrderBook);
		
		//Sort using lambda expression
		Collections.sort(OrderBook, (a,b)-> Order.compareByQuantity(a, b));
		System.out.println(OrderBook);
		
		//Sort using MethodRefernc by calling static method
		Collections.sort(OrderBook,Order::compareByQuantity);
		System.out.println(OrderBook);
		

		//Sort using MethodRefernc by calling instance method
		Order order = OrderBook.get(0);
		Collections.sort(OrderBook,order::compareByPrice);
		System.out.println(OrderBook);
	}

}
