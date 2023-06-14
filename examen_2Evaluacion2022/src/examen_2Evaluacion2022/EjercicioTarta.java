package examen_2Evaluacion2022;

public class EjercicioTarta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hecho similar Miguel Angel, ver teams 14/03/23.
		//un marco con otro marco dentro y un 7 en el centro
		System.out.println(); // println
		int[][] matrices = new int[7][7];
		for (int i = 0; i < matrices.length; i++) {
				System.out.println();
				for (int j = 0; j < matrices.length; j++) {
					if (i == 0 || j == 0 || i == matrices.length-1 || j == matrices.length-1) {
						matrices[i][j] = 1;
						}
					if ((i > 1) && (i < matrices.length-2) && (j > 1) && (j < matrices.length-2)) {
						matrices[i][j] = 1;
						}
					if((matrices.length-1)/2 == i && (matrices.length-1)/2 == j){
							matrices[i][j] = 7; // PARA PONER EL 7 EN EL CENTRO
							}
					System.out.print(" " + matrices[i][j]); // print
				}
		}
	}
}