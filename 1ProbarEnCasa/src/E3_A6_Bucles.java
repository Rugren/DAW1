import java.util.Scanner;

public class E3_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 3 A6_Bucles
		// Pide al usuario por teclado que introduzca dos números, imprime todos los números entre ambos (imprimiendo ambos también). Haz este proceso usando un bucle que pida números hasta que alguno de los dos sea –1.

		System.out.println("Introduzca 2 numeros para comprobar todos los que hay entre ambos (Escribe -1 para finalizar el programa)");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		System.out.println("Tu primer numero es: " + num1);
		
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc1.nextInt();
		System.out.println("Tu segundo numero es: " + num2);

		
		for (num1 = num1; num1 < num2; num1++) {
			// el num2+1 es para que si pongo 10 me coga 10, en lugar de 9. Si no pongo el +1 coge un numero menos que el elegido.
			// pero, como abajo a num2 le hemos restado -1 (num2-1) al bucle, luego da bien, porque entra y sale no?

			System.out.println("Empezamos a contar desde el primer numero menor hasta el numero mayor: " + num1);

			if (num1 == -1)
				break;
		}

		for (num2 = num2; num1 > num2-1; num2++) {

			System.out.println("Empezamos a contar desde el segundo numero menor hasta el numero mayor: " + num2);
		}
		
		
		// ¿Como hacer que corte en el segundo?, porque he probado con:
		// 		if (num2 == -1) System.out.println();
		//		break;
		// pero no sale metiendolo tanto dentro como fuera de los { }, corta el segundo numero, el num2.

		
		
		//--- poner i++ hasta que esa sumatoria del num1 coincida, es decir, sea = al num 2, para que muestre hasta ahí ¿y corte con un break?


		
/*		
		int numeroMinimo = 0; // Como el ejercicio corta en -1, al poner 0 es el límite p.ejemplo, que no se nos salga del bucle.		
		int numeroMaximo = 1000; // para que no ponga más de 1000 numeros y no imprima gran cantidad de numeros entre ambos.
		
		int numero = 0;
		
		while (true) {
			numero = sc1.nextInt();
			numero = sc2.nextInt();
			
			if (numero == -1)
				break;
			
			else if (numeroMinimo <= numeroMaximo)
				numeroMinimo = numero;
			}
			
	*/

		
	}

}
