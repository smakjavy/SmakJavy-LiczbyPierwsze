package nauka;

//import nauka.Stoper;

/**
 * 
 * 
 * @author MC
 *
 */

public class Sito implements LicznikLiczbPierwszych {
// implementacja metod interfejsu	
	
	
	/*
	 * Metoda s³u¿¹ca do wyszukiwania liczb pierwszych z przedzia³u (MAX) zadeklarowanego 
	 * w interfejsie LicznikLiczbPierwszych
	 * metoda oparta jest o sito Eratostenesa (dzijej zadaniem 
	 * ustawianie wartoœæ true w tablicy typu boolean dla kolejnych wielokrotnoœci zmiennej i
	 * sprawdzanie odbywa siê momentu, a¿ i osi¹gnie pierwiastek od MAX. 
	 * do tablicy liczb pierwszych metoda przypisuje tylko te elementy, które maj¹ wartoœæ false
	 */
	public int[] liczLiczbyPierwsze(int MAX){
		
		//deklaracja zmiennej pomocniczej oraz deklaracja i zainicjowanie tablicy liczb pierwszych 
		int i, tabPierwszych[] = new int[MAX];
		
		//deklaracja zmiennej pierwiastek
	 	double pierwiastek;
	 	
	 	/*obliczenie pierwiastka dla zmiennej (MAX) zadeklarowananej w interfejsie LicznikLiczbPierwszych z 
	 	 * wykorzystaniem funkcji matematycznej
	 	 */
	 	pierwiastek = Math.sqrt(MAX);
	    
	 	//deklaracja i stworzenie tablicy do wyszukiwania wielokrotnoœci zmiennej i
	 	boolean tabSito[] = new boolean[MAX+ 1];

	 	/*
	 	 * pêtla typu for dzia³a od i = 2 do pierwiastka z MAX
	 	 */
	 	for(i = 2; i <= pierwiastek; i++){
	 		//je¿eli element tablicy typu boolean ma wartoœæ true przechodzi dalej 
	 		if (tabSito[i] == true){
	 			continue;
	 		}
	 		/*
	 		 * pêtla typu for ma za zadanie podstawiæ wartoœæ true do tablicy typu boolean
	 		 * wszystkich wielokrotnoœci zmiennej i dla mno¿nika j a nastêpnie zwiêkszyæ mno¿nik j o 1 
	 		 */
	 		for (int j = 2 * i ; j <= MAX; j += i){ 			
	 				tabSito[j] = true;          
	 		}
	 	}	
 		/*
 		 * pêtla typu for ma za zadanie sprawdziæ czy zmienna i jest równa zero 
 		 * je¿eli tak podstawia jego wartoœæ pod pierwszy element tablicy liczb pierwszych i zwiêksza zmienn¹ pomocnicz¹ i o 1
 		 * je¿eli nie sprawdza czy wartoœæ tablicy typu boolean jest równa false
 		 * je¿eli tak podstawia pod kolejny element tablicy liczb pierwszych 
 		 */
	 	for (i = 0; i <= MAX; i++){
	 		if (i == 1){
	 			tabPierwszych[i] = i;
	 		} else 
	 			if (tabSito[i] == false){
	 			tabPierwszych[i] = i;
	 		}
	 	}	
		/*
		 * Pêtla sprawdza kolejne elementy tablicy, a¿ osi¹gnie jej koniec tablicy
		 * elementy wiêksze od zera s¹ wyœwietlane
		 */
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
}
	/*	
	public static void main(String[] args) {
		
		//Stoper mierzCzas = new Stoper();
		//mierzCzas.zeruj();
		//mierzCzas.start();
		LiczbyPierwsze dajCzas = new LiczbyPierwsze();
		long start = dajCzas.dajCzasLiczenia();
		LiczbyPierwsze tab = new LiczbyPierwsze();

		System.out.println("Liczby pierwsze do " +MAX);
		tab.liczLiczbyPierwsze(MAX);
		System.out.println("\n");
		dajCzas.dajCzasLiczenia();
        		
		System.out.println("Czas wykonania operacji wynosi:" +(dajCzas.dajCzasLiczenia()- start));	
	}		
}
package poczatki;

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