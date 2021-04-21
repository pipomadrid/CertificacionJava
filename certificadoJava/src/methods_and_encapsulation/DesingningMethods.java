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
		void public walk3() {} // DOES NOT COMPILE   the  access modifier is specified after the returntype.
		void walk4() {}
	 */
	
	
	/*
	 * 
	 * 
	 * OPTIONAL MODIFIERS
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
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	}


}
