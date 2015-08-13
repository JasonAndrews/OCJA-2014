package com.jasonandrews.ocja.exercises.chapterfive;

public class UtilApp {

	public int add(int num1, int num2) {

		return (num1+num2);
	}
	public double add(double num1, double num2) {
		return (num1 + num2);
	}

	public static void main(String[] args) {

		UtilApp ua = new UtilApp();

		int total = ua.add(10, 21);

		double sum = ua.add(11.7D, 9.51D);

		System.out.println("Total: " + total + " | Sum: " + sum + ".");

	}
}