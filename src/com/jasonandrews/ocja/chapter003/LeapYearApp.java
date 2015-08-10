public class LeapYearApp {

	public static void main(String[] args) {
		
		LeapYearApp la = new LeapYearApp();
		
		int year = 2014;		
		if(args.length > 0) {
			year = Integer.parseInt(args[0]);
		}
		boolean result = la.isLeapYear(year);
		System.out.println("Is the year "+year+" a leap year?: " + result + ".");
	} //main

	private boolean isLeapYear(int year) {
		//return ((year % 4) == 0 && !(year%100) == 0);	
		//return ((year%4) == 0 && (!((year%100) == 0) || (year%400) == 0));
		return ((year%4) == 0 && (!(year % 100 == 0) || year%400 == 0));

/*		if((year%4) == 0) {
			if((year%100) == 0) {
				if((year%400) == 0) {
					return true;
				} else {
					return false;
				}		
			} else {
				return true;
			}
		}
		else {
			return false;
		}
*/
	} //isLeapYear

} //class

/*
	
	1: The year is evenly divisible by 4; [DONE]
	2: If the year can be evenly divided by 100, it is NOT a leap year, unless; [DONE]
	3: The year is also evenly divisible by 400. Then it is a leap year. [DONE]
	
*/