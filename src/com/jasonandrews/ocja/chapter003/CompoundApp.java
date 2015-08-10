//package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class CompoundApp {

	private static final int DEFAULT_INPUT_VALUE = -1;

	private static final int INCREMENT_VALUE = 5;
	private static final int DECREMENT_VALUE = 7;

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		CompoundApp ca = new CompoundApp();		

		String input;
		int inputValue = DEFAULT_INPUT_VALUE;
			
		while(inputValue == -1) {
			System.out.print("Please enter in a value: ");
		
			input = reader.nextLine();
			inputValue = (ca.checkInput(input))? Integer.parseInt(input):DEFAULT_INPUT_VALUE;
			
			if(inputValue > -1) {
				ca.doCalculations(inputValue);	
			} else {
				System.out.println("Please enter a positive number!");
			}
		}
		
	
	}//main
	
	private boolean checkInput(String input) {
		
		if(input.matches("[0-9]+")) {
			return true;
		} else return false;

	}
	
	public void doCalculations(int value) {
		System.out.println("You entered: "+ value);
		System.out.println("Your incremented value is: " + (value += INCREMENT_VALUE) + ".");
		System.out.println("Your decremented value is: " + (value -= DECREMENT_VALUE) + ".");
	}

}//class