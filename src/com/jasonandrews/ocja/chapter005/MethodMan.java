package com.jasonandrews.ocja.exercises.chapterfive;

public class MethodMan {

	private String name;
	private String department;
	private int score;
	private int age;

	public static void main(String[] args) {
		MethodMan mm = new MethodMan();
		int value = mm.getScore();
		mm.setAge(55);

	}
	
	private void setName(String name) { 	//private access modifier 
		this.name = name;
	}

	public String getName() {  		//public access modifier 
		return this.name;
	}

	String getDept() {			//default access modifier 
		return department;
	}

	protected int getScore() {		//protected access modifier 
		return this.score;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}