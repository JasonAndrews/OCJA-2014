public class PersonApp {

	public static void main(String[] args) {
		Person me = new Person("Jayceon", 21);
		Person you = new Person("Robert", 30);

		System.out.println("My name is " + me.getName() + " and my age is " + me.getAge() + ".");
		System.out.println("Your name is " + you.getName() + " and your age is " + you.getAge() + ".");

		me = null;
		you = null;
	}

}