package clases_dia;


public class clase_22_11_08_ParesNones_contar_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String nombre = "Paco";

		for (int i = 0; i < nombre.length(); i++);
		System.out.println("Mi letra en la posicion de nombre: " + nombre.charAt(1)); // si pongo 0, me da P, si pongo 1 me da a...
		for (int i = 0; i <= nombre.length()-1; i++);
		//para hacerlo de la misma manera que el primer for, poner el "=" y luego el "-1".
		System.out.println("Mi letra en la posicion de nombre (misma manera, con el -1 tambien sale: " + nombre.charAt(1)); // si pongo 0, me da P, si pongo 1 me da a...
		
		// cuenta el n� de caracteres del "nombre", al ser 4 (P A C O); la P es 0, A es 1, la C es 2 y la O es 3.
	 	
		
		// PARA QUE COJA SOLO LETRAS
		// hacemos un distinto "!" de, y "&&" luego otro distinto, y "&&" luego otro distinto, 
		 String nombre1 = "Paccco";
			for (int i = 0; i < nombre1.length(); i++) {
				if (nombre1.charAt(i) != 'a' &&
						nombre1.charAt(i) != 'e' &&
						nombre1.charAt(i) != 'i' &&
						nombre1.charAt(i) != 'o' &&
						nombre1.charAt(i) != 'u')
					System.out.println("Letras no vocales: " + nombre1.charAt(i));
			}

			
		String hola = "hola Tio";
		System.out.println("hola 1: " + hola.length()); // cuenta los espacios
		System.out.println("hola 2: " + hola.charAt(2)); // nos dar� la "L", porque la h es "0" u la letra "o" es 1.
		System.out.println("hola 3: " + hola.toUpperCase()); // nos pone en mayuscula
		System.out.println("hola 4: " + hola.toUpperCase().replace("O", "E"));  // nos pone en mayuscula y nos sustituye la o por la e.
		System.out.println("hola 4.1: " + hola.toUpperCase().replace(" ", "P"));  // nos pone en mayuscula y nos sustituye la o por la e.
	
		

		
		
		
	}

}
