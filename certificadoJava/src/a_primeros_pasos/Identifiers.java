package a_primeros_pasos;

public class Identifiers {
	
	/*
	 * RULES FOR IDENTIFIERS	
	 * 1- Must begin with a letter or the symbol $ or _
	 * 2 - Subsequent characters may also be numbers
	 * 3 - You cannot use the java reserved keywords
	 */
	
	/*JAVA  IDENTIFIER CONVENTIONS
	 * 
	 *  1- Method and variables begin with lower case letter followed by Camel Case
	 *  2 - Class names begin with an uppercase  letter followed by CamelCase, don't start identifiers with $
	 *  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//legal identifiers
		int okidentifier  =1;
		int $OK2Identifier = 2;
		int _alsoOK1d3ntifi3r = 3;
		int __SStillOkbutKnotsonice$ = 4;
		
		
		//not legal
		int 3PointClass;
		int holl@aaa;
		int *$coffee;
		int public;
		
		//Java conventions
		int myInt;
		class MyClass{};
		
	}

}
 