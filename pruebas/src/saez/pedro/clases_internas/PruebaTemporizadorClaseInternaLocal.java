package saez.pedro.clases_internas;

import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorClaseInternaLocal {
	
	
	public static void main(String[] args) {

	
	Reloj2 miReloj2=new Reloj2();
	
	miReloj2.ejecutarTemporizador(2000, true);
	
	}
	
}
	


class Reloj2{
		
		

		
	public void ejecutarTemporizador(int intervalo,boolean sonido) {
			
		class DameLaHora implements ActionListener{

				
			public void actionPerformed(ActionEvent arg0) {
					
				System.out.println("Escribiendo cada " + intervalo/1000 + " segundos");
					
				if (sonido) Toolkit.getDefaultToolkit().beep();
					
			}
			
			}
			
		ActionListener  oyente = new DameLaHora();
		
		Timer miTemp=new Timer(intervalo,oyente);
			
			miTemp.start();
			
			JOptionPane.showMessageDialog(null, "Dale a Enter para salir");
		
		}
		
		
	

}
