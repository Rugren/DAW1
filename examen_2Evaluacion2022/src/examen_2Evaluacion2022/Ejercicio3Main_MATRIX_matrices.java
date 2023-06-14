package examen_2Evaluacion2022;

import java.util.Arrays;

public class Ejercicio3Main_MATRIX_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = new int[4][4];
		// CREA 4 FILAS Y 4 COLUMNAS
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				
				if(j==1)
					matrix[i][j] = 1;
			}
		}

		for (int i = 0; i < matrix.length; i++)
		System.out.println(Arrays.toString(matrix[i]));
		System.out.println("Fin matrix__________________________________________\n");
	
	
	
	int [][] matrix2 = new int[4][4];
	for (int i = 0; i < matrix2.length; i++) {
		for (int j = 0; j < matrix2.length; j++) {
			
			if(j==0)
				matrix2[i][j] = 1;
		}
	}

	for (int i = 0; i < matrix2.length; i++)
	System.out.println(Arrays.toString(matrix2[i]));
	System.out.println("Fin matrix2__________________________________________\n");

	
	
	int [][] matrix3 = new int[4][4];
	for (int i = 0; i < matrix3.length; i++) {
		for (int j = 0; j < matrix3.length; j++) {
			
			if(i==0)
				matrix3[i][j] = 1;
		}
	}

	for (int i = 0; i < matrix3.length; i++)
	System.out.println(Arrays.toString(matrix3[i]));
	System.out.println("Fin matrix3__________________________________________\n");
	
	
	
	int [][] matrix4 = new int[4][4];
	for (int i = 0; i < matrix4.length; i++) {
		for (int j = 0; j < matrix4.length; j++) {
		if (i == j) 
				matrix4[i][j] = 1;
		}
	}
	
	for (int j = 0; j < matrix4.length; j++)
	System.out.println(Arrays.toString(matrix4[j]));
	System.out.println("Fin matrix4__________________________________________\n");

	
	int [][] matrix5 = new int[3][5];
	for (int i = 0; i < matrix5.length; i++) {
		for (int j = 0; j < matrix5.length; j++) {
			
			if(i==0)
				matrix5[i][j] = 1;
		}
	}

	for (int i = 0; i < matrix5.length; i++)
	System.out.println(Arrays.toString(matrix5[i]));
	System.out.println("Fin matrix5__________________________________________\n");
	
	
	
	int [][] matrix6 = new int[2][10];
	// CREA 2 FILAS Y 10 COLUMNAS
	for (int i = 0; i < matrix6.length; i++) {
		for (int j = 0; j < matrix6.length; j++) {
			
			if(i==0)
				matrix6[i][j] = 1;
		}
	}

	for (int i = 0; i < matrix6.length; i++)
	System.out.println(Arrays.toString(matrix6[i]));
	System.out.println("Fin matrix6__________________________________________\n");
	
	
	
	// EJERCICIO TARTA, crear una tarta que sea:
	/*
[0, 0, 0, 0]
[0, 1, 1, 0]
[0, 1, 1, 0]
[0, 0, 0, 0]

	 */
	int [][] matrix7 = new int[4][4];
	for (int i = 0; i < matrix7.length; i++) {
		for (int j = 0; j < matrix7.length; j++) {
			
			if(i !=0 && j != 3 && j !=0 && j !=3)
				matrix7[i][j] = 7;
			// ?? la idea es que se queden los 4 sietes del centro. HAY QUE QUITAR LOS 2 sietes de la ultima fila.
			
			
//			if(i !=0 && j != 2 && j !=0 && j !=2)
//				matrix7[i][j] = 6;
		}
	}

	for (int i = 0; i < matrix7.length; i++)
	System.out.println(Arrays.toString(matrix7[i]));
	System.out.println("Fin matrix7__________________________________________\n");

	
	// ELIGE TODAS menos la primera, que sea distinto de 0
	int [][] matrix8 = new int[4][4];
	for (int i = 0; i < matrix8.length; i++) {
		for (int j = 0; j < matrix8.length; j++) {
			
			if(i !=0)
				matrix8[i][j] = 1;
		}
	}

	for (int i = 0; i < matrix8.length; i++)
	System.out.println(Arrays.toString(matrix8[i]));
	System.out.println("Fin matrix8__________________________________________\n");
	
	
	
	char [][] matrix9 = new char[5][6];
	for (int i = 0; i < matrix9.length; i++) {
		for (int j = 0; j < matrix9.length; j++) {
			
			if(i !=0)
				matrix9[i][j] = 'o';
		}
	}
	for (int i = 0; i < matrix9.length; i++) {
		for (int j = 0; j < matrix9.length; j++) {
			
			if(i+j==4 && j != 3) // CON EL "j != 3" he quitado la posicion 4(0,1,2,3)
				matrix9[i][j] = 'x';
		}
	}

	for (int i = 0; i < matrix9.length; i++)
	System.out.println(Arrays.toString(matrix9[i]));
	System.out.println("Fin matrix9__________________________________________\n");
	
	
}

}


