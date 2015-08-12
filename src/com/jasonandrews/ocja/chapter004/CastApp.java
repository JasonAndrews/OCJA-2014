public class CastApp {


	public static void main(String[] args) {
		
		int randomChar = (int) (Math.random() * 126); // give me a random char, Math.random() returns a double so I explicitly cast it to an integer.
		if(randomChar < 32) randomChar += 32; // +32 so it gives a number greater than the decimal character of ' ' (space).
		System.out.println(randomChar + " " + (char) randomChar); // now with the integer value, I cast it to a char so it returns the character.
		

	
		float num = 72F;

		int in = (int) num; // explicit conversion.

		float time = 300; //implicit conversion.
		
		System.out.println(in + " " + time);
	}

}