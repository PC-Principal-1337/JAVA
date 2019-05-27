package a69;

import java.math.BigInteger;

public class IbanChecker {
	private static char[] alphabet = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static boolean gueltigeIban(String s) {

		char[] cha = s.toCharArray();
		s = "";// Schreibweise maschinenfreundlich machen
		for (int x = 0; x < cha.length; x++) {
			if (!(cha[x] == '-' || cha[x] == ' '))
				s = s + cha[x];
		}

		cha = s.toCharArray();// cha wird beim umstellen als temp benutzt
		char[] cha2 = new char[cha.length];
		s="";
		
		int u = 0;// ersten 4 Zeichen nach hinten
		while (u < 4) {
			cha2[cha.length - 4 + u] = cha[u];
			u++;
		}
		u = 0;

		while (u < cha.length - 4) {
			cha2[u] = cha[u + 4];
			u++;
		}

		int[] i = new int[cha2.length];// Buchstaben durch int Werte ersetzen
		for (int x = 0; x < cha2.length; x++) {
			for (int y = 0; y < alphabet.length; y++) {
				if (cha2[x] == alphabet[y]) {
					i[x] = y + 10;
					y = 50;
				} else {
					i[x] = cha2[x] - 48;
				}
			}
		}

		for (int x = 0; x < i.length; x++) {
			s = s + i[x];
		}

		BigInteger bint = new BigInteger(s);
		bint = bint.mod(BigInteger.valueOf(97));

		boolean b = false;
		if (bint.intValue() == 1) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		String s = "IQ20-CBIQ-8618-001010-10500";
		boolean b = gueltigeIban(s);
		System.out.println(b);
	}
}
