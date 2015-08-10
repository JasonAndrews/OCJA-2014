package com.jasonandrews.ocja.exercises.chapterthree;

public class Person {

	int age = 21;
	String name = "Jason";

	public static void main(String[] args) {
	
		Person myPerson = new Person();

		System.out.println(myPerson);
				
	}

	public String toString() {
		return (this.name + " " + this.age);
	}
}