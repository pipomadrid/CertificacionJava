package javaApi;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayList {

	
	/*
	 * you are going to see something new in the method signatures:
	 * a “class” named E . Don’t worry—it isn’t really a class. E is used by convention in generics
	 * to mean “any class that this array can hold
	 * 
	 * If you didn’t specify a type when creating the ArrayList , 
	 * E means Object . Otherwise, it means the class you put between < and >
	 * 
	 * You should also know that ArrayList implements toString() so you can easily see the
	 * contents just by printing it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//***********************add()
		
		/*
		 * It's the most  critical method for the exam
		 * 
		 */
		ArrayList list = new ArrayList();
		list.add("hawk");// [hawk]
		list.add(Boolean.TRUE);// [hawk, true]
		System.out.println(list);// [hawk, true]
		
		//we add a string an a boolean , This is okay because we didn’t
		//specify a type for ArrayList ; therefore, the type is Object
		//thet include all except primitives

		
		//Now using generics
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE);// DOES NOT COMPILE
		
		//adding multiple values at different positions:
		
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");// [hawk]
		birds.add(1, "robin");// [hawk, robin]
		birds.add(0, "blue jay");// [blue jay, hawk, robin]
		birds.add(1, "cardinal");// [blue jay, cardinal, hawk, robin]
		System.out.println(birds);// [blue jay, cardinal, hawk, robin]
	}

}
