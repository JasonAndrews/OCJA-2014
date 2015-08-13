import java.util.Scanner;

public class Arraysia{

	//private static final int TOTAL_DIMENSIONS = 3;
	private static int sizeOfDimension = 100;

	private boolean[][][] locations;
	private int numOfLocations;
;	private static boolean userSpecifiesSize = true;
	private static boolean userHidesElisa = true;
	private static boolean multiplyUserHidesElisa = false;

	private static final int WORLD_CREATION = 1;
	private static final int HIDING_ELISA = 2;
	private static final int FINDING_ELISA = 3;
		
	private static Thread findThread;
	private static Thread saveThread;
	
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		//System.out.println("Hello World.");
		
		Arraysia as = new Arraysia();
		as.createWorld(); //Create the world.
		as.hideElisa();   //Hide Elisa, whether it be randomly or user specified.
		
		System.out.println("Number of locations entered: " + as.numOfLocations);
		Finder finder = new Finder(as.locations, as.numOfLocations);		

		as.findElisa();	  //Loop through the arrays to try find her position.
	}
		
	public void createWorld() {
		if(!userSpecifiesSize) {
			locations = new boolean[sizeOfDimension][sizeOfDimension][sizeOfDimension];		
		} else {
			int size = 0;
			while(size < 1)	{
				size = this.getValueFromInput("Please select the size of the dimensions: ", WORLD_CREATION);
			}	
			locations = new boolean[size][size][size];	
			sizeOfDimension = size;	
		}
	}

	public void hideElisa() {
		//String outputMessage = "Please enter a first coord (0 - " +sizeOfDimension + "): ";
		int[] elisasLocation = {-1, -1, -1};
		boolean repeatMethod = false;
		if(!userHidesElisa) {
			elisasLocation[0] = (int)(Math.random() * sizeOfDimension);
			elisasLocation[1] = (int)(Math.random() * sizeOfDimension);
			elisasLocation[2] = (int)(Math.random() * sizeOfDimension);			
		} else {
						
			while(elisasLocation[0] < 0 || (elisasLocation[0] >= sizeOfDimension)) {
				elisasLocation[0] = this.getValueFromInput("Please enter a first coord (0 - " +(sizeOfDimension-1)+ "): ", HIDING_ELISA);			
			}
			while(elisasLocation[1] < 0 || (elisasLocation[1] >= sizeOfDimension)) {
				elisasLocation[1] = this.getValueFromInput("Please enter a second coord (0 - " +(sizeOfDimension-1) + "): ", HIDING_ELISA);				
			}
			while(elisasLocation[2] < 0 || (elisasLocation[2] >= sizeOfDimension)) {
				elisasLocation[2] = this.getValueFromInput("Please enter a third coord (0 - " +(sizeOfDimension-1)+ "): ", HIDING_ELISA);
			}
		} 
		locations[elisasLocation[0]][elisasLocation[1]][elisasLocation[2]] = true;
		System.out.println("Elisa is at location " + elisasLocation[0] + " " + elisasLocation[1] + " " + elisasLocation[2] + ".");

		while(true) {
			System.out.print("Do you wish to select another location for Elisa and her friends to hide? (Y or N): ");
			String choice = reader.nextLine();
			choice = choice.toUpperCase();

			if(choice.charAt(0) == 'Y') {
				repeatMethod = true;		
				break;
			}
			else if(choice.charAt(0) == 'N') {
				repeatMethod = false;
				break;
			}
		}
		++numOfLocations;
		if(repeatMethod) {
			this.hideElisa();
		}
	}
	
	public void findElisa() {

		//Thread.currentThread().interrupt();
		
		boolean elisasLocationFound = false;
		
		for(int i = 0; i < locations.length; ++i) {
			for(int j = 0; j < locations[i].length; ++j) {					
				for(int k = 0; k < locations[i][j].length; ++k) {
					if(locations[i][j][k]) {
						//System.out.println(""+findThread.getId());
						//System.out.println(""+saveThread.getId());
						//this
						//System.out.println(""+saveThread.isAlive());
						//System.out.println("Current Thread: "+Thread.currentThread().getId());
						//System.out.println("Found her at position " + i + " " +j + " " + k + "!");
					}	
				}				
			}
		
		}
		//System.out.println("Elisa was found!");
	}

	private int getValueFromInput(String messageToShow, int methodUsage) {

		String invalidInputErrorMsg = null;
		
		switch(methodUsage) {
		
			case WORLD_CREATION : { invalidInputErrorMsg = "\nPlease enter a value from 1 and upwards!\n"; break; }
			case HIDING_ELISA : { invalidInputErrorMsg = "\nPlease enter a value from 0 - " + (sizeOfDimension-1) + "!\n"; break; }
			case FINDING_ELISA : { invalidInputErrorMsg = "\nPlease enter a value from 0 - " + (sizeOfDimension-1) + "!\n"; break; }
		}
		
		System.out.print(messageToShow);		
		String input = reader.nextLine();
		int value = -1;
		try { 
			value = Integer.parseInt(input); 
		} catch (Exception e) { 
			System.out.println(invalidInputErrorMsg);
			value = -1; 
		}
		return value;

	}
	
}

class Finder implements Runnable { 

	private boolean[][][] locations;
	private int numOfLocations;
	private boolean[] locationSaved;
	Thread saveThread;
	Thread killThread;

	private static boolean elisaFound;
	

	public Finder(boolean[][][] locations, int numOfLocations) {
		this.numOfLocations = numOfLocations;
		this.locations = locations;
		this.locationSaved = new boolean[numOfLocations];
		if(null == saveThread) {
			//System.out.println("Created Saver Thread");
			saveThread = new Thread(this);
			saveThread.setName("Saver Thread");
			saveThread.setPriority(Thread.MAX_PRIORITY);
			saveThread.start();
		}	
		if(null == killThread) {
			//System.out.println("Created Killer Thread");
			killThread = new Thread(this);
			killThread.setName("Killer Thread");
			killThread.setPriority(Thread.MAX_PRIORITY);
			killThread.start();
		}
	}
	
	public void run() {
		//System.out.println("Run method starting on thread : " + Thread.currentThread().getName() + ".");
		if(Thread.currentThread().getName().equals("Killer Thread")) {
			try {
				//Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n");
		int currentLocation = 0;
		for(int i = 0; i < locations.length; ++i) {
			for(int j = 0; j < locations[i].length; ++j) {					
				for(int k = 0; k < locations[i][j].length; ++k) {
					if(locations[i][j][k]) {
						
						if(!locationSaved[currentLocation]) {
																											if(Thread.currentThread().getName().equals("Saver Thread")) {
								locationSaved[currentLocation] = true;	
								System.out.println("Wooho! The saver got to them first!");
								//Remove below.
								try {
									killThread.sleep(10);
								} catch (Exception e) {
								
								}
							} else { 
								System.out.println("The killer got to them first!");
								try {
									saveThread.sleep(10);
								} catch (Exception e) {
								
								}
							}
						}	
						System.out.print(Thread.currentThread().getName() + " found her at position " + i + " " +j + " " + k+"!\n"); 							currentLocation++;
					}	
				}				
			}
		
		}
		//System.out.println("\n");		
	}
}

