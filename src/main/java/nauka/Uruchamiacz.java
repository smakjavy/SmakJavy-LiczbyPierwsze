package nauka;
//import nauka.LiczbyPierwsze;


public class Uruchamiacz {
	public static void main(String[] args) {
		

	LiczbyPierwsze tab = new LiczbyPierwsze();
		int max=LicznikLiczbPierwszych.MAX;
		System.out.println("Liczby pierwsze do " + max +":");
		tab.liczLiczbyPierwsze(max);
		System.out.println("\n");
	
	Sito tabSito = new Sito();

		System.out.println("Liczby pierwsze do " + max +":");
		tab.liczLiczbyPierwsze(max);
		System.out.println("\n");

		
	}
}