package saez.pedro.clases_internas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorClaseInternaAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Timer miTemp=new Timer(3000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Date horaActual=new Date();
				
				System.out.println(horaActual);
			}	
			
		}
		
		);
		
		miTemp.start();
		
		JOptionPane.showMessageDialog(null,"pulsa Enter para salir");
		
	}

}
