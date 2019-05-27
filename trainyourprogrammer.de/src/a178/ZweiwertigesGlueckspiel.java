package a178;

import java.awt.Color;

public class ZweiwertigesGlueckspiel {
	private int runde = 0;
	private int gesetztesGeld = 1000;
	private int kontostand = gesetztesGeld;
	private int maxRunde;
	private int[] kontostandVerlauf;
	private int gewinnSerie = 0;
	private int einsatz = 1;
	private int[] einsatzVerlauf;
	boolean gewonnen;
	private Color graphFarbe;
	private IStrategie strategie;

	public ZweiwertigesGlueckspiel(IStrategie strategie, int maxSerie, Color c) {
		this.strategie = strategie;
		this.maxRunde = maxSerie;
		kontostandVerlauf = new int[maxSerie];
		kontostandVerlauf[0] = gesetztesGeld;
		this.graphFarbe = c;
		this.einsatzVerlauf = new int[maxSerie];
	}

	protected int neuerZug(boolean gewonnen) throws Exception {
		kontostand = strategie.neuerZug(this, gewonnen);
		runde++;
		kontostandVerlauf[runde] = kontostand;
		einsatzVerlauf[runde] = einsatz;
		return kontostand;
	}

	public int getRunde() {
		return runde;
	}

	public void setRunde(int runde) {
		this.runde = runde;
	}

	public int getGesetztesGeld() {
		return gesetztesGeld;
	}

	public void setGesetztesGeld(int gesetztesGeld) {
		this.gesetztesGeld = gesetztesGeld;
	}

	public int getKontostand() {
		return kontostand;
	}

	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}

	public int getMaxRunde() {
		return maxRunde;
	}

	public void setMaxRunde(int maxRunde) {
		this.maxRunde = maxRunde;
	}

	public int[] getVerlauf() {
		return kontostandVerlauf;
	}

	public void setVerlauf(int[] verlauf) {
		this.kontostandVerlauf = verlauf;
	}

	public int getGewinnSerie() {
		return gewinnSerie;
	}

	public void setGewinnSerie(int gewinnSerie) {
		this.gewinnSerie = gewinnSerie;
	}

	public int getEinsatz() {
		return einsatz;
	}

	public void setEinsatz(int einsatz) {
		this.einsatz = einsatz;
	}

	public IStrategie getStrategie() {
		return strategie;
	}

	public void setStrategie(IStrategie strategie) {
		this.strategie = strategie;
	}

	public Color getGraphFarbe() {
		return graphFarbe;
	}

	public void setGraphFarbe(Color graphFarbe) {
		this.graphFarbe = graphFarbe;
	}

	public int[] getEinsatzVerlauf() {
		return einsatzVerlauf;
	}

	public void setEinsatzVerlauf(int[] einsatzVerlauf) {
		this.einsatzVerlauf = einsatzVerlauf;
	}
}