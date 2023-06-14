package UT5_Arrays1;

import java.util.Scanner;

public class Clase2 {

	
	/* EJERCICIO 2
	Crea un array de 10 posiciones de numeros con valores pedidos por teclado. Muestra por
	consola el indice y el valor al que corresponde. Haz dos metodos:
	- El primero rellenara el array pidiendo que se inserten los valores por teclado.
	- El segundo metodo mostrara por consola el indice y el valor que corresponde
	*/

	    public static void main(String[] args) {
	        int[] array = new int[3];
	        pedirValores(array);
	        mostrarValores(array);
	    }

	    public static void pedirValores(int[] array) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Introduce el valor para la posicion " + i + ": ");
	            array[i] = scanner.nextInt();
	        }
	    }

	    public static void mostrarValores(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Valor en la posicion " + i + ": " + "[" + array[i] + "]");
	        }
	    }

}
