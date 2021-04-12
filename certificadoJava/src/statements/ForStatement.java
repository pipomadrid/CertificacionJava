package statements;

public class ForStatement {
	
	/*The Basic for Statement
	 * 
	 * has the same conditional boolean expression and statement, or block of
	 * statements, as the other loops you have seen ,as well as two new sections: an initialization
	 * block and an update statement.
	 * 
	 * 
	 * The initialization and update sections 
	 * may contain multiple statements, separated by commas.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=0;i<10;i++) {// variable i is only accessible within(dentro)  the loop
			
			System.out.println(i + " hola");
			
		}
		
		/*INFINITE LOOP
		 * 
		 * for( ; ; ) {
				System.out.println("Hello World");
			}
			
			
		 */
		
		
		//Adding Multiple Terms to the for Statement
		
		int x = 0;//you can declare a variable, such as x in this example, before the loop begins and use it after it completes.
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			
			/*your initialization block, boolean expression, and update statements
			can include extra variables that may not reference each other.
			
			z is defined in the initialization block and is never used.
			
			Finally, the update statement can modify multiple variables.
			
			 */
			System.out.print(y + " ");
			
			}
		System.out.println();
		System.out.print(x);
		
		/*
		 * the next not compile
		 */
		
		//1--Redeclaring a Variable in the Initialization Block
		int x = 0;
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
		System.out.print(x + " ");
		}
		
		/*
		 * 
		 * We can fix this loop by changing the declaration of x and y as follows:
			int x = 0;
			long y = 10;
			for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
				System.out.print(x + " ");
			}
			
			
			Note that this variation will now compile because the initialization block simply assigns a
			value to x and does not declare it.
		 */
		
		//2 --The variables in the initialization block must all be of the same type.
		
		/*
		 * 
		 * 
		 * for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
			}
		 */
		//3-- Using loop variables outside the loop
		
		/*
		 * 
		 * 
			for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
				System.out.print(y + " ");
				}
			System.out.print(x); // DOES NOT COMPILE
		 */
		
	}

}
