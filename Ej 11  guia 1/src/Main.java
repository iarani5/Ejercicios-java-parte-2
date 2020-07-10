import javax.swing.JOptionPane;

//de la practica 2 el ej 3 (dvd)
//guia practicas completas ej 11 (pag 5)


public class Main {

	public static void main(String[] args) {
		
		//a
		System.out.print("\nA)");		
		Gen listado_genes = new Gen();
		String estos_genes = String.format(JOptionPane.showInputDialog("\nPattern: "));
		System.out.print("\n\nPattern: ["+estos_genes+"]");

		System.out.print("\n\n[....."+listado_genes.getsCadena()+".....]");		
		listado_genes.hallarGenes(estos_genes);
		listado_genes.contadorPattern();
		System.out.print("\n\nNº de patrones: "+listado_genes.getCantidadVeces());
		System.out.print("\n\n[....."+listado_genes.getsCadena()+".....]\n");	
		
		//b
		System.out.print("\nB)\n");		
		System.out.print("\n[....."+listado_genes.getsCadenaSolapados()+".....]");		
		//System.out.print("\nPattern: ["+estos_genes+"]");
		listado_genes.hallarGenesSolapados(estos_genes);
		System.out.print("\n\nNº de patrones: "+listado_genes.getCantidadVecesSolapado());
		System.out.print("\n\n[....."+listado_genes.getsCadenaSolapados()+".....]");
	}

}
