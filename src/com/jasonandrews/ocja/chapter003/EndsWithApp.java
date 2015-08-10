package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class EndsWithApp {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);

		System.out.print("Please enter a string (your name): ");
		String enteredString = reader.nextLine();

		System.out.print("Please enter a substring: ");		
		String endsWithString = reader.nextLine();

		boolean bol = enteredString.endsWith(endsWithString);		
		System.out.println("Does \""+enteredString+"\" end with \""+endsWithString+"\"? Answer: " + bol + ".");

		//bol would be true if i entered my name, "Jason" and asked if it ended with "on".
		//.. bol = enteredString.endsWith("on"); // true
	}

}
