package saez.pedro.InterfacesGraficas;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco miVentana= new Marco();
		
	}

}

class Marco extends JFrame{
	
	public Marco() {
		
	setBounds(730,300,450,450);

	setTitle("Mi_Ventana");
	
	
	setVisible(true);
	
	MiPanel miLamina=new MiPanel();//creamos el panel dentro del marco
	
	add(miLamina);//añadimos el panel al marco
		
	
	}
			
}

class MiPanel extends JPanel {
	
		
		public void  paintComponent(Graphics g) {//sobrescribimos este método , pero dentro lo tenemos que llamar con super. porque realiza mas funciones
			
			super.paintComponent(g);
			
			g.drawString("Primer Panel", 200, 200);
			
			
		}
		
		
	
		
	
	
}