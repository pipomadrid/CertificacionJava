package OperatorsAndStatements;

public class AssigmentOperators {
	
	/*
	 * ASIGMENT OPERATORS 
	 * An assignment operator is a binary operator that modifies, or assigns, the variable on
	 * the left-hand side of the operator.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1; // simplest assignment operator is the = assignment
		
		
		// Java will automatically promote from smaller to larger data types
		//will throw a compiler exception if it detects you are trying to convert from larger to smaller data types.
		
		
		/*
		 * int x = 1.0; // DOES NOT COMPILE 
		 * short y = 1921222; // DOES NOT COMPILE 
		 * int z = 9f; // DOES NOT COMPILE 
		 * long t = 192301398193810323; // DOES NOT COMPILE  we have to put the L at the end
		 *   
		 */
		
		
		/*    CASTING PRIMITIVES VALUES
		 * We can fix the examples in the previous section by casting the results to a smaller data type.
		 * 
		 * 
		 * 
		 * 	int x = (int)1.0;
		 * 
		 *	Overflow is when a number is so large that it will no longer fi t
		 	within the data type, so the system “wraps around” to the next lowest value and counts
		 	up from there:
		 
			short y = (short)1921222; //Stored as 20678 
			
			int z = (int)9l;
			long t = 192301398193810323L;
			
			
			
			short x = 10;
			short y = 3;
			short z = x * y; // DOES NOT COMPILE
			
			short z = (short)x * y; // COMPILE
		 */
	
	
	}

}
