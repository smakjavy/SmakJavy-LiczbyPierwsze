package nauka;

/**
 * 
 * @author MC
 *
 */

public class LiczbyPierwsze {

	final static int MAX_LICZBA_PIERWSZA=10000;
	
	/**
	 * @param args
	 */
	
	// Program zapisuj¹cy liczby pierwsze do tablicy liczb pierwszych
	
	public static void main(String[] args) {
		
		Stoper mierzCzas = new Stoper();
		mierzCzas.zeruj();
		
		int i, j = 0, wynik, tabPierwszych[] = new int[MAX_LICZBA_PIERWSZA];
		mierzCzas.start();
		for (i = 0; i < MAX_LICZBA_PIERWSZA; i++) {
			if (i == 1) {
				tabPierwszych[j] = i;
				j++;
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
