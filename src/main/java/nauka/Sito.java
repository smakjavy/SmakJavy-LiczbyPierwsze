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
		 * Metoda s�u��ca do wyszukiwania liczb pierwszych z przedzia�u (MAX) zadeklarowanego 
		 * w interfejsie LicznikLiczbPierwszych
		 * metoda oparta jest o sito Eratostenesa (dzijej zadaniem 
		 * ustawianie warto�� true w tablicy typu boolean dla kolejnych wielokrotno�ci zmiennej i
		 * sprawdzanie odbywa si� momentu, a� i osi�gnie pierwiastek od MAX. 
		 * do tablicy liczb pierwszych metoda przypisuje tylko te elementy, kt�re maj� warto�� false
		 */
		
		/*
		 * utworzenie obiektu Stoper
		 */
		private Stoper stoper = new Stoper();
		
		//deklaracja zmiennej pomocniczej
		private int i;
		
		//deklaracja zmiennej pierwiastek
		private double pierwiastek;
	 	
		public int[] liczLiczbyPierwsze(int max){
			
			//deklaracja tablicy liczb pierwszych
			int tabPierwszych[] = new int[max];
			
			//deklaracja i stworzenie tablicy do wyszukiwania wielokrotno�ci zmiennej i 
			boolean tabSito[] = new boolean[max+ 1];
			/*
			 * wyzerowanie stopera
			 * uruchomienie stopera
			 */
			stoper.zeruj();
			stoper.start();
				 	
		 	/*obliczenie pierwiastka dla zmiennej (max) zadeklarowananej w interfejsie LicznikLiczbPierwszych z 
		 	 *wykorzystaniem funkcji matematycznej
		 	 */
		 	pierwiastek = Math.sqrt(max);

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
		 		for (int j = 2 * i ; j <= max; j += i){ 			
		 				tabSito[j] = true;          
		 		}
		 	}	
		   
	 		/*
	 		 * p�tla typu for ma za zadanie sprawdzi� czy zmienna i jest r�wna zero 
	 		 * je�eli tak podstawia jego warto�� pod pierwszy element tablicy liczb pierwszych i zwi�ksza zmienn� pomocnicz� i o 1
	 		 * je�eli nie sprawdza czy warto�� tablicy typu boolean jest r�wna false
	 		 * je�eli tak podstawia pod kolejny element tablicy liczb pierwszych 
	 		 */
		 	for (i = 0; i <= max; i++){
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
		 	
			/*
			 * zatrzymanie stopera
			 */
			stoper.stop();
			
	        return tabPierwszych;
		}
		
		/*
		 * Metoda s�u��ca do zwr�cenia czasu liczenia w milisekundach
		 */
		public long dajCzasLiczenia(){	
			return stoper.dajCzas();
		}
}