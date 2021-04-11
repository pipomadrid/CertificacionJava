package OperatorsAndStatements;

public class CompoundAssignmentOperators {
	
	/*
	 * Only -= and += are neccesary for the exam
	 * 
	 * 	forms of the simple assignment
		operator, with a built-in arithmetic or logical operation 
		 and stores the resulting value in a variable in the left-hand side of the
		statement
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2, z = 3;
		x = x * z; // Simple assignment operator
		x *= z; // Compound assignment operator
		
		// x  must be a variable annd must be declared too before use the compound assigment

		
		/*
		 * Compound operators are useful for more than just shorthand—they can also save us
			from having to explicitly cast a value.
				long h = 10;
				int f = 5;
				h = f * x; // DOES NOT COMPILE	
			
		 */
		
		long h = 10;
		int f = 5;
		f *= h; // The compound operator will first cast h to a long, apply the multiplication of two long
		//values, and then cast the result to an int.
		
		//The exam creators are fond
		//of inserting the assignment operator = in the middle of an expression and using the value of
		//the assignment as part of a more complex expression:
		
		long myLong = 5;
		long myLong2 = (x=3);
		System.out.println(myLong); // Outputs 3
		System.out.println(myLong2); // Also, outputs 3
	}

}
