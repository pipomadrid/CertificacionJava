package saez.pedro.InterfacesGraficas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaBotones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones miMarco=new MarcoBotones();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}
//creamos el marco
class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		
		
		setTitle("Prueba Botones");
		
		setSize(300,200);
		
		LaminaBotones miLamina=new LaminaBotones();
		
		add(miLamina);
		
		
		
		
		
	}
	
	
}
//creamos la lamina 
class LaminaBotones extends JPanel{
	
	public LaminaBotones() {
		
		//se crean los botones
		
		JButton botonAmarillo= new JButton("Amarillo");
		JButton botonAzul= new JButton("Azul");
		JButton botonRojo= new JButton("Rojo");
		
		//se añaden los botones a la lamina	
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		
		//creamos las acciones de los botones
		
		AccionColor accionAmarillo= new AccionColor(Color.yellow);
		AccionColor accionAzul= new AccionColor(Color.BLUE);
		AccionColor accionRojo=new AccionColor(Color.RED);
		
		//asociamos las acciones con los botones
		
		botonAmarillo.addActionListener(accionAmarillo);
		botonAzul.addActionListener(accionAzul);
		botonRojo.addActionListener(accionRojo);
		
		
		
	}
	
	private class AccionColor implements ActionListener{

		private Color colorDeFondo;
		
		public AccionColor(Color c) {
			
			colorDeFondo= c;
		}
		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			setBackground(colorDeFondo);
			
		}
		
		
	}
	
	
}