
public class Main {

	public static void main(String[] args) {
		//Scanner derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		int meineZahl = 3;
//		auto1.setzeAttribute(marke, modell, serienNummer, tankVolumen, verbrauch, kw, hubRaum, anzahlSitze);
		auto1.setzeAttribute("Audi","A6", 	"FA38291830", 		72, 		8, 	  160,  2000, 		5);
		auto2.setzeAttribute("Mercedes", "C-Klasse", "daw46bgre", 50, 8, 200, 1800, 4);
		auto3.setzeAttribute("BMW", "3er", "mpo763awd", 100, 13, 210, 1900, 6);

//		auto1.druckeInfo();
//		auto2.druckeInfo();
//		auto3.druckeInfo();
		
//		System.out.println(auto1.getSerienNummer());
		
//		String test = "Test string ";
//		String test2 = auto1.getSerienNummer();
//		System.out.println(test2);
//		System.out.println(test);
//		
//
//		System.out.println( "Die seriennummer lautet "+ auto1.getSerienNummer());
//		System.out.println( "Wir haben insgesamt " + (auto1.getAnzahlSitze()+ auto2.getAnzahlSitze() + auto3.getAnzahlSitze()  ) + " Sitze");
//		
//		System.out.println(auto1.getKw());
//		auto1.setKw(100);
//		System.out.println(auto1.getKw());
		
		
		
//		auto1.setZuFahrendeStrecke(50);
		
		
//		auto1.fahre();
//		System.out.println("Reichweite noch "+auto1.getReichweiteRest() + "km");
		
//		auto1.berechneTankmenge();
//		System.out.println("RestlicheTankmenge "+auto1.RestmengeTank() + "l");
		
		
		
		auto1.tanke(5);
		
//		auto3.setzeAttribute();
		
//		auto1.serienNummer = "4894078963";
//		auto3.anzahlSitze = 5;
		
//		auto1.tankVolumen = 72;		// Angaben in l
//		auto1.verbrauch = 8;		// Angaben in l
		
//		auto2.tankVolumen = 90;
		
		
//		auto1.druckeMarkeUndModell();
//		auto1.berechneReichweite();
//		auto1.druckeReichweite();
//		Wurde in druckeInfo() zusammengefasst		
//		auto1.druckeInfo();	// Gibt das selbe aus, wie Zeile die letzen Zeilen
//		auto2.druckeInfo();
//		auto3.druckeInfo();
		
		
		
		
		
	}

}
