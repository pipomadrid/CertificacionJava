package javaApi;

import java.util.Arrays;

public class UsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Accesing Arrays
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length); // 3
		System.out.println(mammals[0]); // monkey
		System.out.println(mammals[1]); // chimp
		System.out.println(mammals[2]); // donkey
		
		
		String[] birds = new String[6];
		System.out.println(birds.length);// 6, Even the element are null, ther still 6 of them
		
		System.out.println();
		
		
		//Its usual to use loops to read or write an array
		
		int[] numbers = new int[10];
		
		for(int i = 0; i<numbers.length;i++) {
			numbers[i]=i+5;
			System.out.println(numbers[i]);
		}
		
		//you have to be carefull when trying to acces elements that are not in the array:
		
		//numbers[10]  =3; // launch an exception because numbers has 0 to 9 position
		//numbers[numbers.length]= 6; //exception too because length return  10 
		//for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;  //exception because <= numbers.length refer to 10 element too
		
		
		/*
		 * SORTING(ORDENAR) 
		 * 
		 * Java makes it easy to sort an array by providing a sort method -->Arrays.sort()
		 * 
		 * To use it  requires an import:
		 * 
		 * import java.util.*;
		 * or import java.util.Arrays;
		 */
		System.out.println();
		
		int [] numbers2  = {45,32,15};
		
		Arrays.sort(numbers2);
		
		for(int num : numbers2) {
			System.out.print(num + " "); // 15 32 45
		}
		
		System.out.println();
		//The following array have Strings and so it will be ordered from 1 to 9
		//Numbers sort before letters, uppercase sorts before lowercase
		
		String[] strings = { "10", "9", "100","hola","Hola" };
		Arrays.sort(strings);
		for (String string : strings)
		System.out.print(string + " "); //10 100 9 Hola hola
		
		
	}

}
