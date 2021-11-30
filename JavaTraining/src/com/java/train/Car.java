package com.java.train;

public class Car implements Vehicle {
	String brand;
	Car(String brand){
		this.brand = brand;
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Speeding UPPP";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Slowing dowwwn";
	}
	public String turnAlarmOn() {
		return "I m not ONN";
	}
	public static void main(String[] args) {
		
		Vehicle HondaCity = new Car("Honda");
		System.out.println(HondaCity.getBrand());
		System.out.println(HondaCity.slowDown());
		System.out.println(HondaCity.speedUp());
		System.out.println(HondaCity.turnAlarmOf());
		System.out.println(HondaCity.turnAlarmOn());
		System.out.println(Vehicle.getHorsePower(2400, 60));

	}

}
