package javaApi;

import java.util.ArrayList;
import java.util.List;

public class CreatingArrayList {
	
	/*
	 * In array you have to know how many elements will be in the array 
	 * when you create it nd then you are stuck(atascado) with that choice
	 * 
	 * ArrayList can change size at runtime as needed
	 * 
	 * Like an array, an ArrayList is an ordered 
	 * sequence that allows duplicates.
	 * 
	 * requires an import --> import java.util.ArrayList
	 */
	
	/*
	 * CREATING AN ARRAYLIST
	 *	  
	 *There are three ways to create an ArrayList :
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//exmples pre java 5
		ArrayList list1 = new ArrayList();// contains default space for rrylist
		ArrayList list2 = new ArrayList(10);// contains 10 slots
		ArrayList list3 = new ArrayList(list2);// you make a copy of other arrayList, both contents and size
		
		//examples java 5 
		//introduce generics, allow you to specify the type of class that the arraList will contain
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>(); // on Jva 7 you can ommit the type on rigth side
		
		//An arrayList implements an intefaz called List
		//so you can store an arrayList in a list but not vice versa
		
		
		List<String> list6 = new ArrayList<>();
		//ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
	}

}
