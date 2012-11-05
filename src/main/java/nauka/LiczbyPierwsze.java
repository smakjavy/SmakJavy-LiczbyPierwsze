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
	public int[] liczLiczbyPierwsze(int MAX){
		
		//deklaracja zmiennych pomocniczych i tablicy, w której bêd¹ przechowywane liczby pierwsze
		int i, j = 0, wynik, tabPierwszych[] = new int[MAX];
		
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
				int p = 2;
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
        return tabPierwszych;
	}
	public long dajCzasLiczenia(){	
		return System.currentTimeMillis();
	}	
}

	/*	public static void main(String[] args) {
		

		LiczbyPierwsze dajCzas = new LiczbyPierwsze();
		long start = 0;
		start = dajCzas.dajCzasLiczenia();
		LiczbyPierwsze tab = new LiczbyPierwsze();

		System.out.println("Liczby pierwsze do ");
		//tab.liczLiczbyPierwsze(MAX);
		System.out.println("\n");
		dajCzas.dajCzasLiczenia();
        		
		System.out.println("Czas wykonania operacji wynosi:" +(dajCzas.dajCzasLiczenia()- start));	
	}
}


 Poprzednia wersja programu
 * package nauka;

public class LiczbyPierwsze{

	final static int MAX_LICZBA_PIERWSZA=10000;

	
	// Program zapisuj¹cy liczby pierwsze do tablicy liczb pierwszych

	public static void main(String[] args) {
		
		Stoper mierzCzas = new Stoper();
		mierzCzas.zeruj();
		
		int i, j = 0, wynik, tabPierwszych[] = new int[MAX_LICZBA_PIERWSZA];
		mierzCzas.start();
		for (i = 0; i < MAX_LICZBA_PIERWSZA; i++) {
			if (i == 1) {
				tabPierwszych[j++] = i;
			} else {
				int p = 2;
				while (i > p) {
					wynik = i % p;
					if (wynik != 0){
						p++;
					} else{
						p = i + 1;
					}
				}
				if (p != i + 1) {
					tabPierwszych[j++] = i;
				}
			}
		}

		mierzCzas.stop();
		System.out.print("Wstawianie poszczególnych liczb do tablicy - ");
		mierzCzas.podajCzas();
		mierzCzas.zeruj();
		mierzCzas.start();
		
		System.out.print("Liczby pierwsze: ");
		for (i = 1; i < tabPierwszych.length; i++) {
			if (tabPierwszych[i] > 0) {
				System.out.print(tabPierwszych[i] + ", ");
			}
		}
		mierzCzas.stop();
		System.out.print("\nWyœwietlanie poszczególnych elementów tablicy - ");
		mierzCzas.podajCzas();
	}
}
*/