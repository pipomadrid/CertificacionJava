package statements;

public class NestedLoops {
	
	//Loops can contain other loops
	/*
	 * 
	 * Consider a multidimensional array
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] myComplexArray =  {{1,2,3,4},{5,6,7,8},{5,1,6,8}};

		for(int[] mySimpleArray:myComplexArray) {

			for(int i=0; i<mySimpleArray.length;i++) {

				System.out.print(mySimpleArray[i]+ "\t");
			}
			System.out.println();
		}
		
		/*
		 * Nested loops can include while and do-while,
		 */

		// PAY ATTENTION try to guess the result of this statement
		int x = 20;
		while(x>0) {
			do {
				x -= 2;
			} while (x > 5);
			x--;
			System.out.print(x+"\t");
		}
		
		// we can add optional labels to all the if , switch , for etc..
		//When dealing with only one loop, they add no value, but as we’ll see in the next section,
		//they are extremely useful in nested environments.
		
		int[][] myComplexArray2 = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray2) {
			INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
		System.out.println();
		}

	}

}
