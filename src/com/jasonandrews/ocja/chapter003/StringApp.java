/*
	This program shows different String methods suchas the toString method which is inherited from the Object class by default.
	We can override the inherited method and create our own to return information that best represents the states of the object.
*/

package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.Scanner;

public class StringApp {


	private String name;
	private boolean isBanned;
	private long unbanTime;

	public static void main(String[] args) {

		StringApp sa = new StringApp();

		String name = "Jason";

		name.concat(" Andrews");

		System.out.println(name);	 // Will print out "Jason" because we don't make 'name' refer to the new String object returned with the concat method.

		name = name.concat(" Andrews");	// = assignment.
		System.out.println(name); // Will print out "Jason Andrews" because we make 'name' refer to the returned String object containing the new values.

		name = name + " was here";
		System.out.println(name); // Will print out "Jason Andrews was here".

		
		Scanner reader = new Scanner(System.in);
	
		System.out.print("What is your first name?: ");
		String firstName = reader.nextLine();
		
		System.out.print("What is your surname?: ");
		String secondName = reader.nextLine();
	
		System.out.println("Okay, so your name is " + (firstName + " " + secondName) + "!");
		
		sa.setName(firstName + " " + secondName);
		System.out.println("The objects toString result is "+ sa.toString() + ".");
			
		long endTimestamp = sa.getCurrentTimestamp() + (5 * 1000); //add 5 seconds to the timestamp.
		
		//int counter = 0;
		//while(sa.getCurrentTimestamp() < endTimestamp) {
		//	counter++;
		//	System.out.println("["+counter+"] The current milliseconds is: " + System.currentTimeMillis() + ".");
		//}
		//System.out.println("STARTED AT: "+ (endTimestamp - 5*1000) + "& ENDED AT: " + System.currentTimeMillis() + "!");
		

		System.out.println("--------------------------------------------------");
		System.out.println(sa.toString());

		System.out.println("--------------------------------------------------");


		int minutes = 5;
		sa.banPlayer(minutes);
		System.out.println("You have been banned for " + minutes + " minutes!");

		while(sa.isPlayerBanned()) { //constantly check if the player is banned.
		
			if(System.currentTimeMillis() > sa.getUnbanTime()) {
				sa.unbanPlayer();
				System.out.println("You have been unbanned!");
			}
		}
	}

	/*
		Without overriding the parent method, using toString on an object would return..
		"The objects toString result is com.jasonandrews.ocja.exercises.chapterthree.StringApp@6b7920."		

	*/
	//public String toString() { //Overriding the java.lang.Object toString method.
	//	return "Name: " + this.name;
	//}

	private void setName(String name) {
		this.name = name;
	}

	private long getCurrentTimestamp() {
		
		long timestamp = 0;
		
		timestamp = System.currentTimeMillis();		

		return timestamp;
	}
	private boolean isPlayerBanned() {
		return this.isBanned;
	}

	private void banPlayer(int minutes) {
		this.unbanTime = System.currentTimeMillis() + (minutes * (60 * 1000));
		this.isBanned = true;
	}

	private void unbanPlayer() {
		this.isBanned = false;
	}

	private long getUnbanTime() {
		return this.unbanTime;
	}
}