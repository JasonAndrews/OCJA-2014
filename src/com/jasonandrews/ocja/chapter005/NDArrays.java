
public class NDArrays { //Multi Dimensional Array.

	private static final int TOTAL_STUDENTS = 12;
	private static final int MAX_SUBJECTS = 5;

	public static void main(String[] args) {
		new NDArrays().createClass();
	}

	private void createClass() {

		String[][] studentsSubjects = new String[TOTAL_STUDENTS][MAX_SUBJECTS];	

		int studentCounter = 0;
		int subjectCounter = 0;			
		for(String[] students : studentsSubjects) {				
			System.out.println("Student " + ++studentCounter);
			for(int i = 0; i < students.length; ++i) {
				students[i] = "Subject " + ++subjectCounter;					
			}
			System.out.println("Subjects " + java.util.Arrays.toString(students));
			//subjectCounter = 0;
		}
		int[][] studentsExamResults = {{45, 55, 59},{75, 82, 79},{86, 81, 83},{41,40},{39,43,44}};

		studentCounter = 0;
		for(int[] intArray : studentsExamResults) {
			System.out.println("Results For Student " + ++studentCounter);
			for(int i = 0; i < intArray.length; ++i) {
				System.out.println("Scored " + intArray[i] + " on exam " + i + "."); 
			}
		}
	}
}