package a146;

public class MatrizenDrehen {

	public static char[][] drehen(char[][] arr) {
		char[][] temp = new char[arr.length][arr.length];
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length; y++) {
				temp[x][y] = arr[3 - y][x];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		char[][] arr1 = new char[][] { { '-', '-', '-', '-' }, { '-', 'o', '-', '-' }, { 'o', 'o', 'o', '-' },
				{ '-', '-', '-', '-' } };

		char[][] arr2 = new char[][] { { '-', '-', '-', '-' }, { '-', 'o', 'o', '-' }, { 'o', 'o', '-', '-' },
				{ '-', '-', '-', '-' } };

		char[][] arr3 = new char[][] { { '-', '-', '-', '-' }, { '-', 'o', '-', '-' }, { '-', 'o', '-', '-' },
				{ '-', 'o', 'o', '-' } };

		char[][] arr4 = new char[][] { { '-', '-', 'o', '-' }, { '-', '-', 'o', '-' }, { '-', '-', 'o', '-' },
				{ '-', '-', 'o', '-' } };

		int hilf = 0;

		while (hilf < 5) {
			if (hilf > 0) {//verhindert dass,das erste mal schon gedreht wird
				arr1 = drehen(arr1);
				arr2 = drehen(arr2);
				arr3 = drehen(arr3);
				arr4 = drehen(arr4);
			}
			System.out.println();
			for (int x = 0; x < 4; x++) {

				for (int y = 0; y < 4; y++) {
					System.out.print((arr1[x][y] + " "));
				}
				System.out.print("  ");

				for (int y = 0; y < 4; y++) {
					System.out.print((arr2[x][y] + " "));
				}
				System.out.print("  ");

				for (int y = 0; y < 4; y++) {
					System.out.print((arr3[x][y] + " "));
				}
				System.out.print("  ");

				for (int y = 0; y < 4; y++) {
					System.out.print((arr4[x][y] + " "));
				}

				System.out.println();
			}
			hilf++;
		}

	}
}
