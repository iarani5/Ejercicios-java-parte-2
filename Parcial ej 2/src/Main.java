
public class Main {

	public static void main(String[] args) {
		
		Cuadrados listado_cuadrados = new Cuadrados();
		listado_cuadrados.cargar_cuadrado(new CuadradoDeColor(4,"Rojo"));
		listado_cuadrados.cargar_cuadrado(new CuadradoConNumero(4,12));
		listado_cuadrados.mostrar_cuadrados();
	}

}
