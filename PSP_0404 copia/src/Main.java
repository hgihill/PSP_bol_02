
public class Main {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Hilo1());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread t2 = new Thread(new Hilo2());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread t3 = new Thread(new Hilo3());
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Fin de ejecución de los hilos");

	}

}
