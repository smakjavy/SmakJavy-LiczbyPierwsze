package nauka;

/**
 * 
 * @author MC
 *
 */

public class Licz {

	
	public int[] licz (int max) {
		
		Stoper mierzCzas = new Stoper();
		mierzCzas.zeruj();
		
		int i, j = 0, wynik, tabPierwszych[] = new int[max];
		mierzCzas.start();
		for (i = 0; i < max; i++) {
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

		return tabPierwszych;
	}
}
