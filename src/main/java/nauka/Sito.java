package nauka;

import nauka.Stoper;

/**
 * 
 * 
 * @author MC
 *
 */

public class Sito implements LicznikLiczbPierwszych {
// implementacja metod interfejsu	
	
	public int[] liczLiczbyPierwsze(int MAX){
		
		int i, tabPierwszych[] = new int[MAX];
	 	double pierwiastek;
	 	pierwiastek = Math.sqrt(MAX);
	          
	 	boolean tabSito[] = new boolean[MAX+ 1];

	 	for(i = 2; i <= pierwiastek; i++){
	 		if (tabSito[i] == true){
	 			continue;
	 		}
	 		for (int j = 2 * i ; j <= MAX; j += i){ 			
	 				tabSito[j] = true;          
	 		}
	 	}	
	   
	 	for (i = 0; i <= MAX; i++){
	 		if (i == 1){
	 			tabPierwszych[i] = i;
	 		} else 
	 			if (tabSito[i] == false){
	 			tabPierwszych[i] = i;
	 		}
	 	}		
	 	for (i = 1; i< tabPierwszych.length-1; i++){
	 		if (tabPierwszych[i] > 0){
	 			System.out.print(tabPierwszych[i] +", ");  
	 		}
	 	}		
        return tabPierwszych;
	}
	public long dajCzasLiczenia(){	
		return System.currentTimeMillis();
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
			
		Stoper mierzCzas = new Stoper();
		mierzCzas.zeruj();
		mierzCzas.start();
		LiczbyPierwsze tab = new LiczbyPierwsze();
		LiczbyPierwsze dajCzas = new LiczbyPierwsze();
		System.out.println("Liczby pierwsze do " +MAX);
		tab.liczLiczbyPierwsze(MAX);
		System.out.println("\n");
		dajCzas.dajCzasLiczenia();
        		
		System.out.println("Czas wykonania operacji wynosi:" +(dajCzas.dajCzasLiczenia()- mierzCzas.start));	
	}		
}

/*package poczatki;

public class Sito{
 
	final static int MAX_LICZBA_PIERWSZA = 100000;
	
	 public static void main(String[] args) {
	 	// Program zapisuj¹cy liczby pierwsze do tablicy liczb pierwszych
		 
	 	int i, tabPierwszych[] = new int[MAX_LICZBA_PIERWSZA];
	 	double pierwiastek;
	 	pierwiastek = Math.sqrt(MAX_LICZBA_PIERWSZA);
	          
	 	boolean tabSito[] = new boolean[MAX_LICZBA_PIERWSZA + 1];
	 	Stoper mierzCzas = new Stoper();
	    mierzCzas.zeruj();
	    mierzCzas.start();

	 	for(i = 2; i <= pierwiastek; i++){
	 		if (tabSito[i] == true){
	 			continue;
	 		}
	 		for (int j = 2 * i ; j <= MAX_LICZBA_PIERWSZA; j += i){ 			
	 				tabSito[j] = true;          
	 		}
	 	}	
	   
	 	for (i = 0; i <= MAX_LICZBA_PIERWSZA; i++){
	 		if (i == 1){
	 			tabPierwszych[i] = i;
	 		} else 
	 			if (tabSito[i] == false){
	 			tabPierwszych[i] = i;
	 		}
	 	}
	 		 
	 	mierzCzas.stop();
	  	System.out.print("Wstawianie poszczególnych liczb do tablicy - ");  
	  	mierzCzas.podajCzas();
	  	mierzCzas.zeruj();            
	  	mierzCzas.start();   
		
	 	System.out.print("Liczby pierwsze: ");
	           
	 	for (i = 1; i< tabPierwszych.length-1; i++){
	 		if (tabPierwszych[i] > 0){
	 			System.out.print(tabPierwszych[i] +", ");  
	 		}
	 	}
	
	 	mierzCzas.stop();
	  	System.out.print("\nWyœwietlanie poszczególnych elementów tablicy - "); 
	  	mierzCzas.podajCzas();
	 	}	
}
*/