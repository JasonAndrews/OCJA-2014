public class EraCalculator {

	private static final float LEAGUE_AVERAGE_ERA = 4.25F;

	public static void main(String[] args) {
			
		int earnedRuns = 3;
		int inningsPitched = 6;
		int inningsInAGame = 9;
		
		//float leagueAverageEra = 4.25F;
		float era = ( (float) earnedRuns / (float) inningsPitched) * inningsInAGame;
		
		boolean betterThanAverage = (era < LEAGUE_AVERAGE_ERA); //In Baseball, the lower the ERA, the better the score is.

		char yesNo = betterThanAverage ? 'Y' : 'N';

		System.out.println("Earned Runs\t\t" + earnedRuns);
		System.out.println("Innings Pitched\t\t" + inningsPitched);
		System.out.println("ERA\t\t\t" + era);
		System.out.println("League Average ERA\t" + LEAGUE_AVERAGE_ERA);
		System.out.println("Is player better than league average " + yesNo);
	}
}
