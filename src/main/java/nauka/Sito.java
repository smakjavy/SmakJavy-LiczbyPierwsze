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
	 * Metoda s�u��ca do wyszukiwania liczb pierwszych z przedzia�u (MAX) zadeklarowanego 
	 * w interfejsie LicznikLiczbPierwszych
	 * metoda oparta jest o sito Eratostenesa (dzijej zadaniem 
	 * ustawianie warto�� true w tablicy typu boolean dla kolejnych wielokrotno�ci zmiennej i
	 * sprawdzanie odbywa si� momentu, a� i osi�gnie pierwiastek od MAX. 
	 * do tablicy liczb pierwszych metoda przypisuje tylko te elementy, kt�re maj� warto�� false
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
	    
	 	//deklaracja i stworzenie tablicy do wyszukiwania wielokrotno�ci zmiennej i
	 	boolean tabSito[] = new boolean[MAX+ 1];

	 	/*
	 	 * p�tla typu for dzia�a od i = 2 do pierwiastka z MAX
	 	 */
	 	for(i = 2; i <= pierwiastek; i++){
	 		//je�eli element tablicy typu boolean ma warto�� true przechodzi dalej 
	 		if (tabSito[i] == true){
	 			continue;
	 		}
	 		/*
	 		 * p�tla typu for ma za zadanie podstawi� warto�� true do tablicy typu boolean
	 		 * wszystkich wielokrotno�ci zmiennej i dla mno�nika j a nast�pnie zwi�kszy� mno�nik j o 1 
	 		 */
	 		for (int j = 2 * i ; j <= MAX; j += i){ 			
	 				tabSito[j] = true;          
	 		}
	 	}	
 		/*
 		 * p�tla typu for ma za zadanie sprawdzi� czy zmienna i jest r�wna zero 
 		 * je�eli tak podstawia jego warto�� pod pierwszy element tablicy liczb pierwszych i zwi�ksza zmienn� pomocnicz� i o 1
 		 * je�eli nie sprawdza czy warto�� tablicy typu boolean jest r�wna false
 		 * je�eli tak podstawia pod kolejny element tablicy liczb pierwszych 
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
		 * P�tla sprawdza kolejne elementy tablicy, a� osi�gnie jej koniec tablicy
		 * elementy wi�ksze od zera s� wy�wietlane
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
	 	// Program zapisuj�cy liczby pierwsze do tablicy liczb pierwszych
		 
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
	  	System.out.print("Wstawianie poszczeg�lnych liczb do tablicy - ");  
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
	  	System.out.print("\nWy�wietlanie poszczeg�lnych element�w tablicy - "); 
	  	mierzCzas.podajCzas();
	 	}	
}
*/