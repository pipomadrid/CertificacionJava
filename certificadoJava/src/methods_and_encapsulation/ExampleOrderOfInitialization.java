package methods_and_encapsulation;

public class ExampleOrderOfInitialization {
	
	private String name = "Bruno"; //instance variable declarations 5
	{System.out.println(name);} //Instance block initializers  6
	private static int COUNT  = 0;// static variable declaration  2
	static {System.out.println(COUNT);} //  static initializer  3
	static  {COUNT += 10; System.out.println(COUNT);}//  static initializer  4 (3 and 4 goes in order)
	public  ExampleOrderOfInitialization() {//constructor 7
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		//first run the static variable declaration and static Initializer after go "ready to construct" because we 
		//haven't create an instance
		System.out.println("ready to construct");
		//When instance the object the order is :
		/*
		 * Instance variable declaration  an instance Initializtion
		 * Cosntructor
		 */
		ExampleOrderOfInitialization example = new ExampleOrderOfInitialization();
		
		/*
		 * output
		 * 0
		 * 10
		 * ready to construct
		 * Bruno
		 * Cosntructor
		 */
		

	}

}
