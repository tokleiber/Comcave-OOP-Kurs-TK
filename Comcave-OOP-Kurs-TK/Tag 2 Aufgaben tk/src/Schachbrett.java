import static java.lang.System.out;

public class Schachbrett {

	public static void main(String[] args) {
		// Lösung Böckle
		System.out.println("Böckle");
		System.out.println();
		int laenge = 9;
		int breite = 9;

		for (int i = 1; i <= laenge; i++) { // Zeile

			for (int j = 1; j <= breite; j++) { // Spalte
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();

		// Loesung Lesemann

		System.out.println("Lesemann");

		System.out.println();

		int zaehler = 0;
		for (int i = 1; i <= laenge; i++) { // Zeile
			for (int j = 1; j <= breite; j++) { // Spalte
				if (zaehler == 0) {
					System.out.print("#");
					zaehler = 1;
				} else {
					System.out.print(" ");
					zaehler = 0;
				}
			}
			if (breite % 2 == 0) {
				if (zaehler == 1) {
					zaehler = 0;
				} else {
					zaehler = 1;
				}
			}
			System.out.println();
		}

		// Loesung Lesemann

		System.out.println("Lesemann ohne Zusatzzähler");

		System.out.println();

		char zeichen = '#';
		for (int i = 1; i <= laenge; i++) { // Zeile
			for (int j = 1; j <= breite; j++) { // Spalte
				System.out.print(zeichen);
				zeichen = (zeichen == '#') ? ' ' : '#'; // Ternäre Operator
//				if(zeichen == '#') {
//					zeichen = ' ';
//				}
//				else {
//					zeichen ="#";
//				}
			}
			if (breite % 2 == 0) {
				zeichen = (zeichen == '#') ? ' ' : '#';	// Ternärer Operator
			}
			System.out.println();
		}

		// Lösung Masur
		System.out.println("Masur");
		System.out.println();
		boolean setlinespace = false;
		for (int a = 0; a < laenge; a++) {
			for (int b = 1; b <= breite; b++) {
				if (setlinespace == false) {
					System.out.print("# ");
					if (b == breite) {
						setlinespace = true;
					}
				} else if (setlinespace == true) {
					System.out.print(" #");
					if (b == breite) {
						setlinespace = false;
					}
				}
			}
			System.out.println();
		}

		// Lösung Schmidt
		System.out.println();
		System.out.println("Schmidt");
		System.out.println();
		boolean setLineSpace = true;
		for (int i = 0; i < laenge; i++) {
			for (int j = 1; j <= breite; j++) {
				if (!setLineSpace) {
					out.print("#" + " ");
					if (j == breite) {
						setLineSpace = true;
					}
				} else {
					out.print(" " + "#");
					if (j == breite) {
						setLineSpace = false;
					}
				}
			}
			out.println();
		}
	}
}
