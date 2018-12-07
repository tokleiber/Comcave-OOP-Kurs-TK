
public class Spielfeld {
	// Attribute
	private int[][] spielfeld = new int[3][3];
	/*	Zweidimensionales Array: Spalten und Reihen ( X und Y)
	 * 	    0  1  2
	 * 
	 *  0   1  0 -1     1=x
	 *  1   1 -1  0     -1=o
	 *  2   1 -1  1 
	 */
	
	// Konstruktor
	public Spielfeld() {
		setzeZurueck();
	}
	
	
	// Methoden
	public void setzeZurueck() {
		for(int y = 0; y < spielfeld[1].length; y++) {
			for(int x = 0; x < spielfeld.length; x++) {
				this.spielfeld[x][y] = 0;
			}
		}
	}
	
	public int[][] getSpielfeld() {
		return this.spielfeld;
	}
	
	public void setzeFeld(int x, int y, int wert) {
		spielfeld[x][y] = wert;
	}
	
	public boolean pruefeFeld(int x, int y) {
		return spielfeld [x][y] == 0;
	}

	public int gebeBreite() {
		return spielfeld.length;
	}

	public int gebeHoehe() {
		return spielfeld[1].length;
	
	}

}


