package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class ReplaceMethodApp {


	public static void main(String[] args) {

		ReplaceMethodApp rma = new ReplaceMethodApp();

		Scanner reader = new Scanner(System.in);

		System.out.print("Please enter a string: ");
		String enteredString = reader.nextLine();
		
		System.out.println("The final result is: "+rma.replace(enteredString,'a','x') + ".");
		
	
	}

	public String replace(String original, char target, char replacement) {
		StringBuilder finalString = new StringBuilder();
		char[] charArray = new char[original.length()];
	
		char tempChar = 0;
		for(int i = 0; i < original.length(); ++i) {
		
			tempChar = original.charAt(i);
			if(tempChar != target) {
			charArray[i] = tempChar;
			} else {
				charArray[i] = replacement;
			}
			finalString.append(charArray[i]);
		}
		return (""+finalString);
	}

}