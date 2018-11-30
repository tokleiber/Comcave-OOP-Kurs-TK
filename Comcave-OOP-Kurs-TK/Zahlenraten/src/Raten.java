import java.util.Scanner;

public class Raten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner derScanner = new Scanner(System.in);
		
		System.out.print("Eingabe zu suchende Zahl");
		int a = derScanner.nextInt();
		for (int i =10; i >=0; i--) {System.out.println(" ");}
		
		for (int i =10; i >=0; i--) {
			System.out.print("Eingabe vermutete Zahl");
			int b =derScanner.nextInt();
			
			
				if (b == a) {System.out.print("Treffer");break;
					}else if (b < a) {System.out.println("Die gesuchte Zahl ist größer als "+b);
					
						if (b == (a-5)) {System.out.println("Du bist nah dran an der Lösung");
						
						}else if (b == (a-4)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a-3)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a-2)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a-1)) {System.out.println("Du bist nah dran an der Lösung");
						}					
						
					}else if (b > a) {System.out.println("Die gesuchte Zahl ist kleiner als "+b);			
					
						if (b == (a+5)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a+4)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a+3)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a+2)) {System.out.println("Du bist nah dran an der Lösung");
						}else if (b == (a+1)) {System.out.println("Du bist nah dran an der Lösung");
						}
						
						}else {System.out.println("Fehlerhafte eingabe");}
				
				
				System.out.println(" ");
				if ( i == 0) {System.out.println("GAME OVER");
				}else if (i==1){System.out.println("Dies ist dein letzter Versuch ");
				}else{System.out.println("Noch "+ i +" Versuche");}
			
		}
		
		
		
		
		
		
		
	}

}
