package saez.pedro.InterfacesGraficas;

import javax.swing.JFrame;

public class PrimerJframe {

	public static void main(String[] args) {
		
		
		
		/*JFrame ventana=new JFrame("Ventana");//primer ejemplo(hecho en main, se debe crear otra clase)
		
		
		ventana.setSize(300,300);
	
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//el parámetro de esta fución es una constante estática
		
		ventana.setLocation(860,350);
		
		ventana.setVisible(true);//poner siempre en unltimo lugar*/
		
		
		MiJFrame miVentana=new MiJFrame();
		
		

	}

}

class MiJFrame extends JFrame{
	
	public MiJFrame(){
	
	//setSize(600,350);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//setLocation(860,350);
	
	setBounds(735,350,450,450);//con esta instruccion damos posicion y tamaño  a la vez
	
	//setLocationRelativeTo(null); //pone la ventana en el centro independientemente del monitor
	
	setResizable(false);//Permite o no que podamos redimensionar una ventana
	
	//setExtendedState(JFrame.MAXIMIZED_BOTH); //nos permite maximizar ventana
	
	setTitle("Ventana");
	
	setVisible(true);
	

	
	}
	
}
