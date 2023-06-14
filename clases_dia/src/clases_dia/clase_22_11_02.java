package clases_dia;


import java.util.Scanner;

public class clase_22_11_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PUNTOS CARDINALES (como ejercicio 2 de "A4_CondicionalesI")
		
		/*
		String puntoCardinal = "Sur";
		String puntoCardinal2 = "Sur";		
		
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		puntoCardinal.equals(entrada);
		System.out.println(puntoCardinal.equals(entrada));
		
		//1.1 como Sur y Sur son iguales me devuelve true, 
		//1.2 si pongo ! delante de "puntoCardinal.equals(entrada)", 
		//1.3 quedandose as�: "!puntoCardinal.equals(entrada)" negar�a y dar�a lo contrario
		
		
		// System.out.println(puntoCardinal == entrada);
		// System.out.println(puntoCardinal == puntoCardinal2);
		
		sc.close();
		
		*/
		
		/* puesto como comentario porque para ejecutar hay que escribir lo de norte, sur...) 
		 * 
		System.out.println("Introduce un punto cardinal: [Norte, Sur, Este, Oeste]");
		Scanner sc = new Scanner(System.in);
		
		// mi entrada es lo que yo leo por el esc�ner en min�scula		
		String entrada = sc.nextLine().toLowerCase();
		// 1.0 entrada = entrada.toLoweCase(); 
		// 1.1 que permite que nos lea a min�scula y no de error al usuario 
		
		String salida;
		
		switch (entrada){
			case "norte":
				salida = "Sur";
				break;
			case "sur":
				salida = "Norte";
				break;
			case "este":
				salida = "Oeste";
				break;
			case "oeste":
				salida = "Este";
				break;
			default:
				salida = "ERROR";
				break;
		
		}
		System.out.println(salida);
		// si escribo "Sur" con la primera en may�cula nos dar� error.

		*/
		
		
		
		
		
		
		
		// Bucles controlados por Contador: BUCLE FOR
		
		//Bucle for ejemplo 1 (PRIMERA MANERA de hacer, con el while)
		int sumaPares = 0;
		int indice = 20;
		while(indice <=50) { //como indice es menor de 50, entra.
			if (indice % 2 == 0) // esto es que ser�a par
				sumaPares = sumaPares + indice; // como se cumple coge sumaPares (0) + indice (20).
			indice++;
		}
		System.out.println(sumaPares);
		// si pongo el syso fuera de las comillas {, }, nos dar� el n�mero final 
		
		
		//Bucle for ejemplo 1 (SEGUNDA MANERA de hacer, con el for)
		
		/* probando:
		 * for (int i = 20; i <= 50; i++) { //cuando llegue a 50 para)
			if (i %2 == 0); //como vamos a poner que busque un n� par, cuando encuentre el primer par se parar�)
			int numPares = 0; // queremos sumar los n� pares del 20 al 50, en plan, que sume 20 + 22 + 24.
			
			System.out.println(i);
		}
		*/
		
		
		int sumaPares2 = 0;
		
		for(int indice2 = 20; indice2 <= 50; indice2++) {
			if (indice2 % 2 == 0) {
				sumaPares2 = sumaPares2 + indice2;
				// sumaPares2 += indice2; (esta l�nea es la misma que la 102, que la l�nea anterior) 
			
				// System.out.println(sumaPares2);
				// si pongo aqu� el syso me dar� 20, 42 (20 + 22), 66 (42 + 24), etc.				

			}
		}
				System.out.println(sumaPares2);
				// si pongo el syso fuera de las comillas {, }, nos dar� el n�mero final 

		
		
	}

}
