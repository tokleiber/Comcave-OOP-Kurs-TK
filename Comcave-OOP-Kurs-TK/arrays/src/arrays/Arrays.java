package arrays;

public class Arrays {
	//Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;;
	private int zahl4 = 2;
	
	private int [] zahl = {1, 5, 10, 3 , 2 ,6 ,5 ,3 ,8 ,99 ,7 ,1 ,8 ,256 ,149 ,357 ,281 ,68};
	//					   0  1   2  3   4  5  6  7  8  9   10 11 12  13   14   15   16  17
 	//Methode
	public void gebeZahlen() {
		System.out.println(zahl0 + " "+zahl1 +" "+ zahl2 +" "+ zahl3 +" "+ zahl4);
//		int i = 4;
		System.out.println(zahl[0]);
		//array ausgeben
		//for each
		//für jedes
//		for(int element: zahl) {
//			System.out.print(element + " ");
//		}
		
		for (int i = 0; i < zahl.length; i++ ) {
			System.out.print(zahl[i] + " ");
			
		}
//		Arrays können wir normale variabelen nutzen
//		werte werden genau so zugewiesen
		
		System.out.println();
		zahl[0] = 10;
		System.out.println(zahl[0]);
		
//		System.out.println();	
//		System.out.println(zahl[2]);
		
		for (int i = 0; i < zahl.length; i++ ) {
			zahl[i]=0;
			System.out.print(zahl[i] + " ");}
		System.out.println();
		
		for(int element: zahl) {
			zahl[element] =0;
			System.out.print(element + " ");
		}
		
		
	
		
		
	}	
}
