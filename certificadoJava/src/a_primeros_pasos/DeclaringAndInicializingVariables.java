package a_primeros_pasos;

public class DeclaringAndInicializingVariables {

	
	/*
	 * a variable is a name for a piece of memry that stores data
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we declare two variables
		String zooName;
		int numberAnimals;
		
		//now we can initialize
		zooName = " Madrid zoo";
		numberAnimals = 800;
		
		//you can do it in the same statement
		String AnimalName = "Bear";
		
		//we cen declare multiple varibles  of the same type in the same statement
		String s1, s2;
		String s3 = "yes", s4 = "no";
		
		// PAY ATTENCION TO TRICKS
		int i1, i2, i3 =0;
		// Here we hve declared 3 varibles but only one was initialized
		
		//int num, String value; // DOES NOT COMPILE  differentes types can't be declared in the same statement
		
		boolean b1, b2; //legal 
		String s5 = "1", s6; // legal
		//double d1, double d2; // ilegal, de type can't be repetead
		int i4; int i5; // legal  the ; separates the statement
		//int i6; i7; // ilegal 
	}

}
