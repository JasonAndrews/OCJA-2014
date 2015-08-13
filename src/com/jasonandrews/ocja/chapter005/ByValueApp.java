package com.jasonandrews.ocja.exercises.chapterfive;

public class ByValueApp {

	public static void main(String[] args) {


		int num = 0;

		ByValueApp bva = new ByValueApp();

		System.out.println("Main num: " + num);

		
		bva.changeNumber(num);

		System.out.println("Main num: " + num);

	}

	private void changeNumber(int number) {
	
		System.out.println("Method num: " + number);
		++number;
		
		System.out.println("Method num: " + number);
	}

}