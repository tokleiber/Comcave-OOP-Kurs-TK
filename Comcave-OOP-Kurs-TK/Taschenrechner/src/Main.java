import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Taschenrechner objektorientiert erstellen
		/*
		 * Wir brauchen dazu:
		 * einen Scanner, um eingaben anzunehmen
		 * ein objekt von unserer Klasse rechner
		 * eine schleife in der das programm ausgeführt wird
		 * verschiedene Methoden in Rechner um
		 * 	zu addieren
		 * 	zu subtrahieren
		 * 	zu multiplizieren
		 * 	zu dividieren
		 * 	den rest einer division zu bestimmen(Modulo)
		 * Diese Methoden sollen einen Rückgabewert besitzen
		 * dort soll das Ergebniss zurück gegeben werden
		 * wir wollen das ergebniss auf der konsole ausgeben
		 *  4 + 9 = 19
		 *  8 - 8 =64
		 */
		// erstellen ein objekt der scanner der klasse Scanner
		Scanner derScanner = new Scanner(System.in);
		Scanner derScanner2 = new Scanner(System.in);
		//erstellen ein objekt derRechner der Klasse Rechner
		Rechner derRechner = new Rechner();
		
		//eine schleife in der unser programm ausgeführt wird
		//wir wollen eine dauerschleife
		System.out.println("Wilkommen beim super dupper rechner v1.0");
		System.out.println();
		
		while(true) {
			//alles hier drinnen wird solange ausgeführt bis 
			//wir das Programm beenden
			System.out.println("Welche Rechenoperation möchtest du ausführen");
			System.out.println("+ addition");
			System.out.println("- Subtraktion");
			System.out.println("* Multiplikation");
			System.out.println("/ Division");
			System.out.println("% Rest Bestimmung");
			//lese operanden ein
			System.out.print("Operation: ");
			String operator =derScanner.next();
			
			switch (operator) {
			case "+":
			case "-":
			case "*":
			case "/":
			case "^":
					System.out.print("Eingabe zahl1: ");
					double eingabe1 = derScanner.nextDouble();
					System.out.print("Eingabe zahl2: ");
					double eingabe2 = derScanner.nextDouble();
					
					//Rufe entsprechende Methode auf
					
					System.out.print("Ergebniss: ");
					switch (operator) {
					
					case "+": 
								System.out.println(derRechner.addieren(eingabe1, eingabe2));
								System.out.println();
						break;
						
					case "-":
								System.out.println(derRechner.subtrahieren(eingabe1, eingabe2));
								System.out.println();
						break;
							
					case "*":
								System.out.println(derRechner.multiplizieren(eingabe1, eingabe2));
								System.out.println();
						break;
						
					case "/":
								System.out.println(derRechner.dividieren(eingabe1, eingabe2));
								System.out.println();
						break;
						
					case "%":
								System.out.println(derRechner.modulo(eingabe1, eingabe2));
								System.out.println();
						break;
					
					case "^":
						System.out.println(derRechner.hoch(eingabe1, eingabe2));
						System.out.println();
						break;	
						
					default: 
								System.out.println("fehlerhafte eingabe");
								System.out.println();
						break;
					
					}break;
					
			case "!"://fakultät
			case "*2":
				System.out.print("Eingabe zahl1: ");
				
				double eingabe3 = derScanner.nextDouble();
				System.out.print("Ergebniss: ");
					switch (operator) {
					
					case "!": 
							System.out.println(derRechner.fakultaet(eingabe3));
							System.out.println(); break;
							
					case "*2": 
							System.out.println(derRechner.mal2(eingabe3));
							System.out.println();break;
					}
							
					
			}	
					
					
			
					
					
			
				System.out.println("Möchtest du nochmal rechnen?");
				System.out.println("   (beliebige taste für weiter)=ja     (n)=nein");
				if(derScanner.next().toLowerCase().charAt(0) == 'n') {
					System.out.println("Das programm wurde beendet");break;
				}else 
					System.out.println();
			
				 		
			
		
		}	
			
		}
		
		
		
	}

