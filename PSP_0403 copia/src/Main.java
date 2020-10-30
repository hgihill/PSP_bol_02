import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		final int NUMTHREADS = 5;
		byte[] arrayByte = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		ArrayList<Hilo> listHilos = new ArrayList<Hilo>();

		int i;

		// Creando runnables
		for (i = 0; i < NUMTHREADS; i++) {
			System.out.println("Creando runnable " + i + ".");
			listHilos.add(new Hilo(arrayByte, i));
		}

		System.out.println("----------------------");

		for (i = 0; i < NUMTHREADS; i++) {
			System.out.println("\nActual (" + (i + 1) + ")\n");
			muestraArray(arrayByte);
			listHilos.get(i).run();

			System.out.println("\n\nModificado (" + (i + 1) + ")\n");
			arrayByte = listHilos.get(i).getArrayByte();
			muestraArray(arrayByte);
		}

	}

	public static void muestraArray(byte[] arrayByte) {
		System.out.println("[");
		for (int i = 0; i < arrayByte.length; i++) {

			System.out.print(arrayByte[i] + ",");
		}
		System.out.println("]");
	}

}
