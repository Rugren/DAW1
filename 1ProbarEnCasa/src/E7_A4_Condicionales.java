import java.util.Scanner;

public class E7_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Introduce un numero: ");
		
		Scanner scanner = new Scanner(System.in);
		int miNumero = scanner.nextInt();
		
		if (miNumero >= 0) {
			System.out.println("Es positivo");
		}
		
		if (miNumero < 0) {
			System.out.println("Es negativo");
		}
		
		
		
		if (miNumero %2 == 0) {
			System.out.println("Es par");
		}
		
		//El "!=" hace que sea distinto ; distinto de divisible entre 2 es impar.
		if (miNumero %2 != 0) { 
			System.out.println("Es impar");
		}
		
		
		
		if (miNumero %5 == 0) {
			System.out.println("Es divisible por 5");
		}
		if (miNumero %5 != 0) {
			System.out.println("No es divisible por 5");
		}

		scanner.close();

		

	}

}
