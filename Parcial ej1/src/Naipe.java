
public class Naipe {
	private int valor;
	private String palo;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public Naipe(int v, String p) {
		this.valor=v;
		this.palo=p;
	}
	
	@Override
	public String toString() {
		return "Naipe [valor=" + valor + ", palo=" + palo + "]";
	}
	
	public boolean comparar_cartas(String compara) {
		return this.palo.equals(compara);
	}
	
	
				
}










