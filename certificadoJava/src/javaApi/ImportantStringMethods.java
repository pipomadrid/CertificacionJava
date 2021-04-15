package javaApi;

public class ImportantStringMethods {
	
	/*You need to know that a String is a squence of characters and Java counts for 0
	 * when indexed.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*****************length()
		
		String animales = "animals";
		System.out.println(animales.length());// 7 , java counts from 0 to 6 but the zero counts, remember!!
		
		//*****************charAt()
		
		System.out.println(animales.charAt(0)); // a
		System.out.println(animales.charAt(6)); // a
		
		//if you put charAt(7) -->java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		
		//***************indexOf()
		
		/*
		 * 
		 * The method indexOf()looks at the characters in the string and finds the first index that
		 * matches the desired value:
		 * 
		 * int indexOf(char ch)
		 * int indexOf(char ch, index fromIndex)
		 * int indexOf(String str)
		 * int indexOf(String str, index fromIndex)
		 * 
		 * 
		 */
		
		System.out.println(animales.indexOf('a')); //0   can use for a character
		System.out.println(animales.indexOf("al")); //4   or  a String
		System.out.println(animales.indexOf('a', 4 )); //4   says Java shouldn’t even look at the characters until it gets to index 4
		System.out.println(animales.indexOf('a', 5 )); // -1  No match is found
		
		
		//***************Subtring()
		
		/*
		 * The method substring() also looks for characters in a string.
		 * It returns parts of the string.
		 * The first parameter is the index(zero based) to start with for the returned string
		 * optional second parameter, which is the end index you want to stop at.(Stop, not include)
		 * 
		 * int substring(int beginIndex)
		 * int substring(int beginIndex, int endIndex)
		 * 
		 */
		
		System.out.println(animales.substring(3));  //mals
		System.out.println(animales.substring(animales.indexOf('m'))); //mals
		System.out.println(animales.substring(3,4)); //m
		System.out.println(animales.substring(3, 7)); // mals  there is no 7 position but is the endo of string invisible position
		System.out.println(animales.substring(3, 3)); // empty string
		//System.out.println(animales.substring(3, 2)); // throws exception
		//System.out.println(animales.substring(3, 8)); // throws exception
		
		//*************toLowerCase() and toUpperCase()
		
		System.out.println(animales.toUpperCase()); //ANIMALS
		System.out.println("HOLA".toLowerCase()); //hola
		
		//The original Strings still the same, Strings are INMUTABLE
		
		
		
		//*************equals() and equalsIgnoreCase()
		
		/*The equals() method checks whether two String objects 
		 * contain exactly the same characters in the same order
		 * 
		 * The equalsIgnoreCase() will convert the characters’ case if needed.
		 * 
		 * 
		 */
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		
		//***************startsWith() and endsWith()
		
		/*look at whether the provided value matches part of the String
		Java is doing a case-sensitive check on the values provided.
		*/
		
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		
		//*****************contains()
		
		/*
		 * looks for matches in the String.
		 * the match can be anywhere in the String-->you don’t have to write str.indexOf(otherString) != -1.
		 */
		
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
		
		//*******************replace()
		
		/*
		 * does a simple search and replace on the string.
		 * There’s a version that takes char parameters as well as a version 
		 * that takes CharSequence parameters
		 * 
		 * String replace(char oldChar, char newChar)
		 * String replace(CharSequence oldChar, CharSequence newChar)
		 */
		
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc  -->chars
		System.out.println("abcabc".replace("ab", "A")); // AcAc  --> String
		
		//***********************trim()
		
		/*
		 * The trim() method removes whitespace from the beginning and end of a String
		 * whitespace consists of spaces along with the \t (tab) and \n (newline) character
		 * 
		 * Other characters, such as \r (carriage return), are also included in
		 * what gets trimmed.
		 * */		 
		
		System.out.println("abc".trim()); // abc ->prints the original string because there are no whitespace characters
		System.out.println("\t a b c\n".trim()); //  a b c    gets ride of tab, spaces subsequent and trailing new line, but no the middle spaces
		
		//***********************Method Chaining
		
		/*
		 * It is common to call multiple methods on the same String,
		 * 
		 */
		String start = "AniMaL ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal"
		String result = lowercase.replace('a', 'A'); // "Animal"
		System.out.println(result);
		
		// we can put ti in a small space using method chaining:
		String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result2);
		/*
		 * 
		 * To read code that uses method chaining, start at the left and evaluate the
		 * first method. Then call the next method on the returned value of the fi rst method. Keep
		 * going until you get to the semicolon.
		 * 
		 * REMEMBER THAT STRING IS INMUTABLE
		 * 
		 * 
		 */
		
		String a = "abc";
		String b = a.toUpperCase();// the a variable will not change
		b = b.replace("B", "2").replace('C', '3');// Strings are inmutables but variables can be assigned with other String
		System.out.println("a=" + a); //a=abc
		System.out.println("b=" + b); // b = A23
		
	}

}
