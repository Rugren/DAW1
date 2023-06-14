package UT5_Arrays1;

import java.util.Arrays;

public class Clase6 {

	/* EJERCICIO 6
	Dado un array de numeros de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los
	valores de este array en otro array distinto pero con los valores invertidos, es decir, que el
	segundo array debera tener los valores {5,4,3,2,1}.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOriginal = {1, 2, 3, 4, 5};
		int[] arrayInvertido = new int[arrayOriginal.length];

		for (int i = arrayOriginal.length - 1, j = 0; i >= 0; i--, j++) {
			arrayInvertido[j] = arrayOriginal[i];
		}

		System.out.println("Array original: " + Arrays.toString(arrayOriginal));
		System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));

	}
	
}
