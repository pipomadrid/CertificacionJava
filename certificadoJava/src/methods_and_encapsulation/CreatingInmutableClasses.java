package methods_and_encapsulation;

/*Encapsulating data is helpful because it prevents callers from making uncontrolled changes
to your class.Another common technique is making classes immutable so they cannot be
changed at all.
you can pass them around your application with a guarantee that the caller didn’t change anything.
This helps make programs easier to maintain
*/

public class CreatingInmutableClasses {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder(" initial");
		
		NotImmutable example = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = example.getBuilder();
		sb.append(" more");
		System.out.println(gotBuilder);
		
		System.out.println(sb);
		
		Immutable example2 = new Immutable(sb); //If the class is inmutable, after this point can't be change
		sb.append(" que tal");//change the StringBuilder but not the String 
	    String gotString = example2.getValue();
	    sb.append("adding again");
	    System.out.println(gotString);
	}

}

//One step in making a class immutable is to omit the setters.

//immutable is only measured after the object is constructed so with the constructor we can pass a value to the class

class ImmutableSwan {
	
	private int numberEggs;
	public ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	public int getNumberEggs() {
		return numberEggs;
	} }
 
// we have to be carefull with what we return, if we return a stringbuilder, we can add values in it
// making changes in the "inmutable" class

class NotImmutable {
	private StringBuilder builder; 
	public NotImmutable(StringBuilder b) {
		builder = b;
	}
	public StringBuilder getBuilder() {  //We are returning a mutable object, so we can change it after the call
		return builder;

	}
}

class Immutable {
	
	private StringBuilder builder2; 
	public Immutable(StringBuilder b) {
		
		//builder2 = b; // here we have a problem because builder points to the Stringbuilder that instance the Object, (check what returns in main)
		builder2 = new StringBuilder(b);// we have to make a defensive copy to prevent that
	}
	public String getValue() { //now we are returning a String, and we can't change it
		return builder2.toString();

	}
}