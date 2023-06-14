package examen;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
		int[][] arrrayBidimensional = new int[3][4];
		
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 4; j++) {
		            System.out.print(arrrayBidimensional[i][j] + " ");
		        }
		        System.out.println();
		    }
		    System.out.println();
*/
		
		int [][] arrrayBidimensional = new int [3][4];
		Random numeroRandom = new Random();
		
		// Creacion de matriz 
		int [] elementoMayor = new int [arrrayBidimensional.length];
		int [] elementoMenor = new int [arrrayBidimensional.length];

		
		for (int i = 0; i < elementoMayor.length; i++) {
			elementoMayor[i] = -1;
		}
		
		System.out.println(Arrays.toString(elementoMayor));
		
		
		// Relleno de matriz
		for (int i = 0; i < arrrayBidimensional.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < arrrayBidimensional[i].length; j++) {
				arrrayBidimensional[i][j] = numeroRandom.nextInt(11); // que el random sea de 10, como pide el ejercicio
				System.out.print(arrrayBidimensional[i][j] + " ");
			}
		}
		
		// elemento mayor de todo el array
		for (int i = 0; i < arrrayBidimensional.length; i++) {
			 for (int j = 0; j < arrrayBidimensional[i].length; j++) {
				 if (arrrayBidimensional[i][j] > elementoMayor[i])
					 elementoMayor[i] = arrrayBidimensional[i][j];
			}
		}
		
		System.out.println("\n" + "Elemento mayor de todo el array: " + Arrays.toString(elementoMayor));

		
		
		// elemento menor de cada fila
		for (int i = 0; i < arrrayBidimensional.length; i++) {
			 for (int j = 0; j < arrrayBidimensional[i].length; j++) {
				 if (arrrayBidimensional[i][j] < elementoMenor[i])
				 elementoMenor[i] = arrrayBidimensional[i][j];
				 
// ir probando con otro for o if dentro, para crear igual que arriba el elementoMayor, ya que aqui dentro no lo reconoce
		//			 if (arrrayBidimensional[i][j] < elementoMenor[i] && arrrayBidimensional[i][j] > elementoMayor)
		//			 elementoMenor[i] = arrrayBidimensional[i][j];
				 // ? de cada fila sera quitando la i o la j ?? ir probando
			}
		}
		
	
		System.out.println("\n" + "Elemento menor: " + Arrays.toString(elementoMenor));

		
	}

}
