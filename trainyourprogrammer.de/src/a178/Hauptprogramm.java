package a178;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Hauptprogramm {

	public static void main(String[] args) {
		int maxSerie = 1000;
		int gewinnwahrscheinlichkeit;

		do {
			gewinnwahrscheinlichkeit = (int) (Math.random() * 100);
		} while (gewinnwahrscheinlichkeit >= 60 || gewinnwahrscheinlichkeit <= 40);

		ArrayList<ZweiwertigesGlueckspiel> glueckspiele = new ArrayList<ZweiwertigesGlueckspiel>();

		glueckspiele.add(new ZweiwertigesGlueckspiel(new statisch(), maxSerie, Color.BLACK));
		glueckspiele.add(new ZweiwertigesGlueckspiel(new martingal(), maxSerie, Color.GREEN));
		glueckspiele.add(new ZweiwertigesGlueckspiel(new reverse_martingal(), maxSerie, Color.BLUE));
		glueckspiele.add(new ZweiwertigesGlueckspiel(new Fibonacci(), maxSerie, Color.RED));

		boolean gewonnen;
		List<Integer> pleite = new ArrayList();

		for (int p = 0; p < maxSerie; p++) {
			if (((int) (Math.random() * 100) - gewinnwahrscheinlichkeit) <= 0) {
				gewonnen = true;
			} else {
				gewonnen = false;
			}

			for (int i = 0; i < glueckspiele.size(); i++) {
				try {
					if (!pleite.contains(i))
						glueckspiele.get(i).neuerZug(gewonnen);
				} catch (Exception e) {
					pleite.add(i);
				}
			}
		}

		Anzeige anzeige = new Anzeige(glueckspiele, gewinnwahrscheinlichkeit);
	}
}