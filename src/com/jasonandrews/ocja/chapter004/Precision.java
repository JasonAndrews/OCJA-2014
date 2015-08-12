public class Precision {


	public static void main(String[] args) {

		new Precision().investigate();

	}

	public void investigate() {

		float debt = 169175764521.123456F;
		System.out.println(debt);
		System.out.printf("%f, %d\n", debt, 5000);

		String formattedStr = null;

		formattedStr= formattedStr.format("Fuel: %f Litres | Health: %d", 33.0F, 90);
		System.out.print(formattedStr);

	}
}