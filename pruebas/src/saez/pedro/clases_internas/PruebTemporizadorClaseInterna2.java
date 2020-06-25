package saez.pedro.clases_internas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebTemporizadorClaseInterna2 {

	public static void main(String[] args) {
		
		Reloj miReloj=new Reloj(4000,true);
		
		miReloj.ejecutarTemporizador();
		
		

	}

}



class Reloj{
	
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
	}
	
	
	private int intervalo;
	
	private boolean sonido;
	
	
	public void ejecutarTemporizador() {
		
		ActionListener  oyente = new DameLaHora();
		
		Timer miTemp=new Timer(intervalo,oyente);
		
		miTemp.start();
		
		JOptionPane.showMessageDialog(null, "Dale a Enter para salir");
	
	}
	private class DameLaHora implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println("Escribiendo cada " + intervalo/1000 + " segundos");
			
			if (sonido) Toolkit.getDefaultToolkit().beep();
			
		}
		
	}
	
}