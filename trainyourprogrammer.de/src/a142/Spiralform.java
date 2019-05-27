package a142;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spiralform {

	public static void main(String[] args) {
		try {
			// String s wird mittels Tastatur eingelesen
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Geben sie einen Text ein");
			in = new BufferedReader(new InputStreamReader(System.in));
			String eingabe = in.readLine();
			char[] charArray1 = eingabe.toCharArray();

			// Das Programm funktioniert nur mit ungeraden Dimensionen größer 1
			int dimension = (int) Math.sqrt(charArray1.length);
			while (dimension < 3) {
				dimension++;
			}
			if (dimension * dimension < charArray1.length)
				dimension += 1;
			if (dimension % 2 != 1)
				dimension += 1;

			char[][] spirale = new char[dimension][dimension];

			// Das charArray soll so viele Zeichen enthalten, wie Platz in der Spirale ist
			char[] charArray2 = new char[dimension * dimension];

			// Das Array wird aufgefüllt
			for (int x = 0; x < (dimension * dimension); x++) {
				if (x < charArray1.length) {
					charArray2[x] = charArray1[x];
				} else
					charArray2[x] = 000;// Alle übrigen Zeichen sind null
			}

			// x und y sind die mitte des arrays
			int x = (dimension / 2);
			int y = x;
			int z = 0;
			int schritte = 2;
			int durchgänge = (dimension / 2);

			// Mittelpunkt einfügen
			spirale[x][y] = charArray2[z];

			while (durchgänge > 0) {
				z++;
				y++;
				spirale[x][y] = (charArray2[z]);

				for (int f = 0; f < schritte-1; f++) {
					z++;
					x--;
					spirale[x][y] = (charArray2[z]);
				}

				for (int f = 0; f < schritte; f++) {
					z++;
					y--;
					spirale[x][y] = (charArray2[z]);
				}

				for (int f = 0; f < schritte; f++) {
					z++;
					x++;
					spirale[x][y] = (charArray2[z]);
				}

				for (int f = 0; f < schritte; f++) {
					z++;
					y++;
					spirale[x][y] = (charArray2[z]);
				}

				schritte+=2;
				durchgänge--;
			}

			for (int k = 0; k < dimension; k++) {
				for (int l = 0; l < dimension; l++) {
					System.out.print(spirale[k][l] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
