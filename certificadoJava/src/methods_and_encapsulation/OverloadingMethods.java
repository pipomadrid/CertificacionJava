package methods_and_encapsulation;




/*
 * Method overloading occurs when
	there are different method signatures with the same name but different type or number of parameters.
	
	These are all valid overloaded methods:
	public void fly(int numMiles) { }
	public void fly(short numFeet) { }
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }

	Not valid overloading:
	public void fly(int numMiles) { }
	public int fly(int numMiles) { } // DOES NOT COMPILE
	
	Calling overloaded methods is easy. You just write code and Java calls the right one
 */

public class OverloadingMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Overloading and varargs
		fly(new int[] {1,2,3});
		fly(1,2,3,4,5,6);

		
		/*
		 * Java calls the most specific method it can.
		 * Rule Example of what will be the order  chosen for glide(1,2)
				1-Exact match by type     public String glide(int i, int j) {}
				2-Larger primitive type   public String glide(long i, long j) {}
				3-Autoboxed type          public String glide(Integer i, Integer j) {}
				4-Varargs                 public String glide(int... nums) {}
		 */
		
		//Autoboxing
		/*Java tries to use the most specifi c parameter
		list it can find.*/
			fly2(2); //Integer
			fly3(2); //int
			
		//Reference Types
			fly4("prueba");// String
			fly4(5); //object    java looks for an int , when it doesn't find it autoboxes to Integer
			
		
		//Primitives
			fly5(123); //int 
			fly5(123L);//long
			
	}
	
	//Overloading and varargs
	//public static void fly(int[] lengths) { }
	public static void fly(int... lengths) { }  //Not compile because Java treats varargs as if they where an array, so the method signature
	//are the same 
	
	//Autoboxing
	
	public static void fly2(Integer numMiles) {
		System.out.println("Integer");
		}
	public static void fly3(Integer numMiles) {
		System.out.println("Integer");
		}
	public static void fly3(int numMiles) {
		System.out.println("int");
	}
	
	//Reference types
	public static void fly4(String s) {
		System.out.println("string ");
		}
	public static void fly4(Object o) {
		System.out.println("object ");
	}
	
	//Primitives 
	public static void fly5(int i) {
		System.out.println("int ");
	}
		
	public static void fly5(double l) {
		System.out.println("long ");
	}
	/*
	 * public class TooManyConversions {
			public static void play(Long l) { }
	 * 		public static void play(Long... l) { }
			public static void main(String[] args) {
				play(4); // DOES NOT COMPILE  too many conversions
				play(4L); // calls the Long version
} 
}
Here we have a problem. Java is happy to convert the int 4 to a long 4 or an Integer 4.
It cannot handle converting in two steps to a long and then to a Long. If we had public
static void play(Object o) { }, it would match because only one conversion would be
necessary: from int to Integer. An Integer is an Object.
	 */
	

}
