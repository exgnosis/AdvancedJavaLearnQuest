package unsync;

public class Runner {
	public static void main(String[] args) {
		Counter counterObject = new Counter();
		for (int i = 1; i <= 10 ; i++) {
			Thread t = new Thread (counterObject);
			t.start();
		}

	}

}
