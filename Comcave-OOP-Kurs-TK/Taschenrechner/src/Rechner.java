
public class Rechner {
		
		//Attribute
		//brauchen wir keine
		//Methoden
	// Addition
		double addieren(double eingabe1, double eingabe2) {
			return (eingabe1 + eingabe2);
		};
	//Subtraktion
		double subtrahieren(double eingabe1, double eingabe2) {
			return  (eingabe1 - eingabe2);
		};
	//multiplikation
		double multiplizieren(double eingabe1, double eingabe2) {
			return (eingabe1 * eingabe2);
		};
	//Division
		double dividieren(double eingabe1, double eingabe2) {
			return (eingabe1 /eingabe2);
		};
	//rest bestimmung(Modulo)
		double modulo(double eingabe1, double eingabe2) {
			return (eingabe1 % eingabe2);
		};
	// hoch 
		double hoch( double eingabe1, double eingabe2) {
			return (Math.pow(eingabe1, eingabe2));
		};
	//fakultät
		int fakultaet(double eingabe3){
			int f = 1;
			for(int i = 1; i<=eingabe3; i++) {
				f *= i;
			};
		}
	//verdoppeln
		double mal2(double eingabe3) {
			return eingabe3 *2;
		}
		
		
		
	}


