package a_primeros_pasos;

public class GarbageColelctor {
	
	/*
	 * Process of automatically freeing memory on the heap(pila) by deleting
	 * objects that are nor longer reachable in our program.
	 * 
	 * Java provides a method called System.gc().(is not guaranted to run)
	 * 
	 * The more interesting part of garbage collection is when the memory belonging to an
		object can be reclaimed. Java waits patiently until the code no longer needs that memory.
	 * 
	 * An object is no longer reachable when one of two situations occurs:
 		1-The object no longer has any references pointing to it.
 		2-All references to the object have gone out of scope
	 * 
	 * 
	 * Do not confuse a reference with the object that it refers to; they are two different entities.
		The REFERENCE is a variable that has a name and can be used to access the contents
		of an object.A reference can be assigned to another reference
	 * 
	 * 
	 * An OBJECT sits on the heap and does not have a name. Therefore, you have no way to
		access an object except through a reference. Objects come in all different shapes and
		sizes and consume varying amounts of memory.
		
		is the object that gets garbage collected, not its reference.
		
		FINALIZE()
		Java allows objects to implement a method called finalize() that might get called.
		This method gets called if the garbage collector tries to collect the object
		Just keep in mind that it might not get called and that it definitely won’t be called twice
		Remember, finalize() is only run when the object is eligible for garbage collection(out of scope)
		
		***The lesson is that the finalize() call COULD RUN ZERO OR ONE TIME****
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one,two;
		one= new String("a"); // have the first object , one points to "a"
		two = new String("b");// have the second object, two points to "b"
		one = two;            // attention!! one point here to "b" so "a" have no reference that points to it,
							//so is the first eligible for garbage collection
		String three= one ; // three point to "b" , remember that one change and now is pointing to "b"
		one = null; // one now is null	
		
		
			
	}
	
	// End of the method and so "b" here is out of scope

}
