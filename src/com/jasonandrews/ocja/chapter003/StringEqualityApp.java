package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class StringEqualityApp {
	private int testInt = 5; //Just testing the classes equals method.
	private boolean testBool = false;

	public static void main(String[] args) {
	
		String str = "hello";
		String str2 = "moto";

		if(str.equals(str2)) System.out.println("Equals");
		if(str.equals(str)) System.out.println("Yes!");
		if(str2.equals(str2)) System.out.println("Yay!");
	
		StringEqualityApp sea1 = new StringEqualityApp();
		StringEqualityApp sea2 = new StringEqualityApp();

		sea2.testInt = 5; //change the objects state testVar to 6, so we can compare them.
		sea2.testBool = true; //changing this value to false would make "yes" be printed out below.
		if(sea1.equals(sea2)) {
			System.out.println("yes");
		} else 	System.out.println("nope");
	}

	private boolean equals(StringEqualityApp sea) {
		return (this.testInt  == sea.testInt && this.testBool == sea.testBool);
	}

}