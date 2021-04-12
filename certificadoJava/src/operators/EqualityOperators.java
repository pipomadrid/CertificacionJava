package operators;

import java.io.File;

public class EqualityOperators {
	
	/*
	 * the equals operator == and not equals operator !=. Like the
		relational operators, they compare two operands and return a boolean value
	 * 
	 * The equality operators are used in one of three scenarios:
		1. Comparing two numeric primitive types. If the numeric values are of different data
		types, the values are automatically promoted as previously described. For example,
			5 == 5.00 returns true since the left side is promoted to a double.
		2. Comparing two boolean values.
		3. Comparing two objects, including null and String values
	 * 
	 * 
	 * you cannot mix and match types:
	 * 
	 * 	boolean x = true == 3; // DOES NOT COMPILE
		boolean y = false != "Giraffe"; // DOES NOT COMPILE
		boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
		
		
		For object comparison, the equality operator is applied to the references to the objects,
		not the objects they point to.
		
		Two references are equal if and only if they point to the same
		object, or both point to null(SEE EXAMPLE)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File x = new File("myFile.txt");
		File y = new File("myFile.txt");
		File z = x;
		System.out.println(x == y); // Outputs false
		System.out.println(x == z); // Outputs true
	}

}
