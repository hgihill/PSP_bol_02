
public class Hilo2 implements Runnable {

	byte[] array1 = { 1, 2, 3 };
	byte[] array2 = { 4, 5, 6 };
	int res1 = 0, res2 = 0;

	@Override
	public void run() {
		for (int i = 0; i < array1.length; i++) {
			res1 += array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			res2 += array1[i];
		}
		System.out.println("----------------\nResultado hilo 2\n----------------\n" + (res1 * res2));
	}

}
