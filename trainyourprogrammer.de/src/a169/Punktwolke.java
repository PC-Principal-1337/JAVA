package a169;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Punktwolke extends JFrame {

	public Punktwolke() {
		
		this.setLayout(new BorderLayout());
		this.add(new Chart(),BorderLayout.LINE_START);
		
		Button newPoints=new Button("newPoints");
		this.add(newPoints,BorderLayout.LINE_END);
		
		Button drawConvexLine=new Button("drawConvexLine");
		this.add(drawConvexLine,BorderLayout.LINE_END);
		
		this.setVisible(true);
		this.setSize(1000,750);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Konvexe Hüllkurve um Punktwolke");
	
	}

	
	
	private class Chart extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			Graphics2D g2d = (Graphics2D) g;
			
			
			
			
			
			this.setBackground(Color.WHITE);
			this.setVisible(true);
			this.setSize(750,750);
		}
	}

	public static void main(String[] args) {
		new Punktwolke();
	}
}