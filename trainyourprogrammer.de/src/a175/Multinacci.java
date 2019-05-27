package a175;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Multinacci {
	public static void main(String[] args) {
	
		int k = 100;
		int anzahlGlieder=10;
		
		BigDecimal phi_fibok = BigDecimal.ZERO;
		BigDecimal fibok = BigDecimal.ONE;
		BigDecimal[] array = new BigDecimal[k];

		for (int p = 0; p < array.length; p++) {
			array[p] = BigDecimal.ONE;
		}

		for (int w = 0; w < anzahlGlieder; w++) {
			for (int i = 0; i < k - 1; i++) {
				fibok = fibok.add(array[i]);
			}
			for (int h = 0; h < array.length - 1; h++) {
				array[h] = array[h + 1];
			}
			array[array.length - 1] = fibok;
			System.out.println(fibok.toString());
		}

		phi_fibok = array[array.length - 1].divide(array[array.length - 2], 10, RoundingMode.HALF_UP);
		System.out.println(phi_fibok);
	}
}


