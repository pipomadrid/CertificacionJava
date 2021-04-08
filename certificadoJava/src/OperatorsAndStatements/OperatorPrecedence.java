package OperatorsAndStatements;

public class OperatorPrecedence {
	
	/*
	 * For the OCA exam, you’ll need know a specifi c
		subset of Java operators, how to apply them, and the order in which they should be applied
		
		Java operators are not necessarily evaluated from left-to-right order
		
		Unless overriden with parenthesis , Java follow this order of operation:
		
		Post-unary operators                y++,x--
		Pre unary operators                 ++y, --x
		Other unary operators               +, -, !
		Multiplication/Division/Modulus     *, /, %
		Addition/Subtraction				 +, -
		Shift operators 					<<, >>, >>>
		Relational operators                <, >, <=, >=, instanceof
		Equal to/not equal to               ==, !=
		Logical operators					 &, ^, |
		Short-circuit logical operators      &&, ||
		Ternary operators                 	 boolean expression ? expression1 : expression2
		Assignment operators 				=, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
		
		
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int y = 4;
		double x = 3 + 2 * --y; // first  --y, then * 2 and finally +3
		System.out.println(x+ " ," + y );
		
	}

}
