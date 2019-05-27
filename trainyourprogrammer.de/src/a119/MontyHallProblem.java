package a119;

public class MontyHallProblem {

	public static void main(String[] args) {
		int counter1 = 0;
		int counter2 = 0;
		int tuer1 = 1;
		int tuer2 = 2;
		int tuer3 = 3;

		for (int x = 0; x < 1000; x++) {
			int gewinn = (int) (Math.random() * 3 + 1);
			int typ1 = (int) (Math.random() * 3 + 1);// nicht Wechsler
			int typ2 = typ1;// Wechsler

			//Moderator öffnet eine Tür die nicht, die gewählte Tür oder der Gewinn ist
			if ((tuer1 != gewinn) && (tuer1 != typ1)) {
				tuer1 = -1;
			}
			if ((tuer2 != gewinn) && (tuer2 != typ1) && (tuer1 != -1)) {
				tuer2 = -1;
			}
			if ((tuer3 != gewinn) && (tuer3 != typ1) && (tuer1 != -1) && (tuer2 != -1)) {
				tuer3 = -1;
			}

			
			if (typ1 == gewinn)
				counter1++;

			//typ2 wechseld immer!
			if (tuer1 == -1) {
				if (tuer2 != typ2) {
					typ2 = tuer2;
				} else {
					typ2 = tuer3;
				}
			}

			if (tuer2 == -1) {
				if (tuer1 != typ2) {
					typ2 = tuer1;
				} else {
					typ2 = tuer3;
				}
			}

			if (tuer3 == -1) {
				if (tuer1 != typ2) {
					typ2 = tuer1;
				} else {
					typ2 = tuer2;
				}
			}

			if (typ2 == gewinn) {
				counter2++;
			}

			tuer1 = 1;
			tuer2 = 2;
			tuer3 = 3;

			System.out.println("nicht Wechsler: " + counter1 + "  Wechsler: " + counter2);
		}

	}
}
