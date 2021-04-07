package a_primeros_pasos;

public class LocalVariables {

	/*
	 * local variables must be initialized before use
	 * do not have a default value
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public int notValid() {
		 int y = 10;
		 int x;
		 int reply = x + y; // DOES NOT COMPILE because x is not inicialized
		 return reply;
		 }

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch); // DOES NOT COMPILE because is no initilized in else statement
		}
}
