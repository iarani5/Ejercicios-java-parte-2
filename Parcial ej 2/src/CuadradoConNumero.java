
public class CuadradoConNumero extends Cuadrado {

	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public CuadradoConNumero(int l, int n) {
		super(l);
		this.numero=n;
	}
	

	@Override
	public String toString() {
		return numero+"\n"+super.toString();
	}
	
}
