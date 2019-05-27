package a157;

import java.math.BigInteger;

public class Funktion {

	public static void main(String[] args) {
		// Schritt 1+2
		int fn = 12;
		String s = "";
		for (int j = 1; j <= fn; j++) {
			s = Integer.toBinaryString(j) + s;
		}

		//Schritt 3
		BigInteger res = BigInteger.ZERO;
		BigInteger ex = BigInteger.ONE;
		int oneORzero = -1;
		while (!s.equals("")) {
			oneORzero = Integer.valueOf(s.substring(s.length() - 1));
			if (oneORzero == 1) {
				res = res.add(ex);
			}
			ex = ex.shiftLeft(1);
			s = s.substring(0, s.length() - 1);
		}
		System.out.println(res);

	}
}
