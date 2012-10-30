package nauka;

public class Sito {
 
	final static int MAX_LICZBA_PIERWSZA = 1000000;
	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
	 	// Program zapisuj¹cy liczby pierwsze do tablicy liczb pierwszych
		 
	 	int i, tabPierwszych[] = new int[MAX_LICZBA_PIERWSZA];
	 	double pierwiastek;
	 	pierwiastek = Math.sqrt(MAX_LICZBA_PIERWSZA);
	          
	 	boolean tabSito[] = new boolean[MAX_LICZBA_PIERWSZA + 1];
	 	/*      Stoper mierzCzas = new Stoper();
	        	Stoper mierzCzas1 = new Stoper();
	        	mierzCzas.zeruj();
	        	mierzCzas.start(); */

	 	for(i = 2; i <= pierwiastek; i++){
	 		if (tabSito[i] == true){
	 			continue;
	 		}
	 		for (int j = 2 * i ; j <= MAX_LICZBA_PIERWSZA; j += i){ 			
	 				tabSito[j] = true; 
	 		 			         
	 		}
	 	}	
	   
	 	for (i = 0; i <= MAX_LICZBA_PIERWSZA; i++){
	 		if (i == 1){
	 			tabPierwszych[i] = i;
	 		} else 
	 			if (tabSito[i] == false){
	 			tabPierwszych[i] = i;
	 		}
	 	}
	 		 
	 	/*  mierzCzas.stop();
	  	System.out.print("Wstawianie poszczególnych liczb do tablicy - ");  
	  	mierzCzas.podajCzas();
	  	mierzCzas1.zeruj();            
	  	mierzCzas1.start();*/   
		
	 	System.out.print("Liczby pierwsze: ");
	           
	 	for (i = 1; i< tabPierwszych.length-1; i++){
	 		if (tabPierwszych[i] > 0){
	 			System.out.print(tabPierwszych[i] +", ");  
	 		}
	 	}
	
	 	/*  mierzCzas1.stop();
	  	System.out.print("\nWyœwietlanie poszczególnych elementów tablicy - "); 
	  	mierzCzas1.podajCzas(); */
	 	}	
}
