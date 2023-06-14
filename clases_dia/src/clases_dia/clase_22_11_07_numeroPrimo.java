package clases_dia;

public class clase_22_11_07_numeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// vamos a calcular el numero primero, 
		//que solo se pueda dividir por 1 y pors� mismo.
		
		int numero = 1457;
		int divisibles = 0;
		int indice = numero; //empezar� aqu�
		
		
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
			
		
		
		
	}
}
