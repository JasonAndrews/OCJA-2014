public class People{

	private int personsNumber;
	private String personsName;
	private int personsScore;

	People(int personsNumber, String personsName, int personsScore) {
		this.personsNumber = personsNumber;
		this.personsName = personsName;
		this.personsScore = personsScore;
	}	
		
	public String toString() {
		return (this.personsNumber + " " + this.personsName + " " + this.personsScore);
	}	

}