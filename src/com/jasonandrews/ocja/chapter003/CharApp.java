package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class CharApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Please enter your name: ");	
		String name = reader.nextLine();
		
		System.out.print("Please enter the index you wish to check: ");
		int indexToCheck = -1;
		try {
			indexToCheck = reader.nextInt();

		} catch (java.util.InputMismatchException e) {
			System.out.println("You can only enter a number!");
			e.printStackTrace();	
		}
		
		try {
			char ch = name.charAt(indexToCheck);
			System.out.println(ch);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("");
			e.printStackTrace();
		}

		for(int i =0; i < name.length(); ++i) {
			try {
				//.. When it iterates to the last element, variable i will be larger than the length of the String, so it will throw an exception when it tries to get a char using the charAt method.
				//.. -> if(i == name.length() - 1) { i = name.length()+5; } 
				System.out.print(name.charAt(i));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("");
				e.printStackTrace();
			}
		}

		
	
	}


}