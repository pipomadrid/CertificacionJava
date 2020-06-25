package saez.pedro.InterfacesGraficas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnJframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoDibujos miMarco=new MarcoDibujos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoDibujos extends JFrame{
	

	public MarcoDibujos() {
		
		
		setBounds(300,300,800,450);
		
		PanelDibujos milamina=new PanelDibujos();
		
		milamina.setBackground(Color.black);
		
		add(milamina);
		
		setVisible(true);	
		
	}
	
	
	
	
}

class  PanelDibujos extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		/*g.drawRect(20, 20, 125, 75);
		
		g.drawLine(20, 20, 145, 95);
		
		g.fillRect(20,200, 125, 75);*/
		
		Graphics2D g2=(Graphics2D)g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		BasicStroke trazo=new BasicStroke(4);
		
		Font miLetra=new Font("Courier",Font.BOLD,20);
		
		g2.setFont(miLetra);
		
		g2.drawString("hola que tal", 500, 200);
		
		g2.setPaint(Color.blue);
		
		g2.setStroke(trazo);
		
		g2.draw(rectangulo);
		
		g2.setPaint(new Color(123,123,55));
		
		g2.fill(rectangulo);
		
		
		
	}
	
	
	
}