package clases_dia;

import java.util.Arrays;
import java.util.Random;

public class clase_23_03_14_repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays con recorrido For y LinkedList
		// EJERCICIO INVENTADO 1 array, que compruebe si un numero es par.
		
		int [][] miArray = new int [3][3];
		Random rnd = new Random();
		
		// Creacion de matriz solucion
		int [] mayoresPares = new int [miArray.length];
		for (int i = 0; i < mayoresPares.length; i++) {
			mayoresPares[i] = -1;
		}
		
		System.out.println(Arrays.toString(mayoresPares));
		
		// Relleno de matriz
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < miArray[i].length; j++) {
				miArray[i][j] = rnd.nextInt(11);
				System.out.print(miArray[i][j] + " ");
			}
		}
		
		// Valor par mayor de cada fila
		// mayoresPares[0] = numero par mayor de la fila 0
		// mayoresPares[1] = numero par mayor de la fila 1
		// mayoresPares[2] = numero par mayor de la fila 2
		// mayoresPares[i] = numero par mayor de la fila i
		
		for (int i = 0; i < miArray.length; i++) {
			 for (int j = 0; j < miArray[i].length; j++) {
				 if (miArray[i][j] > mayoresPares[i] && miArray[i][j] % 2 == 0)
					 mayoresPares[i] = miArray[i][j];
			}
		}
		
		System.out.println("\n" + Arrays.toString(mayoresPares));

		
	}

}
