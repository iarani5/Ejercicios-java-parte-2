
public class Gen {
	
	private String sCadena = "ACDSCCDCRGQCFFDFEWFDFVF";
	private String sCadenaSolapados = "ACACDCDCCDAFRCDDDCDFRCTCDC";

	private int cantidadVeces = 0;
	private int cantidadVecesSolapado = 0;
	private String cantidadEstrellas = "";
	private String cantidadNumeral = "";

	
	public Gen(){
		
	}

	public String getsCadena() {
		return sCadena;
	}

	public void setsCadena(String sCadena) {
		this.sCadena = sCadena;
	}
	
	public String getsCadenaSolapados() {
		return sCadenaSolapados;
	}

	public void setsCadenaSolapados(String sCadenaSolapados) {
		this.sCadenaSolapados = sCadenaSolapados;
	}
	
	public int getCantidadVeces() {
		return cantidadVeces;
	}

	public void setCantidadVeces(int x) {
		this.cantidadVeces = x;
	}
	

	public int getCantidadVecesSolapado() {
		return cantidadVecesSolapado;
	}

	public void setCantidadVecesSolapado(int x) {
		this.cantidadVecesSolapado = x;
	}


	public  void hallarGenes(String aB){
		for(int i=0;i<aB.length();i++){
			cantidadEstrellas +=  '*';
		}
		sCadena = sCadena.replaceAll(aB, cantidadEstrellas);
	}
	
	public  void contadorPattern(){
		int cont=0;
		char[] sCadena_chars = sCadena.toCharArray();
		for(int i=0;i<sCadena_chars.length;i++) {
			if(sCadena_chars[i]=='*') {
				cont++;
			}
		}
		cantidadVeces=cont/cantidadEstrellas.length();
		
	}
	
	public  void hallarGenesSolapados(String aB){
		String a_solapar = aB.substring(1, aB.length());
		String genes_solapados = aB+a_solapar;
		for(int i=0;i<aB.length()-1;i++){
			cantidadNumeral +=  '#';
		}
		String salida=cantidadEstrellas+cantidadNumeral;
		sCadenaSolapados = sCadenaSolapados.replaceAll(genes_solapados, salida);	

		int cont=0;
		char[] sCadena_chars = sCadenaSolapados.toCharArray();
		for(int i=0;i<sCadena_chars.length;i++) {
			if(sCadena_chars[i]=='*'||sCadena_chars[i]=='#') {
				cont++;
			}
		}
		cantidadVecesSolapado=cont/salida.length();
	}
	
}
