package statements;

public class WhileStatement {
	
	
	/*
	 * repetition control structure -->loop
	 * By using non constant variables, each repetition of the statement may be different.
	 * 
	 * it has a termination condition, implemented
		as a boolean expression, that will continue as long as the expression evaluates to
		true.
		
		the boolean expression is evaluated before each iteration,and exits if the evaluation returns false.
		In this manner, the statement block may never be executed.
		
		//PAY ATTENTION 
	 *   infinite loops
	 *   
	 *   int x = 2;
		int y = 5;
		while(x < 10)
		y++;
		
		the boolean expression that is evaluated is never modificated, 
		and the expression will always be true
	 *   
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WhileStatement myWhile1= new WhileStatement();
		myWhile1.eatCheese(10);
		
		
		
	}

	int roomInBelly = 5;
	public void eatCheese(int bitesOfCheese) {
		
		while (bitesOfCheese > 0 && roomInBelly > 0) {
		bitesOfCheese--;
		roomInBelly--;
		System.out.println(roomInBelly);
		}
		System.out.println(bitesOfCheese+" pieces of cheese left");
		}

}
