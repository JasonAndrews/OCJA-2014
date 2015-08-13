//package com.jasonandrews.ocja.exercises.chapterfive;

public class VehicleApp {

	public static void main(String[] args) {

		VehicleApp va = new VehicleApp();

		Car myCar = new Car();

		System.out.println("My cars model is: " + myCar.getModel());
		va.changeCar(myCar);
		System.out.println("My cars model is: " + myCar.getModel());
	}

	public void changeCar(Car car) {
		car.setModel("Veyron");
	}

}