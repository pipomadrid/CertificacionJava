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
		
		//CHAINING 
		
		/*
		 * When we chained String method calls, the
		 * result was a new String with the answer.
		 * 
		 * 
		 * Chaining StringBuilder objects doesn’t work this way.
		 *  Instead, the StringBuilder changes its own state and returns a reference to itself!
		 */
		
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle"
		StringBuilder same = sb.append("+end"); // "start+middle+end"
		
		//The exam won’t always make the code easy to read by only having one method per line:
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);//abcdefg
		System.out.println("b=" + b);//abcdefg
		
		//PAY ATTENTION
		/*There’s only one StringBuilder object here.
		 *  We know that because new StringBuilder() was called only once.
		 * On line 5, there are two variables referring to that object,
		 *  which has a value of "abcde".
		 * On line 6, those two variables are still referring to that same object
		 * 
		 * */
		 
		
		//CREATING STRINGBUILDER
		
		//There are 3 ways construct a Stringbuilder:
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10); //reserves a certain number of slots for characters
		
		
		/*TIP --> size is the number of characters currently in the secuence and
		capacity is the numbers of characters that secuence can hold.Since strings
		is inmutable size and capacity are the same, but for Stringbuilder java knows that the size
		can change , when Stringbuilder is constructed it may start at the default capacity:
		*/
		StringBuilder sb4=new StringBuilder(5);// size =0, capacity= 5
		sb4.append("hola"); // size = 4  capacity = 5
		sb.append("als"); // size = 7 java automatically increase capacity 
		
		
		 
		 
		 
	}

}
