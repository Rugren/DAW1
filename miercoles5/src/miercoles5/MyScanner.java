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
		
		System.out.println("Buenos días " + nombre);
		
		/* scanner.close(); (esto estaba en la línea 17, 
		estaba escrito al final de este primer apartado, 
		pero eliminado y puesto al final de todo, 
		ya que solo se puede poner uno porque da error
		*/
		
		Scanner scanner = new Scanner (System.in);
		int x, y;
		System.out.println("\nIntroduce dos números: ");
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if (x >= y) {
			System.out.println("\nEl número mayor es: " + x);
		}
		else
			System.out.println("\nEl número mayor es: " + y);
		
		scanner.close();

		/* USO DE RANDOM
		hay que importar el Random (cuando salga el error, darle a importar al fallo que salga)
		el entre paréntesis 21 y luego el -10 es para que nos dé un número al azar entre el -10 y el 10 (el nº 0 también cuenta)
		*/
		
		Random miRandom = new Random();
		int numeroAleatorio = miRandom.nextInt(21) - 10;
		System.out.println("\nNúmeroRandom al azar: " + numeroAleatorio);
		
		
			
		
		}
		
		
	}
	

		
		
		