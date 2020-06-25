package saez.pedro.primeros_pasos;

import javax.swing.JOptionPane;

public class ejercicio_peso_video27 {
	
	public static void main(String[] args) {
		
		int peso_ideal=0;
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		String hombre_mujer=JOptionPane.showInputDialog("Eres hombre o mujer");
		
		String h="hombre";
		
		String m="mujer";
		
		if(hombre_mujer.equalsIgnoreCase(h)) {
			
			peso_ideal=altura-110;
			 JOptionPane.showMessageDialog(null, "tu peso ideal es " + peso_ideal);
			
		}
		else if (hombre_mujer.equalsIgnoreCase(m)){
			
			peso_ideal=altura-120;
			 JOptionPane.showMessageDialog(null, "tu peso ideal es " + peso_ideal);
		}else {
			
			JOptionPane.showMessageDialog(null, "el genero introducido no es correcto");
			
		}
		

		
		
	}
	
	
	

}
