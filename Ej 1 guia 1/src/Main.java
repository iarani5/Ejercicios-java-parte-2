
public class Main {

	public static void main(String[] args) {
		
		//PERSONA
		
		Persona iara = new Persona("Iara", 54.3);
		
		//MERCURIO
		Planeta mercurio= new Planeta("mercurio",0.4);
		mercurio.Imprimir(mercurio.calcularPeso(iara.getPeso()));
		
		
		/*
		//JUPITER
		Planeta jupiter= new Planeta();
		jupiter.setNombre("Jupiter");
		jupiter.setFactor((double) 0.4);
		jupiter.Imprimir(tierra.calcularPeso((double)2.2));
		*/
	}

}
