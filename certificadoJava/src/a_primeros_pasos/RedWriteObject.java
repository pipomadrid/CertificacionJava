package a_primeros_pasos;

public class RedWriteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swan mother = new Swan();
	   // we read and write the vaible direclty from the caller
		mother.numberEggs = 1;
		System.out.println(mother.numberEggs);
		//read =get , and write = set

		
		// see Instance Initialization
		
		Bird pio= new Bird ();
		Bird pioPio = new Bird(3);
		
		
	}

}
class Swan {
	
	int numberEggs; 
}
class FirstName{
	// we can also  read and write fields directly on the line you have
	// declared them
	String first= "Peter"; // write
	String second= "Daniel"; // write
	String full= first + second; //read (first and second)and write both
}

//*****************CODE BLOCKS************************
// the code between braces {} = code block
//Sometimes code blocks are inside a method --> run when the method is called
// others code blocks appear outside a method --> instance initializers
// To count the number of code blocks just counts the number of pairs of braces

//******************INSTANCE INICIALIZATION**********************
//In a Java program, operations can be performed on methods, constructors and initialization blocks.
//Instance Initialization Blocks or IIB are used to initialize instance variables . 
//So firstly, constructor is invoked and the java compiler copies the instance initializer block in the constructor after the first statement super(). 
//They run each time when object of the class is created. 

class Bird{
	
	Bird(){
		System.out.println("Constructor");
	}
	// the compiler do like this:
	/*
	 * Bird(){
	 * super(); // first call the super constructor
	 * 
	 * {System.out.println("Instance Initialization");}  // copies the  instace initializer  after the super
	 *
	 *  System.out.println("Constructor");  // 
	 * }
	 */

	
	Bird(int a){
		System.out.println("Constructor with parameter a =  " + a );	
		
	}
	
	{System.out.println("Instance Initialization");}
	
	
}

/*There are mainly three rules for the instance initializer block. They are as follows:
 * 
1-The instance initializer block is created when instance of the class is created.
2-The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
3-The instance initializer block comes in the order in which they appear.
*/




