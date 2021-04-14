package statements;

public class ContinueStatement {
	
	/*
	 * a statement that causes flow to finish the execution of the current loop.
	 * While the break statement transfers control to the enclosing statement, the continue
		statement transfers control to the boolean expression that determines if the loop should
		continue.
		In other words, it ends the current iteration of the loop
		
		the continue statement is applied to the nearest inner loop under execution
		using optional label statements to override this behavior.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;//the loop will return control to the parent loop any time the first value is 2 or the second value is b.
				System.out.print(" " + a + x);
				
				//output 1a 3a 4a
				
				//Now, imagine we removed the FIRST_CHAR_LOOP label in the continue statement so that
				//control is returned to the inner loop instead of the outer:
				
				//output  1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
				
				/*
				 * 
				 * 
				 * 
				 * Alows optional labels  Allows break statement   Allows continue statemen
				if     Yes *                      No                         No
               while   Yes                        Yes                        Yes
               do while Yes                       Yes                        Yes
               for      Yes                       Yes                        Yes
               switch   Yes                       Yes                        No
				 */
			}
		}
	}

}
