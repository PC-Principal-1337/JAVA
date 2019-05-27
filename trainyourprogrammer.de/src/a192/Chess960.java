package a192;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Chess960 extends JFrame {

	public Chess960() {
		this.add(new Chart());
		this.setVisible(true);
		this.setSize(1000, 600);
	}

	public void aktualisiere() {

	}

	private class Chart extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g.drawLine(50, 0, 50, 400);
			g.drawLine(50, 400, 450, 400);
		
			char c=65;
			for (int i = 1,l=75,h=375; i < 9; i++,l+=50,h-=50) {
				g.drawString(String.valueOf(c), l, 425);
				c=(char)(c+1);
				g.drawString(String.valueOf(i), 25, h);
			}
			
		
	
			for(int x=50;x<450;x+=50) {
				for(int y=0;y<400;y+=50) {
					g.setColor(Color.getHSBColor(131, 86, 41));
					g.fillRect(x, y, 50, 50);
				
				}
			}
			
			
//			g.drawString("A", 150, 725);
//			g.drawString("A", 250, 725);
//			g.drawString("A", 350, 725);
//			g.drawString("A", 450, 725);
//			g.drawString("A", 550, 725);
//			g.drawString("A", 650, 725);
//			g.drawString("A", 750, 725);
//			g.drawString("A", 850, 725);
			
		}
	}

	public static void main(String[] args) {
		Chess960 chess = new Chess960();
		
	}

}
