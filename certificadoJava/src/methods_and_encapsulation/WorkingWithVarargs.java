package methods_and_encapsulation;

public class WorkingWithVarargs {
	
	/*
	 * A method can use varargs parameters as if it is an array
	 * A vararg parameter must be the last element in a methds parameter
	 * list
	 * You are only llowed to have one varg parameter for method
	 */
	
	/*
	 * 
	 * When calling a method with a vararg parameter, 
	 * you have a choice. You can pass in an
	 * array, or you can list the elements of the array 
	 * and let Java create it for you
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 walk(1); // java creates an array of lenght 0
		 walk(1, 2); // java creates an array of lenght 1
		 walk(1, 2, 3); // java creates an array of lenght 2
		 walk(1, new int[] {4,5});//  array of lenght 2
		 //walk(1, null); // throws a NullPointerException because it is trying to get the lenght of null 


		 //Accessing a vararg parameter is also just like accessing an array.
		 //It uses array indexing.
		 
		 run(2, 5 ,6); //5 
		 
	}
	
	public void walk1(int... nums) { }
	public void walk2(int start, int... nums) { }
	public void walk3(int... nums, int start) { } // DOES NOT COMPILE , position is not the last one
	public void walk4(int... start, int... nums) { } // DOES NOT COMPILE,  position is not the last one

	
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);// see main
	}
	public static void run(int... nums) {
			System.out.println(nums[1]);
	}
}
