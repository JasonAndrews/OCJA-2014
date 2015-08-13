public class ArrayConstructionApp {

	public static final int TOTAL_PEOPLE_IN_CLASS = 16;
	public static final int TOTAL_SCORES_PER_PERSON = 3;
	
	public static void main(String[] args) {				

		People[] classMembers = new People[TOTAL_PEOPLE_IN_CLASS];

		String[] peoplesFirstNames = {"Gordon", "Amir", "Jason", "Colin", "Stephen", "Briggsy", "Sebastian", "Frank", "Martin", "Sam", "Colin", "Stephen", "JP", "Anders", "Andrew", "Gary"};//new String[TOTAL_PEOPLE_IN_CLASS];
	
		
		int[][] peoplesScores = new int[TOTAL_PEOPLE_IN_CLASS][TOTAL_SCORES_PER_PERSON]; //All elements set to 0 by default.
		for(int i = 0; i < peoplesScores.length; ++i) {
			for(int j = 0; j < TOTAL_SCORES_PER_PERSON; ++j) {
				peoplesScores[i][j] = -1;
				
			}
		}	// Setting the value of each element to -1 so I know what hasn't been changed.

		for(int i = 0; i < peoplesScores.length; ++i) {
			for(int j = 0; j < TOTAL_SCORES_PER_PERSON; ++j) {
				peoplesScores[i][j] = (int) (Math.random() * 100);				
			}
		}

		for(int i = 0; i < classMembers.length; ++i) {
			classMembers[i] = new People(peoplesFirstNames[i], peoplesScores[i]); 
		}
		
		for(People person : classMembers) {
			System.out.println(person);
		}



/*
		String[] copiedFirstNames = new String[5];
		System.arraycopy(peoplesFirstNames, 2, copiedFirstNames, 0, 5);	//Copy the elements of the peoplesFirstNames array starting at index 2, and pasting them into the array copiedFirstNames starting at element 0 and copying 5 altogether.
	
		for(int i = 0; i < copiedFirstNames.length; ++i) {
			System.out.println(copiedFirstNames[i]+ ".");	
		}

		System.out.println("----------------------------\n----------------------------");
		String[] clockTypes = {"Wrist Watch", "Desk Clock", "Wall Clock"};
		String[] newClockTypes = new String[2];
		System.arraycopy(clockTypes, 0, newClockTypes, 0, 2);
		for(String s : clockTypes) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
		for(String s : newClockTypes) {
			System.out.println(s);
		}
*/
	}
}

class People{
	//public static final int TOTAL_SCORES_PER_PERSON = 3;
	private static int totalPeople = 0;	

	private int personsNumber;
	private String personsName;
	private int[] personsScores;// = new int[ArrayConstructionApp.TOTAL_SCORES_PER_PERSON];

	People(String personsName, int[] personsScore) {
		this.personsNumber = ++totalPeople;
		this.personsName = personsName;
		this.personsScores = personsScore;
		
	}	
		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.personsNumber + " " + this.personsName);
		for(int i = 0; i < ArrayConstructionApp.TOTAL_SCORES_PER_PERSON; ++i) {
			sb.append(" " + this.personsScores[i]);
		}
		return sb.toString();
	}	
}