package a178;

public class Fibonacci implements IStrategie {
	private int fiboEinsatz[] = new int[20];
	int position = 1;

	public Fibonacci() {
		fiboEinsatz[0] = 1;
		fiboEinsatz[1] = 1;
		for (int i = 2; i < 20; i++) {
			fiboEinsatz[i] = fiboEinsatz[i - 1] + fiboEinsatz[i - 2];
		}
	}

	public int neuerZug(ZweiwertigesGlueckspiel glueck, boolean gewonnen) throws Exception {
		if (glueck.getKontostand() > 0 && glueck.getKontostand() < (glueck.getGesetztesGeld() * 2)) {
			if (gewonnen) {
				int gewinn = glueck.getKontostand() + glueck.getEinsatz();
				if (!(position <= 1))
					position = position - 2;
				if (fiboEinsatz[position] <= glueck.getKontostand()) {
					glueck.setEinsatz(fiboEinsatz[position]);
				} else {
					glueck.setEinsatz(glueck.getKontostand());
				}
				return gewinn;
			} else {
				int verlust = glueck.getKontostand() - glueck.getEinsatz();
				position++;
				if (fiboEinsatz[position] <= glueck.getKontostand()) {
					glueck.setEinsatz(fiboEinsatz[position]);
				} else {
					glueck.setEinsatz(glueck.getKontostand());
				}
				return verlust;
			}
		} else
			throw new Exception("Kein neuer Zug möglich");

	}

	public String toString() {
		return "Fibonacci";
	}
}
