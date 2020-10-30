
public class Hilo1 implements Runnable {

	@Override
	public void run() {
		System.out.println("----------------\nResultado hilo 1\n----------------");
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}

	}

}
