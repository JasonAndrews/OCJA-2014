public class Boxer {

	public static void main(String[] args) {

		Boxer box = new Boxer();

		System.out.println(box.boxingDay(26)); // prints false;
	
	}
	
	private boolean boxingDay(Integer day) { 	// boxes the int argument.
			
		Boolean isBox = true;			// boxes the literal.

		Short num = 360;			//boxes the primitive.

		if(isBox) {				//unboxes.
			System.out.println(++num);	//unboxes, increments and boxes. Prints 361.
		}
		
		return !isBox;				//unbox and return inverse.

	}

}