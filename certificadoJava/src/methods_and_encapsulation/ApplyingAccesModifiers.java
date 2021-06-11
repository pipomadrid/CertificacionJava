package methods_and_encapsulation;

public class ApplyingAccesModifiers {
	
	/*
	 *Private --> Only accessible in the same class 
	 * 
	 * default(package) --> private and other classes in the same package
	 * 
	 * protected -->  default access and child classes
	 * 
	 * public -->protected and classes in the other packages
	 */

	//SEE EXMPLES PG 174 TO 180 , PAY ATENTION TO PGE 178 IT,S CONFUSING
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * El modificador protected es el más complejo ya que si creamos una instancia de otra clase dentro de la clase hija
	 * , aunque la instanciada sea la clase padre no podremos acceder a los métodos ,ejemplo:
	 * 
	 * La clase Bird tiene los métodos floatInWater y el atributo text
	 * 
	 * 	package pond.swan;
 		import pond.shore.Bird; // in different package than Bird
 		public class Swan extends Bird { // but subclass of bird
 			public void swim() {
 				floatInWater(); 		// can access because it,s subclase of Bird
 				System.out.println(text); 	// can access because it,s subclase of Bird
 			}
 			public void helpOtherSwanSwim() {
 				Swan other = new Swan();
 				other.floatInWater(); 			// can access because instance Swan it,s subclase of Bird
 				System.out.println(other.text);// can access because instance Swan  it,s subclase of Bird
 			}
 			public void helpOtherBirdSwim() {
 				Bird other = new Bird();
 				other.floatInWater();			 // DOES NOT COMPILE  we are using a variable and is not a subclass
 				System.out.println(other.text); // DOES NOT COMPILE ,  we are using a variable and is not a subclass
 			}
 			public void helpOtherBirdSwanSwim() {
 				Bird other = new Swan();
 				other.floatInWater();			 // DOES NOT COMPILE  we are using a variable that stores a Swan into a Bird reference
 				 and Bird is not a subclass
 				System.out.println(other.text); // DOES NOT COMPILE , because the same fact
 				
 			}
 		
 		
 		Looking at it a different way, the protected rules apply under two scenarios:
 		
			■A member is used without referring to a variable. This is the case on lines 5 and 6. In
			this case, we are taking advantage of inheritance and protected access is allowed.
			
			■ A member is used through a variable. This is the case on lines 10, 11, 15, and 16.
			In this case, the rules for the reference type of the variable are what matter. If it is a
			subclass, protected access is allowed. This works for references to the same class or a
			subclass.
			
			
			package pond.duck;
			import pond.goose.Goose;    // goose extends birds
			public class GooseWatcher {
				public void watch() {
					Goose goose = new Goose();
					goose.floatInWater(); // DOES NOT COMPILE because we are using Goose that extends birds but we aren't in Goose class
											and GooseWatcher is not in the same package as bird
				} }
				
			
	 * 
	 */

}
