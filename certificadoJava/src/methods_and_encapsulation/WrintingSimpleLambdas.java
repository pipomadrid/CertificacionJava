package methods_and_encapsulation;

import java.util.ArrayList;
import java.util.List;

public class WrintingSimpleLambdas {
	
	//Added in Java 8
	/*
	 * You can think of a lambda expression as an anonymous method. doesn't have a name.
	 * Lambda expression is like a method that you can pass as if it were a variable.
	 * Only the simplest lambda expressions are on the OCA exam
	 */

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		 animals.add(new Animal("fish", false, true));
		 animals.add(new Animal("kangaroo", true, false));
		 animals.add(new Animal("rabbit", true, false));
		 animals.add(new Animal("turtle", false, true));
		 
		 print(animals,a -> a.canHop());
		 
		 /*
		  * if we didn't use lambda we have to write classes that implements the method of the interface to check the animals that
		  * can swim too, the lambda simplifies the code.  
		  */
		 print (animals,a ->a.canSwim()); 
		 print (animals,a ->!a.canSwim());
		 
		 /*
		  *  the print method expects a CheckTrait method and we are passing a lambda, 
		  *  java tries to map our lambda to the interface: boolean test(Animal a)
		  *  that means that lambda parameter must be an Animal and has to return a boolean.
		  *  
		  *  The syntax of lambdas is tricky because many parts are optional
		  *  
		  *  
		  * 	 a -> a.canHop()
				(Animal a) -> { return a.canHop(); }
				
				The parentheses can only be omitted if there is a single parameter.
				We can omit braces when we only have a single statement.
				Here java doesn’t require you to type return or use
				a semicolon when no braces are used.
								
				 print(() -> true); // 0 parameters
				 print(a -> a.startsWith("test")); // 1 parameter
				 print((String a) -> a.startsWith("test")); // 1 parameter
				 print((a, b) -> a.startsWith("test")); // 2 parameters
				 print((String a, String b) -> a.startsWith("test")); // 2 parameters
				 print(a -> { return a.startsWith("test"); });
				 
				 There is one more issue you might see with lambdas. We’ve been defining an argument
				list in our lambda expressions. Since Java doesn’t allow us to redeclare a local variable, the
				following is an issue:
				(a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE
				We tried to redeclare a, which is not allowed. By contrast, the following line is okay
				because it uses a different variable name:
				(a, b) -> { int c = 0; return 5;}
		  */
		 
		 
	}
	
	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
	}


interface CheckTrait{
	boolean test(Animal a);	
}




