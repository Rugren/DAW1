import java.util.Scanner;

public class E5_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float ahorros = 6000.50f;
		float compra = 5249.24f; // la compra es 5249.24f; 		
		
		if (ahorros - compra > 0) {
			ahorros = ahorros - compra;
			System.out.println("Has gastado " + compra + "€ de tus ahorros");
			System.out.println("Te quedan: " + ahorros + "€");

		}
		
		else if (ahorros - compra < 0) {
			ahorros = ahorros - compra;
			System.out.println("Has malgastado " + compra + "€ y tienes los siguientes nº rojos: " + ahorros + "€");
		}

		
		if (ahorros - compra <= 1000) {
			ahorros = ahorros;
			System.out.println("Te quedan: " + ahorros + "€ no gastar mucho mas (ya tenemos menos de 1000€ ¡Cuidado!)");
		}
		
		float nuevoGasto = 2000f;		
		System.out.println("Saldo final: " + (ahorros - nuevoGasto) + " euros");

		
		
// un boolean que devuelva true si (ahorros < 1000) dentro del if primero de "(ahorros - compra > 0)" ?
	//		así devuelve truecuidado:	System.out.println((ahorros < 1000) + "cuidado" );

		// ¿comprobar si saco 4900.50f que no me salga el mensaje ya queda menos de 1000, cuando el resultado es 1100.

		
	/* Probando que por el escaner cojamos una cifra y reste
		System.out.println("Escriba la cantidad a sacar: ");
		Scanner sc = new Scanner(System.in);
		
		float dineroSacado = sc.nextFloat();

		float ahorros = 6000.50f;
		float compra = 5249.24f;
		
		System.out.println(ahorros - dineroSacado);
	*/
		
	/*switch (ahorros) {
			case 1:
				System.out.println("");
	*/
		
		
	}

}
