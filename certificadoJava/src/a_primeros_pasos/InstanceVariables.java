package a_primeros_pasos;

public class InstanceVariables {
	
	 static int MAX_LENGTH= 5; // class variable
	 int length; // instance variable
	
	/*	INSTANCE 
	 * Variables that are not local variables are known as instance variables or class variables.
		Instance variables are also called fields.Are shared across multiple objects
	 * 
	 * 
	 *  CLASS VARIABLES(STATIC)
	 * 
	 * has the keyword static before it
	 * Instance and class variables do not require you to initialize them.As soon as you declare them , 
	 * they are given a default value:
	 * 
	 * 
	 * boolean     					false
	 * byte, short, int, long       0
	 * float, double        		0.0 
	 * char                 		\u0000 (NUL)
	 * everything else          	null
	 */

	
	/*
	 * VARIABLE SCOPE
	 * 	when a variable is inside a method cannot be used outside this
	 * are local to the method
	 * Each block of code between {} has its own scope
	 * blocks can contain other blocks. These smaller contained blocks can reference
		variables defined in the larger scoped blocks, but not vice versa
		Method parameters are avaiable for the entire method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	 }
		
	 public void eatIfHungry(boolean hungry) {
		 if (hungry) {
			 int bitesOfCheese = 1;
		 	} // bitesOfCheese goes out of scope here
		 System.out.println(bitesOfCheese);// DOES NOT COMPILE 
	
	 }
	 
	 public void eatIfHungry2(boolean hungry) {
		  if (hungry) {
			  int bitesOfCheese = 1;
			  {
				  boolean teenyBit = true;
				  System.out.println(bitesOfCheese); // COMPILE because block is inside the block where variable is declared 
			  }
		  }
		  System.out.println(teenyBit); // DOES NOT COMPILE
	 }
	 
	 // SCOPE IN CLASS AND INSTANCE VARIABLES
	 /*
	  * Local variables—in scope from declaration to end of block
		Instance variables—in scope from declaration until object garbage collected
	 	Class variables—in scope from declaration until program ends
	  */
	 
	 public void grow(int inches) {
		 if (length < MAX_LENGTH) {
		  int newSize = length + inches;
		  length = newSize;
		 }
	 }
	 


}
	
