import java.util.Scanner;

public class Eingaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String meinText = "Hallo Welt";
		
		System.out.println(meinText);
	*/	
		Scanner derScanner = new Scanner(System.in); // neues objekt derScanner von Klasse Scanner
		Scanner derScanner2 = new Scanner(System.in); // neues objekt derScanner von Klasse Scanner
		//String meineEingabe = Eingabe von der Konsole übernehmen
	/*	System.out.print("Eingabe: ");
		String meineEingabe = derScanner.nextLine();// nextline für Strings
		System.out.println("unsere eingabe lautet:"+meineEingabe);
		System.out.print("Eingabe: ");
		int meineZahl = derScanner.nextInt();// nextint für Zahlen
		System.out.println("unsere eingabe lautet:"+meineZahl);
		
		//Eingabe an nehmen als int Wert
		//Quadrat bilden(mit sich selbst multiplizieren
		//Die Quadratzahl von 4 ist 16 ausgeben
		
		System.out.println("Eingabe: ");
		int zahl1 = derScanner.nextInt();
		int zahl2 = zahl1 * zahl1 ;
		System.out.println("Die Quadratzahl von "+ zahl1 +" ist "+ zahl2 );
		
		System.out.println("Eingabe erste Zahl: ");
		int zahl1 = derScanner.nextInt();
		System.out.println("Eingabe zweite Zahl: ");
		int zahl2 = derScanner.nextInt();
		int zahl3 = zahl1 +zahl2;
		System.out.println( zahl1 +" addiert mit "+ zahl2+ " ergiebt " + zahl3 );
		
		System.out.println("Eingabe erste Zahl: ");
		double zahl1 = derScanner.nextDouble();
		System.out.println("Eingabe zweite Zahl: ");
		double zahl2 = derScanner.nextDouble();
		double zahl3 = zahl1 + zahl2;
		System.out.println( zahl1 +" addiert mit "+ zahl2+ " ergiebt " + zahl3 );
		
		// char eingaben
		System.out.println("ZEichen einlesen:");
		char meinZeichen = derScanner.nextLine().charAt(0);
		System.out.println("Das Zeichen lautet: "+ meinZeichen);
	*/	
		//Rechenprogramm
		System.out.println("Eingabe erste Zahl: ");
		double zahl1 = derScanner.nextDouble();
		
		System.out.println("Eingabe rechenoperator: ");
		String operator= derScanner.next();
		
		System.out.println("Eingabe zweite Zahl: ");
		double zahl2 = derScanner.nextDouble();
		switch(operator) {
		case "+" : double zahl3 = zahl1 + zahl2;
				System.out.println( zahl1 + operator + zahl2+ " ergiebt: " + zahl3 );break;
		case "-" :  zahl3 = zahl1- zahl2;
				System.out.println( zahl1 + operator + zahl2+ " ergiebt: " + zahl3 );break;
		case "*" : zahl3 = zahl1 * zahl2;
					System.out.println( zahl1 + operator + zahl2+ " ergiebt: " + zahl3 );break;
		case "/" : zahl3 = zahl1 / zahl2;
					System.out.println( zahl1 + operator + zahl2+ " ergiebt: " + zahl3 );break;
		default : System.out.println("Fehler bei der eingabe ");			
		}
		
		
		derScanner.close();// scanner sollte immer geschlossen sein 
		derScanner2.close();// scanner sollte immer geschlossen sein 
		
		
		
		
		
		
	}
	
}
