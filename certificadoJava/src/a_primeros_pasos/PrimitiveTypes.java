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
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(56); // 56
		System.out.println(0b11); // 3
		System.out.println(017); // 15
		System.out.println(0x1F); // 31
		// TODO Auto-generated method stub

		
		
		
		
	}

}
