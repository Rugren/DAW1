import java.util.Scanner;

public class Examen_primera_evaluacion_A_EditadoEnCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Introduce: 1-Calcular el numero de vocales, 2-Calcular el numero de consonantes, 3-Calcular el numero de mayusculas, 4-Mostrar texto en mayusculas, 5-finalizar aplicacion");
		Scanner usuarioQuiereHacer = new Scanner(System.in);
		
		int opcionUsuario = usuarioQuiereHacer.nextInt();
		System.out.println("Has elegido hacer: " + opcionUsuario);

		
		switch (opcionUsuario) {
		case 1:
			if (opcionUsuario == 1) {
				
			System.out.println("El usuario quiere Calcular el numero de vocales");
			}
			break;
		case 2:
			System.out.println("El usuario quiere Calcular el numero de consonantes");
			break;
		case 3:
			System.out.println("El usuario quiere Calcular el numero de mayusculas");
			break;
		case 4:
			System.out.println("El usuario quiere Mostrar texto en mayusculas");
			break;
		case 5:
			System.out.println("El usuario quiere finalizar aplicacion");
			break;
		default:
			System.out.println("Te has equivocado. Marque una de las opciones validas (1,2,3,4. 5=para finalizar aplicacion.");
			break;
		}
		
		
/*		poniendo otro escaner delante no deja volver a escribir.
		Scanner textoDelUsuario = new Scanner(System.in);
		String textoIntroducidoUsuario = textoDelUsuario.toString();
*/
		
		
		
		// El usuario quiere Calcular el numero de vocales
		if (opcionUsuario == 1) {
		System.out.println("Escriba la palabra para calcular sus vocales");
/* ++		hacer as�? da mal por poner otro if.
		Scanner numVocales = new Scanner(System.in);
		String vocales = numVocales.nextLine();
			for (int i = 0; i < vocales.length(); i++) {
				if (vocales.charAt(i) = 'a' &&
					vocales.charAt(i) = 'e' &&
					vocales.charAt(i) = 'i' &&
					vocales.charAt(i) = 'o' &&
					vocales.charAt(i) = 'u')
				System.out.println("Letras vocales: " + vocales.charAt(i));
		}
*/			
			
		}

		
		
		// El usuario quiere Calcular el numero de consonantes
		else if (opcionUsuario == 2) {
			
		System.out.println("\nEl numero de consonantes es: " );

		}
		
		
		// El usuario quiere Calcular el numero de mayusculas
		else if (opcionUsuario == 3) {
			
		System.out.println("\nEl el numero de mayusculas es: " );
		}
		
		// El usuario quiere Mostrar texto en mayusculas
		else if (opcionUsuario == 4) {
		System.out.println("Escriba el texto para ponerlo en mayuscula");
		
		Scanner sc4 = new Scanner(System.in);
		String textoMayuscula = sc4.nextLine();
		
		System.out.println("El texto en mayuscula es: " + textoMayuscula.toUpperCase());
		}

		// El usuario quiere finalizar aplicacion
		else if (opcionUsuario == 5) {
			
		System.out.println("Has finalizado aplicacion");
		}


		// Te has equivocado. Marque una de las opciones validas (1,2,3,4. 5=para finalizar aplicacion.
		else {
		System.out.println("\nNinguna opcion es valida. Marca una de las opciones validas, sino pulsa '5' para finalizar aplicacion.");
		}
	
		
		
		usuarioQuiereHacer.close();
		

		
		
	}

}
