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
	==	Pr�fung auf einen exakten Wert
	<	kleiner als
	>	gr��er als
	<=	kleiner gleich
	>=	gr��er gleich
	!=	ungleich
	
Bedingungen verkn�pfen
	
	||	logisches ODER		Eines von beiden oder beide m�ssen true sein
	&&	logisches UND		M�ssen beide true sein
	
	|	bitweises ODER		Unterschied siehe Methodenaufruf
	&	bitweises UND
	^	bitweises XOR		ENTWEDER eines oder das andere muss true sein
	
	
Verzweigungen
	if (meineZahl == 5) {
	... wird ausgef�hrt, wenn meine Zahl 5 ist.
	}
	else if (meineZahl < 10) {
	... wird nur gepr�ft, wenn der Fall davor (meineZahl == 5) NICHT zutrifft.
	... wird ausgef�hrt, wenn meineZahl kleiner 10 ist.
	}
	else {
	... wird ausgef�hrt, wenn KEIN anderer Fall zutrifft.
	}
	
	
	switch (meineZahl) {
	case 5:
		...
		break;
	case 1:			Wir k�nnen beliebig viele Bedingungen 
	case 2:			untereinander schreiben.
	case 3:
		...
		break;		Break ist wichtig, damit die Anweisung beendet wird.
		
		
Schleifen
	Kopfgesteuerte Schleifen
	
	for(int i = 0; i <= 10; i++) {		(Z�hler definieren; Bedingung / Grenze definieren; Anweisung nach jedem Durchgang)
	...									Wenn man wei�, wie oft etwas wiederholt werden soll, bietet sich die For Schleife an. 
	}
	while(zahl1 > 5 && zahl 2 < 10) {
		...								Wird so lange ausgef�hrt, wie die Bedingung im Schleifenkopf wahr ist.
	}
	
	while(true) {
		...								Dauerschleife
		break;							Wird solange ausgef�hrt, bis in der Schleife break aufgerufen wird.
	}
	
	Fu�gesteuerte Schleife
	do {
		...								Schleife wird mindestens einmal ausgef�hrt ...
	}	
	while(zahl1 > 5 && zahl 2 < 10);	... bevor die Bedingung gepr�ft wird. 
	

Ausgaben auf der Konsole t�tigen
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
																	In der Konsole m�ssen wir aber das , nutzen.
	derScanner.nextLine();			Einen String einzulesen
	derScanner.next.charAt(0);		Ein Zeichen einzulesen			Beispiel: 	Nein	
																				^
	
Klassen definieren
	public class MeineKlasse {
		Eigenschaften der Klasse definieren, also die Attribute
		Attribute deklarieren wir immer private!
		So kann von au�erhalb nicht direkt darauf zugegriffen werden.
		
		private int meinAttribut;
		private int meinAttribut2;
		private String meinString;
		
		F�higkeiten der Klasse definieren, also die Methoden
		public void meineMethode() {
			...
			F�hrt alles aus, was in den geschweiften Klammern steht.
			void steht f�r KEINEN R�ckgabewert
		}
		
		Methoden k�nnen einen Wert zur�ckgeben ...
		... zum Beispiel Getter Methode			
		
		public int getMeinAttribut() {			Mit einem Getter k�nnen wir auf private Attribute zugreifen.
			return this.meinAttribut;
		}
		
		public int getMeinAttribut2() {			Mit einem Getter k�nnen wir auf private Attribute zugreifen.
			return this.meinAttribut;
		}
		
		Methoden k�nnen Parameter annehmen ...
		... zum Beispiel Setter Methode	
		
		public void setMeinString(String parameter) {
			this.meinString = parameter;		Mit einem Setter k�nnen wir von au�en einen Wert setzen.
		}
		
		private void meineGeheimeMethode() {	Kann nicht von au�en aufgerufen werden.
			...									Aber von innerhalb der Klasse.
		}
	}
	
	
Unterschied zwischen Klassen und Objekten?
	Klassen sind Vorlagen f�r konkrete Objekte.
	Beispiel Pl�tzchen Backen: 	Ausstechform (Klasse) und Keks (Objekt)
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