import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		byte bNumero = 0;
		int iId = 0;

		final int NUMTHREADS = 5;
		byte[] arrayByte = { 0, 0, 0, 0, 0 };
		ArrayList<Hilo> listHilos = new ArrayList<Hilo>();
		ArrayList<Thread> listThreads = new ArrayList<Thread>();
		int iContador;

		// Valor inicial del array
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Posición inicial " + iContador + " del array: " + arrayByte[iContador]);
		}

		System.out.println("----------------------");

		// Creando runnables
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando runnable " + iContador + ".");
			listHilos.add(new Hilo(bNumero, iId));
		}

		System.out.println("----------------------");

		// Creando hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando el hilo " + iContador + ".");
			listThreads.add(new Thread(listHilos.get(iContador)));
		}

		// Iniciar hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			listThreads.get(iContador).start();
			//Creamos el join 
			try {
				listThreads.get(iContador).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("----------------------");

		// Cambio de contenido del array
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			Hilo h1 = listHilos.get(iContador);
			arrayByte[iContador] = (byte) h1.getbNumero();
		}

		//Valor final del array
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Posición final " + iContador + " del array: " + arrayByte[iContador]);
		}

	}

}
