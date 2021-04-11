package OperatorsAndStatements;

public class UnaryOperators {

	
	/*
	 * requires only one operand or variable to function 
	 * 
	 * +     Indicates a number is positive, although numbers are assumed
				to be positive in Java unless accompanied by a negative unary
				operator
	 * -     Indicates a literal number is negative or negates an expression
	 * 
	 * ++     Increments a value by 1
	 * 
	 * --     Decrements a value by 1
	 * 
	 * !      Inverts a Boolean’s logical value
	 *
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean x = false;
		System.out.println(x); // false
		x = !x;
		System.out.println(x); // true
		
		//nor can you apply a logical complement operator, !, to a numeric expression.
		// int x = !5; // DOES NOT COMPILE
		
		
		double y = 1.21;
		System.out.println(y); // 1.21
		y = -y;
		System.out.println(y); // -1.21
		y = -y;
		System.out.println(y); // 1.21
		
		//you cannot apply a negation operator, -, to a boolean expression
		//boolean y = -true; // DOES NOT COMPILE
		
		int counter = 0;
		System.out.println(counter); // Outputs 0
		System.out.println(++counter); // Outputs 1   PRE-INCREMENT
		System.out.println(counter); // Outputs 1
		System.out.println(counter--); // Outputs 1  POST-INCREMENT
		System.out.println(counter); // Outputs 0
		
		
		int num1 = 3;
		int num2 = ++num1 * 5 / num1-- + --num1;// 4*5/4+2  -->20/4+2-->5+2 = 7 
		System.out.println("num1 is " + num1);  //2
		System.out.println("num2  is " + num2);  //7

	}

}
