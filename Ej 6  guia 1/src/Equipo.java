import java.util.*;

public class Equipo {
	public int numero;
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
	public void setNumero(int n){
		this.numero=n;
	}
	
	public int getNumero (){
		return numero;
	}
	
	public void crear_jugadores(){
		Random rand = new Random();	
		ArrayList<Jugador> jugadores_list = new ArrayList<Jugador>();
		
		for(int i=0;i<=11;i++){
			Jugador jugador = new Jugador();
			jugador.setCantidadGoles(rand.nextInt(30));
			jugador.setCantidadInfracciones(rand.nextInt(30));
			jugador.setCantidadPartidos(rand.nextInt(30));
			jugadores_list.add(jugador);			
		}
		this.jugadores=jugadores_list;
	}
	
	public int unaFigura(ArrayList<Jugador> array_buenos_jugadores){
		int max_goles=0;
		for(int i=0;i<array_buenos_jugadores.size();i++){
			if(array_buenos_jugadores.get(i).getCantidadGoles()>max_goles){
				max_goles=array_buenos_jugadores.get(i).getCantidadGoles();
			}
		}
		return max_goles;
	}
	
	public int juegoSucio(ArrayList<Jugador> array_buenos_jugadores){
		int max_goles=0;
		for(int i=0;i<array_buenos_jugadores.size();i++){
			if(array_buenos_jugadores.get(i).getCantidadGoles()>max_goles){
				max_goles=array_buenos_jugadores.get(i).getCantidadGoles();
			}
		}
		return max_goles;
	}
	
}
