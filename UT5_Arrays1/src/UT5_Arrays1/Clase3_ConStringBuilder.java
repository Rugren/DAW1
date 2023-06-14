package UT5_Arrays1;

import java.util.Scanner;

public class Clase3_ConStringBuilder {

	// +++ (pero con StringBuilder y .append que no hemos visto)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] letras = new char[26];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = (char) ('A' + i);
		}

		Scanner sc = new Scanner(System.in);
		StringBuilder cadena = new StringBuilder();
		int posicion;
		do {
			System.out.print("Introduzca una posicion del array (Escibe -1 para finalizar): ");
			posicion = sc.nextInt();
			if (posicion >= 0 && posicion < letras.length) {
				cadena.append(letras[posicion]);
			} else if (posicion != -1) {
				System.out.println("ERROR: Posicion incorrecta, inserte otro numero.");
			}
		} while (posicion != -1);

		System.out.println("Cadena resultante de tus posiciones elegidas: " + cadena);
	} 

}
