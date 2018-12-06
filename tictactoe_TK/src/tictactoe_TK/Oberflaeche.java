package tictactoe_TK;
import java.util.Scanner;
public class Oberflaeche {
	//attribute
	private Scanner derScanner= new Scanner(System.in);
	
	
	//methoden
	public void gebeText(String text, boolean neueZeile) {
		System.out.println(text + (neueZeile ?"\n" : ""));
		
//		System.out.println(text);
//		if (neueZeile) {
//			System.out.println(text);
//				}else System.out.print(text);
	}
	public String leseText() {
		return derScanner.next();
	}
	public char leseZeichen() {
		return derScanner.next().charAt(0);
	}
	
}
