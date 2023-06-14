package Objetos;

import clases.Coche;
import clases.Color;

public class Main {
	
	public static void main(String[] args) {
		Punto p1 = new Punto(1, 2); 
		Punto p2 = new Punto(3, 1); 
		Punto p3 = new Punto(2, 2); 
		
		Cuadrado c1 = new Cuadrado(10, p1);
		//c1.getMiPunto();
		System.out.println(c1.getMiPunto());
		Punto p4 = c1.getMiPunto();
		
		
		//
		Coche coche1 = new Coche("Berlina", Color.ROJO_PASION);
		System.out.println(coche1.getVelocidadMaxima());
		
		Coche coche2 = new Coche("Turismo", Color.GRIS);
		System.out.println(coche2.getModelo());
		//
		
		
		
		// constructor nuevo
//por editar		Cuadrado c1 = new Cuadrado(10, p1);
//por editar		Cuadrado c2 = new Cuadrado(10, p1);
	
	
	
/*	esto es del arhivo "Punto.java"
 * 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto punto = new Punto(10, 16); 
						//el primer 10 es paramX y el siguiente 16 es paramY.
		System.out.println("Posicion inicial: ");
		System.out.println(punto.getX());
		System.out.println(punto.getY());
		
		System.out.println("Nueva posicion: ");
		punto.cambiaPosicion();
		System.out.println(punto.getX());
		System.out.println(punto.getY());
*/
	
	}

}
