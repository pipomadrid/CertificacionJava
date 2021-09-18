package methods_and_encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
		 PredicateSearch.print (animals,a ->!a.canSwim());// Use Predicate Interface that Java provides
		 
		 
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


//PREDICATES
/*
 * Lambdas work with interfaces that have only one method-->Functional interfaces.
 * 
 * You can imagine that we’d have to create lots of interfaces like this to use lambdas.
 * Java recognizes that this is a common problem and provides such an interface
	for us. It’s in the package java.util.function and the gist(esencia) of it is as follows:
	
			public interface Predicate<T> {
				boolean test(T t);
			}
 * The only difference is that it uses this type T instead of Animal.
 * This means we don’t need our own interface anymore
 * 
 */

class PredicateSearch {

	 static void print(List<Animal> animals, Predicate<Animal> checker) { //we are using predicate instead Checktrait
		 System.out.print("Interfaz Predicate: ");
		 for (Animal animal : animals) {
			 if (checker.test(animal))
				 System.out.print( animal + " ");
		 }
		 System.out.println();
	 	}
	 

	
	 
	
}

/*
 * Java 8 even integrated the Predicate interface into some existing classes.
 * There is onlyone you need to know for the exam. ArrayList declares a removeIf() method that takes a Predicate
 * 
 * List<String> bunnies = new ArrayList<>();
	 bunnies.add("long ear");
	 bunnies.add("floppy");
	 bunnies.add("hoppy");
	 System.out.println(bunnies); // [long ear, floppy, hoppy]
	 bunnies.removeIf(s -> s.charAt(0) != 'h');  // takes a string and returns a boolean
	 System.out.println(bunnies); // [hoppy]
 * 
 */
	



