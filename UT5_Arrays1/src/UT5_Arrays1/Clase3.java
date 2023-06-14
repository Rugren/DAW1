package UT5_Arrays1;

import java.util.Scanner;

public class Clase3 {
	
	/* EJERCICIO 3
	Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayusculas). Despues, ve
	pidiendo posiciones del array por teclado y si la posicion existe en el array, el valor se anadira
	a una cadena que se mostrara al final, se dejara de insertar cuando se introduzca un -1.
	Por ejemplo, si escribo los siguientes numeros
	- 0 //Anadira la ‘A’
	- 5 //Anadira la ‘F’
	- 25 //Anadira la ‘Z’
	- 50 //Error, inserte otro numero
	- -1 //fin
	Cadena resultante: AFZ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] letras = new char[26]; 	
//1.1 Son 25 letras del abecedario, pero dejar 26,
//1.2 porque el 25 hace referencia a la Z, siendo 0 la A. (No empieza en el 1).
		for (int i = 0; i < letras.length; i++) {
			letras[i] = (char) ('A' + i);
		}

		Scanner sc = new Scanner(System.in);
		String cadena = "";
		int posicion;
		do {
			System.out.print("Introduzca una posicion del array (Escibe -1 para finalizar): ");
			posicion = sc.nextInt();
			if (posicion >= 0 && posicion < letras.length) {
// 2.1				cadena = cadena + letras[posicion];
// 2.2		La linea anterior es lo mismo que la linea siguiente (el sumatorio):			
 				cadena += letras[posicion];
			} else if (posicion != -1) {
				System.out.println("ERROR: Posicion incorrecta, inserte otro numero.");
			}
		} while (posicion != -1);

		System.out.println("Cadena resultante de tus posiciones elegidas: " + cadena);
	}

}

