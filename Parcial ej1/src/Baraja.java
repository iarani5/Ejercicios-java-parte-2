import java.util.ArrayList;

public class Baraja {
	private ArrayList<Naipe> mazo_cartas= new ArrayList<Naipe>();

	public ArrayList<Naipe> getMaso_cartas() {
		return mazo_cartas;
	}

	public void setMaso_cartas(ArrayList<Naipe> maso_cartas) {
		this.mazo_cartas = maso_cartas;
	}
	
	public Baraja(){

	}
	
	public void agregar_carta(Naipe una_carta) {
		mazo_cartas.add(una_carta);
	}

	public int contar_cartas_mismo_palo(String palo) {
		int cont=0;
		for(int i=0;i<mazo_cartas.size();i++) {
			if(mazo_cartas.get(i).comparar_cartas(palo)) {
				cont++;
			}
			
		}
		return cont;
	}
	
}
