
public class Fahrzeug {
	//Attribute
	
protected int anzahlRaeder;
protected String farbe;
protected String marke;
protected String modell;
protected double motorleistung;
protected double tankVolumen;
protected double tankStand;
protected double verbrauch;

//Konstruktor
public Fahrzeug(int anzahlRaeder, String farbe, String marke,
		String modell, double motorleistung, 
		double tanlVolumen,  double verbrauch) {
	
			this.anzahlRaeder = anzahlRaeder;
			this.farbe = farbe;
			this.marke = marke;
			this.modell = modell;
			this.motorleistung = motorleistung;
			this.tankVolumen = tankVolumen;
			this.tankStand = tankVolumen;
			this.verbrauch = verbrauch;
			
	
	System.out.println("Ein neues fahrzeug wurde erstellt");
	System.out.println();
	System.out.println(marke + " "+ modell );
	
	
}


//Methoden



}
