package figuras;

import Objetos.Punto;

public class FigurasPunto {
	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
	}*/

	/* Cosas que puede hacer Punto:
	 atributos;
	 x : int
	 y : int
	 color : Color (es de la clase enum Color; ROJO, VERDE, AZUL.)
	 nombre: String
	 
	 Métodos:
	 desplazar:
	 cambiaColor
	 multiplicarEsc.

	 */
	
	//ATRIBUTOS:
	private int x;
	
	private int y;
	
	private Color color;
	
	private String nombre;
	
	
	private static int contadorPuntos;
	// al poner static pertenecerá a la clase. 
	// Si no ponemos static pertenecerá a p1, p2, p3,...
	
	
	// MÉTODOS:
	// visibilidad + nombre clase + lista parámetros (separados por comas) + {}
	public FigurasPunto (int paramX, int paramY, Color paramColor, String paramNombre){
		this.x = paramX;
		this.y = paramY;
		this.color = paramColor;
		this.nombre = paramNombre;
	}
	
	public FigurasPunto (Color paramColor, String paramNombre) {
		
	}
	
	//
	
	public void moverAPunto(FigurasPunto p){
		this.x = p.x;
		this.y = p.y;
	}

	//
	
	public FigurasPunto(int pX, int pY){
		contadorPuntos++;
		this.x = pX;
		this.y = pY;
	}
	
	
}
