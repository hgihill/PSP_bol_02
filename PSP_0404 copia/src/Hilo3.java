import medac.validaciones.LibFrontend;

public class Hilo3 implements Runnable {

	@Override
	public void run() {
		
		float fNum = (float) LibFrontend.valida("Introduzca el número deseado (0.0, 100.0): ", 0, 100, 2);

		System.out.println(fNum + "/10.0 --> " + (fNum / 10.0) + "\n");
	}

}
