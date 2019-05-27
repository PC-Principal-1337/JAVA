package a178;

public class martingal implements IStrategie {
	public int neuerZug(ZweiwertigesGlueckspiel glueck, boolean gewonnen) throws Exception {
		if (glueck.getKontostand() > 0 && glueck.getKontostand() < (glueck.getGesetztesGeld() * 2)) {
			if (gewonnen) {
				int gewinn = glueck.getKontostand() + glueck.getEinsatz();
				glueck.setEinsatz(1);
				return gewinn;
			} else {
				int verlust = glueck.getKontostand() - glueck.getEinsatz();
				if (glueck.getEinsatz() * 2 < glueck.getKontostand()) {
					glueck.setEinsatz(glueck.getEinsatz() * 2);
				} else {
					glueck.setEinsatz(glueck.getKontostand());
				}
				return verlust;
			}
		} else
			throw new Exception("Kein neuer Zug möglich");
	}

	public String toString() {
		return "martingal";
	}
}
