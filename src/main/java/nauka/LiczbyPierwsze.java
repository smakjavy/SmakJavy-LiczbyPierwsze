package nauka;

/**
 * 
 * @author MC
 *
 */

public class LiczbyPierwsze implements LicznikLiczbPierwszych {
	// implementacja metod interfejsu	

		/*
		 * Metoda s�u��ca do wyszukiwania liczb pierwszych z przedzia�u (MAX) zadeklarowanego 
		 w interfejsie LicznikLiczbPierwszych
		 * metoda sprawdza ka�d� liczb� czy jest podzielne bez reszty przez kolejne dzielniki (p) 
		 */
		
		/*
		 * utworzenie obiektu Stoper
		 */
		private Stoper stoper = new Stoper();
			
		public int[] liczLiczbyPierwsze(int max){
			
			//deklaracja zmiennych pomocniczych oraz tablicy, w kt�rej b�d� przechowywane liczby pierwsze
			int i, j = 0, wynik, p, tabPierwszych[] = new int[max];
			
			/*
			 * wyzerowanie stopera
			 * uruchomienie stopera
			 */
			stoper.zeruj();
			stoper.start();
			
			/*
			 * P�tla dzia�a od 0 do liczby MAX zadeklarowanej w interfejsie LicznikLiczbPierwszych
			 */
			for (i = 0; i < max; i++) {
				
				/* 
				 * Warunek sprawdza czy zmienna i=1 
				 * je�eli tak podstawia pod pierwszy element tablicy jego warto�� (j=0) 
				 * i przechodzi do nast�pnego elementu tablicy
				 * je�eli nie przypisuje zmiennej p warto�� 2 i rozpoczyna p�tl� while 
				 * po wykonaniu p�tli typu while 
				 */		
				if (i == 1) {
					tabPierwszych[j++] = i;
				} else {
					p=2;
					/*
					 * P�tla wykonuje si� dla zmiennej i > p
					 * dzieli modulo zmienn� i przez dzielnik p i podstawia pod zmienn� wynik
					 */
					while (i > p) {
						wynik = i % p;
						
						/*
						 * warunek sprawdza czy zmienna wynik jest r�na od 0
						 * je�eli tak zwi�ksza o 1 zmienn� p
						 * w przeciwnym wypadku podstawia pod zmienn� p warto�� zmiennej i zwi�kszon� o 1
						 */
						if (wynik != 0){
							p++;
						} else{
							p = i + 1;
						}
					}
					
					/* 
					 * warunek sprawdza czy dzielnik p jest r�ny od zmiennej i powi�kszonej o 1
					 * je�eli tak podstawia przypisuje warto�� zmiennej i do tablicy o elemencie[j] i zwi�ksza j o 1 
					 */
					if (p != i + 1) {
						tabPierwszych[j++] = i;
					}
				}
			}	
			
			/*
			 * P�tla sprawdza kolejne elementy tablicy, a� osi�gnie jej koniec tablicy
			 * elementy wi�ksze od zera s� wy�wietlane
			 */
			for (i = 1; i < tabPierwszych.length; i++) {
				if (tabPierwszych[i] > 0) {
					System.out.print(tabPierwszych[i] + ", ");
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