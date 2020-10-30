
public class Hilo implements Runnable {

	private byte[] arrayByte;
	int iId = 0;

	public Hilo(byte[] arrayByte, int iId) {
		this.arrayByte = arrayByte;
		this.iId = iId;
	}

	public byte[] getArrayByte() {
		return arrayByte;
	}

	public void setArrayByte(byte[] arrayByte) {
		this.arrayByte = arrayByte;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	@Override
	public void run() {
		for (int i = 0; i < arrayByte.length; i++) {
			arrayByte[i] = (byte) (Math.random() * 10);
		}

	}

}
