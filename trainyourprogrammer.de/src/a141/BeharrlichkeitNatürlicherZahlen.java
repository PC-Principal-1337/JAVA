package a141;

public class BeharrlichkeitNatürlicherZahlen {

	public static int pers(int n) {
		int pers = 0;
		int mod = 0;
		int res = n;// res=n damit mind.1 durchlauf stattfindet
		while ((res / 10) != 0) {
			n = res;
			res = 1;
			pers++;
			while (n > 0) {
				mod = n % 10;
				res *= mod;
				n = n / 10;
			}
		}
		return pers;
	}

	public static int komponentenMulti(int n) {
		int mod = 0;
		int res = 1;
		while (n > 0) {
			mod = n % 10;
			res *= mod;
			n = n / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		int maxpers = -1;
		int stellen = 1000000;
		int[] erg = new int[2500];

		for (int x = 0; x < stellen; x++) {// max pers für Stellen berechnen
			if (pers(x) > maxpers) {
				maxpers = pers(x);
			}
		}

		System.out.println("Beste Beharrlickeit " + maxpers + " bei:");

		int zaeler = 0;
		for (int x = 0; x < stellen; x++) {// alle Zahlen mit maxpers in erg abspeichern					
			if (pers(x) == maxpers) {
				erg[zaeler] = x;
				zaeler++;
			}
		}

		for (int x = 0; x < erg.length; x++) {// doppelte Ergebnisse bezüglich ihrer "Eigenmultiplikation",
			for (int y = 0; y < erg.length; y++) {// werden herausgelöscht
				if (y != x) {
					if (komponentenMulti(erg[x]) == komponentenMulti(erg[y])) {
						erg[y] = 0;
					}
				}
			}
		}

		for (int i = 0; i < erg.length; i++) {
			if (erg[i] != 0) {
				System.out.println(erg[i]);
			}
		}

	}
}
