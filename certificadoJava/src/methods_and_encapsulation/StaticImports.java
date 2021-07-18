package methods_and_encapsulation;

import java.util.List;
import static java.util.Arrays.asList; // asList is a static method


/*
 * 
 * Regular imports are for importing classes. Static imports are for importing static members of
	classes.
	You can use a wildcard or import a specific member
	
	//IMPORTANT, POSIBLE EXAM QUESTIONS
	
	Import static java.util.Arrays; // DOES NOT COMPILE ,We can't make an static import of a class
	import static java.util.Arrays.asList; 
	static import java.util.Arrays.*; // DOES NOT COMPILE , Order must be import static
	public class BadStaticImports {
		public static void main(String[] args) {
			Arrays.asList("one"); // DOES NOT COMPILE, we haven't  made import  of Arrays  class we made an static import of the method, 
														so we must use asList.
		} 
	}
	
	In Chapter 1, you learned that importing two classes with the same name gives a compiler error. This is true of static
	imports as well:
	
	import static statics.A.TYPE;
	import static statics.B.TYPE; // DOES NOT COMPILE
	
 */
public class StaticImports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = asList("one" ,"two"); 
		/*
		 * If we don't use static imports each time we use it we would have to call it like this : Arrays.asList
		 */
		
	}

}
