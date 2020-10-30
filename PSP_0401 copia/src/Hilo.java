
public class Hilo implements Runnable {

	private byte bNumero;
	private int iId;

	public Hilo(byte bNumero, int iId) {
		setbNumero(bNumero);
		setiId(iId);
	}

	public int getbNumero() {
		return bNumero;
	}

	public void setbNumero(byte bNumero) {
		this.bNumero = bNumero;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	@Override
	public void run() {
		setbNumero((byte) (Math.random() * 50));
	}

}
