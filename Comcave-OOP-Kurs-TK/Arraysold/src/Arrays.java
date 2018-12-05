
public class Arrays {
	// Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;
	private int zahl4 = 2;

	// Arrays
	// Länge muss definiert sein
	// Länge kann nicht veränder werden

	// Direkte Initialisierung mit bereits definierten Werten
	private int[] zahl = { 1, 5, 10, 3, 2, 789, 7, 9, 1, 2, 3, 4, 5, 6, 7, 101 };
	// 0 1 2 3 4 5 6 7 8 9 10
	private String[] worte = { "Hallo", "Welt" };

	// Initialisierung ohne Werte
	private int[] zahlen = new int[10];

	// Methoden
	public void gebeZahlen() {
		// Zahl0-4 von Hand ausgeben
		System.out.println(zahl0 + " " + zahl1 + " " + zahl2 + " " + zahl3 + " " + zahl4);
		
		// For each Schleife
		gebeIntArrayForEach(zahl);
		System.out.println();

		// For Schleife
		gebeIntArrayFor(zahl);
		
		// Werte an einer bestimmten Stelle auslesen
		int k = 4;
		System.out.println(zahl[k]);
		System.out.println();
		
		// Länge des Arrays auslesen
		System.out.println(zahl.length);
		System.out.println();

		// Arrays können wir normale Variablen nutzen
		// Werte werden genau so zugewiesen
		zahl1 = 10;
		zahl[0] = 10;

		gebeIntArrayFor(zahl);

		// Tragen Sie an jeder Stelle im Array den Wert 0 ein
		// Nutzen Sie die eben gelernte Schleife
		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		System.out.println();
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		System.out.println();
	}
	
	private void setzeArray(int[]array, int wert) {
		for (int i =0; i < array.length; i++) {
			array[i]= wert;
		}
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
	
	private void setzeArray(int[] array) {
		for (int i =0; i < array.length; i++) {
			array[i]= gebeZufallszahl();}
	}
	
	private int gebeZufallszahl() {
		return (int) (Math.random()*100);
	}
	
	private void sortiereAufsteigend(int[] array) {
		//Bubble sort
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
