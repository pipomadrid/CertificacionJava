package saez.pedro.InterfacesGraficas;

import java.awt.*;

import javax.swing.JFrame;

public class JFrameImagen {
	
	public static void main(String[] args) {
		
		
		OtroJFrame MiVentana=new OtroJFrame();
		
		
	}
}
	
	
class OtroJFrame extends JFrame{
		
	public OtroJFrame(){
		
	//setSize(600,350);
		
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setLocation(860,350);
		
	setBounds(735,350,450,450);//con esta instruccion damos posicion y tamaño  a la vez
		
	//setLocationRelativeTo(null); //pone la ventana en el centro independientemente del monitor
		
	//setResizable(false);//Permite o no que podamos redimensionar una ventana
		
	//setExtendedState(JFrame.MAXIMIZED_BOTH); //nos permite maximizar ventana
		
	setTitle("Ventana");
	
	
	Toolkit miSistema= Toolkit.getDefaultToolkit();
	
	Image MiIcono= miSistema.getImage("descarga.png");//en linux de trabajo no parece icono
	
	setIconImage(MiIcono);
	
	
		
	setVisible(true);
		

		
	}
		
}
	
	
	


