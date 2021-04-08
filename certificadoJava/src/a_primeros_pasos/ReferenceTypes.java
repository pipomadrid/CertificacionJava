package a_primeros_pasos;

/*
 * a reference type refers to an object (an instnce of a class)
 * reference unlike primitives do not hold the value of the object they refer to only
 * points to an object by storing the memory address where the object is located
 * 
 * 
 */

public class ReferenceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date today; // today reference  type date and can only point to a date object
		String greeting; // can only reference to a string object
			/*
			 * A value is assigned
				to a reference in one of two ways:
■ 				A reference can be assigned to another object of the same type.
■ 				A reference can be assigned to a new object using the new keyword.
			 */
		today = new java.util.Date();// now point to a Date object and can be used to access the field nd methods of this object
		greeting = "hello"; // point to the String object "hello"
		
		
		System.out.println(today.getDay()); // we can access to the objects methods
	
		System.out.println(greeting.charAt(1));
		
		//differences between primitives and  references types:
		
		//int value = null; // does not compile, can't be signed to null
		String s = null;
		//refernces can use object methods, primitive don't have 
		String reference = "hello"; 
		int len = reference.length();
		//int bad = len.length(); // DOES NOT COMPILE
		
		
	}

}
