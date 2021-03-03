package a_primeros_pasos;

public class ReadAndWriteFields {

	String miCampoTest; // instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reading and writing object fields
		// reading a variable is call getting it
		// writing a variable is called setting it
		// you can read a field directly from the caller

		ReadAndWriteFields prueba1 = new ReadAndWriteFields();

		prueba1.miCampoTest = "Hola esto es una prueba"; // set variable
		System.out.println(prueba1.miCampoTest); // get variable

	}

}

		//You can even read and write fields directly on the line declaring them:
	class Name {
		String first = "Theodore";
		String last = "Moose";
		String full = first + last;
		//Lines 2 and 3 both write to fields. Line 4 does both. It reads the fields first and last. It  then writes the field full.
}	
		
