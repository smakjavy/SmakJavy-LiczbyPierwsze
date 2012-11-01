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
	int[] tabPierwszych;
	public int[] liczLiczbyPierwsze(int MAX){
		
		int i, j = 0, wynik, tabPierwszych[] = new int[MAX];

		for (i = 0; i < MAX; i++) {
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

/* Poprzednia wersja programu
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