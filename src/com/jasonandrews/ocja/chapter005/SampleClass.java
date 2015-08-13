public class SampleClass {

	public static void main(String[] args) {
		new SampleClass().sampleMethod();
	}

	void sampleMethod() {	//Start of code block A
		int totalCount = 0;

		for(int i = 0; i < 3; i++) {	//Start of code block B
	
			int forCount = 0;
			totalCount++;
			forCount++;

			{	//Start of code block C
				int block1Count = 0;
				totalCount++;
				forCount++;
				block1Count++;
			}	//End of code block C

			{	//Start of code block D
				int block2Count = 0;
				totalCount++;
				forCount++;
				block2Count++;
			}	//End of code block D

			/* These two variables have no relation to the above ones of the same name */

			int block1Count;
			int block2Count;

		}//End of code block B

	}//End of code block A
}