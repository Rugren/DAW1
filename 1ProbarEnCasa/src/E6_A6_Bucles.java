import java.util.Random;
import java.util.Scanner;

public class E6_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 6 - E6_A6_Bucles
		
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		
		Random numeroAAcertar = new Random ();
		
		int numAleatorio = numeroAAcertar.nextInt(101);
		int contador = 0;
		
		boolean acertaste = true;
		// abajo hecho sin el boolean acertaste y puesto directamente el while (true), pero con el while(true) está peor.
		
		while (acertaste) {
			
			contador++; // puesto el contador al principio porque si lo pongo al final del while me cuenta una menos.

			int numUsuario = sc.nextInt();
			
			if (numUsuario > numAleatorio) {
				System.out.println("El numero a acertar es menor");
			}
			
			else if (numUsuario < numAleatorio) {
				System.out.println("El numero a acertar es mayor");
			}
			
			else if (numUsuario == numAleatorio) {
				System.out.println("�Has acertado el numero!");
			break;
			}
			
		}
		
		System.out.println("Has ganado en el siguiente numero de intentos: " + contador);
		
		
	}

}


		
/* 
		 ESTABA HECHO CON EL while (true) Y ASI no se debe hacer, mejor como hemos hecho al principio, con: " boolean acertaste = true; while (acertaste) "

 		// Ejercicio 6 - E6_A6_Bucles
		
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		
		Random numeroAAcertar = new Random ();
		
		int numAleatorio = numeroAAcertar.nextInt(101);
		int contador = 0;
				
		while (true) {
			
			contador++; // puesto el contador al principio porque si lo pongo al final del while me cuenta una menos.

			int numUsuario = sc.nextInt();
			
			if (numUsuario > numAleatorio) {
				System.out.println("El numero a acertar es menor");
			}
			
			else if (numUsuario < numAleatorio) {
				System.out.println("El numero a acertar es mayor");
			}
			
			else if (numUsuario == numAleatorio) {
				System.out.println("�Has acertado el numero!");
			break;
			}
			
		}
		
		System.out.println("Has ganado en el siguiente numero de intentos: " + contador);
		
		
	}

}
*/
