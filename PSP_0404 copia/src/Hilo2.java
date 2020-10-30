import medac.validaciones.LibFrontend;

public class Hilo2 implements Runnable {

	@Override
	public void run() {

		int iNum = (int) LibFrontend.valida("Introduzca el número que desee (0-1000): ", 0, 1000, 1);
		
		System.out.println(iNum + "+10 --> " + (iNum + 10) +"\n");

	}

}
