package Objetos;

public class Cuadrado {
	private int longitudLado;
	private Punto miPunto;

	public Cuadrado(int longitud, Punto p) {
		this.longitudLado = longitud;
		this.miPunto = p;
	}
	
	public Cuadrado(int longitud, int x, int y) {
		this.longitudLado = longitud;
		Punto p = new Punto(x, y);
		this.miPunto = new Punto(x, y);
	}
	
	public Cuadrado(int longitud) {
		this.longitudLado = longitud;
		this.miPunto = new Punto(0,0);
	}
	
	

	public int getLongitudLado() {
		return this.longitudLado;
	}
	
	public Punto getMiPunto() {
		return this.miPunto;
	}
	
}
