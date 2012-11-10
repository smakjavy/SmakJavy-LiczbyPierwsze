package nauka;

/*
 * Klasa uruchomieniowa dla klas LiczbyPierwsze i Sito
 * ma za zadanie wy�wietli� wyniki z metod liczLiczbypierwsze i dajCzasLiczenia
 * oblicza czas od pocz�tku uruchomienia klasy Uruchamiacz do ko�ca
 */
public class Uruchamiacz {
	public static void main(String[] args) {

	LiczbyPierwsze tab = new LiczbyPierwsze();
		
		int max=100000;
		
        System.out.println("Liczby pierwsze do " + max +" zwr�cone za pomoc� klasy LiczbyPierwsze:");
		tab.liczLiczbyPierwsze(max);
		System.out.println("\n");
		System.out.println("Czas liczenia wynosi: " + tab.dajCzasLiczenia());
		System.out.println("\n");
		
		Sito tabSito = new Sito();
		System.out.println("Liczby pierwsze do " + max +" zwr�cone za pomoc� klasy Sito:");
		tabSito.liczLiczbyPierwsze(max);
		System.out.println("\n");
		System.out.println("Czas liczenia wynosi: " + tabSito.dajCzasLiczenia());
		System.out.println("\n");
		
	}	
}