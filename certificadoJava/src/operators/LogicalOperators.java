package operators;

public class LogicalOperators {
	
	/*
	 * The logical operators, (&), (|), and (^), may be applied to both numeric and boolean data
		types
	 * When they’re applied to boolean -->logical operators
	 *
	 * When applied to numeric data types  -->bitwise operators(comparison of bits)
	 * 
	 * 
	 * x & y:
	 * x = true , y = true --> true
	 * x =false , y = true -->false
	 * x =true , y = false -->false
	 * x =false , y = false -->false
	 * 
	 * x | y:
	 * x = true , y = true --> true
	 * x =false , y = true -->true
	 * x =true , y = false -->true
	 * x =false , y = false -->false
	 * 
	 * x ^ y:
	 * x = true , y = true --> false
	 * x =false , y = true -->true
	 * x =true , y = false -->true
	 * x =false , y = false -->false
	 * 
	 * 
	 * Finally we have &&, ||:
	 * nearly identical to the logical operators,& and |, respectively
	 * the rigth side of the expression may be never evaluated if the final result can be
	 * determined by the left- hand side of the expression:
	 * 
	 * boolean x = true || (y < 4); x can only be false if the two sides are false, her we know that the left side is true
	 * , there,is no need to evaluate the second condition
	 * 
	 * A more common example of where short-circuit operators are used is checking for null
			objects before performing an operation, such as this:
		if(x != null && x.getValue() < 5) {
		// Do something
		}
		
	 * if x was null, then the short-circuit(&&) prevents a NullPointerException
	 * 
	 * if(x != null & x.getValue() < 5) { // Throws an exception if x is null
			// Do something
			}
			
			
			PAY ATENTION
		if alter a varaible on the rigth hand that is never reached.See example on main:
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 6;
		boolean y = (x >= 6) || (++x <= 7);// x++ is never reached because there is no need to evaluate it, so the value will not change
		System.out.println(x);
		
		
	}

}
