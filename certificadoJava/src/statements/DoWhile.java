package statements;

public class DoWhile {
	
	
	
	/*
	 * 
	 * like while loop , but the condition is at the end and this guarantees that the statement
	 * or block will be executed at least once.
	 * 
	 * Any while loop can be converted to a do-while loop, and vice versa.
	 * 
	 * Java recommends you use a while loop when a loop might not be executed at all and a do while
	 * loop when the loop is executed at least once
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 5;
		
		do {
			System.out.println(x);
			--x;
			
			
		}while(x>0);

	}

}
