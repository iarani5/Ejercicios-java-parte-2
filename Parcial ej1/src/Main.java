
public class Main {

	public static void main(String[] args) {
		Naipe primer_naipe= new Naipe(1,"Espada");
		Naipe segundo_naipe= new Naipe(2,"Espada");
		Naipe tercer_naipe= new Naipe(2,"Basto");
		Naipe cuarto_naipe= new Naipe(2,"Copa");
		Naipe quinto_naipe= new Naipe(10,"Copa");
		Naipe sexto_naipe= new Naipe(10,"Copa");

		Baraja mazo = new Baraja();
		
		mazo.agregar_carta(primer_naipe);
		mazo.agregar_carta(segundo_naipe);
		mazo.agregar_carta(tercer_naipe);
		mazo.agregar_carta(cuarto_naipe);
		mazo.agregar_carta(quinto_naipe);
		mazo.agregar_carta(sexto_naipe);
		System.out.println("------------ COMPARAR CARTAS: ");
		System.out.println(primer_naipe.comparar_cartas(segundo_naipe.getPalo()));
		System.out.println(primer_naipe.comparar_cartas(tercer_naipe.getPalo()));
		System.out.println("------------ CONTAR CARTAS MISMO PALO: ");
		System.out.println("Copa: "+mazo.contar_cartas_mismo_palo("Copa"));
		System.out.println("Espada: "+mazo.contar_cartas_mismo_palo("Espada"));

	}

}
