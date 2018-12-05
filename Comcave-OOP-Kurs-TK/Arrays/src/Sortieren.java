
public class Sortieren {
	// Attribute
	// Initialisierung ohne Werte
	private int[] zahlen = new int[20];

	// Methoden
	public void starte() {
		// Zufallszahlen füllen
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		// Bubblesort aufrufen
		sortiereAufsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		sortiereAbsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		
		neueZeile();
		neueZeile();
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		sortiere(zahlen, true);
		neueZeile();
		gebeIntArrayFor(zahlen);
		sortiere(zahlen, false);
		neueZeile();
		gebeIntArrayFor(zahlen);
		

	}

	private void neueZeile() {
		System.out.println();
	}

	private void gebeIntArrayForEach(int[] array) {
		// Array ausgeben
		// for each
		// Für jedes
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	private void gebeIntArrayFor(int[] array) {
		// Aufgabe:
		// Komplettes Array ausgeben aber OHNE for each Schleife
		// Versuchen Sie, mit bereits bekannten Schleifen etwas zu basteln, was das
		// ganze Array ausgibt.
		// Zum Beispiel eine For schleife

		// Laufvariable i
		// Bedingung: i muss kleiner als die Anzahl der Einträge des Arrays sein
		// Anweisung: erhöhe i nach jedem Durchlauf um 1
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// Gleichnamige Methoden mit unterschiedlichen Parametern nennt man
	// überladene Methoden.
	// Wichtig: Datentyp und Reihenfolge ist entscheidend
	private void setzeArray(int[] array, int wert) {
		for (int i = 0; i < array.length; i++) {
			array[i] = wert;
		}
	}

	private void setzeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = gebeZufallszahl();
		}
	}

	private int gebeZufallszahl() {
		return (int) (Math.random() * 100);
	}

	private void sortiereAufsteigend(int[] array) {
		// Bubblesort
		// 1. Zahlen tauschen
		// 0 1 2 3 3 4 5 6 7 8 9 10 11 12
		// array.length = 13
//		int stelle = array.length - 2;
//		if (array[stelle] > array[stelle + 1]) {
//			int temp = array[stelle];
//			array[stelle] = array[stelle + 1];
//			array[stelle + 1] = temp;
//		}

		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle <= array.length - 2 - i; stelle++) {
				if (array[stelle] > array[stelle + 1]) {
					int temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;
				}
			}
		}
	}

	private void sortiereAbsteigend(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle <= array.length - 2 - i; stelle++) {
				if (array[stelle] < array[stelle + 1]) {
					int temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;
				}
			}
		}
	}
	
	private void sortiere(int[] array, boolean aufsteigend) {
		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle <= array.length - 2 - i; stelle++) {
				if (pruefeVergleich(array, aufsteigend, stelle)) {
					int temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;
				}
			}
		}
	}
	
	private boolean pruefeVergleich(int[] array, boolean aufsteigend, int stelle) {
		return ((array[stelle] > array[stelle + 1]) && aufsteigend) || ((array[stelle] < array[stelle + 1]) && !aufsteigend);
		
	}
	
	// Verschiene Algorithmen implementieren
	// Zeit stoppen
	// Verschiedene Längen testen
	// Wie verhalten sich die Algorithmen mit steigender Länge.
	// Mehrere Druchgänge
	// Durchschnitt angeben, evtl. Standardabweichung
}
