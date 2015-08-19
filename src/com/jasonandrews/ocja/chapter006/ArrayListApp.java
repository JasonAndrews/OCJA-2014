import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {

		ArrayListApp ala = new ArrayListApp();
		ala.createList();

		ArrayListApp2 ala2 = new ArrayListApp2();
		ala2.createList();
	}

	public void createList() {
		
		ArrayList<String> myList = new ArrayList<String>();

		String truth = "trek";

		myList.add(" rocks");
		myList.add(truth);
		
		myList.add(truth + truth);
	
		System.out.print(myList.size());
		System.out.print(myList.contains(2012));
		System.out.print(myList.contains("trektrek"));
		myList.remove("trek");
		System.out.print(myList.size());
		System.out.println("");
	}
}

class ArrayListApp2 {

	public void createList() {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(new Integer(1));
		al.add(new Integer(2));

		al.add(0, 2014);

		System.out.println(al.get(0) + " " + al.get(1) + " " + al.size());

	}
	

}