
public class Planeta {
	private String nombre;
	private Double factor;
	
	public void Imprimir (Double n){
		System.out.print("Tu peso en este planeta "+getNombre()+" es: "+n+"Kg\n");
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Double getFactor(){
		return factor;
	}
	
	public void setNombre(String n){
		this.nombre=n;
	}

	public void setFactor(Double f){
		this.factor=f;
	}

	public Planeta (String n, Double f){
			nombre = n;
			factor = f;
	}
	
	public Double calcularPeso (Double num){
		return (factor*num);
	}
	
}
