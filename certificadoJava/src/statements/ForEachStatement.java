package statements;

public class ForEachStatement {
	
	/*
	 * the for enhanced
	 * 
	 * The left-hand side of the for-each loop must include a 
	 * declaration for an instance of a variable,whose type matches the type of a member of the
	 * array or collection in the right-hand.
	 * 
	 * On each iteration of the loop, the
	 * named variable on the left-hand side of the statement is assigned a new value from the array
	 * or collection on the right-hand side of the statement
	 * 
	 * The right-hand side of the for-each loop statement must be a built-in Java 
	 * array or an object whose class implements java.lang.Iterable
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
		System.out.print(name + ", ");
		}
		
		
		System.out.println();// only to make space
		
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
		System.out.print(value + ", ");
	
		}

		System.out.println();
		
		/*PAY ATTENTION
		 * 
		 * be sure that the rigth side is an array or iterable object 
		 * and the left has a matching type
		 */
		
		//notice that the forr each prints the "," after the last name
		//to solve that we have to use the standard for:
		
		java.util.List<String> names2 = new java.util.ArrayList<String>();
		names2.add("Lisa");
		names2.add("Kevin");
		names2.add("Roger");
		for(int i=0; i<names2.size(); i++) {
		String name = names2.get(i);
		if(i>0) {
		System.out.print(", ");
		}
		System.out.print(name);
		}
		
		
	}

}
