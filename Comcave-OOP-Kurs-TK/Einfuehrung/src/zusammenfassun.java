/*
Behandelte Themen Woche 1&2

Datentypen
	String
	char
	(byte) 
	int
	(long)
	float
	double
	boolean
	
Variablen deklarieren ...
	int meineZahl
... und initialisieren / zuweisen.
	= 5;

Bedingungen definieren
	==	Prüfung auf einen exakten Wert
	<	kleiner als
	>	größer als
	<=	kleiner gleich
	>=	größer gleich
	!=	ungleich
	
Bedingungen verknüpfen
	
	||	logisches ODER		Eines von beiden oder beide müssen true sein
	&&	logisches UND		Müssen beide true sein
	
	|	bitweises ODER		Unterschied siehe Methodenaufruf
	&	bitweises UND
	^	bitweises XOR		ENTWEDER eines oder das andere muss true sein
	
	
Verzweigungen
	if (meineZahl == 5) {
	... wird ausgeführt, wenn meine Zahl 5 ist.
	}
	else if (meineZahl < 10) {
	... wird nur geprüft, wenn der Fall davor (meineZahl == 5) NICHT zutrifft.
	... wird ausgeführt, wenn meineZahl kleiner 10 ist.
	}
	else {
	... wird ausgeführt, wenn KEIN anderer Fall zutrifft.
	}
	
	
	switch (meineZahl) {
	case 5:
		...
		break;
	case 1:			Wir können beliebig viele Bedingungen 
	case 2:			untereinander schreiben.
	case 3:
		...
		break;		Break ist wichtig, damit die Anweisung beendet wird.
		
		
Schleifen
	Kopfgesteuerte Schleifen
	
	for(int i = 0; i <= 10; i++) {		(Zähler definieren; Bedingung / Grenze definieren; Anweisung nach jedem Durchgang)
	...									Wenn man weiß, wie oft etwas wiederholt werden soll, bietet sich die For Schleife an. 
	}
	while(zahl1 > 5 && zahl 2 < 10) {
		...								Wird so lange ausgeführt, wie die Bedingung im Schleifenkopf wahr ist.
	}
	
	while(true) {
		...								Dauerschleife
		break;							Wird solange ausgeführt, bis in der Schleife break aufgerufen wird.
	}
	
	Fußgesteuerte Schleife
	do {
		...								Schleife wird mindestens einmal ausgeführt ...
	}	
	while(zahl1 > 5 && zahl 2 < 10);	... bevor die Bedingung geprüft wird. 
	

Ausgaben auf der Konsole tätigen
	System.out.print("Konsolenausgabe");						Ausgabe ohne Zeilenumrbuch
	System.out.println("Konsolenausgabe mit Zeilenumbruch");	Ausgabe mit Zeilenumbruch
	System.out.printf(%s %f.2 %s, "Strecke:", meineZahl, "km")  Formatierte Ausgabe
		%d	Ganzahlen (int)
		%f	Kommazahlen (double, float)
		%c 	Zeichen (char)
		%s  String
		\n	Zeilenumbruch		
		

Eingaben von der Konsole einlesen
	Scanner derScanner = new Scanner(System.in);
	derScanner.nextInt();			Eine Ganzzahl einzulesen
	derScanner.nextDouble();		Eine Kommazahl einzulesen		Wir verwenden in der Programmierung den . als Komma. 
																	In der Konsole müssen wir aber das , nutzen.
	derScanner.nextLine();			Einen String einzulesen
	derScanner.next.charAt(0);		Ein Zeichen einzulesen			Beispiel: 	Nein	
																				^
	
Klassen definieren
	public class MeineKlasse {
		Eigenschaften der Klasse definieren, also die Attribute
		Attribute deklarieren wir immer private!
		So kann von außerhalb nicht direkt darauf zugegriffen werden.
		
		private int meinAttribut;
		private int meinAttribut2;
		private String meinString;
		
		Fähigkeiten der Klasse definieren, also die Methoden
		public void meineMethode() {
			...
			Führt alles aus, was in den geschweiften Klammern steht.
			void steht für KEINEN Rückgabewert
		}
		
		Methoden können einen Wert zurückgeben ...
		... zum Beispiel Getter Methode			
		
		public int getMeinAttribut() {			Mit einem Getter können wir auf private Attribute zugreifen.
			return this.meinAttribut;
		}
		
		public int getMeinAttribut2() {			Mit einem Getter können wir auf private Attribute zugreifen.
			return this.meinAttribut;
		}
		
		Methoden können Parameter annehmen ...
		... zum Beispiel Setter Methode	
		
		public void setMeinString(String parameter) {
			this.meinString = parameter;		Mit einem Setter können wir von außen einen Wert setzen.
		}
		
		private void meineGeheimeMethode() {	Kann nicht von außen aufgerufen werden.
			...									Aber von innerhalb der Klasse.
		}
	}
	
	
Unterschied zwischen Klassen und Objekten?
	Klassen sind Vorlagen für konkrete Objekte.
	Beispiel Plätzchen Backen: 	Ausstechform (Klasse) und Keks (Objekt)
								Mit einer Form (Klasse) lassen sich viele Kekse (Objekte) erstellen.
								Aus einer Klasse kann ich beliebig viele Objekte erstellen.
								
Objekte erstellen
	Vergleichbar mit Definition von Variablen:
	Datentyp	Name 		= Wert;
	MeineKlasse meinObjekt 	= new MeineKlasse();
	
Auf Methoden eines Objekts zugreifen und aufrufen
	meinObjekt.meineMethode();
	
	int Zahl = meinObjekt.getMeinAttribut();
	
	System.out.println(meinObjekt.getMeinAttribut());
	
	if(meinObjekt.getMeinAttribut < 10) {
		...
	}
	
	Logisch vs. bitweise (& vs. &&	| vs. ||)
	if(meinObjekt.getMeinAttribut < 10 & meinObjekt.getMeinAttribut2 > -10) {
		...
	}
	

	
UML 


	
	
	
	
	
	
	
	
	
	
	


	*/