package methods_and_encapsulation;

public class ExampleOrderOfInitialization2 {


	static { add(2); }  // 2 static initialization

	static void add(int num) { System.out.print(num + " "); }// 1 static method declaration

	ExampleOrderOfInitialization2() { add(5); } // 7 constructor

	static { add(4); }// 3 static initialization

	{ add(6); }// 5 Initialization block

	static { new ExampleOrderOfInitialization2(); } // 4 static initialization

	{ add(8); }  //6 Initialization block

	public static void main(String[] args) { }
	

}


//output    2 4 6 8 5 