package methods_and_encapsulation;

public class CreatingConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bunny bunny = new Bunny("blue");  // when we make an instantiation of a class we are calling the constructor

		Mouse mouse = new Mouse(15);
		mouse.print();// 15 16 6
		
		InitialtionOrder init = new InitialtionOrder();
		
	}

}
class Bunny {
	
	//CONSTRUCTOR 
	/*Constructors are used when creating a new object. This process is called instantiation
	because it creates a new instance of the class
	A constructor is typically used to initialize instance variables
	*/
	private String color; //instance variable
	
	public Bunny(String color) {
		this.color = color; //The this keyword tells Java you want to reference an instance variable, the right side is the parameter
		System.out.println("Constructor of a " + color +  " Bunny");
	}
}
	
	/*
	 * public bunny() { } // DOES NOT COMPILE
	   public void Bunny() { } //is not a constructor because of the void 
	*/
	
	/*
	 *DEFAULT CONSTRUCTOR
		Every class in Java has a constructor whether you code one or not. If you don�t include any
		constructors in the class, Java will create one for you without any parameters.
		
		public class Rabbit {
			public static void main(String[] args) {
				Rabbit rabbit = new Rabbit(); // Calls default constructor, it has an empty parameter and an empty body 
			}
		}
		
		Having a private constructor in a class tells the compiler not to provide a default noargument
		constructor. It also prevents other classes from instantiating the class. This is
		useful when a class only has static methods or the class wants to control all calls to create
		new instances of itself. Ejm:
		
		class Rabbit4 {
			private Rabbit4() { }
		}
		
		public class RabbitsMultiply {
			public static void main(String[] args) {
		
				Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE
				
				}
		}
		
	 * 
	 */
	
	/*OVERLOADING CONSTRUCTORS
		Up to now, you�ve only seen one constructor per class. You can have multiple constructors
		in the same class as long as they have different method signatures
	 * 
	 * 
	 * 
	 * public class Hamster {
			private String color;
			private int weight;
			public Hamster(int weight) { // first constructor
					this.weight = weight;
					color = "brown";
			}
			public Hamster(int weight, String color) { // second constructor
					this.weight = weight;
					this.color = color;
			}
		}
	 * There is a bit of duplication.
	 * What we really want is for the first constructor to call the second constructor with
		two parameters. You might be tempted to write this:
		
			public Hamster(int weight) {
				Hamster(weight, "brown"); // DOES NOT COMPILE
				}  
				
				This will not work. Constructors can be called only by writing new before the name of the
				constructor. They are not like normal methods that you can just call
				
			public Hamster(int weight) {
				new Hamster(weight, "brown"); // Compiles but does not do what we want
				}
				
		Java provides a solution: this
		
		When this is used as if it were a method, Java calls another constructor on the same
		instance of the class.
			public Hamster(int weight) {
				this(weight, "brown");
			}
			
			
		this() has one special rule you need to know. If you choose to call it, the this() call
		must be the first noncommented statement in the constructor.
		
	 */

	//COSNTRUCTOR CHAINING
class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	public Mouse(int weight) {
		this(weight, 16); // calls constructor with 2 parameters
	}
	public Mouse(int weight, int numTeeth) {
		this(weight, numTeeth, 6); // calls constructor with 3 parameters
	}
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
}
	
	/*THE FINAL FIELDS can be assigned in the constructor .
	By the time the constructor completes, all final instance variables
	must have been set:
	
	*
	*   public class MouseHouse {
			private final int volume;
			private final String name = "The Mouse House";
			public MouseHouse(int length, int width, int height) {
				volume = length * width * height;
			}
		}
	*/
	
	/*ORDER OF INITIALIZATION
	 * 
	 * IMPORTANT
	 *  1- SUPERCLASS
	 *  2-STATIC VARIABLE DECLARATION AND STATIC INITIALIZERS
	 *  3-INSTANCE VARIABLE DECLARATIONS 
	 *  4- THE COSNTRUCTOR
	 * 
	 */
	class InitialtionOrder {
		//no Superclass  1
		private String name = "Bruno"; //instance variable declarations 5
		{System.out.println(name);} //Instance block initializers  6
		private static int COUNT  = 0;// static variable declaration  2
		static {System.out.println(COUNT);} //  static initializer  3
		static  {COUNT += 10; System.out.println(COUNT);}//  static initializer  4 (3 and 4 goes in order)
		public InitialtionOrder() { //constructor 7
			System.out.println("Constructor");
		}
		
		/*output:
		 * 0
		 * 10
		 * Bruno
		 * Constructor
		 */
		
		//SEE THE CLASS  ExampleOrderOfInitialization.java
	}



