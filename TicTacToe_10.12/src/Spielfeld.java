
public class Spielfeld {
	// Attribute
	private int[][] spielfeld = new int[3][3];
	/*	Zweidimensionales Array: Spalten und Reihen ( X und Y)
	 * 		0  1  2
	 *    0 1  1  1  = 3
	 *    1 0  0  0 
	 *    2 -1 -1 -1 = -3
	 */
	
	// Konstruktor
	public Spielfeld() {
		setzeZurueck();
	}
	
	
	// Methoden
	public void setzeZurueck() {
		// spielfeld[1].length gibt uns die Spielfeldhöhe, also den zweiten Wert aus Zeile 4
		for(int y = 0; y < spielfeld[1].length; y++) {
			// spielfeld.length gibt uns die Spielfeldbreite, also den ersten Wert aus Zeile 4
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
		// Wenn frei (0), dann true
		// Wenn belegt(1 oder -1), dann false
		return spielfeld[x][y] == 0;
	}
	
	public int gebeBreite() {
		return spielfeld.length;
	}
	
	public int gebeHoehe() {
		return spielfeld[1].length;
	}
	public boolean pruefeVoll() {
		for(int y = 0; y < spielfeld[1].length; y++) {
			for(int x = 0; x < spielfeld.length; x++) {
				if(this.spielfeld[x][y]==0) {
					return false;
				}
				
	
			}
		}return true;
	} 
}
