package javaApi;

public class CreatingArrays {
	
	/*
	 * 
	 * An array is an area of memory on the heap 
	 * with space for a designated number of elements
	 * 
	 * In other words, an array is an ordered list.It can contain duplicates
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numbers1 = new int[3]; // int is the type , [] the array symbol,3 the size
		
	/*
	 * 
	 * When using this form to instantiate an array, set all the elements to the default value for
	 * that type. 
	 * As you learned in Chapter 1, the default value of an int is 0.
	 * 
	 * element  0   0   0 
	 * index    0   1   2
	 * 
	 */
		int[] numbers2 = new int[] {42,53,67};//other way to create an array
		int [] numbers3 = {30,45,32};//Anonymous array, because you don't specify type and size
		
		
	/*
	 * 
	 * element  42    53   67
	 * index    0     1     2 
	 * 
	 * 
	 * 
	 * Finally, you can type the [] before or after the name,
	 *  and adding a space is optional.
	 * This means that all four of these statements do the exact same thing
	 * 
	 * 
	 */
	
		int[] numAnimals;
		int [] numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
		
		
	/*
	 * 
	 * Multiple “Arrays” in Declarations
	 * 
	 */
		
		int [] ids, types;// the two are type int[]

		int ids2 [], types2; // in this case , first is int[] and types2 is int type
		
		//Java sees this line of code and thinks 
		//something like this: “They want two variables of type int"
		
	/*
	 * CREATING SRRSY WITH REFERENCES TYPES
	 * 
	 * You can choose any Java type to be the type of the array.
	 * This includes classes you create yourself.
	 * 
	 */
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true  .We can call equals() because an array is an object
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		
		/*
		 * The equals() method on arrays does not look at the elements of the array.
		 * 
		 * The array does not allocate space for the String
		 * objects. Instead, it allocates space for a reference to where the objects are really stored.
		 */
	
		
		/*
		 * class Names {
		 *		 String names[];  // this array point to null
		 * }
		 * 
		 * 
		 * class Names {
		 * 		 String names[] = new String[2];   // this has a length =2
		 * } 
		 * 
		 * Casting arrays:
		 * 
		 * String[] strings = { "stringValue" };  // create an array of strings
		 * Object[] objects = strings;    // no need to cast because object is broader(mas amplia) type than String
		 * String[] againStrings = (String[]) objects;  // cast is needed because we are moving to a more specific type
		 * againStrings[0] = new StringBuilder(); // DOES NOT COMPILE  a STringbuilder its not a String
		 * objects[0] = new StringBuilder(); // careful!  Stringbuilder can go in an Object variable but actually we don't have an Object[] ,
		 */// we have a String refered to an object and this will throw an exception at runtime
		 * 
		 */
	}

}
