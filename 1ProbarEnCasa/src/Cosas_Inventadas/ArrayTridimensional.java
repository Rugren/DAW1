package Cosas_Inventadas;

public class ArrayTridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Crear un array tridimensional de tamaño 2x3x4
		int[][][] arr = new int[2][5][4]; // cambie el 5 por un 3, en todos lados (en los 2 siguientes for de j tambien)

		// el i que es 2, hace que nos de 2 paquetes de arrays ( si el 2 lo sustituimos por 3 en arr, y en los 2 for de abajo, nos mostrara 3 arrays completos).
		// la j que es 5, hace que nos de 5 numeros en vertical
		// la k que es 4, hace que nos de 4 numeros en horizontal

		
		
		// Llenar el array con valores
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 5; j++) {
		        for (int k = 0; k < 4; k++) {
		            arr[i][j][k] = i + j + k;
		        }
		    }
		}

		// Imprimir el contenido del array
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 5; j++) {
		        for (int k = 0; k < 4; k++) {
		            System.out.print(arr[i][j][k] + " ");
		        }
		        System.out.println();
		    }
		    System.out.println();
		}
	}

}
