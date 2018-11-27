
public class Auto {
	//Attribute = Zustand
	String marke;
	String modell;
	String seriennummer;
	int kw;
	int hubRaum;
	int anzahlSitze = 5;
	int tankVolumen;
	int verbrauch;
	int reichweite;
	
	// Methoden = Fähigkeiten
	
	void druckeMarkeUndModell() {
		System.out.println(marke+ " "+ modell);
		System.out.println(seriennummer);
		
	}
	void berechneReichweite(){
		//Tank 100l
		//Verbrauch10l/100km
		//REichweite = 100l/10					10*100km = 1000km
		
		//Tank	60l
				//Verbrauch 5l/100km
				//REichweite = 60l/5					12*100km = 1200km
		//Reichweite=> tankvolumen/Verbrauch *100
		
		 reichweite = tankVolumen / verbrauch *100;  
	}
	void druckeReichweite() {
		
		System.out.println(reichweite+"km");
	}
	void druckeInfo() {
		druckeMarkeUndModell();
		berechneReichweite();
		druckeReichweite();
		System.out.println("Tankvolumen: " + tankVolumen);
		System.out.println("Verbrauch: " + reichweite + "l/100km");
		System.out.println("Anzahl der Sitze: " + anzahlSitze);
		System.out.println();
	}
	
}
