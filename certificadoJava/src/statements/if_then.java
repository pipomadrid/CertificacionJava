package statements;

public class if_then {

	
	
/*Java statement is a complete unit of execution in Java, terminated with a semicolon (;)
 * 
 * Control flow statements break up the flow
 * of execution by using decision making, looping, and branching, allowing the application to
 * selectively execute particular segments of code.
 * 
 * 
 * IF-THEN
 * only want to execute a block of code under certain circumstances
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int	hourOfDay = 5;
		if(hourOfDay<11)
			System.out.println("Good morning");// no braces here, only for single statements


		if(hourOfDay<4)
			System.out.println("Wake");// if we want to put multiple statements  we have to put the braces on
		System.out.println("I am not in the if statement , you have to surround with braces");//PAY ATTENTION ON EXAM


		//If_Then_Else

		if(hourOfDay < 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Afternoon");
		}
		
		
		//If_then_elseif_else
		
		// if neither of the two first expressions are true , it will execute the code of the else block
		
		if(hourOfDay < 11) {
			System.out.println("Good Morning");
			} else if(hourOfDay < 15) {
			System.out.println("Good Afternoon");
			} else {
			System.out.println("Good Evening");
			}

		
		// the order is important:
		if(hourOfDay < 15) {
			System.out.println("Good Afternoon");
			} else if(hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
			} else {
			System.out.println("Good Evening");
			}
		
		//PAY ATTENTION ON EXAM
		
		/*
		 * Another common place the exam may try to lead you astray is by providing code where
			the boolean expression inside the if-then statement is not actually a boolean expression:
			
		int x = 1;
		if(x) { // DOES NOT COMPILE
		
		
		int x = 1;
		if(x = 5) { // DOES NOT COMPILE
		...
		}
		
		
		
		
		 */
		

			
		}
		
		
	}

	
	

}
