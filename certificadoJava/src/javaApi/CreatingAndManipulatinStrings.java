package javaApi;

class CreatingAndManipulatinStrings {
	
	/*
	 * 
	 * A string is basically a sequence of characters
	 * 
	 * this is an example of a reference
	 * type. You also learned that reference types are created using the new keyword
	 * 
	 * it doesn’t have new in it! In Java, these two
	 * snippets both create a String:
	 * String name = "Fluffy";
	 * String name = new String("Fluffy");
	 * 
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creation
		
		String name = "Bruno";
		String name2 = new String("Marina");
		System.out.println(name + " " + name2 );
		
		//CONCATENATION
		/*
		 *The OCA exam creators like string concatenation because the + operator
		 *can be used in two ways within the same line of code. 
		 * 
		 * 
		 * 1. If both operands are numeric, + means numeric addition.
		 * 2. If either operand is a String, + means concatenation
		 */

		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		
		//There's other way to use concatenation, using the method concat,it's tricky:
		
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); // s2 can't be change because it's inmutable 
		System.out.println(s2); // "12"
		
		//There is only one more thing to know about concatenation, --> +=
		
		String s = "1"; // s currently holds "1"
		s += "2"; // s currently holds "12"
		s += 3; // s currently holds "123"
		System.out.println(s); // 123
		
		
		//INMUTABILITY
		/*
		 * Once a String object is created , its not allowed to change.
		 * You can think of a string as a storage box you have perfectly full and whose sides can’t
		 * bulge.(sobresalir).
		 * 
		 * Mutable is another word for changeable. Immutable is the opposite—an object that
		 * can’t be changed once it’s created. On the OCA exam, you need to know that String is
		 * immutable.
		 * 
		 */
		
		//THE STRING POOL
		
		/*Since strings are everywhere in Java, they use up a lot of memory.
		 * Java realizes that many strings repeat in the program 
		 * and solves this issue by reusing common ones.
		 * 
		 * The string pool, also known as the intern pool, 
		 * is a location in the Java virtual machine (JVM)
		 * that collects all these strings.
		 * 
		 * The string pool contains literal values that appear in your program. For example,
		 * “name” is a literal and therefore goes into the string pool. myObject.toString() is a string
		 * but not a literal, so it does not go into the string pool. Strings not in the string pool are garbage
		 * collected just like any other object.
		 * 
		 * String name = "Fluffy";// Use string pool
		 * String name = new String("Fluffy");  // don't use string pool
		 */
	}

}
