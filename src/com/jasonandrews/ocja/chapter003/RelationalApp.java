import java.util.Scanner;

public class RelationalApp {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
/*		for(char c = 21; c < 161; ++c) {
			System.out.print(c + " ");
			if(c%10 == 0) {
				System.out.println("");
			}
		}	

		for(int i = 65, j = i+32; i < (int) 'z'; ++i, ++j) {
			if(i <= (int) 'Z') {
				System.out.println("Is " + (char) i + " greater than " + (char) j + "? Answer: " + (i > j) + "!");
			}
		}
*/		
		String tempChar;

		char firstChar = 0;
		char secondChar = 0;
			
		System.out.print("\nPlease enter your first character: ");	

		tempChar = reader.nextLine();
	

		if(tempChar.length() == 1) {
			firstChar = tempChar.charAt(0);
		} else {
			System.out.println("You can only enter one character!");
		}
	
		System.out.print("Please enter your second character: ");	
		tempChar = reader.nextLine();

		if(tempChar.length() == 1) {
			secondChar = tempChar.charAt(0);
		} else {
			System.out.println("You can only enter one character!");
		}
		
		System.out.println("In ascending order: ");
		if(firstChar < secondChar) {
			System.out.println(firstChar + " [" + (int) firstChar +"]\n" + secondChar + " [" +(int) secondChar+ "]");
		} else {
			System.out.println(secondChar + " [" + (int) secondChar +"]\n" + firstChar + " [" +(int) firstChar+ "]");
		}
	}
}