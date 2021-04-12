package statements;

public class SwitchStatement {
	
	/*a single value is evaluated and flow is redirected to the first matching branch
	 *know as case statement.ifno such case statement is found , an optional default statement will be called
	 *f no such default option is available, the entire switch statement will be skipped.
	 *
	 *Support data types:
	 *	int and Integer
	 *	byte and Byte
	 *	short and Short
	 *	char and Character
	 *	String
	 *	enum values
	 *
	 *boolean and long are not supported
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// the default block is not required to be in a especial order
		// it,s important to use the break statement to terminate the switch and return flow control 
		int day = 5;
		switch(day) {
		default:
		System.out.println("Weekday");
		break;
		case 0:
		System.out.println("Sunday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		}
		
		
		//IMPORTANT
		// here we have'n't use the break at default so the once he code run into default will continue
		//in order until founds a break statement
		//if the value was 0, all three statements would be output(Sunday,Weekday,Saturday)
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		case 0:
		System.out.println("Sunday");
		default:
		System.out.println("Weekday");
		case 6:
		System.out.println("Saturday");
		break;
		}
		
		//PAY ATTENTION 
		//The exam creators are fond of switch examples that are missing break statements
		
		
		/*
		 * the data type for case statements must all match the data type of the switch variable. As already discussed,
			the case statement value must also be a literal, enum constant, or final constant variable.
		 */
		
		/*private int getSortOrder(String firstName, final String lastName) {
			String middleName = "Patricia";
			final String suffix = "JR";
			int id = 0;
			switch(firstName) {
			case "Test":
			return 52;
			
			case middleName: // DOES NOT COMPILE  (NOT FINAL)
			id = 5;
			break;
			
			case suffix:
			id = 0;
			break;
			
			case lastName: // DOES NOT COMPILE  (final but can't be a parameter)
			id = 8;
			break;
			
			case 5: // DOES NOT COMPILE, no matching type
			id = 7;
			break;
			
			case 'J': // DOES NOT COMPILE  no matching type
			id = 10;
			break;
			
			case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE  no matching type
			id=15;
			break;
			
			}
			return id;
			}
			*/

	}

}
