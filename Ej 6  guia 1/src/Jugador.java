
public class Jugador extends Equipo {
	private int cantidad_goles;
	private int cantidad_infracciones;
	private int cantidad_partidos;

	
	public Jugador(int cantidad_goles, int cantidad_infracciones, int cantidad_partidos) {
		this.cantidad_goles = cantidad_goles;
		this.cantidad_infracciones = cantidad_infracciones;
		this.cantidad_partidos = cantidad_partidos;
	}

	public Jugador() {

	}

	public int getCantidadPartidos(){
		return cantidad_partidos;
	}
	
	public void setCantidadPartidos(int n){
		this.cantidad_partidos=n;
	}
	
	public int getCantidadGoles(){
		return cantidad_goles;
	}
	
	public void setCantidadGoles(int cG){
		this.cantidad_goles=cG;
	}
	
	public int getCantidadInfracciones(){
		return cantidad_infracciones;
	}
	
	public void setCantidadInfracciones(int cI){
		this.cantidad_infracciones=cI;
	}
	
	public boolean esBuenJugador(int cant_goles, int cant_infracciones){
		return cant_goles>=10&&cant_infracciones<5;
	}
	
	public boolean juegoSucio(int cant_goles, int cant_infracciones, int cantidad_partidos){
		return !(cantidad_partidos>2&&cant_goles!=0&&cant_infracciones!=0);
	}
	

}
