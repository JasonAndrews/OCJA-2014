public class ChildClass extends ParentClass {

	public ChildClass() {
		System.out.println("ChildClass Constructor!");
	}
	public ChildClass(String str) {
		super(str);
		System.out.println("ChildClass Constructor " + str + "!");
	}

}