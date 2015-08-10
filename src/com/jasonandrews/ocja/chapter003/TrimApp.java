package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class TrimApp{


	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		TrimApp ta = new TrimApp();

		String name = "   Jayceon Andrews  ";
		System.out.println(name); //Prints "   Jayceon Andrews  ".
		name = name.trim();
		System.out.println(name); //Prints "Jayceon Andrews".

		String str = "   file";
		str = str.trim(); // "file".

		name = name.trim().toLowerCase();
		System.out.println(name);
		
		System.out.print("Please enter in a string using a mixture of upper & lower case letters: ");
		String enteredString = reader.nextLine();

		System.out.println("The toLowerCase result is: <" + ta.toLowerCase(enteredString) + ">.");

		System.out.println("The toUpperCase result is: <" + ta.toUpperCase(enteredString) + ">.");


	}

	public String toLowerCase(String original) {
		StringBuilder finalString = new StringBuilder();
		char[] charArray = new char[original.length()];
		int tempChar = 0;
		
		for(int i = 0; i < original.length(); ++i) {

			tempChar = original.charAt(i);
			
			if(tempChar > 64 && tempChar < 91) {
				tempChar = tempChar + ((char) 32);
			}
			charArray[i] = (char) tempChar;

			finalString.append(charArray[i]);
		}
	
		return ""+finalString;
	}

	public String toUpperCase(String original) {
		StringBuilder finalString = new StringBuilder();
		char[] charArray = new char[original.length()];
		int tempChar = 0;
		
		for(int i = 0; i < original.length(); ++i) {

			tempChar = original.charAt(i);
			
			if(tempChar > 96 && tempChar < 123) {
				tempChar = tempChar - ((char) 32);
			}
			charArray[i] = (char) tempChar;

			finalString.append(charArray[i]);
		}
	
		return ""+finalString;
	}


}