package a_primeros_pasos;

import java.util.Random;

// remember that an object is an instance of a class

public class CreatingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random(); // we are creating an instance of Random and storing it in r variable

		// () tell us is a constructor , that is a special method that creates a new
		// object

		// define a new constructor :
		
		//for most classes you don't have to code a constructor, the compiler will supply a default constructor for you
		
		 Chicken chicken1= new Chicken(); 
		 chicken1.name="juanito";

	}
}

	 class Chick {

		public Chick() { // the name of the constructor matches the name of the class, and there is no
							// return type
			System.out.println("in constructor");
		}

		// the purpose if the constructor is to inicialize fields, you can inicialize in
		// the constructor or directly
		// on the line on which they're declared

	}

	 class Chicken {
		int numEggs = 0;// initialize on line
		String name;

		public Chicken() {
			name = "Duke";// initialize in constructor
		}
	}
	

	

