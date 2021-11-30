package com.java.train;

public interface Vehicle {
	
	//By default all are abstract
	String getBrand();
	String speedUp();
	String slowDown();
	
	default String turnAlarmOn() {
		return "I am ON";
	}
	
	default String turnAlarmOf() {
		return "I am OFF";
	}
	
	static int getHorsePower(int rpm,int torque)
	{
	return (rpm*torque)/5252;
	}
}
