package com.jasonandrews.ocja.exercises.chapterthree;

public class ReplaceApp {


	public static void main(String[] args) {

		String str = "Java rocks";

		str = str.replace('a', 'o');
		System.out.println(str);
		str = str.replace("vo", "hn");
		System.out.println(str);
		str = str.replace("ro", "ha");
		System.out.println(str);
		str = str.replace(' ', '-');
		System.out.println(str);


	}

}