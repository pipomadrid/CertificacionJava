package OperatorsAndStatements;

public class BinaryOperators {

	
	/*
	 * They can be used to perform mathematical operations on variables,
		create logical expressions, as well as perform basic variable assignments
	 *  include addition (+), subtraction (-), multiplication (*), division (/), and modulus (%).
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x= 2 * 5 +3 * 4 - 8; //  first * and / then evaluates left to rigth
		
		int y = 2 * ((5+3) * 4 - 8); // you can change the order using parentesis around sections you want to evaluate first
		
		System.out.println(x);
		System.out.println(y);
		
		//All of the arithmetic operators may be applied to any Java primitives, except boolean and String(only + and +=)
		
		
		//some modulus examples to remind
		
		System.out.println(9 / 3); // Outputs 3
		System.out.println(9 % 3); // Outputs 0
		
		System.out.println(10 / 3); // Outputs 3
		System.out.println(10 % 3); // Outputs 1 --> 3*3= 9 +   1    = 10   
		
		
		//Numeric Promotion rules
		/*
		 * 
		 * 1. If two values have different data types, Java will automatically promote one of the values
				to the larger of the two data types.
				int x = 1;
				long y =33;
				x * y   will be long
				
		   2. If one of the values is integral and the other is floating-point, Java will automatically
				promote the integral value to the floating-point value’s data type
				int x = 2;
				double y = 2.4;
				x*y will be  double 
				
				
		    3. Smaller data types, namely byte, short, and char, are first promoted to int any time
				they’re used with a Java binary arithmetic operator, even if neither of the operands is
                int.(Unary operators are excluded from this rule. For example, applying ++ to a short value results in a short value)
                	short x = 10;
					short y = 3;
					x/y  will be int
                
			4. After all promotion has occurred and the operands have the same data type, the resulting
            value will have the same data type as its promoted operands
		 * 
		 */
		
	}

}
