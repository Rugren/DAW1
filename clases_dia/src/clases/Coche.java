package clases;

// esto es del ejercicio o clase clase_22_11_29_Clases_instancia

// public static void main(String[] args) {
	// TODO Auto-generated method stub

//}

//}

public class Coche {
	
	//Atributos
	private int velocidadActual;
	public final int velocidadMaxima = 250; 
	private static int contadorCoches = 0;
	private String modelo;
	// private float peso;
	private Color color;
	private int marcha; 
	
	// Contructor 

//	public Coche(int velocidad, String modelo, float peso) {
//		this.velocidad = velocidad; this.modelo = modelo; this.peso = peso;

	public Coche(String paramModelo, Color paramColor) {
		this.modelo = paramModelo;
		this.velocidadActual = 0;
		this.marcha = 0;
		this.color = paramColor;
		contadorCoches++;
		}

		
		public String getModelo() {
			return modelo;
		}
		
		public static int getContadorCoches() {
			return contadorCoches;
		}
		
		public final int getVelocidadMaxima() {
			return velocidadMaxima;
		}
		
		
		public void setModelo(String nuevoModelo) {
			this.modelo = nuevoModelo;
		}

		public void acelerar(int aceleracion) {
			this.velocidadActual = this.velocidadActual + aceleracion;
			// es lo mismo que: this.velocidadActual += aceleracion;
			
			if (this.velocidadActual >= velocidadMaxima)
				this.velocidadActual = velocidadMaxima;
		}

		public void acelerar2(int aceleracion) {
			if (this.velocidadActual + aceleracion >= velocidadMaxima)
				this.velocidadActual = velocidadMaxima;
			else
				this.velocidadActual = this.velocidadActual + aceleracion;
		}
	
		
		
		
		
	}


