import java.util.ArrayList;

public class Cuadrados {
	private ArrayList<Cuadrado> cuadrados = new ArrayList<Cuadrado>();

	public ArrayList<Cuadrado> getCuadrados() {
		return cuadrados;
	}

	public void setCuadrados(ArrayList<Cuadrado> cuadrados) {
		this.cuadrados = cuadrados;
	}
	
	public Cuadrados() {
		
	}
	
	public void cargar_cuadrado(Cuadrado c) {
		cuadrados.add(c);
	}
	
	public void mostrar_cuadrados() {
		for(int i=0;i<cuadrados.size();i++) {
			System.out.println(cuadrados.get(i).toString());
		}
	}
}
