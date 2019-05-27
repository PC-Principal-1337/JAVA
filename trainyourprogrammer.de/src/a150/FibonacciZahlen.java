package a150;

import java.math.*;

public class FibonacciZahlen {

	public static void main(String[] args) {
		int n = 100;
		BigInteger alt = BigInteger.ZERO;
		BigInteger aelter = BigInteger.ONE;
		BigInteger neu = BigInteger.ZERO;

		while (n > 0) {
			neu = neu.add(alt);
			neu = neu.add(aelter);
			System.out.println(neu);
			aelter = alt;
			alt = neu;
			neu = BigInteger.ZERO;
			n--;
		}

	}
}
