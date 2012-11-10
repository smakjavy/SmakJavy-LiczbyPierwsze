package nauka;

/*
 * Klasa uruchomieniowa dla klas LiczbyPierwsze i Sito
 * ma za zadanie wyœwietliæ wyniki z metod liczLiczbypierwsze i dajCzasLiczenia
 * oblicza czas od pocz¹tku uruchomienia klasy Uruchamiacz do koñca
 */
public class Uruchamiacz {
	public static void main(String[] args) {
		
	Stoper stoper = new Stoper();
	stoper.zeruj();
	stoper.start();

	LiczbyPierwsze tab = new LiczbyPierwsze();
		
		int max=1000;
		
                System.out.println("Liczby pierwsze do " + max +" zwrócone za pomoc¹ klasy LiczLiczbyPierwsze:");
		tab.liczLiczbyPierwsze(max);
		System.out.println("\n");
		
                //TODO - po co tutaj tworzymy now¹ instancjê ? przecie¿ wystarczy pobraæ czas liczenia z obiektu tab
                LiczbyPierwsze czas = new LiczbyPierwsze();
		System.out.println("Czas liczenia wynosi " + czas.dajCzasLiczenia());
		System.out.println("\n");
		
                //TODO - przy deklaracji zmiennej u¿yjmy nazwy klasy a nie interfejsu
		Sito tabSito = new Sito();
		System.out.println("Liczby pierwsze do " + max +" zwrócone za pomoc¹ klasy Sito:");
		tab.liczLiczbyPierwsze(max);
		System.out.println("\n");
                //TODO - tutaj odwo³ajmy siê do tabsitio a nie do czas.
		System.out.println("Czas liczenia wynosi " + czas.dajCzasLiczenia() +":");
		System.out.println("\n");
		
	stoper.stop();	
	stoper.podajCzas();	
	}	
}