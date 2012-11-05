
package nauka;

public interface LicznikLiczbPierwszych {
	
	/**
	 * liczy liczby pierwsze
	 * @param max maksymalna liczba, dla której odbedzie sie liczenie czy jest pierwsza
	 * @return tablia liczb pierwszych
	 */
	
	public int[] liczLiczbyPierwsze(int max);
	int MAX=10000;
	/**
	 * podaje czas liczenia
	 * @return czas liczenia w milisekundach
	 */
	public long dajCzasLiczenia();
}
