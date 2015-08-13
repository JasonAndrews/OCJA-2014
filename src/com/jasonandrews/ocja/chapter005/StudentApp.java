public class StudentApp {


	public static void main(String[] args) {
		
		Student[] studentList = new Student[3];
		for(int i = 0; i < studentList.length; ++i) {
			studentList[i] = new Student();

			System.out.println(studentList[i].getNumber());		
			//System.out.println(Student.getPop());
		}	
		System.out.println(Student.getPop());	
	}
}