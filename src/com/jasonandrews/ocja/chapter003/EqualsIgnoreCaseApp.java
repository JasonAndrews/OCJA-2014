package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class EqualsIgnoreCaseApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		EqualsIgnoreCaseApp eica = new EqualsIgnoreCaseApp();		

		System.out.print("Please enter your password: ");
		String password1 = reader.nextLine().trim();
		
		System.out.print("Please re-enter your password: ");
		String password2 = reader.nextLine().trim();
		//if(password1.equalsIgnoreCase(password2)) {
		//	System.out.println("\nYou have successfully logged in!");
		//} else {
		//	System.out.println("\nThe passwords you entered did not match!");
		//}

		if(eica.equalsIgnoreCase(password1.trim(), password2.trim())) {
			System.out.println("\nYou have successfully logged in!");
		} else {
			System.out.println("\nThe passwords you entered did not match!");
		}
	}

	public boolean equalsIgnoreCase(String firstStr, String secondStr) {

		if(firstStr.length() != secondStr.length()) {
			return false;
		}
		
		int tempChar1 = 0;
		int tempChar2 = 0;
				
		for(int i = 0, j = 0; i < firstStr.length(); ++i, ++j) {
			tempChar1 = firstStr.charAt(i);
			tempChar2 = secondStr.charAt(j);
			if(tempChar1 == tempChar2 || (tempChar1+32 == tempChar2) || (tempChar1-32 == tempChar2)) {
				continue;			
			} else {
				return false;
			}
		}
		return true;
	}
	
}