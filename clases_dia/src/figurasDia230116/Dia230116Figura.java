package figurasDia230116;

import Objetos.Punto;

public abstract class Dia230116Figura {

	private Punto posicion;
	private String nombre;
	
	public Dia230116Figura() {
		this.posicion = new Punto(0,0);
	}
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	public Dia230116Figura(Punto posicion) {
		this.
	}

	public Dia230116Figura() {
		this.posicion = new Punto(0, 0);
		this.nombre = "figura";
	}
	
	public void imprimirNombre() {
		System.out.println(super.getNombre());
		
	}
}
