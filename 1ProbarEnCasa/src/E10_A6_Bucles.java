
public class E10_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 10 A6_Bucles. Cuenta el número de vocales de una palabra.
		
		 String palabra = "Manuel";
		 int contador = 0;
		 
			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) == 'a' ||
					palabra.charAt(i) == 'e' ||
					palabra.charAt(i) == 'i' ||
					palabra.charAt(i) == 'o' ||
					palabra.charAt(i) == 'u')
					System.out.println("Letras vocales: " + palabra.charAt(i));
			}


				
				
				

/* Meter el if con algun sumatorio:				
				if (palabra.charAt(i) == 'a') {
					
					System.out.println(palabra);
				}
*/				
				
/* 
				System.out.println("Sumatorio de: " + 'a' + 'e');
*/	
			
	
	}

}
