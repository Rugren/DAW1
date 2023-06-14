package Cosas_Inventadas;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crer un bucle for que recorra un array en java
		
		
		// Manera de hacerlo sencilla
		// Supongamos que tenemos un array llamado "numeros" con los siguientes valores:
/*		
		int[] numeros = {1, 2, 3, 4, 5};
		
		// Para recorrer este array utilizando un bucle for en Java, podemos hacer lo siguiente:
		for(int i = 0; i < numeros.length; i++){
		    System.out.println(numeros[i]);
		}

		// Este bucle for utilizará una variable "i" para recorrer el array. 
		// La variable "i" se inicializa en 0, y el bucle se ejecutará mientras "i" sea menor que... 
		// ... la longitud del array "numeros". 
		// En cada iteración del bucle, se imprimirá el valor del elemento..
		// ... en la posición "i" del array utilizando la sintaxis "numeros[i]".


*/
		// para meter los números en una lista en Java, podemos utilizar la clase ArrayList. 
		// cómo crear una lista, recorrer el array y añadir los elementos a la lista:
		int[] numeros = {1, 2, 3, 4, 5};
        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            listaNumeros.add(numeros[i]);
        }

        // Imprimir la lista
        System.out.println(listaNumeros);
    
        // En este ejemplo, hemos creado una instancia de la clase ArrayList llamada "listaNumeros". 
        // Dentro del bucle for, hemos utilizado el método "add()" de la lista para añadir cada...
        // ... elemento del array "numeros" a la lista.
        // Finalmente, hemos impreso la lista utilizando el método "println()"...
        // ... de la clase System. La salida del programa sería:

	}

}
