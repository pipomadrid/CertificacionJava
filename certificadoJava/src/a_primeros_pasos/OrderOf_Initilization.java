package a_primeros_pasos;

public class OrderOf_Initilization {
	
	private String name = "Fluffy";//3
	
	{System.out.println("setting field");}//4
	
	public OrderOf_Initilization() {//5
		name= "tiny";//6
		System.out.println("setting constructor");//7
	}
	


	public static void main(String[] args) {// 1
		// TODO Auto-generated method stub

		OrderOf_Initilization orden= new OrderOf_Initilization(); //2
		System.out.println(orden.name);//8
		
		
	}

}

// first we start in the main method
//line 19 calls the constructor and Java creates a new object
// Initializes the name to Fluffy
// print the instance initializer 
// Once all the fields and instance initializers have run Java returns the constructor
// next change the value of the name
// print the syso of the constructor
// print the name on line 20
 
//****important --> you can't refer to a variable before it has been initializated 
//Order matters for the fi elds and blocks of code. You can’t refer to a variable before it has
//been initialized:

// { System.out.println(name); } // DOES NOT COMPILE
// private String name = "Fluffy";

