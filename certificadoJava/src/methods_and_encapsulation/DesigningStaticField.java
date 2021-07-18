package methods_and_encapsulation;

import java.util.ArrayList;

public class DesigningStaticField {

	/*
	 * Some static variables are meant to change as the program runs. Counters are a
	 * common example of this.
	 * Other static variables are meant to never change during the program, Known as constants
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Initializers.NUM_BUCKETS=4; // we can't  update a final variable
		Initializers.values.add("hola");  // we are allowed to call methods, but we can' reassign the final values to point a different object
		//Initializers.values= new ArrayList<>();
		Initializers.values.set(0,"adios"); // we cn call method again
		System.out.println(Initializers.values);
		Initializers.values = new ArrayList<String>(); //We cannot reasign a constant field
	}

}

class Initializers {

	public static int counter = 0;  //you can Initialize a static variable on the line it is declared
	public static final int NUM_BUCKETS = 45; //CONSTANTE
	public static final ArrayList<String> values = new ArrayList<>();
}
