package methods_and_encapsulation;

public class DesigningStaticMethosAndFields {
	
	
	/*
	 * Static methods don´t need an instance of the class
	 * You can think of statics as being a member of the single class object that exist independently of any
		instances of that class.
	 * 
	 * 
	 * static methods have two main purposes:
	 * 
		■ For utility or helper methods that don’t require any object state. Since there is no need
			to access instance variables, having static methods eliminates the need for the caller to
			instantiate the object just to call the method.
				
		■ For state that is shared by all instances of a class, like a counter. All instances must
			share the same state. Methods that merely(simplemente) use that state should be static as well
			
			
		Accessing a static member is easy. You just put the classname before the method or
		variable and you are done
		
		
		http://puntocomnoesunlenguaje.blogspot.com/2013/02/java-static.html
		
		Static methods only can access static atributes of the class
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
