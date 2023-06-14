import java.util.Scanner;

public class Exam_1Eval_1de2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		A. Menú de Strings (5 ptos)
		Crea un menú con las siguientes opciones:
		a. Calcular el número de vocales
		b. Calcular el número de consonantes
		c. Calcular el número de mayúsculas
		d. Mostrar texto en mayúsculas
		e. Finalizar aplicación
		
		Como entrada, el usuario deberá introducir una frase de, al menos 5 palabras, 
		que debe contener letras en mayúsculas y minúsculas y vocales y consonantes.
		
		El siguiente paso será introducir la opción elegida.
		Ejemplo de entrada/salida:
		Introduce una frase:
		Hola mundo Hello World Asd
		Introduce una opción:
		a. Calcular el número de vocales
		b. Calcular el número de consonantes
		c. Calcular el número de mayúsculas
		d. Mostrar texto en mayúsculas
		e. Finalizar aplicación
		c
		4
		*/
		        
		Scanner entrada = new Scanner(System.in);
		String frase = "z";
		String opcion = "a";
		
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		int contadorMayusculas = 0;
		int numeroPalabras = 5;
		String fraseMinuscula = frase.toLowerCase();
		boolean play = true;
		
		
		while (play) {
			System.out.println("Introduce una frase de cinco palabras");
			frase = entrada.nextLine();
			fraseMinuscula = frase.toLowerCase();
			
			String[] fraseArray = frase.split(" ");
			// el .split es para separar, entre parentesis hemos separado los espacios: .split(" "); La traducción sería: separado por.
			// si en el .split entre parentesis hubieramos puesto: ("-"); hubiera separado por ejemplo si ponemos 123-456 y seria 123 456 de texto al escribir.
			
			numeroPalabras = fraseArray.length;
			if (play && numeroPalabras == 5) {
				System.out.println("Introduce una opción:\n" + "a. Calcular el número de vocales\n"
						+ "b. Calcular el número de consonantes\n" + "c. Calcular el número de mayúsculas\n"
						+ "d. Mostrar texto en mayúsculas\n" + "e. Finalizar aplicación\n");
				
				opcion = entrada.nextLine();
				
			switch (opcion) {
				// "a. Calcular el número de vocales
				case "a":
					for (int i = 0; i < frase.length(); i++) {
						if (frase.charAt(i) == 'a' 
							|| frase.charAt(i) == 'e' 
							|| frase.charAt(i) == 'i'
							|| frase.charAt(i) == 'o' 
							|| frase.charAt(i) == 'u' 
							|| frase.charAt(i) == 'A'
							|| frase.charAt(i) == 'E' 
							|| frase.charAt(i) == 'I' 
							|| frase.charAt(i) == 'O'
							|| frase.charAt(i) == 'U') {
							contadorVocales++;
						}
					}
					System.out.println("Tiene " + contadorVocales + " vocales");
					break;
					
				// b. Calcular el número de consonantes
				case "b":
					for (int i = 0; i < frase.length(); i++) {
						if (frase.charAt(i) != 'a' 
							&& frase.charAt(i) != 'e' 
							&& frase.charAt(i) != 'i'
							&& frase.charAt(i) != 'o' 
							&& frase.charAt(i) != 'u' 
							&& frase.charAt(i) != 'A'
							&& frase.charAt(i) != 'E' 
							&& frase.charAt(i) != 'I' 
							&& frase.charAt(i) != 'O'
							&& frase.charAt(i) != 'U' 
							&& frase.charAt(i) != ' ') {
							contadorConsonantes++;
						}
					}
					System.out.println("Tiene " + contadorConsonantes + " consonantes");
					break;
					
				// c. Calcular el número de mayúsculas
				case "c":
					for (int i = 0; i < frase.length(); i++) {
						if (frase.charAt(i) != fraseMinuscula.charAt(i)) {
							contadorMayusculas++;
						}
					}
					System.out.println("Tiene " + contadorMayusculas + " mayúsculas");
					break;
					
				// d. Mostrar texto en mayúsculas
				case "d":
					System.out.println("Tu frase en mayuscula: " + frase.toUpperCase());
					break;
					
				case "e":
					System.out.println("Usted ha finalizado la aplicación");
					play = false;
					break;
				}
			}
		}
		entrada.close();

	}

}
