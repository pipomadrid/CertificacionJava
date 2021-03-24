package a_primeros_pasos;

public class PrimitiveTypes {
	
	
	/*Java has eight built-in data types(primitive types),represent the building blocks for Java
	 * because all Java objects are just a complex collection of these primitive data types
	 * 	boolean true or false true
		byte 8-bit integral value 123
		short 16-bit integral value 123
		int 32-bit integral value 123
		long 64-bit integral value 123
		float 32-bit floating-point value 123.45f   requires f
		double 64-bit floating-point value 123.456
		char 16-bit Unicode value 'a'
		
		Each numeric type uses twice as many bits as the smaller similar type.
		
		 A byte is 8 bits, and a bit has two posible values ,0 and 1
		 a byte can represent 256 characters ( 2 exp 8)
		 The number of bits is used by Java when it fi gures out how much memory to reserve for
		your variable
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Integer.MAX_VALUE); // max number of int
		
		/*When a number
		is present in the code, it is called a literal
		By default, Java assumes you are defining an int
		value with a literal.
		

		*/
		
		long max=31222222222222222L; // without the L does not compile
		
		/*Java allows you to specify digits
		in several other formats:
		 octal (digits 0–7), which uses the number 0 as a prefix—for example, 017
	 	hexadecimal (digits 0–9 and letters A–F), which uses the number 0 followed by x or X
		as a prefix—for example, 0xFF
	 	binary (digits 0–1), which uses the number 0 followed by b or B as a prefix—for example,
		0b10*/
		
		System.out.println(56); 
		System.out.println(0b11); 
		System.out.println(017); 
		System.out.println(0x1F);	
		
		/*The last thing you need to know about numeric literals is a feature added in Java 7. You
		can have underscores in numbers to make them easier to read:*/
		int million1 = 1000000;
		int million2 = 1_000_000;
		System.out.println(million1 +" " +million2);
	
	}
	
	
	
}
