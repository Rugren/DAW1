package miercoles5;

import java.util.Random;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.next();
		
		System.out.println("Buenos d�as " + nombre);
		
		/* scanner.close(); (esto estaba en la l�nea 17, 
		estaba escrito al final de este primer apartado, 
		pero eliminado y puesto al final de todo, 
		ya que solo se puede poner uno porque da error
		*/
		
		Scanner scanner = new Scanner (System.in);
		int x, y;
		System.out.println("\nIntroduce dos n�meros: ");
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if (x >= y) {
			System.out.println("\nEl n�mero mayor es: " + x);
		}
		else
			System.out.println("\nEl n�mero mayor es: " + y);
		
		scanner.close();

		/* USO DE RANDOM
		hay que importar el Random (cuando salga el error, darle a importar al fallo que salga)
		el entre par�ntesis 21 y luego el -10 es para que nos d� un n�mero al azar entre el -10 y el 10 (el n� 0 tambi�n cuenta)
		*/
		
		Random miRandom = new Random();
		int numeroAleatorio = miRandom.nextInt(21) - 10;
		System.out.println("\nN�meroRandom al azar: " + numeroAleatorio);
		
		
			
		
		}
		
		
	}
	

		
		
		