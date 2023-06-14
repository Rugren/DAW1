package UT5_Arrays1;

import java.util.Random;
import java.util.Scanner;

public class Clase4 {
	
	/* EJERCICIO 4
	Crea un array de numeros de un tamano pasado por teclado, el array contendra numeros
	aleatorios entre 1 y 300 y mostrar aquellos numeros que acaben en un digito que nosotros le
	indiquemos por teclado (debes controlar que se introduce un numero correcto), estos deben
	guardarse en un nuevo array. Por ejemplo, en un array de 10 posiciones e indicamos mostrar
	los numeros acabados en 5, podria salir 155, 25, etc.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.print("Introduce el tamano del array: ");
		int tamanoArray = sc.nextInt();

		int[] numeros = new int[tamanoArray];
		// numeros: son todos los numeros del Array del tamanoArray.
		int[] numerosFiltrados;
		int digito;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(300) + 1; 
			// Los 300 numeros aleatorios, recordar siempre el +1(ver linea anterior) para que cuente tambien el 300.
		}

		System.out.print("Introduce el digito a filtrar (0-9): ");
		digito = sc.nextInt();

		while (digito < 0 || digito > 9) { 
			// Este es el array de 10 posiciones, el 0 cuenta como posicion 1 y el 9 como posicion 9. Como el 0 tambien se cuenta, son 10 posiciones.
			System.out.print("Digito incorrecto. Introduce el digito a filtrar (0-9): ");
			digito = sc.nextInt();
		}

		numerosFiltrados = filtrarNumeros(numeros, digito);

		System.out.println("Numeros random que terminan en " + digito + ":");
		for (int i = 0; i < numerosFiltrados.length; i++) {
			System.out.println(numerosFiltrados[i]);
			
			//
			
		}
		
		System.out.println("Cantidad de numeros que han salido aleatoriamente [" + numerosFiltrados.length + "]" + " que terminen en nuestro digito(" + digito + ")" + " escogido.");

	}

	public static int[] filtrarNumeros(int[] numeros, int digito) {
		int[] numerosFiltrados = new int[numeros.length];
		int contador = 0;

		for (int i = 0; i < numeros.length; i++) {
			int ultimoDigito = numeros[i] % 10;

			if (ultimoDigito == digito) {
				numerosFiltrados[contador] = numeros[i];
				contador++;
			}
		}

		int[] resultado = new int[contador];
		for (int i = 0; i < contador; i++) {
			resultado[i] = numerosFiltrados[i];
		}

		return resultado;
	}


}
