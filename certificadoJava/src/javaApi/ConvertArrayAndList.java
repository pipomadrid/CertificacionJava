package javaApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayAndList {
	
	/*
	 * You should know how to convert between an array and an ArrayList. 
	 * turning an ArrayList into an array:
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Turning an ArrayList into an array:
		/*
		 * ArrayList converts itself to an array, but default to an array of class Object
		 * We have to specify the type of the array , if we specify the size of 0 Java will create
		 * a new array of the proper size for the retun value
		 * 
		 */
		
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();  // by default the method convert to an array of Object
		System.out.println(objectArray.length); // 2
		String[] stringArray = list.toArray(new String[0]); //We specify the type and put the size to 0 
		System.out.println(stringArray.length); // 2
		for(String x : stringArray) {
			
			System.out.println(x);
		}
		
		
		
		//Convert from array to a List
		
		/*
		 * The original array and created array backed List are linked
		 * When a change is made to one, it is available in the other.
		 * It is a fi xed-size list and is also known a backed List
		 * 
		 */
		

		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list2 = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list2.set(1, "test"); // [hawk, test]  the changes will appear on the array too
		array[0] = "new"; // [new, test]   the changes will appear on the List too
		for (String b : array) System.out.print(b + " "); // new test
		System.out.println();
		for(String b :list2)System.out.print(b + " ");
		//list2.remove(1); // throws UnsupportedOperation Exception  , we can't change the size of the list
		
	}

}
