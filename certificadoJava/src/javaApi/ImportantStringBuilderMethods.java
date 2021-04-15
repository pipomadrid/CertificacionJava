package javaApi;

public class ImportantStringBuilderMethods {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt() , indexOf(), length() , substring()
		
		//Works the same as String ones
		
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));//anim
		int len = sb.length(); //7
		char ch = sb.charAt(6); //s
		System.out.println(sub + " " + len + " " + ch); //anim 7 s
		
		//*******************append()
		
		/*the most frequently used method in StringBuilder
		 * 
		 * here are more than 10 method signatures that look 
		 * similar but that take different data types as parameters
		 * 
		 */
		
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println(sb1); // 1c-true 
		
		//you can append () without having to convert your parameter to a String first

		
		//********************insert()
		
		
		/*
		 * 
		 * There are lots of
		 * method signatures for different types. Here’s one:
		 * 
		 * StringBuilder insert(int offset, String str)
		 * 
		 * adds characters to the StringBuilder at the requested index and
		 * returns a reference to the current StringBuilder
		 */
		
		StringBuilder sb2 = new StringBuilder("animals");
		 sb2.insert(7, "-"); // sb = animals-    7 is the offset -->Index where we wnat to insert the parameter
		 sb2.insert(0, "-"); // sb = -animals-
		 sb2.insert(4, "-"); // sb = -ani-mals
		 System.out.println(sb2);
		 
		 //***************delete() and deleteCharAt()
		 
		 /*opposite of the insert() method. It removes characters from
		  * the sequence and returns a reference to the current StringBuilder
		  * deleteCharAt() -->only a character
		  * 
		  * StringBuilder delete(int start, int end)
		  * StringBuilder deleteCharAt(int index)
		  */
		 
		 StringBuilder sb3 = new StringBuilder("abcdef");
		 sb.delete(1, 3); // sb = adef  iclude 1 , but not include 3
		 //sb.deleteCharAt(5); // throws an exception
		 
		 //****************reverse()
		 
		 /*
		  * The reverse() method does just what it
		  * sounds like: it reverses the characters in the sequences and returns a reference
		  * 
		  */
		 StringBuilder sb4 = new StringBuilder("ABC");
		 sb4.reverse();
		 System.out.println(sb4);
		 
		 
		 //*****************toString()
		 
		 /*
		  * The last method converts a StringBuilder into a String
		  * Its used when maybe it needs to be passed to another method that is
		  * expecting a String.
		  */
		 sb4.toString();
		 
		 
		 
	}

}
