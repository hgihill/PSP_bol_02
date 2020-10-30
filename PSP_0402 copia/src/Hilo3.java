import medac.validaciones.LibFrontend;

public class Hilo3 implements Runnable {

	@Override
	public void run() {
		System.out.println("----------------\nResultado hilo 3\n----------------");
		String sLeer = (String) LibFrontend.leer("Introduzca un mensaje para que sea impreso: ");
		
		System.out.println(sLeer);
	}

}
