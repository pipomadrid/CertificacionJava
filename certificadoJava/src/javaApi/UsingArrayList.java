package javaApi;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayList {

	
	/*
	 * you are going to see something new in the method signatures:
	 * a â€œclassâ€� named E . Donâ€™t worryâ€”it isnâ€™t really a class. E is used by convention in generics
	 * to mean â€œany class that this array can hold
	 * 
	 * If you didnâ€™t specify a type when creating the ArrayList , 
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
		
		//we add a string an a boolean , This is okay because we didnâ€™t
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
		
		//************************delete()
		 
		/* 
		 * remove first matching value in the arraylist 
		 * or remve element at index specified
		 * 
		 * returns boolean or E:
		 * 
		 * boolean remove(Object object) 
		 * E remove(int index)  the E is the element that has been removed
		 *                 
		 */
		
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		birds2.add("hawk"); // [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); // prints false
		System.out.println(birds2.remove("hawk")); // prints true
		System.out.println(birds2.remove(0)); // prints hawk
		System.out.println(birds2); // []
		
		//Since calling remove() with an int uses the index, an index that doesn’t exist will throw
		//an exception. For example, birds.remove(100) throws an IndexOutOfBoundsException.
		
		
		//**************************set()
		
		/*
		 * changes one of the elements of the ArrayList without changing the size
		 * 
		 * 
		 * E set(int index, E newElement)
		 * 
		 * 
		 * The E return type is the element that got replaced.
		 */

		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk"); // [hawk]
		System.out.println(birds3.size()); // 1
		birds3.set(0, "robin"); // [robin]
		System.out.println(birds3.size()); // 1
		//birds3.set(1, "robin"); // IndexOutOfBoundsException
		
		
		//***************************isEmpty() and size()
		
		/*
		 * look at how many of the slots are in use
		 * 
		 * boolean isEmpty()
		 * int size()
		 * 
		 */
		List<String> birds4 = new ArrayList<>();
		System.out.println(birds4.isEmpty()); // true
		System.out.println(birds4.size()); // 0
		birds4.add("hawk"); // [hawk]
		birds4.add("hawk"); // [hawk, hawk]
		System.out.println(birds4.isEmpty()); // false
		System.out.println(birds4.size()); // 2
		
		
		//*******************************clear()
		
		/*
		 * 
		 * discard all elements of the ArrayList
		 * 
		 * void clear()
		 * 
		 * 
		 */
		
		List<String> birds5 = new ArrayList<>();
		birds5.add("hawk"); // [hawk]
		birds5.add("hawk"); // [hawk, hawk]
		System.out.println(birds5.isEmpty()); // false
		System.out.println(birds5.size()); // 2
		birds5.clear(); // []
		System.out.println(birds5.isEmpty()); // true
		System.out.println(birds5.size()); // 0
		
		
		//****************************contains()
		
		/*
		 * method checks whether a certain value is in the ArrayList
		 * 
		 * boolean contains(Object object)
		 * the method calls equals on each element of the ArrayList
		 */
		
		List<String> birds6 = new ArrayList<>();
		birds6.add("hawk"); // [hawk]
		System.out.println(birds6.contains("hawk")); // true
		System.out.println(birds6.contains("robin")); // false
		
		
		//******************************equals()
		
		/*
		 * you can compare two lists 
		 * to see if they contain the same elements in the same order.
		 * 
		 */
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a"); // [a]
		System.out.println(one.equals(two)); // false  -->different size
		two.add("a"); // [a]
		System.out.println(one.equals(two)); // true
		one.add("b"); // [a,b]
		two.add(0, "b"); // [b,a]
		System.out.println(one.equals(two)); // false --<different order
	}

}
