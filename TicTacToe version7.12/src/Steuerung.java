
public class Steuerung {
	// Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	private Spielfeld dasSpielfeld = new Spielfeld();
	private int zustand = 0;
	private int aktSpieler= 0;
	private int feldBreite;
	private int feldHoehe;
	// Konstruktor
	public Steuerung() {
		// Begrüßungstext
		dieOberflaeche.gebeText("TicTacToe V1.0", true);

		spielerEinlesen();
		feldBreite= dasSpielfeld.gebeBreite();
		feldHoehe= dasSpielfeld.gebeHoehe();
	}

	// Methoden
	public void start() {
		// Hier kommt unser Programmablauf rein
		while(zustand < 5) {
			switch(zustand) {
			//spiel läuft
			case 0:
				spielfeldAusgeben();
				feldSetzen();
				pruefeSieg();
				
				spielerWechsel();
				//spieler wechseln
				//aktSpieler =( aktSpieler ==1) ? 0: 1;
			//	if (aktSpieler == 0) {
				//	aktSpieler = 1;
				//}else if (aktSpieler == 1) {
				//	aktSpieler = 0;
				//}
				break;
			//spieler 1 gewinnt
			case 1: 
				dieOberflaeche.gebeText(spieler[0].getName() + " hat gewonnen", true);
				zustand = 4;
				spielfeldAusgeben();
				break;
			//spieler 2 gewinnt
			case 2:
				dieOberflaeche.gebeText(spieler[1].getName() + " hat gewonnen", true);
				zustand = 4;
				spielfeldAusgeben();
				break;
				
			//unentschieden	
			case 3:
				dieOberflaeche.gebeText("Das Spiel geht unentschieden aus", true);
				zustand = 4;
				spielfeldAusgeben();
				break;
				
			//frage nach wiederholung
			case 4:
				dieOberflaeche.gebeText("Wollt ihr nochmal spielen? (J/N)", true);
				if (Character.toLowerCase(dieOberflaeche.leseZeichen()) == 'j') {
					dasSpielfeld.setzeZurueck();
					zustand=0;
					break;
				}else {zustand = 5;
				}break;
				
			
			
			}
		}
		dieOberflaeche.neueZeile(3);
		System.out.println("spiel beendet");
	}

	private void feldSetzen() {
		dieOberflaeche.gebeText(spieler[aktSpieler].getName()+ " ist an der Reihe ", true);
		
		
		int tempX;
		int tempY;
		do {
		dieOberflaeche.gebeText("X: ", false);	
		 tempX = dieOberflaeche.leseZahl();
		dieOberflaeche.gebeText("Y: ", false);
		  tempY = dieOberflaeche.leseZahl();
		}while (tempX < 0 || tempX >= this.feldBreite ||
				tempY < 0 || tempY >= this.feldHoehe);
		
		
		int wert = aktSpieler == 1? 1: -1;
		if (dasSpielfeld.pruefeFeld(tempX, tempY)== true) {
			dasSpielfeld.setzeFeld(tempX, tempY, wert);}
		else {
			dieOberflaeche.gebeText("Feld ist bereits belegt" , true);
			spielerWechsel();
		}
		
//		
		
	}

	private void spielfeldAusgeben() {
		dieOberflaeche.gebeSpielfeld(dasSpielfeld.getSpielfeld(), spieler[0].getSpielStein(),
				spieler[1].getSpielStein());
	}

	private void spielerEinlesen() {
		// Spieler 1 ausgeben
		dieOberflaeche.gebeText("Spieler 1", true);
		// Name und Zeichen einlesen
		dieOberflaeche.gebeText("Name: ", false);
		String tempString = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		char tempChar = dieOberflaeche.leseZeichen();

		// Objekt spieler[0] erstellen
		spieler[0] = new Spieler(tempString, tempChar);

		// Neue Zeile
		dieOberflaeche.neueZeile(1);

		// Spieler 2 ausgeben
		dieOberflaeche.gebeText("Spieler 2", true);
		// Name und Zeichen einlesen
		dieOberflaeche.gebeText("Name: ", false);
		tempString = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		tempChar = dieOberflaeche.leseZeichen();

		// Objekt spieler[1] erstellen
		spieler[1] = new Spieler(tempString, tempChar);

		// Neue Zeile
		dieOberflaeche.neueZeile(1);
	}

	private void spielerWechsel() {
		aktSpieler= (aktSpieler == 1) ? 0: 1;
	}

	private void pruefeSieg() {
		// spielfeld in die methode holen und zwischenspeichern
		int [][] feld = dasSpielfeld.getSpielfeld().clone();
		int summe = 0;
		
		for (int x = 0; x<3; x++) {
			summe += feld[x][0];
			if (summe == 3) {
				//Spieler 1 hat gewonnen
					zustand = 1;break;
			}
			else if(summe == -3) {
				//Spieler 2 hat gewonnen
					zustand = 2;break;
			}
		}
	
		//prüfen ob sieg
		
		
		
		
		
	}



}
