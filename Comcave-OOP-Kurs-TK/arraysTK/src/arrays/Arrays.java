package arrays;

public class Arrays {
	//Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;;
	private int zahl4 = 2;
	
	//arrays
	//länge muss definiert sein
	//länge kann nicht verändert werden
	//
	
	//'Direkte initialisierung mit  bereits definierten werten
	private int [] zahl = 	      {1, 5, 10, 3 , 2 ,6 ,5 ,3 ,8 ,99 ,7 ,1 ,8 ,256 ,149 ,357 ,281 ,68};
	//					  	       0  1   2  3   4  5  6  7  8  9   10 11 12  13   14   15   16  17
	private double [] zahlkomma = {5.55, 4.9, 7.8 };
	private char [] buchstabe =   {'a', 'b', 'c', 'f', 'h', 'g'};
	private String [] wort =      { "abc", "def","ghi" } ;
	
	//initialisierung ohne werte
	private int [] zahlen = new int[10] ;
	
	private void  gebeIntArrayForEach(int[] array) {
		for (int element : array) {
			System.out.println(element + " ");
		}
	}
	private void  gebeIntArrayFor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}}	
	
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
		System.out.println();
		
		
	
		
		
	}	
	public void gebeKommaZahl() {
		System.out.println();
		System.out.println(zahlkomma.length +" einträge vorhanden");
		for (int i = 0; i < zahlkomma.length; i++ ) {
			System.out.print(zahlkomma[i] + " ");}
			System.out.println();
		
		
		for (int i = 0; i < zahlkomma.length; i++ ) {
			zahlkomma[i]= 0.0;
			System.out.print(zahlkomma[i] + " ");}
		System.out.println();
	}
	public void gebeBuchstabe() {
		System.out.println();
		System.out.println(buchstabe.length + " einträge vorhanden");
			for (int i = 0; i < buchstabe.length; i++ ) {
				System.out.print(buchstabe[i] + " ");}
				
			System.out.println();
			
			for (int i = 0; i < buchstabe.length; i++ ) {
				buchstabe[i]= 'z';
				System.out.print(buchstabe[i] + " ");}	
			System.out.println();
	}
	public void gebeWort() {
		System.out.println();
		System.out.println(wort.length + " einträge vorhanden");
			for (int i = 0; i < wort.length; i++ ) {
				System.out.print(wort[i] + " ");}
				
			System.out.println();
			
			for (int i = 0; i < wort.length; i++ ) {
				wort[i]= "xyz";
				System.out.print(wort[i] + " ");}
			System.out.println();
	}
	
	
	
}
