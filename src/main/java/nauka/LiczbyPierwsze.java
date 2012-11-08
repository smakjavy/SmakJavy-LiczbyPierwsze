package nauka;

//import nauka.Stoper;


/**
 * 
 * 
 * @author MC
 *
 */

public class LiczbyPierwsze implements LicznikLiczbPierwszych {
	// implementacja metod interfejsu	

		/*
		 * Metoda s³u¿¹ca do wyszukiwania liczb pierwszych z przedzia³u (MAX) zadeklarowanego 
		 w interfejsie LicznikLiczbPierwszych
		 * metoda sprawdza ka¿d¹ liczbê czy jest podzielne bez reszty przez kolejne dzielniki (p) 
		 */
		
		/*
		 * utworzenie obiektu Stoper
		 */
		private Stoper stoper = new Stoper();
		
		//deklaracja zmiennych pomocniczych i tablicy, w której bêd¹ przechowywane liczby pierwsze
		private int i, j = 0, wynik, p, tabPierwszych[] = new int[MAX];
		
		
		public int[] liczLiczbyPierwsze(int MAX){
		
			/*
			 * wyzerowanie stopera
			 * uruchomienie stopera
			 */
			stoper.zeruj();
			stoper.start();
			
			/*
			 * Pêtla dzia³a od 0 do liczby MAX zadeklarowanej w interfejsie LicznikLiczbPierwszych
			 */
			for (i = 0; i < MAX; i++) {
				
				/* 
				 * Warunek sprawdza czy zmienna i=1 
				 * je¿eli tak podstawia pod pierwszy element tablicy jego wartoœæ (j=0) 
				 * i przechodzi do nastêpnego elementu tablicy
				 * je¿eli nie przypisuje zmiennej p wartoœæ 2 i rozpoczyna pêtlê while 
				 * po wykonaniu pêtli typu while 
				 */		
				if (i == 1) {
					tabPierwszych[j++] = i;
				} else {
					p=2;
					/*
					 * Pêtla wykonuje siê dla zmiennej i wiêksze od zmiennej p
					 * dzieli modulo zmienn¹ i przez dzielnik p i podstawia pod zmienn¹ wynik
					 */
					while (i > p) {
						wynik = i % p;
						
						/*
						 * warunek sprawdza czy zmienna wynik jest ró¿na od 0
						 * je¿eli tak zwiêksza o 1 zmienn¹ p
						 * w przeciwnym wypadku podstawia pod zmienn¹ p wartoœæ zmiennej i zwiêkszon¹ o 1
						 */
						if (wynik != 0){
							p++;
						} else{
							p = i + 1;
						}
					}
					
					/* 
					 * warunek sprawdza czy dzielnik p jest ró¿ny od zmiennej i powiêkszonej o 1
					 * je¿eli tak podstawia przypisuje wartoœæ zmiennej i do tablicy o elemencie[j] i zwiêksza j o 1 
					 */
					if (p != i + 1) {
						tabPierwszych[j++] = i;
					}
				}
			}	
			
			/*
			 * Pêtla sprawdza kolejne elementy tablicy, a¿ osi¹gnie jej koniec tablicy
			 * elementy wiêksze od zera s¹ wyœwietlane
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
		 * Metoda s³u¿¹ca do zwrócenia czasu liczenia w milisekundach
		 * NIE DZIA£A 
		 */
		public long dajCzasLiczenia(){	
			return stoper.dajCzas();
		}
	}	