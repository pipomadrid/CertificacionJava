package a_primeros_pasos;

// comentario una linea
/*
 *  comentario varias lineas
 */

/*
 * Java does not requier that the class be public
 * if you have a public class it needs to match the filename
 * you can put two classes in the same file , only one is allowed to be public
 */
 public class ClasesJava {

	// public keyword means that class can be used by other classes
	// ClasesJava is the keyword that define the class
	// fields + method = member of the class
	/*
	 *  a method is an operation that can be called
	 *  void no value is returned
	 *  parameter is the information that the method required when is called
	 *  the full declaration of a method is called method signature
	 */
	
	String campo; // class fields, state of the program
	
	public void setCampo(String campo) {  // class method, operate the state, class behavior
		 
		this.campo=campo;
		
	}
	
	public String getCampo() {
		
		return campo;
	}

}

