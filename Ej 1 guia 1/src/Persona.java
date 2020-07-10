
public class Persona {
	private String nombre;
	private Double peso;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String n){
		this.nombre=n;
	}
	
	public Double getPeso(){
		return peso;
	}
	
	public void setPeso(Double p){
		this.peso=p;
	}
	
	public Persona (String n, Double p){
		nombre=n;
		peso=p;
	}
}
