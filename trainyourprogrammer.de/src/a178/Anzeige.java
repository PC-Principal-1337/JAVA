package a178;

		import java.awt.BasicStroke;
		import java.awt.Color;
		import java.awt.Font;
		import java.awt.Graphics;
		import java.awt.Graphics2D;
		import java.util.ArrayList;
		import javax.swing.JFrame;
		import javax.swing.JPanel;
		
		public class Anzeige extends JFrame {
			ArrayList<ZweiwertigesGlueckspiel> data = new ArrayList<ZweiwertigesGlueckspiel>();
		
			public Anzeige(ArrayList<ZweiwertigesGlueckspiel> glueckspiele, int gewinnwahrscheinlichkeit) {
				this.add(new Chart());
				this.setVisible(true);
				this.setSize(1100, 700);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				data = glueckspiele;
				this.setTitle("Gesetztes Geld:" + data.get(0).getGesetztesGeld() + "   Gewinnwahrscheinlichkeit: "
						+ gewinnwahrscheinlichkeit);
			}
		
			private class Chart extends JPanel {
		
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.setColor(Color.BLACK);
		
					Graphics2D g2d = (Graphics2D) g;
		
					for (int i = 0; i <= 1000; i += 100) {
						g2d.drawLine(0, (this.getHeight() / 2) + i / 4, this.getWidth(), (this.getHeight() / 2) + i / 4);
						g2d.drawLine(0, (this.getHeight() / 2) - i / 4, this.getWidth(), (this.getHeight() / 2) - i / 4);
						g2d.drawString("+" + i, 0, (this.getHeight() / 2) - i / 4);
						g2d.drawString("" + i * -1, 0, (this.getHeight() / 2) + i / 4);
					}
		
					for (int i = 0; i <= 1000; i += 100) {
						g2d.drawString("" + i, 0 + i, (this.getHeight() / 2) + 250);
					}
		
					Font font = g.getFont().deriveFont(20.0f);
					g2d.setFont(font);
					g2d.drawString("Runden", this.getWidth() / 2, (this.getHeight() / 2) + 275);
					g2d.drawString("Gewinn", 0, (this.getHeight() / 2) - 275);
		
					BasicStroke stroke = new BasicStroke(2);
					g2d.setStroke(stroke);
		
					for (int i = 0; i < data.size(); i++) {
						g2d.setColor(data.get(i).getGraphFarbe());
						g2d.drawString("" + data.get(i).getStrategie(), 100 + i * this.getWidth() / 4,
								(this.getHeight() / 2) - 275);
		
						for (int p = 0; p < data.get(i).getMaxRunde() - 1; p++) {
							g2d.drawLine(p,
									(this.getHeight() / 2)
											+ (((data.get(i).getVerlauf())[p] - data.get(i).getGesetztesGeld()) / 4) * -1,
									p + 1, (this.getHeight() / 2)
											+ (((data.get(i).getVerlauf())[p + 1] - data.get(i).getGesetztesGeld()) / 4) * -1);
						}
					}
		
					this.setBackground(Color.WHITE);
					this.setVisible(true);
					this.setSize(super.getSize());
				}
			}
		}
