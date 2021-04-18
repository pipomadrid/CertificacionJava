package javaApi;

public class MultidimensionalArrays {
	
	//Arrays cn hold other arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to declare an array of multiple dimensions:
		
		int [][] vars1;//2d
		int vars2[][];//2d
		int [] vars3[];//2d
		int[] vars [], space [][]; // vars4-->2d, space -->3d

		
		
		//we can specify the size in the declaration:
		String [][] rectangle = new String[3][2];
		
		//an array can be  symmetrical:
		
		int[][] symmetrical = {{1,2},{3,4},{5,6}};
		System.out.println(symmetrical[0][0]);//1
		System.out.println(symmetrical[0][1]);//2
		System.out.println(symmetrical[1][0]);//3
		System.out.println(symmetrical[1][1]);//4
		System.out.println(symmetrical[2][0]);//5
		System.out.println(symmetrical[2][1]);//6
		
		//or different sizes:
		System.out.println();
		
		int[][] differentSizes = {{1,4},{3},{9,8,7}};
		System.out.println(differentSizes[0][0]);//1
		System.out.println(differentSizes[0][1]);//4
		System.out.println(differentSizes[1][0]);//3
		System.out.println(differentSizes[2][0]);//9
		System.out.println(differentSizes[2][1]);//8
		System.out.println(differentSizes[2][2]);//7
		
		
		/*
		 * Another way to create an asymmetric array is to initialize just an array’s fi rst dimension,
		 * and define the size of each array component in a separate statement:
		 * 
		 */
		int [][] args2 = new int[4][];
		args2[0] = new int[5];
		args2[1] = new int[3];
		
	}

}
