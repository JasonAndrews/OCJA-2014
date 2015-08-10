package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class StartsWithApp {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);

		System.out.print("Please enter a string: ");
		String enteredString = reader.nextLine();

		System.out.print("Please enter a substring: ");		
		String startsWithString = reader.nextLine();

		boolean bol = enteredString.startsWith(startsWithString, checkFromIndex);		
		System.out.println("Does \""+enteredString+"\" start with \""+startsWithString+"\"? Answer: " + bol + ".");

		System.out.print("Please enter the index you wish to check from: ");

		try {
			int checkFromIndex = reader.nextInt();
			
			
			


		} catch (java.util.InputMismatchException e) {
			System.out.println("\nPlease enter a number only!\n");
		}

		//.startsWith(String, indexToStart);
		


	}

}
