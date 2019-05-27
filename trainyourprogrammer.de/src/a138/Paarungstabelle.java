package a138;

public class Paarungstabelle {

	public static void main(String[] args) {

		int n = 6;// Anzahl der Teilnehmer

		if (n % 2 == 1) {// Anzahl muss gerade sein
			n++; // Spiele mit NR.10 sind dann Freispiele
		}

		// x=Runden y=Spiele
		String[][] arr = new String[n - 1][n / 2];

		int min = 0;
		int max = n;

		for (int x = 0; x < n - 1; x++) {
			for (int y = 0; y < n / 2; y++) {

				if (min == n - 1) {
					min = 0;
				}

				if (max == 1) {
					max = n;
				}

				if (x % 2 == 0) {// ungerade Zeile

					if (y == 0) {// erste Spalte
						min++;
						arr[x][y] = "" + min + "-" + n;

					} else {
						min++;
						max--;
						arr[x][y] = "" + min + "-" + max;
					}
				}

				if (x % 2 == 1) {// gerade Zeile

					if (y == 0) {// erste Spalte
						min++;
						arr[x][y] = "" + n + "-" + max;

					} else {
						min++;
						max--;
						arr[x][y] = "" + min + "-" + max;
					}
				}
			}
		}

		for (int x = 0; x < n - 1; x++) {
			for (int y = 0; y < n / 2; y++) {
				System.out.printf("%6s", arr[x][y]);
			}
			System.out.println();
		}

	}
}