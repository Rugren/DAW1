package clases_dia;

import java.util.Scanner;

public class A7_ActividadClase_E2_conWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 2 (clase d�a 15/11/22)
//		Pide al usuario por teclado que introduzca dos n�meros, imprime todos los
//		n�meros entre ambos (imprimiendo ambos tambi�n). Haz este proceso usando
//		un bucle que pida n�meros hasta que alguno de los dos sea �1.

		
		// Hecho con While. Est� bien. Acaba cuando ponemos -1 y -1.
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		while(x !=-1 && y != -1){
			System.out.println("Introduce dos numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
		if (x !=-1 || y != -1) {
			int mayor;
			int menor;
			
			if (x >= y) {
				mayor = x;
				menor = y;
		}
		else {
			mayor = y;
			menor = x;
		}

		for (int num = menor; num <= mayor; num++) {
			System.out.println(num);
		}
		}
		}
				
				
				
			}

		}
