package com.jasonandrews.ocja.exercises.chapterthree;

import java.util.ArrayList;

public class StringBuilderApp{

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Please enter your name: ");
		ArrayList<StringBuilder> sbList = new ArrayList<StringBuilder>();

		sbList.add(sb);
		sbList.add(new StringBuilder("Please enter your age: "));
		sbList.add(new StringBuilder("Please enter your nationality: "));
		sbList.add(new StringBuilder("Please enter your current address?: "));	
		for(StringBuilder tempSb : sbList) {
			System.out.println(tempSb);
		}	

		StringBuilder sb2 = sb.append("Jason");
		System.out.println(sb2);

		StringBuilder sb3 = new StringBuilder("What is the sum of 5 multiplied by 5?: " + (5*5));
		System.out.println(sb3);
	
		StringBuilder tempSb1 = new StringBuilder("Hello");
		StringBuilder tempSb2 = new StringBuilder("World");

		System.out.println(tempSb1+"55"+tempSb2);
		
		// Or we could use the 2 lines below. 
		StringBuilder tempSb3 = new StringBuilder( (tempSb1.insert(tempSb1.length(),"55")) + ""+tempSb2);
		//System.out.println(tempSb3);
		
		StringBuilderApp sba = new StringBuilderApp();
		StringBuilder sb25 = new StringBuilder("Hello");
		sb25 = sba.insert(sb25,1,"illy y");
		System.out.println(sb25);

		tempSb3.delete(tempSb1.length()-2, tempSb1.length());
		
		StringBuilder tempSb3Two = new StringBuilder(""+tempSb3);
		System.out.println("The value of tempSb3 is: " + tempSb3);
		for(int i = 0; i < tempSb3.length(); ++i) {
			
			//System.out.println(j);
			if(i%2 == 1) {
				tempSb3.delete(i,(i+1));
			}
		}
		System.out.println(tempSb3);
		
		StringBuilder palindrome = null;
		boolean isPalindrome = false;

		palindrome = new StringBuilder("2002");
		
		if((""+palindrome).equalsIgnoreCase(""+palindrome.reverse())) {
			System.out.println("Yes, it's a palindrome!");
		} else {
			System.out.println("Nope, it's not a palindrome!");			
		}

		//System.out.print
	}

	public StringBuilder insert(StringBuilder sb, int index, String strToInsert) {
		StringBuilder finalSb = new StringBuilder();

		String afterIndexStr = null;
		String beforeIndexStr = null;

		afterIndexStr = sb.substring(index);
		beforeIndexStr = sb.substring(0,index);
		
		sb = null;
		finalSb.append(beforeIndexStr).append(strToInsert).append(afterIndexStr);
		return finalSb;
	}


}