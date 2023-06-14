import java.util.Scanner;

public class E3_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Queremos declarar una variable que represente una dirección (puede ser Arriba, Abajo, Derecha o Izquierda). 
		 * Nuestro programa debe asignar a otra variable la dirección opuesta a la dirección declarada. 
		 * Se puede imprimir por pantalla dicho valor opuesto o almacenarlo en una variable.
		 */

		System.out.println("Introduce una direccion: [Arriba, Abajo, Derecha o Izquierda]");
		Scanner sc = new Scanner(System.in);
		String direccion = sc.nextLine().toLowerCase(); // puesto .toLowerCase(); para que no nos dé error si el usuario escribe en mayúsculas o minúsculas
		
		String direccionContraria;
		
		switch (direccion){
			case "arriba":
				direccionContraria = "Abajo";
				break;
			case "abajo":
				direccionContraria = "Arriba";
				break;
			case "derecha":
				direccionContraria = "Izquierda";
				break;
			case "izquierda":
				direccionContraria = "Derecha";
				break;
			default:
				direccionContraria = "ERROR";
				break;
		
		}
		System.out.println(direccionContraria);
		sc.close(); 
		//¿El "sc.close()" es necesario ponerlo? 
		//No me ha influido en nada al ejecutarlo, ¿Qué error podría dar, o qué pasaría si no se pusiera?

		
	}

}
