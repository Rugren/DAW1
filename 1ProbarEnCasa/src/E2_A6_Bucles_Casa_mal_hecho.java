
public class E2_A6_Bucles_Casa_mal_hecho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 2 A6_Bucles
		/* 
		Utiliza otros dos contadores para almacenar en uno de ellos la suma de 
		todos los números pares y en el otro de los números impares desde el 
		número 1 hasta el 100.
		*/

		

		int contarDesdeNumero = 1;
		
		while (true) {
			if (contarDesdeNumero == 101) { // para que deje de contar en el 100, se pone ==, y el 101 para que cuente hasta el 100.
				break;
			}
			System.out.println(contarDesdeNumero);
			contarDesdeNumero++;
		}

		
/*		
		int contarDesdeNumero = 1;
		int contarHastaNumero = 100;

		while (true) {
			if (contarDesdeNumero == 101) { // para que deje d contar en el 100,se pone ==, y el 101 para que cuente hasta el 100.

				if (contarHastaNumero == 100) {
				contarHastaNumero/2;
				}
				break;
			}
			System.out.println(contarHastaNumero);

			System.out.println(contarDesdeNumero);
			contarDesdeNumero++;
		}
*/		
		

/*
		for (int i = 1; i <= 100; i++) {
				if (numero / 2 == 0) {
				}
			System.out.println(numero);
		}
*/
		
	/*	
		while (indice > 0 && divisibles < 3) {
// 	era: while (indice > 0) {
//		 while (indice > 0 && divisibles < 3) {	// pero le hemos a�adido esto arriba para no poner el if y break de abajo que est� comentando. Por si el numero es muy largo	
			if (numero % indice == 0)
				divisibles++; //sumarle 1.
			
	//		if (divisibles > 2)
	//			break;
		// Por si el numero es muy largo, se hace este if y break, pero la manera correcta es lo que hemos puesto arriba: "while (indice > 0 && divisibles < 3) {"
			
			indice--; //tiene que decrementar indice
	}

		if (divisibles <=2)
			System.out.println("Es numero primo");
		else
			System.out.println("No es numero primo");
*/			

		
	}

}
