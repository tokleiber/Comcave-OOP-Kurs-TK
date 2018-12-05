
public class sortieren {

	// Attribute

	// initialisieren ohne werte
	private int[] zahlen = new int[10];

	// Methoden
	public void starte() {
		// array zahlen ausgeben
		gebeIntArrayFor(zahlen);
		neueZeile();

		// array zahlen mit zufallszahlen füllen
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		// bubblesort aufrufen
		sortiereAufsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		// array zahlen mit zufallszahlen füllen
		neueZeile();
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		// bubblesort aufrufen
		sortiereAbsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		neueZeile();
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		sortiereAufsteigend2(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();


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

//gleichnamige methoden mit unterschiedlichen parametern nennt man überladene Methoden
//wichtig: datentyp und reihenfolge ist entscheidend
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

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				int temp;
				temp = array[i];
				if (array[i] < array[j]) {
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	private void sortiereAbsteigend(int[] array) {
		final double timeStart = System.currentTimeMillis() ;
		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle <= array.length - 2 - i; stelle++) {

				int temp;
				if (array[stelle] < array[stelle + 1]) {

					temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;

				}
			}
			
		}
		final double timeEnd= System.currentTimeMillis();
		System.out.println("Dauer: "+(timeEnd - timeStart));
	}

	private void sortiereAufsteigend2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle <= array.length - 2 - i; stelle++) {

				int temp;
				if (array[stelle] > array[stelle + 1]) {

					temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;

				}
			}

		}
	}

	
	
	
	
	
	
	
	
	
	
}
