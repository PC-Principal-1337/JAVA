package a174;

import java.util.Scanner;

public class Variablenspielerei {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i1 = Integer.parseInt(scan.nextLine());
		int i2 = Integer.parseInt(scan.nextLine());

		System.out.println("Zahl 1: " + i1 + "   Zahl 2: " + i2);

		i2 = i2 + i1;
		i1 = i2 - i1;
		i2 = i2 - i1;

		System.out.println("Zahl 1: " + i1 + "   Zahl 2: " + i2);
	}
}