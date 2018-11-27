


public class Main {

	public static void main(String[] args) {
		//Scanner derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		auto1.marke= "Audi";
		auto1.modell= "A6";
		
		auto2.marke= "Mercedes";
		auto2.modell= "C-Klasse";
		
		auto3.marke= "BMW";
		auto3.modell= "3er";
		
		auto1.seriennummer="daiwn897452";
		auto1.anzahlSitze= 5;
		
		auto2.seriennummer="ddaw36581v2";
		auto2.anzahlSitze= 7;
		
		auto3.seriennummer="cnejld140er";
		auto3.anzahlSitze= 4;
		
		auto1.tankVolumen=100;
		auto1.verbrauch=9;
		
		auto2.tankVolumen=50;
		auto2.verbrauch=4;
		
		auto3.tankVolumen=20;
		auto3.verbrauch=7;
		
	//	auto1.druckeMarkeUndModell();
	//	auto1.berechneReichweite();
	//	auto1.druckeReichweite();
		
		auto1.druckeInfo();//gibt das selbe aus wie die letzten zeilen
		auto2.druckeInfo();
		auto3.druckeInfo();
	}//Klammer main String

}//klammer von Main
