package operators;

public class TernaryOperator {
	
	
	/*
	 * 
	 * 
	 * ternary operator, is the only operator that takes three operands and is of the form:
	 * 
	 * booleanExpression ? expression1 : expression2
	 * 
	 * The first operand must be a boolean expression, and the second and third can be any expression that returns a value
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 10;
		int x = (y > 5) ? (2 * y) : (3 * y);// parenthesis is not required
		/*
		 * equivalent to :
		 * int y = 10;
		   int x;
		   if(y > 5) {
		   		x = 2 * y;
		   } else {
				x = 3 * y;
			}
		 */
		System.out.println(x);
		
		
		System.out.println((y > 5) ? 21 : "Zebra");
		
		//int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE
		
		//only one of the right-hand expressions of the ternary operator will be evaluated
		//at runtime. In a manner similar to the short-circuit operators:
		
		int num1= 1;
		int num2 = 1;
		final int num3= num1<10 ? num1++ : num2++;
		System.out.println(num1 + "," + num2); // Outputs 2,1 only num1 will be increment
		
		
		
		int num4 = 1;
		int num5 = 1;
		final int num6 = num4>=10 ? num4++ : num5++;
		System.out.println(num4 + "," + num5); // Outputs 1,2  only num5 will be increment

	}

}
