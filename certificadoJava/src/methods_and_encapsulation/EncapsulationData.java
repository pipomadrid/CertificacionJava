package methods_and_encapsulation;


/*
 * Encapsulation means we set up the class so only methods
	in the class with the variables can refer to the instance variables
 */
public class EncapsulationData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Swan {
	
	private int numberEggs; //private
	public int getNumberEggs() {//getter
		return numberEggs;
	}
	public void setNumberEggs(int numberEggs) {//setter
		if(numberEggs >= 0 ) this.numberEggs = numberEggs;
		
	}
	
}

/*
 * 
 * Java defines a naming convention that is used in JavaBeans. 
 * JavaBeans are reusable software components. 
 * JavaBeans call an instance variable a property. 
 * The only thing you need to know about JavaBeans 
 * for the exam is the naming conventions listed in Table
 * 
 * JAVABEANS CONVENTIONS:
 * 
 * Properties are private. private int numEggs;
Getter methods begin with is if the property is a boolean . public boolean isHappy() {
																	return happy;
																}
Getter methods begin with get if the
property is not a boolean . 								public int getNumEggs() {
																	return numEggs;
															}
Setter methods begin with set . 							public void setHappy(boolean happy) {
																	this.happy = happy;
															}	
The method name must have a prefix
of set / get / is , followed by the first
letter of the property in uppercase, fol-
lowed by the rest of the property name. 					public void setNumEggs(int num) {
																	numEggs = num;
															}
 * 
 */

/*
 * 
 * 	private boolean playing;  
	private String name;
	public boolean getPlaying() { return playing; }  // should be isPlaying because is  boolean
	public boolean isPlaying() { return playing; }  //Correct
	public String name() { return name; }  // should be getName 
	public void updateName(String n) { name = n; }// should be getName 
	public void setname(String n) { name = n; }  // should be getName 
	 
*/
