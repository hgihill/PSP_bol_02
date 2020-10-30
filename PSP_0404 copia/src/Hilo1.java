import medac.validaciones.LibFrontend;

public class Hilo1 implements Runnable {

	@Override
	public void run() {

		String sMensaje = (String) LibFrontend.leer("Introduzca el mensaje que desee mostrar por pantalla: ");
		System.out.println("Mensaje: " + sMensaje + "\n");

	}

}
