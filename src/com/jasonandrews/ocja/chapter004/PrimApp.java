
import java.util.Scanner;

public class PrimApp {

	private byte memberByte;	
	private boolean memberBoolean;
	private char memberChar = 0;

	public static void main(String[] args) {

		new PrimApp().testPrims();
	}

	public void testPrims() {
		byte myByte = -1;
		short myShort = -1;
		int myInt = -1;
		long myLong = -1L;
			
		float myFloat = -1.0F;
		double myDouble = -1.0D;

		char myChar = 0;
		
		boolean myBoolean = false;			
		

		Scanner reader = new Scanner(System.in);
		try {

			do {
				System.out.print("Please enter in a byte value: ");
				myByte = reader.nextByte();	
			} while (myByte == -1);


		} catch (java.util.InputMismatchException e) {

		}
/*		
		System.out.print("Please enter in a byte value: ");		
		myByte = reader.nextByte();	

		System.out.print("Please enter in a short value: ");
		myShort = reader.nextShort();

		System.out.print("Please enter in a int value: ");
		myInt = reader.nextInt();

		System.out.print("Please enter in a long value: ");
		myLong = reader.nextLong();

		System.out.print("Please enter in a float value: ");
		myFloat = reader.nextFloat();

		System.out.print("Please enter in a double value: ");
		myDouble = reader.nextDouble();

		System.out.print("Please enter in a char value: ");
		myChar = reader.next().charAt(0);

		System.out.print("Please enter in a boolean value: ");
		myBoolean = reader.nextBoolean();
*/		
		System.out.println("");
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println("");

		//this.memberByte = 1000;  //possible loss of precision - found int when byte is required.
		//this.memberBoolean = 1; //incompatible types - found int when boolean is required.
		//this.memberChar = 80000; //possible loss of precision - found int when char is required.	
		
		System.out.println("Default value for byte is: " + this.memberByte);
		System.out.println("Default value for boolean is: " + this.memberBoolean);
		System.out.println("Default value for char is: <" + this.memberChar + ">");
		//System.out.println("Default value for char is: <" + '\u80000' + ">"); // unclosed character literal error.

		//byte players1 = 0.0; //possible loss of precision.
		//short players2 = 0.0; //possible loss of precison.
		//int players3 = 0.0;  //possible loss of precision.
		//long players4 = 0.0; //possible loss of precision.

		int age = 100/3;
		System.out.print(age); // will print out 33, it will remove the .333333.. part.

		
		//do {
			
			//try {
			
				
			//} catch (java.util.InputMismatchException e) {

			//}
		//} while (myByte == -1);	
	}
}