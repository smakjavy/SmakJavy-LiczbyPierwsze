package nauka;

public class Stoper {
	
	long start, stop;

	void start() {
		start = System.currentTimeMillis();
	}

	void stop() {
		stop = System.currentTimeMillis();
	}

	void zeruj() {
		start = 0;
	}

	void podajCzas() {
		System.out.println("czas operacji wynosi: " + dajCzas());
	}
	
	long dajCzas() {
		return stop - start;
	}
}