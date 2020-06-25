package saez.pedro.InterfacesGraficas;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco2 miMarco=new Marco2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco2 extends JFrame{
	

	public Marco2() {
		
		
		setBounds(300,300,800,450);
		
		Panel milamina=new Panel();
			
		add(milamina);
		
		setVisible(true);	
		
	}
	
	
	
	
}

class  Panel extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File miImagen=new File("src/saez/pedro/InterfacesGraficas/casa.jpg");
		
		try {
			imagen=ImageIO.read(miImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("La imagen no se ha encontrado");
		}
		
		g.drawImage(imagen, 50, 50, null);
		
		
		
	}
	
	private Image imagen;
	
}

	
	
	
