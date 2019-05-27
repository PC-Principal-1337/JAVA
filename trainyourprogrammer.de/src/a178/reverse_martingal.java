package a178;

public class reverse_martingal implements IStrategie {
	public int neuerZug(ZweiwertigesGlueckspiel glueck, boolean gewonnen) throws Exception {
		int angestrebteGewinnSerie = 5;
		if (glueck.getKontostand() > 0 && glueck.getKontostand() < (glueck.getGesetztesGeld() * 2)) {
			if (gewonnen) {
				int gewinn = glueck.getKontostand() + glueck.getEinsatz();
				glueck.setGewinnSerie(glueck.getGewinnSerie() + 1);
				if (glueck.getGewinnSerie() < angestrebteGewinnSerie) {
					if (glueck.getKontostand() < glueck.getEinsatz() * 2) {
						glueck.setEinsatz(glueck.getKontostand());
					}
					glueck.setEinsatz(glueck.getEinsatz() * 2);
				} else {
					glueck.setEinsatz(1);
				}
				return gewinn;
			} else {
				int verlust = glueck.getKontostand() - glueck.getEinsatz();
				glueck.setEinsatz(1);
				glueck.setGewinnSerie(0);
				return verlust;
			}
		} else
			throw new Exception("Kein neuer Zug möglich");

	}

	public String toString() {
		return "reverse-martingal";
	}
}
