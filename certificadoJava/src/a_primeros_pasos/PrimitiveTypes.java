package a_primeros_pasos;

public class PrimitiveTypes {
	
	/* java has eight built-in data types
	 * all java objects are a complex collection of these primitive types
	 * Java primitive types:
	 * 		boolean:	true or false 
	 * 		byte: 		8- bit integral value      	 	123
	 * 		short:		16 bit integral value			123
	 * 		int:		32 bit integral value			123	
	 * 		long:		64 bit integral value			123	
	 * 		float:		32 bit floating-point(decimal) value  	123.45f  f required
	 * 		double:		64 bit floating-point value		123.456
	 * 		char:		16 bit Unicode value			'a'
	 * Byte CAN HOLD VALUE FROM -128 TO 127
	 * a Byte is 8 bits --> bit = 0 or 1
	 * 8 bits can represent 256 values --> 2 exp8
	 * the maximum number an int can hold is
	 *	2,147,483,647 . How do we know this? One way is to have Java tell us:
	 * System.out.println(Integer.MAX_VALUE);
	 * when a number is present in the code is called Literal, by default java ssumes
	 * you are defining an int value with a literal:
	 * long max = 3123333333333 // DOES NOT COMPILE
	 * long max = 3333331242355L  // java konos it,s a long
 	 * L can b l but  we use L because l seems like number 1
 	 * 
 	 * Java allows you to specify numbers in other formats like
 	 * octal(0-7) use 0 as prefix 017
 	 *  hexadecimal(0-9) use 0 folloewd by x as a prefix 0xFF
 	 *  binary(0-1) number 0 folloewd by b as prefix 0b10
 	 *  
 	 *  you can underscore numbers to make them more readable
 	 *  int million1 = 1000000;
     *  int million2 = 1_000_000;
     *  You can add
		underscores anywhere except at the beginning of a literal, the end of a literal, right before a
		decimal point, or right after a decimal point. Let’s look at a few examples:
		double notAtStart = _1000.00; // DOES NOT COMPILE
		double notAtEnd = 1000.00_; // DOES NOT COMPILE
		double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0; // this one compiles
			
     *  
	 */
	
	
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
		
		System.out.println(56); // 56
		System.out.println(0b11); // 3
		System.out.println(017); // 15
		System.out.println(0x1F); // 31
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
		 octal (digits 0�7), which uses the number 0 as a prefix�for example, 017
	 	hexadecimal (digits 0�9 and letters A�F), which uses the number 0 followed by x or X
		as a prefix�for example, 0xFF
	 	binary (digits 0�1), which uses the number 0 followed by b or B as a prefix�for example,
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
