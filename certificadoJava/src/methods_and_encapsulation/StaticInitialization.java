package methods_and_encapsulation;

public class StaticInitialization {
	/*
	 * Remember instance initialializers . Just code inside braces
	 * 
	 *Static initializers look similar:
	 *
	 *
	 *REMENBER --> TRY TO AVOID USE INSTANCE AND STATIC INITIALIZERS 
	 *
	 *private static final int NUM_SECONDS_PER_HOUR;
	 *
	 *static {
	 *
	 *  int numSecondsPerMinute = 60;
	 *	int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	 *
	 *}
	 *
	 *It runs when the class is first used
	 *
	 *
	 *
	 *
	 * 
	 */

	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four; //Must be initialized
	
	static {
		one = 1;
		two = 2;
		three = 3;// DOES NOT COMPILE we can't reasign a final field
		two = 4;// DOES NOT COMPILE  again we can't reasig a final field
			
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
