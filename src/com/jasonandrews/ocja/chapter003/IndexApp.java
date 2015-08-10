package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class IndexApp {

	public static void main(String[] args) {
		
		IndexApp ia = new IndexApp();
		ia.doActions();
		

	}

	public void doActions() {
		//mainMenu:
		//while(true) {
	
			Scanner reader = new Scanner(System.in);
		

			//System.out.println("***** Main Menu *****");
			//System.out.println("*********************");
		
			System.out.print("Please enter in a string: ");
			String stringEntered = reader.nextLine();

			System.out.print("What substring do you want to search the string for?: ");
			String checkForThisStr = reader.nextLine();
		
			System.out.print("What char do you want to search the string for?: ");
			char checkForThisChar = reader.nextLine().charAt(0);//'a';
		
			System.out.println("The starting point for the string " + checkForThisStr + " is: " + stringEntered.indexOf(checkForThisStr) + ".");

			if(stringEntered.indexOf(checkForThisStr) != -1) {
				System.out.println("\n< String >\nWoohoo! \"" + checkForThisStr + "\" starts at index "+ stringEntered.indexOf(checkForThisStr) + ".");	
			} else System.out.println("\n< String >\nOh no, \"" + checkForThisStr + "\" wasn't found in the string.");
		
			if(stringEntered.indexOf(checkForThisChar) != -1) {
				System.out.println("\n< char >\nWoohoo! \'" + checkForThisChar + "\' starts at index "+ stringEntered.indexOf(checkForThisChar) + ".");			} else System.out.println("\n< char >\nOh no, \'" + checkForThisChar + "\' wasn't found in the string.");

			System.out.println("\n< length >\nThe length of your string was: " + stringEntered.length() + ".");

			System.out.print("What would you like to add to the string?: ");
			String stringToAdd = reader.nextLine();
			stringEntered = stringEntered.concat(stringToAdd);
			System.out.println("The value of the string is now: "+ stringEntered + ".");
			//add in concat!!!
		//} // while
	}

}

