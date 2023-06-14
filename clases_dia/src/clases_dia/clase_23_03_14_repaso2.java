package clases_dia;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class clase_23_03_14_repaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Arrays con recorrido For y LinkedList
		// EJERCICIO INVENTADO 2 array, que compruebe mayor que.
		
		
		int [][] miArray = new int [10][10];
		LinkedList<Integer> menorAMayor = new LinkedList<>();
		// LinkedList<array> para meter array en vez de un Integer: un entero.
		boolean esMenorMayor = true;
		
		Random rnd = new Random();
		for (int i = 0; i < miArray.length; i++) {
			for (int j = 0; j < miArray[0].length; j++) {
				miArray[i][j] = rnd.nextInt(10)+1; // que coja 10, por eso el 10+1.
			}
		}
		
		int numero;
		
		for (int i = 0; i < miArray.length; i++) {
			numero = miArray[i][0]; // ponemos el 0 porque todavia no tenemos la j definida.
			esMenorMayor = true;
			for (int j = 0; i < miArray[0].length; j++) {
				if (j > 0 && miArray[i][j] <= numero ) { // ponemos la j delante para que si es 0 que no siga comprobando y ahorrar memoria.
					esMenorMayor = false;
				// if (!esMenorMayor)
					break;
				}
				numero = miArray[i][j]; // si no se ha hecho un break lo compara con el siguiente
			}
			if (esMenorMayor)
				menorAMayor.add(i); // anadimos la fila, la i
		}
		
		
		System.out.println(Arrays.toString(miArray)); // asi da mal
		System.out.println(Arrays.deepToString(miArray)); // asi con el deepToString va bien+++
		
		
		
	}

}
