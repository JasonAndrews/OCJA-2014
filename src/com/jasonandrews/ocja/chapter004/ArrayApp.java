

public class ArrayApp {

	private static final int MAX_POSSIBLE_SCORE = 100;

	public static void main(String[] args) {

		int[] scores = new int[10];	//Create an array of ints with the size being 10.	

		int totalScore = 0; 			//will store the total score.
		int meanScore = 0;  			//will store the mean/average score.
		int maxScore = -1;  			//will store the max score.
		int minScore = MAX_POSSIBLE_SCORE;	//will store the min score.

		//assigning random values.
		for(int i = 0; i < scores.length; ++i) {
			scores[i] = (int) (Math.random() * 100); 	//do the random calculation first, then cast it.
			//Math.random() returns a double but I cast it to an integer here.
		}

		//printing out the values of the array.
		for(int i : scores) { //enhanced for loop to iterate through the array.
			System.out.println(i);
			totalScore += i; //calculating the total score, add each value to the totalScore variable.
		
			if(i < minScore) minScore = i; 	//find the min score, if the value of i is less than the current value of minScore, then set minScore as the value of i.
			if(i > maxScore) maxScore = i; 	//find the max score, same as above but for the max value instead.
		}

		meanScore = (totalScore / scores.length);	//calculating the mean/average score.

		System.out.println("The mean score is " + meanScore + ".");
		System.out.println("The maximum score is " + maxScore + ".");
		System.out.println("The minimum score is " + minScore + ".");
	}
}