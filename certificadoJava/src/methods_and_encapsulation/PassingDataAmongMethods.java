package methods_and_encapsulation;

/*
 * 
 * Java is a pass by value language. This means that a copy of the variable is made and the
	method receives that copy.Other language use pass-by-reference, that use the original values, no copies 
 */

public class PassingDataAmongMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Primitives
		int num = 4; //The variable wouldn't change
		newNumber(5);
		System.out.println(num); // 4
		
		//References type
		String name= "Pedro";
		speak(name);
		System.out.println(name); // Pedro
		
		//Calling methods on the parameters will affect the caller
		
		StringBuilder name2 = new StringBuilder();
		speak(name2);
		System.out.println(name2); // Marina
		
		//Return  values 
		int num2 = 1;
		sumNumber(num2); // we are doing nothing with the return value
		System.out.println(num2);  // 1 
		
		
			
	}
	
	public static void newNumber(int num) {// The parameter has the same name but its only coincidence, the name could be anything
		num = 8;	
	}
	private static void speak(String name) {
		name = "Bruno";
		
	}
	public static void speak(StringBuilder s) { // In this case  s and name2 points to the same StringBuilder
		
		s.append("Marina"); //We are using a method, we don't reassing the variable
		
		/*
		 * if we reassing s, will point to  different StringBuilder so Name2 and s will not have the same values
		 * s = new StringBuilder();
		 * s.append("Marina");
		 */
	}
	
	public static int sumNumber(int num2) {
		num2++;
		return num2;
	}

}
