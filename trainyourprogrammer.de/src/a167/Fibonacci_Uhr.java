package a167;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fibonacci_Uhr extends JFrame {
	Color[] colors = new Color[5];

	public Fibonacci_Uhr() {
		this.add(new Chart());
		this.setVisible(true);
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Fibonacci-Uhr");
	}

	public void aktualisiere(Color[] colors) {
		this.colors = colors;
		repaint();
	}

	public static void main(String[] args) {
		Fibonacci_Uhr anzeige = new Fibonacci_Uhr();
		Color[] colors = new Color[5];
		int[] wert = new int[] { 5, 3, 2, 1, 1 };
		int[] benutzteWerte = new int[] { 0, 0, 0, 0, 0 };
		Calendar cal = new GregorianCalendar();
		int stunde, minute;

		while (true) {
			cal = cal.getInstance();
			stunde = cal.get(Calendar.HOUR);
			minute = cal.get(Calendar.MINUTE);
			benutzteWerte = new int[] { 0, 0, 0, 0, 0 };
			colors = new Color[] { Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, };

			// Stunde
			for (int i = 0; i < 5; i++) {
				if ((stunde - wert[i]) >= 0) {
					stunde = stunde - wert[i];
					benutzteWerte[i]++;
				}
			}

			for (int j = 0; j < 5; j++) {
				if (benutzteWerte[j] == 0) {
					colors[j] = Color.WHITE;
				}

				if (benutzteWerte[j] == 1) {
					colors[j] = Color.RED;
				}
			}

			// MinuteGroß
			for (int i = 0; i < 5; i++) {
				if ((minute - wert[i] * 5) >= 0) {
					minute = minute - wert[i] * 5;
					benutzteWerte[i]++;
				}
			}

			for (int j = 0; j < 5; j++) {
				if (benutzteWerte[j] == 0) {
					colors[j] = Color.WHITE;
				}

				if (benutzteWerte[j] == 1 && colors[j] != Color.RED) {
					colors[j] = Color.GREEN;
				}

				if (benutzteWerte[j] == 2) {
					colors[j] = Color.BLUE;
				}
			}

			// MinuteKlein
			benutzteWerte = new int[] { 0, 0, 0, 0, 0 };
			for (int i = 1; i < 5; i++) {
				if ((minute - wert[i]) >= 0) {
					minute = minute - wert[i];
					benutzteWerte[i]++;
				}
			}

			for (int j = 0; j < 5; j++) {

				if (benutzteWerte[j] == 1 && colors[j] == Color.WHITE) {
					colors[j] = Color.YELLOW;
				}

				if (benutzteWerte[j] == 1 && colors[j] == Color.RED) {
					colors[j] = Color.PINK;
				}

				if (benutzteWerte[j] == 1 && colors[j] == Color.BLUE) {
					colors[j] = Color.CYAN;
				}

				if (benutzteWerte[j] == 1 && colors[j] == Color.GREEN) {
					colors[j] = Color.MAGENTA;
				}

			}
			anzeige.aktualisiere(colors);
		}
	}

	private class Chart extends JPanel {
		public void paintComponent(Graphics g) {
			this.setBackground(Color.WHITE);
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(colors[4]);
			g2d.fillRect(250, 50, 100, 100);

			g2d.setColor(colors[3]);
			g2d.fillRect(250, 150, 100, 100);

			g2d.setColor(colors[2]);
			g2d.fillRect(50, 50, 200, 200);

			g2d.setColor(colors[1]);
			g2d.fillRect(50, 250, 300, 300);

			g2d.setColor(colors[0]);
			g2d.fillRect(350, 50, 500, 500);

			g2d.setColor(Color.BLACK);
			g2d.drawRect(50, 50, 800, 500);
			g2d.drawRect(250, 50, 100, 100);
			g2d.drawRect(250, 150, 100, 100);
			g2d.drawRect(50, 50, 200, 200);
			g2d.drawRect(50, 250, 300, 300);
			g2d.drawRect(350, 50, 500, 500);
		}
	}
}