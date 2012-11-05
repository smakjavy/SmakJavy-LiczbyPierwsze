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
	 * Metoda s�u��ca do wyszukiwania liczb pierwszych z przedzia�u (MAX) zadeklarowanego 
	 w interfejsie LicznikLiczbPierwszych
	 * metoda sprawdza ka�d� liczb� czy jest podzielne bez reszty przez kolejne dzielniki (p) 
	 */
	public int[] liczLiczbyPierwsze(int MAX){
		
		//deklaracja zmiennych pomocniczych i tablicy, w kt�rej b�d� przechowywane liczby pierwsze
		int i, j = 0, wynik, tabPierwszych[] = new int[MAX];
		
		/*
		 * P�tla dzia�a od 0 do liczby MAX zadeklarowanej w interfejsie LicznikLiczbPierwszych
		 */
		for (i = 0; i < MAX; i++) {
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
				int p = 2;
				/*
				 * P�tla wykonuje si� dla zmiennej i wi�ksze od zmiennej p
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

	
	// Program zapisuj�cy liczby pierwsze do tablicy liczb pierwszych

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
		System.out.print("Wstawianie poszczeg�lnych liczb do tablicy - ");
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
		System.out.print("\nWy�wietlanie poszczeg�lnych element�w tablicy - ");
		mierzCzas.podajCzas();
	}
}
*/