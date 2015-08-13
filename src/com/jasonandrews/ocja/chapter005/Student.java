public class Student {

	private static long pop = 0L;
	private long number = 0L;

	Student() {
		this.number = ++pop;
	}
	
	public static long getPop() {
		return pop;
	}

	public long getNumber() {
		return this.number;
	}

}