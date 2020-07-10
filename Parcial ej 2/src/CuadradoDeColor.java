
public class CuadradoDeColor extends Cuadrado{
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public CuadradoDeColor(int l, String c) {
		super(l);
		this.color=c;
	}
	
	@Override
	public String toString() {
		return  color+"\n"+super.toString();
	}
}
