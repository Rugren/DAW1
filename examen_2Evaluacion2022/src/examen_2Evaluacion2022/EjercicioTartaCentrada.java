package examen_2Evaluacion2022;

import java.util.Arrays;

public class EjercicioTartaCentrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] matrix10 = new int[4][4];
		for (int i = 0; i < matrix10.length; i++) {
			for (int j = 0; j < matrix10.length; j++) {
				if (i == j) {
					matrix10[i][j] = 1;
				}
			}
			for (int j = 0; j < matrix10.length; j++) {
				System.out.println(Arrays.toString(matrix10[i]));
			}
		
			System.out.println("Fin matrix10__________________________________________"); // era la matrix4 en ej. como lo tenia manu del que le pase.
			//si borro este se va a la porra el matrix11 y matrix12
			
		// El de los arrays en el centro
		int[][] matrix11 = new int[4][4];
		for (i = 0; i < matrix11.length; i++) {
			for (int j = 0; j < matrix11.length; j++) {
				if (i != 0 && i != 3 && j != 0 && j != 3) // si aqui pongo { ya no salen los 2 unos centrados
					matrix11[i][j] = 1;
				}
			}
			for (i = 0; i < matrix11.length; i++) {
				System.out.println(Arrays.toString(matrix11[i]));
			}
			
			System.out.println("Fin matrix11__________________________________________"); // era la matrix6 en ej. como lo tenia manu del que le pase.
			
			
			char[][] matrix12 = new char[6][6];
			for (i = 0; i < matrix12.length; i++) {
				for (int j = 0; j < matrix12.length; j++) {
					matrix12[i][j] = 'o';
				}
			}
			for (i = 0; i < matrix12.length; i++) {
				for (int j = 0; j < matrix12.length; j++) {
					if (i == matrix12.length / 2 - 1 && j == matrix12.length / 2
							|| j == matrix12.length / 2 - 1 && i == matrix12.length / 2)
						matrix12[i][j] = 'x';
					if (i == 5 || i == 0 && j == 5 || j == 0)
						matrix12[i][j] = 'x';
				}
			}
			for (i = 0; i < matrix12.length; i++) {
				System.out.println(Arrays.toString(matrix12[i]));
			}
			System.out.println("Fin matrix12__________________________________________"); // era la matrix7 en ej. como lo tenia manu del que le pase.
		}


	}

}
