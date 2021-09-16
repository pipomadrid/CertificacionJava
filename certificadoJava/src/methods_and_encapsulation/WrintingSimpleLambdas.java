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




