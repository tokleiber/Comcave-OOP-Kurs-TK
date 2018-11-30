
public class Auto {
	// Attribute	= 	Eigenschaften
	private String marke;				// der modifizierer private blockiert den zugriff von außerhalb der klasse
	private String modell;
	private String serienNummer;
	private int kw;
	private int hubRaum;
	private int anzahlSitze;
	private double tankVolumen = 60;
	// int tankStand ??
	private double verbrauch = 8;
	private double reichweite;
	private double strecke = 100;
	private double tankStand;
	//private double reichweiteRest;
	private String passwort;
	// Methoden		=	Fähigkeiten
	void druckeMarkeUndModell() {
		System.out.println(marke + " " + modell);
		System.out.println("Seriennummer: "+serienNummer);
	}
	
	//in die klammer () schreiben wir parameter
	//parameter müssen beim aufruf der Funktion übergeben werden
	//und sind nur in der Methode verfügbar
	void setzeAttribute(String marke, String modell, String serienNummer, double tankVolumen, double verbrauch, int kw, int hubRaum, int anzahlSitze) {
		//parameter sind nur innerhalb der methode verfügbar!
		//parameter müssen übergeben werden, wenn sie erwartet werden
		
		this.modell = modell;
		this.marke  = marke;
		this.serienNummer = serienNummer;
		this.tankVolumen = tankVolumen;
		this.verbrauch = verbrauch;
		this.kw = kw;
		if (anzahlSitze >= 2 && anzahlSitze <=9)
			this.anzahlSitze = anzahlSitze;
		
		if (hubRaum > 0)
			this.hubRaum = hubRaum;
		else
			this.hubRaum = 0;
		
		
		
		
	}
	void setZuFahrendeStrecke(double zuFahrendeStrecke) {
		this.strecke = zuFahrendeStrecke;
	}
	//berechnung strecke
	void fahre() {
		
		berechneReichweite();//die berechnung muss vorher durchgeführt werden wenn 
		
		// nimmt Strecke in Kilometer an
		// Berechnet tankstand neu
		// Nutzen sie dazu den verbrauch 
		// tankvolumen - zufahrendestrecke*verbrauch
		if (strecke <= reichweite) {
		reichweite = reichweite-strecke;
		}
			
		
	}
	double getReichweiteRest() {
		return this.reichweite;
	}
	//berechnung restliche tankmenge
	void berechneTankmenge() {
//		if (strecke <= reichweite ) {
		tankVolumen = tankVolumen-(strecke*(verbrauch/100));
//		}else { 
			
//			System.out.println("Der verbrauch für die gewünschte strecke übersteigt das tankvolumen");
//		}
		}
	
	double RestmengeTank() {
		
		return this.tankVolumen;
	}
	
	void berechneReichweite() {
		// Tank 100l
		// Verbrauch 10l / 100km
		// Reichweite => 100l / 10l = 10 		10*100km = 1000km
		
		// Tank 60
		// Verbrauch 5l / 100km
		// Reichweite => 60l / 5l = 12 		12*100km = 1200km
		
		reichweite = tankStand / verbrauch * 100;
	}
	
	void tanke(double tankmenge) {
		this.tankStand = tankVolumen -(strecke*(verbrauch/100));
		
		if (tankVolumen - tankStand >= tankmenge) {
			this.tankStand += tankmenge;
		System.out.println("ihr Tankstand beträgt: " +tankStand+ " Sie haben "+ tankmenge +"l getankt" ); 
		} else
			tankStand = tankVolumen-tankStand;
			System.out.println("Sie können max " + tankStand +" l tanken");
	}
	
	
	
	
	
		
	
	//get methode oder getter gennannt
	//wird genutzt um gekapselte Daten, also private Daten,
	//nach außen weiterzureichen/ drucke = ausgabe konsole/ get = ausgabe nach außen
	String getSerienNummer() {
		return this.serienNummer;
	}
	
	int getAnzahlSitze() {
		return this.anzahlSitze;
	}
//set methode oder auch setter genannt
	void setKw( int kw) {
		this.kw=kw;
	}
// getter für kw
	int getKw() {
		return this.kw;
	}
	// Fehler auslesen
         
	String fehlerAuslesen(String passwort) {
		if (this.passwort.equals(passwort)) {
			return "Keine Fehler";
		}else {
			return "Passwort falsch";
		}
	}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void druckeInfo() {
		druckeMarkeUndModell();
		berechneReichweite();
		System.out.println("Anzahl Sitze:" + this.anzahlSitze );
		System.out.println("Leistung: " + this.kw + "kw");
		System.out.println("Hubraum: " + this.hubRaum+ "cm3");
		System.out.println("Tankvolumen: " + this.tankVolumen + " l");
		System.out.println("Verbrauch: " + this.verbrauch + "l/100 km");
		druckeReichweite();
		System.out.println();
	}
	
	void druckeSerienNummer() {
		System.out.println(this.serienNummer);
	}
	
	void druckeMarke() {
		System.out.println("Marke: "+this.marke);
	}
	
	void druckeModell() {
		System.out.println("Modell: "+this.modell);
	}
	
	void druckeKw() {
		System.out.println(this.kw);
	}
	
	void druckeHubRaum() {
		System.out.println(this.hubRaum + " cm3");
	}
	
	void druckeAnzahlSitze() {
		System.out.println("Anzah der Sitze: "+this.anzahlSitze);
	}
	
	void druckeTankVolumen() {
		System.out.println("Tankvolumen: "+this.tankVolumen);
	}
	
	void druckeVerbrauch() {
		System.out.println("Verbrauch: "+this.verbrauch);
	}
	
	void druckeReichweite() {
		System.out.println("Reichweite: " + reichweite + " km");
	}
	
}
