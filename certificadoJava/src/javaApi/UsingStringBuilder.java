package javaApi;


public class UsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A small program can create a lot of String objects very quickly
		 * 
		 * The empty String on line 10 is instantiated, and then line 12 appends an "a". However,
		 * because the String object is immutable, a new String object is assigned to alpha and the
		 * “” object becomes eligible for garbage collection. The next time through the loop, alpha is
		 * assigned a new String object, "ab", and the "a" object becomes eligible for garbage
		 * collection. The next iteration assigns alpha to "abc" and the "ab" object becomes eligible
		 * for garbage collection, and so on.
		 */
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++)
			alpha += current;
		System.out.println(alpha);

		 
		 /*
		 * This is very inefficient.
		 * Luckily, Java has a solution. The StringBuilder class
		 * creates a String without storing all those interim String values.
		 * 
		 * Unless String, StringBuilder is not immutable.
		 */
	
		
		
		
		StringBuilder alpha2 = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++)
			alpha2.append(current);
		System.out.println(alpha2);
		
		/*
		 * 
		 * The call to append() on line 17
		 * adds a character to the StringBuilder object each time through the for loop and appends
		 * the value of current to the end of alpha.
		 * 
		 * This code reuses the same StringBuilder without
		 * creating an interim String each time.
		 */
	}

}
