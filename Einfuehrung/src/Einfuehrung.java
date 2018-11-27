
public class Einfuehrung {

	public static void main(String[] args) {
		// Was sind Variablen?
		// Variablen sind Speicherbausteine
		// Jede Variable ist von einem bestimmten Typ
		// Es gibt ganze Zahlen, Kommazahlen, Worte, Buchstaben, Wahrheitswerte
		// Typ Namen

		// Ganze Zahl
		int meineGanzeZahl = 4;

		// Komma Zahl
		double meineKommaZahl = 7;

		System.out.print("Meine ganze Zahl lautet "); // "" gibt immer genau das aus, was in den Anführungszeichen steht
		System.out.println(meineGanzeZahl); // Gibt den Wert von meineGanzeZahl aus

		System.out.println("Meine ganze Zahl lautet " + meineGanzeZahl); // Selbiges wie weiter oben

		double zahl2 = meineKommaZahl / 2; // Da meineKommaZahl vom Typ double ist, muss .0 nicht ergänzt werden
		System.out.println(zahl2);

		double zahl3 = meineGanzeZahl / 8.0; // Wichitg! 2.0 Da sonst eine int Zahl entsteht und der Kommaanteil
												// abgetrennt würde
		System.out.println(zahl3);

		// Worte und Texte
		// Verkettung von Zeichen
		String meinWort = "Hallo"; // Einzelne Worte
		String meinText = "Java ist spannend :D"; // Oder ganze Texte

		// sysout + Strg + Leertaste gibt System.out.println();

		System.out.println(meinWort);
		System.out.println(meinText);

		// Einzelne Zeichen
		char meinBuchstabe = 'c';
		System.out.println(meinBuchstabe);

		// Wahrheitstypen
		boolean meineWahrheit = false; // Können nur true (wahr) oder false (falsch) annehmen
		System.out.println(meineWahrheit);

		// Verzweigungen
		if (meineWahrheit) {
			System.out.println("If wurde ausgefüht!");
		} else {
			System.out.println("Else wurde ausgeführt!");
		}

		// Prüfe ob meineGanzeZahl größer als 10 ist. Wenn ja, gebe "Zahl ist größer als
		// 10" aus, wenn nein, gebe "Zahl ist kleiner als 10" aus
		if (meineGanzeZahl > 10) {
			System.out.println("Zahl ist größer als 10.");
		} else { // == Überprüfung = Zuweisung
			if (meineGanzeZahl == 10) {
				System.out.println("Zahl ist gleich 10.");
			} else {
				if (meineGanzeZahl < 10) {
					System.out.println("Zahl ist kleiner 10.");
				} else {
					System.out.println("Zahl ist nicht definiert.");
				}
			}
		}
		
		// Bei Bereichen, If, Else if und Else
		if (meineGanzeZahl > 10) {
			System.out.println("Zahl ist größer als 10.");
		} else if (meineGanzeZahl == 10) {
			System.out.println("Zahl ist gleich 10.");
		} else if (meineGanzeZahl < 10) {
			System.out.println("Zahl ist kleiner 10.");
		} else {
			System.out.println("Zahl ist nicht definiert.");
		}
		
		// Bei expliziten Werten switch case
		switch(meineGanzeZahl) {
		case 8:
			System.out.println("Nur eine 8");
			break;
		case 10:
			System.out.println("Bei einer 10...");
			
		case 5: 
			System.out.println("... gibt es eine 5 dazu");
			break;
		}

		// Schleifen
		// For Schleife						1. Zählvariable + Ausgangswert		2. Bedingung	3. Anweisung
		for(int i = 10; i>= 1; i-=5) {		// ++ Inkrekment: Erhöhe um 1 			-- Dekrement: Erniedrige um 1
			System.out.println(i);
		}
		
		// Gebe 5 mal "Hallo Welt!" in einer Zeile mit Leerzeichen dazwischen aus
		// Hallo Welt! Hallo Welt! Hallo Welt! Hallo Welt! Hallo Welt!
		for(int i = 4; i >= 0; i--) {
			System.out.print("Hallo Welt! ");
		}
			
		System.out.println();
			
		// Fakultät
		// 5!=5*4*3*2*1
		// 10!=10*9*8*7*6*5*4*3*2*1

		int start = 5;
		int f = 1;
		
		// 3! = 3*2*1
		
		for(int i = 1; i<= start; i++) {
			f *= i; 	// f = f*i;
		}
		
		System.out.println("Fakulät von " + start + " ist " + f);
		
		
		// While Schleife
		int i = 2;
		int j = 4;
		while(i <= 5 || j == 4) {
			System.out.println("Test");
			i++;
			j =5;
		}
		
		// Do While Schleife
		i = 5;
		do {
			System.out.println("Do while führt mindestens einmal aus!");
		} while(i == 2);
	}

}
