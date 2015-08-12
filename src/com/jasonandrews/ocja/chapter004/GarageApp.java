//package com.jasonandrews.ocja.exercises.chapterfour;

public class GarageApp {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		Car myCar = new Car("Green");
		Car yourCar = new Car("Red");

		if(null != myCar) {
			System.out.println("My cars colour is: " + myCar.getColour() + ".");
		}
		if(null != yourCar) {
			System.out.println("Your cars colour is: " + yourCar.getColour() + ".");
		}
	}

}