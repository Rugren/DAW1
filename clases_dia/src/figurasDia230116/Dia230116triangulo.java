package figurasDia230116;

import Objetos.Punto;

public class Dia230116triangulo extends Dia230116Figura {
	
	public static final String COLOR = "Rojo"; 
	// COLOR en mayusculas es una constante.
	
	private String color;
	// el "color" en minuscula es un atributo.
	public Dia230116triangulo(String color, Punto posicion) {
		super();
		this.color = color;
	}
	
		public String getColor() {
		return color;
	}
		
	
}
