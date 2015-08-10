public class EqualityTest {

	public static void main(String[] args) {

		Integer value1 = new Integer("312");
		Integer value2 = new Integer("312");
		System.out.println(value1.equals(value2));

		EqualityTest object1 = new EqualityTest();
		EqualityTest object2 = new EqualityTest();
		System.out.println(object1.equals(object2));		

		//System.out.print(true | false & true + ","); //Will not compile because the concatenation of a boolean and a string is not allowed.
		System.out.print((true | false & true) + ","); //It will compile.
	}


}