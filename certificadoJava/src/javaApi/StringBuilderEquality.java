package javaApi;

public class StringBuilderEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		
		/*one and two are both completely separate
		 * StringBuilders, giving us two objects
		 * 
		 * one and three both point to the same object and
		 * the second print statement gives us true
		 * 
		 * 
		 */
		
		/*
		 * ************String equality
		 * 
		 * Its more confusing because the JVM reuses String literals.
		 * JVM use the string pool for literals in order to reuses the Strings
		 * If we use new String() this will not be in the pool
		 * 
		 */
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); //true 
		
		//Cuando declaras una cadena como esta, en realidad estás llamando al método intern () en String.
		//Este método hace referencia a un grupo interno de objetos de cadena. 
		//Si ya existe un valor de cadena "Hello World", 
		//entonces y hará referencia a esa cadena y no se creará un nuevo objeto String
		/*
		 * x and y points to the same location int he pool
		 * 
		 * 
		 */
		
		String r= "Hello World";
		String z = " Hello World".trim();
		System.out.println(r == z); // false
		
		/*
		 * In this example, we don’t have two of the same String literal. Although x and z happen
		 * to evaluate to the same string, one is computed at runtime. 
		 * Since it isn’t the same at compile-time, a new String object is created.
		 */
		String s1= new String("Hello World"); //we force to create a new string so 
		String s2 = "Hello World";
		System.out.println(s1 == s2); // false
		
	 /*
	  * The lesson is to never use == to compare String objects. The only time
	  * you should have to deal with == for Strings is on the exam
	  */
		
		String s3 = "Hello World";
		String s4 = " Hello World".trim();
		System.out.println(s3.equals(s4)); // true
		
		/*
		 * 
		 * String class implemented a standard method
		 * called equals to check the values inside the String rather 
		 * than the String itself.
		 * 
		 * StringBuilder did not implement equals(). If you call equals() on two StringBuilder
		 * instances, it will check reference equality.
		 * 
		 * If a class doesn’t have an equals method, 
		 * Java determines whether the references point to the
		 * same object—which is exactly what ==
		 * 
		 * 
		 */
		/*public class Tiger {
			String name;
			public static void main(String[] args) {
				Tiger t1 = new Tiger();
				Tiger t2 = new Tiger();
				Tiger t3 = t1;
				System.out.println(t1 == t1); // true, because points to the same object
				System.out.println(t1 == t2); // false, are reference of different objects
				System.out.println(t1.equals(t2)); // false , because Tiger does not implement equals(),so Java compare reference points to the same object
			} 
		}
		*/
	}

}
