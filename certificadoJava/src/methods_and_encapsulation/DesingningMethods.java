package methods_and_encapsulation;

public class DesingningMethods {
	
	/*
	 * METHODS
	 * 
	 * example:
	 *              public final void nap(int minutes) throws InterruptedException {}
	 * Required?      no    no    yes  yes    yes        no
	 * 
	 * 
	 * ACCESS MODIFIER
	 * public    The method can be called from any class.
	 * private   The method can only be called from within the same class.
	 * protected The method can only be called from classes in the same package or subclasses.
	 * Default (Package Private) Access The method can only be called from classes in the same
	 * 							package. This one is tricky because there is no keyword for default access
	 */
	
	/*
	 * 
	 * The exam creators like to trick you by putting 
	 * method elements in the wrong order or using incorrect values
	 * 
	 * 	public void walk1() {} 
		default void walk2() {} // DOES NOT COMPILE    default is not a valid access modifier
		void public walk3() {} // DOES NOT COMPILE   the  access modifier is specified after the return type.
		void walk4() {}
	 */
	
	
	/*
	 * 
	 * 
	 * OPTIONAL SPECIFIERS
	 * 
	 * you can have multiple specifiers in the same method (although not all combinations are legal).
	 * When this happens, you can specify them in any order.
	 * 
	 * 	static --> Used for class methods.
		abstract--> Used when not providing a method body.
		final --> Used when a method is not allowed to be overridden by a subclass.
		
		public void walk1() {}
		public final void walk2() {}
		public static final void walk3() {}
		public final static void walk4() {}
		public modifier void walk5() {} // DOES NOT COMPILE
		public void final walk6() {} // DOES NOT COMPILE
		final public void walk7() {}   //Java allows the optional specifiers to appear before the access modifier.
		
	 */
	
	/*
	 * RETURN TYPE
	 * 
	 * 
	 * The return type might be an actual Java type such as String or int.
	 *  If there is no return type, the void keyword is used.
	 *  Methods with a return type other than void are required to have a return statement inside the
	 *  method body.
	 *  Methods that have a return type of void are permitted to have a return statement with no
	 *  Value returned or omit the return statement entirely.
	 *  
	 *  public void walk1() { }
		public void walk2() { return; }
		public String walk3() { return ""; }
		public String walk4() { }           // DOES NOT COMPILE NO RETURN 
		public walk5() { } // DOES NOT COMPILE   no void keyword
		String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE because only have a return when a==4
	 */
	
	/*
	 * METHODS NAMES
	 * same rules as variables
	 * may only contain letters, numbers, $, or _.
	 * the first character is not allowed to be a number, 
	 * and reserved words are not allowed.
	 * By convention, methods begin with a lowercase letter but are not required to
	 * 	public void walk1() { }
		public void 2walk() { } // DOES NOT COMPILE  number at beginning not allowed
		public walk3 void() { } // DOES NOT COMPILE  the method name is before the return type.
		public void Walk_$() { }
		public void() { } // DOES NOT COMPILE --> no funtion name
	 */
	
	/*
	 * 
	 * PARAMETERS
	 * 
	 * It doesn’t have to contain any parameters.
	 * you can just have an empty pair of parentheses after the method name.
	 * If you do have multiple parameters, you separate them with a comma.
	 * public void walk1() { }
		public void walk2 { } // DOES NOT COMPILE no parentheses
		public void walk3(int a) { }
		public void walk4(int a; int b) { } // DOES NOT COMPILE  no semicolons allowed here
		public void walk5(int a, int b) { }
		
	 */
	
	/*
	 * OPTIONAL EXCEPTION LIST
	 * 
	 * code can indicate that something went wrong by throwing an exception.
	 * For now, you just need to know that it is optional and
	 * where in the method signature it goes if present.
	 * 
	 * public void zeroExceptions() { }
		public void oneException() throws IllegalArgumentException { }
		public void twoExceptions() throws
		IllegalArgumentException, InterruptedException { }
	
	
	You might be wondering what methods do with these exceptions. The calling
	method can throw the same exceptions or handle them.
	 */
	
	/*
	 * METHOD BODY
	 * A method body is simply a code block.
	 * It has braces that contain zero or more Java statements.
	 * 
	 * public void walk1() { }
	 * public void walk2; // DOES NOT COMPILE
	 * public void walk3(int a) { int name = 5; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

	//PAY ATTENTION  RETURN TYPES

	int integer() {
		return 9;
	}
	int long1() {
		return 9L; // DOES NOT COMPILE because the value must match the retun type
	}

	int integerExpanded() {
		int temp = 9;
		return temp;
	}
	int longExpanded() {
		int temp = 9L; // DOES NOT COMPILE  the same case as previus but with returning a variable
		return temp;
	}

}
