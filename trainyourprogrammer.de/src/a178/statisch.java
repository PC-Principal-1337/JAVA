package a178;

public class statisch implements IStrategie {
	public int neuerZug(ZweiwertigesGlueckspiel glueck, boolean gewonnen) throws Exception {
		if (glueck.getKontostand() > 0 && glueck.getKontostand() < (glueck.getGesetztesGeld() * 2)) {
			if (gewonnen) {
				return (glueck.getKontostand() + glueck.getEinsatz());
			} else {
				return (glueck.getKontostand() - glueck.getEinsatz());
			}
		} else
			throw new Exception("Kein neuer Zug möglich");

	}

	public String toString() {
		return "statisch";
	}
}
