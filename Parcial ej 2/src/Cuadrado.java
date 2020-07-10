
public abstract class Cuadrado {
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	public Cuadrado(int l) {
		this.lado=l;
	}
	
	@Override
	public String toString() {
		if(lado == 1) {
			return "*";
		}
		String linea = new String(new char[lado]).replace('\0', '*');
		StringBuilder rta = new StringBuilder(linea);
		rta.append("\n");

		if(lado>2){
			for(int i = 1; i <= lado - 2; i++){
				StringBuilder inter = new StringBuilder(linea);
				for (int j = 1; j <= linea.length() - 2; j++){
					inter.setCharAt(j, ' ');
				}	
				rta.append(inter);
				rta.append("\n");
			}
		}

		rta.append(linea);
		return rta.toString();
	}

	
}
