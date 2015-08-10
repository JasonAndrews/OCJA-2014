package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class SubStringApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = reader.nextLine();

		System.out.println(name); //Jason Andrews

		name = name.substring(6); //same as name.substring(6, name.length());
		System.out.println(name); //Andrews

		name = name.substring(3);
		System.out.println(name); //rews

		name = name.substring(0, 2); // 0 is inclusive (includes it) while 2 is exclusive (exludes it). So take values at index 0 and 1.
		System.out.println(name); //re
	
		
		
	}


}