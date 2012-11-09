package nauka;

//import nauka.Stoper;

/**
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
		
		/*
		 * utworzenie obiektu Stoper
		 */
		private Stoper stoper = new Stoper();
		
		//deklaracja zmiennej pomocniczej oraz deklaracja i zainicjowanie tablicy liczb pierwszych 
		private int i, tabPierwszych[] = new int[MAX];
		
		//deklaracja zmiennej pierwiastek
		private double pierwiastek;
	 	
	 	
	 	//deklaracja i stworzenie tablicy do wyszukiwania wielokrotnoœci zmiennej i      
		private boolean tabSito[] = new boolean[MAX+ 1];
	 	
		public int[] liczLiczbyPierwsze(int MAX){
			
			/*
			 * wyzerowanie stopera
			 * uruchomienie stopera
			 */
			stoper.zeruj();
			stoper.start();
				 	
		 	/*obliczenie pierwiastka dla zmiennej (MAX) zadeklarowananej w interfejsie LicznikLiczbPierwszych z 
		 	 * wykorzystaniem funkcji matematycznej
		 	 */
		 	pierwiastek = Math.sqrt(MAX);

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
		 	
			/*
			 * zatrzymanie stopera
			 */
			stoper.stop();
			
	        return tabPierwszych;
		}
		
		/*
		 * Metoda s³u¿¹ca do zwrócenia czasu liczenia w milisekundach
		 * NIE DZIA£A 
		 */
		public long dajCzasLiczenia(){	
			return stoper.dajCzas();
		}
}