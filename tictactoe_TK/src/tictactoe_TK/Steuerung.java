package tictactoe_TK;

public class Steuerung {
	//attribute
	private Oberflaeche dieOberflaeche= new Oberflaeche(); 
	private Spieler[] spieler= new Spieler[2];
	
	//konstruktor
	public Steuerung() {
		//Begrüßungstext
		dieOberflaeche.gebeText("tictactoe v1.0", true);
		//objekte spiele[0] und spieler[1] erstellen
		spieler[0] = new Spieler("Spieler 1", 'X');
		spieler[1] = new Spieler("Spieler 2", 'O');
	}
	
	//methoden
	public void start() {
		// hier kommt der programmablauf rein

	//geben sie mit de roberfläche die namen der Spieler aus
		System.out.println(spieler[0].getName());
		System.out.println(spieler[1].getName());
		dieOberflaeche.gebeText(spieler[0].getName(),true);
		dieOberflaeche.gebeText(spieler[1].getName(),false);
	
	}
	
}
