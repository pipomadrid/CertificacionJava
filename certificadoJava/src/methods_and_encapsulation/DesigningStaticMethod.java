package methods_and_encapsulation;



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

		Static methods only can access static members(variables and methods) of the class
	 */

public class DesigningStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prueba.counter();
		Prueba.counter();
		Prueba.counter();

		ContadorDeInstancias uno = new ContadorDeInstancias();
		ContadorDeInstancias dos = new ContadorDeInstancias();
		ContadorDeInstancias tres = new ContadorDeInstancias();

		System.out.println("el numero de instancias es : " + ContadorDeInstancias.contador);

		Prueba p = new Prueba();
		Prueba p2 = new Prueba();

		// you can use an instance of the class to call a static method:
		p.counter();
		p = null; // p still a prueba
		p.counter();

		// pay attention to this

		Prueba.count = 1;
		p.count = 4;
		p2.count = 7;
		System.out.println(Prueba.count); // output is 7

		// IMPORTANT Static member(fields or methods) can't call an instance
		// members(variable and methods)

	}

}

class Prueba {

	public String campo1 = "Hola";
	public static int count = 0;

	public static void counter() {

		count++;
		System.out.println(count);
		// System.out.println(campo1); not compile because we can't call an instance
		// method in a static member
		System.out.println(new Prueba().campo1); // now compile because we can call an instance variable using an
													// instance of the class
	}
}

// A common use for static variables is counting the number of instances:

class ContadorDeInstancias {

	public static int contador = 0;

	public ContadorDeInstancias() {
		contador++;
	}

}