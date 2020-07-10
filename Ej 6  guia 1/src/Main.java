import java.util.*;


public class Main {

	public static void main(String[] args) {
		ArrayList<Equipo> listado_equipos = new ArrayList<Equipo>();
		for(int i=1;i<=10;i++){
			Equipo equipo = new Equipo();
			equipo.setNumero(i);
			equipo.crear_jugadores();
			listado_equipos.add(equipo);
		}		
		
		System.out.print("********* E Q U I P O S *********\n\n");

		for(int i=0;i<listado_equipos.size();i++){
			System.out.print("__________EQUIPO #"+listado_equipos.get(i).getNumero()+":\n");
			System.out.print(" -- FIGURA:\n");
			
			ArrayList<Jugador> listado_jugadores = new ArrayList<Jugador>();
			for(int j=0;j<listado_equipos.get(i).jugadores.size();j++){
				if(listado_equipos.get(i).jugadores.get(j).esBuenJugador(listado_equipos.get(i).jugadores.get(j).getCantidadGoles(),listado_equipos.get(i).jugadores.get(j).getCantidadInfracciones())){
					System.out.print("ES BUEN JUGADOR PORQUE HIZO: "+listado_equipos.get(i).jugadores.get(j).getCantidadGoles()+" GOLES\n");
					listado_jugadores.add(listado_equipos.get(i).jugadores.get(j));
				}
				if(listado_equipos.get(i).jugadores.get(j).juegoSucio(listado_equipos.get(i).jugadores.get(j).getCantidadGoles(),listado_equipos.get(i).jugadores.get(j).getCantidadInfracciones(),listado_equipos.get(i).jugadores.get(j).getCantidadPartidos())){
					System.out.print("---- ES MAL JUGADOR: \n");
					System.out.print("GOLES: "+listado_equipos.get(i).jugadores.get(j).getCantidadGoles()+"\n");
					System.out.print("FALTAS: "+listado_equipos.get(i).jugadores.get(j).getCantidadInfracciones()+"\n");
					System.out.print("PARTIDOS: "+listado_equipos.get(i).jugadores.get(j).getCantidadPartidos()+"\n");


					listado_jugadores.add(listado_equipos.get(i).jugadores.get(j));
				}
			}
			int mas_goles_por_equipo= listado_equipos.get(i).unaFigura(listado_jugadores);
			System.out.print("**** EL MEJOR GOLEADOR DEL EQUIPO HIZO: "+mas_goles_por_equipo+" GOLES\n");

		}
	}

}
