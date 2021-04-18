package javaApi;

public class WrapperClases {
	
	/*
	 * we’ve only put String objects in the ArrayList
	 * What happens if we want to put primitives in?
	 * 
	 * Each primitive type has a wrapper class.
	 * which is an object type that corresponds to the primitive
	 * 
	 * 
	 * 		primitive    Wrapper    Example of constructing
	 * 		boolean 	Boolean 	new Boolean(true)
			byte 		Byte 		new Byte((byte) 1)
			short 		Short 		new Short((short) 1)
			int 		Integer 	new Integer(1)
			long 		Long 		new Long(1)
			float 		Float 		new Float(1.0)
			double 		Double 		new Double(1.0)
			char 		Character 	new Character('c')
			
		The wrapper classes also have a method that converts back to a primitive.
		
		There are also methods for converting a String to a primitive or wrapper class. You do
		need to know these methods. The parse methods, such as parseInt(), return a primitive,
		and the valueOf() method returns a wrapper class.
	 */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int primitive = Integer.parseInt("123");//Converts String to an int primitive
		Integer wrapper = Integer.valueOf("123");//Converts String to an Integer wrapper class
		
		
		//If the String passed in is not valid for the given type, Java throws
		//an exception.
		//int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		//Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
		
		
		
		/*
		 * IMPORTANT
		 * methods you need to recognize for creating a primitive or wrapper
		 * class object from a String
		 * 
		 * Wrapper class       Converting String to primitive     Converting String to wrapper class
		Boolean 				Boolean.parseBoolean("true");		 Boolean.valueOf("TRUE");
		Byte 					Byte.parseByte("1"); 				 Byte.valueOf("2");
		Short 					Short.parseShort("1"); 				 Short.valueOf("2");
		Integer 				Integer.parseInt("1"); 				 Integer.valueOf("2");
		Long 					Long.parseLong("1"); 				 Long.valueOf("2");
		Float 					Float.parseFloat("1"); 				 Float.valueOf("2.2");
		Double 					Double.parseDouble("1"); 			 Double.valueOf("2.2");
		Character 				None 								 None
		 * 
		 * 
		 */
	}
	

}
