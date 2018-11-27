import java.util.Scanner;

public class aufgaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner derScanner = new Scanner(System.in);
	
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx	
		//Literangaben
			
			System.out.println("Eingabe Flüßigkeitsmenge: ");
			double zahl5 =derScanner.nextDouble();
			if (zahl5 >= 1.0) {
				int zahl6 = (int)zahl5;
				System.out.println(zahl6 + "l");
			} else if(zahl5 >=0.1){			
				zahl5= zahl5*100;
				int zahl6 = (int)zahl5;
				System.out.println(zahl6 + "cl");
			}else if (zahl5 >=0.001 ) {
				zahl5 = zahl5*1000;
				int zahl6 = (int)zahl5;
				System.out.println(zahl6 + "ml");
			
			}else System.out.println("error");
			
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx	
			//Literangaben variante 2
			System.out.println("Eingabe Flüßigkeitsmenge: ");
			double zahl55 =derScanner.nextDouble();
				if (zahl55 >= 1.0) {
		
					System.out.println(Math.round(zahl55) + "l");
				} else if(zahl55 >=0.1){			
					zahl55= zahl55*100;
					
					System.out.println(Math.round(zahl55) + "cl");
				}else if (zahl55 >=0.001 ) {
					zahl55 = zahl55*1000;
					
					System.out.println(Math.round(zahl55) + "ml");
				
				}else System.out.println("error");			
			
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		// Gerade/Ungerade/ % heißt modulo
			int n = 2;
			if ((n % 2) ==0) {
				System.out.println("gerade");
			} else {System.out.println("ungerade");}
			
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx	
	    // Auswahlmenü
			
		int wahl1 = 3;	
		int wahl2 = 3;	
		
		switch(wahl1) {
		case 1 : System.out.println("Öffnungszeiten");break;
		case 2 : System.out.println("Anschrift");break;
		case 3 : 	switch(wahl2) {
					case 0 : System.out.println("Hauptmenü");break;
					case 1 : System.out.println("Termin vereinbaren");break;
					case 2 : System.out.println("Termin absagen");break;
					case 3 : System.out.println("Mitarbeiter sprechen");break;
		}}
		
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx				
		
		//Geschachtelte Schleifen
		
			
			String b =" "; 
			String c =" ";
			
			for (int i = 1 ; i <=5; i++ ) {
				
				b =Integer.toString(i)  ;	
				c = b + i ;
				System.out.println(c);
				
			}
			
//Geschachtelte Schleifen variante 2
		
			
			for ( int i = 1; i<=5; i++)
	        {
	            for (int j=1; j<=i; j++){
	            	
	                System.out.print(i);
	            }
	            System.out.println();
	           
	        }
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
			//Einfache Schachbrett
			for (int i = 1 ; i<=8; i++) {
				if ((i % 2) ==0) {
					System.out.println('#'+" "+'#'+" "+'#'+" "+ '#');
				}else {System.out.println(" "+'#'+" "+'#'+" "+'#'+" "+'#');
			}}
			
			
			
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx			
			
			
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
}}
