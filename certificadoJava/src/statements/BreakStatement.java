package statements;

public class BreakStatement {
	
	/*
	 * break statement transfers the flow
		of control out to the enclosing statement
	 * optionalLabel: while(booleanExpression) {
		// Body
		// Somewhere in loop
		break optionalLabel;
		}
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//In particular, take a look at the statement break PARENT_LOOP. This statement will break
		//out of the entire loop structure as soon as the first matching value is found

		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP; // return (1,1)
					//break; //return (2,0)
					//si no ponemos nada return (2,2)
				}
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");

		}
	}

}
