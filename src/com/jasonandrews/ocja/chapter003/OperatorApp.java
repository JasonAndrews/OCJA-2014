package com.jasonandrews.ocja.exercises.chapterthree;

public class OperatorApp {

	public static void main(String[] args) {
	
		//declaring
		byte day;
		short year;	
		int age;
		long bankBalance;
		
		float radius;
		double pi;

		String name;
		char firstLetter;
		
		boolean isAlive;

		//initialising
		day = 24;
		year = 2014;
		age = 21;
		bankBalance = 500023032L;
		
		radius = 1.4445F;	
		pi = 3.144444444;		

		name = "Jason";
		firstLetter = 'J';
		isAlive = true;

		System.out.println("Byte: " + day +"\nShort: "+ year + "\nInt: "+age+"\nLong: "+ bankBalance + "\nFloat: " + radius+"\nDouble: "+pi+"\nString: "+name+"\nChar: "+firstLetter+"\nBoolean: "+isAlive);
		
	}

}