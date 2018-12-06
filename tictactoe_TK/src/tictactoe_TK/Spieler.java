package tictactoe_TK;

public class Spieler {

	private String name;
	private char spielStein;
	private int anzahlSiege;
	
	public Spieler(String name, char spielStein) {
		this.name = name;
		this.spielStein=spielStein;
		this.anzahlSiege=0;
	}
	
	public String getName() {
		return name;
	}
	public char getSpielStein() {
		return spielStein;
	}
	public int getAnzahlSiege() {
		return anzahlSiege;
	}
	public void speichereSieg() {
//		this.anzahlSiege= anzahlSiege++;
//		this.anzahlSiege++;
		this.anzahlSiege += 1;
	}
	
	
}
