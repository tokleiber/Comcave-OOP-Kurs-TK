import java.util.Scanner;

public class Oberflaeche {
	// Attribute
	private Scanner derScanner = new Scanner(System.in);
	
	// Methoden
	public void gebeText(String text, boolean neueZeile) {
		System.out.print(text + (neueZeile ? "\n" : ""));
	}
	
	public void gebeSpielfeld(int[][] spielfeld, char z0, char z1) {
		for(int y = 0; y < spielfeld[1].length; y++) {
			for(int x = 0; x < spielfeld.length; x++) {
				System.out.print("[" + (spielfeld[x][y] == 1 ? z0 : (spielfeld[x][y] == -1 ? z1 : ' ' )) + "]");
			}
			System.out.println();
		}
	}
	
	public String leseText() {
		return derScanner.next();
	}
	
	public char leseZeichen() {
		return derScanner.next().charAt(0);
	}
	
	public int leseZahl() {
		return derScanner.nextInt();
	}
	
	public void neueZeile(int anzahl) {
		for(int i = 0; i < anzahl; i++) {
			System.out.println();
		}
	}

}
