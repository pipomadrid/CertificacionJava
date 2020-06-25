package saez.pedro.clases_internas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temporizador oyente=new Temporizador();
		
		Timer miTemp=new Timer(3000,oyente);
		
		miTemp.start();
		
		JOptionPane.showMessageDialog(null,"pulsa Enter para salir");
		
		
		

	}

}

class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println("Escribiendo cada 3 segundos");
		
	}
	
	
	
}
