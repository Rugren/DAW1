package UT5_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UT5_ExpresionesRegulares_Ejercicios_paraMi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* SIEMPRE SON TODOS:
		String regex
		String input
		Matcher matcher

		Pero he ido poniendole al final su nombre propio, para no duplicar las variables.
		 */

		
		// Ejercicio 1
		// 1.	Busca matriculas con el formato: AB 7354 B.
		// ^[A-Z]{2}\\s\\d{4}\\s[A-Z]$
		
		// Matriculas con el formato "AB 7354 B":
		String patternMatriculas = "^[A-Z]{2}\\s\\d{4}\\s[A-Z]$";

//	OTROS EJEMPLOS:
		// Otro ejemplo, que no pide el ejercicio
		//Numeros de telefono con el formato "(123) 456-7890":
		String patternNumTelefono = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
		
		// Otro ejemplo, que no pide el ejercicio
		// Direcciones de correo electronico con el formato "example@email.com":
		String patternEmail = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
		
		// Otro ejemplo, que no pide el ejercicio
		// URLs con el formato "https://www.example.com":
		String patternURL = "^https:\\/\\/www\\.[\\w.]+\\.[a-zA-Z]{2,3}$";
//
		
		String inputMatricula = "La matricula de mi coche es AB 7354 B";
		String patternMatricula = "^[A-Z]{2}\\s\\d{4}\\s[A-Z]$"; // lo mismo que arriba String patternMatriculas

		Pattern p = Pattern.compile(patternMatricula);
		Matcher m = p.matcher(inputMatricula);

		if (m.find()) {
		    System.out.println("Se encontro una matricula: " + m.group());
		} else {
		    System.out.println("No se encontro ninguna matricula.");
		}

		
		//__________________________________________________________________________________	
		
		
		// Ejercicio 2
		// 2.	Busca texto con formato dni.
		// \\b\\d{8}[A-HJ-NP-TV-Z]\\b
	
		// Para buscar texto con formato DNI en Java, se puede utilizar la siguiente expresion regular:
		String regexDNI = "\\b\\d{8}[A-HJ-NP-TV-Z]\\b";

/*		Explicacion de la expresion regular:

			\\b indica que la coincidencia debe estar delimitada por un limite de palabra, es decir, no puede haber letras o numeros adyacentes antes o despues de la coincidencia.
			\\d{8} indica que la coincidencia debe ser un numero de 8 digitos.
			[A-HJ-NP-TV-Z] indica que la coincidencia debe ser una letra mayuscula que no incluya las letras I, O y U.
			\\b indica nuevamente que la coincidencia debe estar delimitada por un limite de palabra.
			Ejemplo de uso en Java:
*/
		String textoDNI = "El DNI de Juan es 12345678K";
		Pattern patronDNI = Pattern.compile("\\b\\d{8}[A-HJ-NP-TV-Z]\\b");
		Matcher matcherDNI = patronDNI.matcher(textoDNI);
		if (matcherDNI.find()) {
		    String dniEncontrado = matcherDNI.group();
		    System.out.println("Se encontro el DNI: " + dniEncontrado);
		} else {
		    System.out.println("No se encontro ningun DNI.");
		}

		//__________________________________________________________________________________	
	
		
		// Ejercicio 3
		// 3.	Busca palabras en mayusculas con _ en medio (formato de constantes en Java).
		// \\b[A-Z]+(_[A-Z]+)+\\b

		String regexMayusConBarraBajaEnMedio = "\\b[A-Z]+(_[A-Z]+)+\\b";
/*
		Esta expresion regular utiliza los siguientes elementos:

			\b: Este elemento indica el limite de una palabra, lo que significa que la expresion regular solo buscara palabras completas y no coincidira con una palabra que sea parte de otra palabra mas larga.
			[A-Z]+: Este elemento busca una o mas letras mayusculas.
			(_[A-Z]+)+: Este elemento busca uno o mas grupos de caracteres que comiencen con un guion bajo _ seguido de una o mas letras mayusculas.
			\\b: Este elemento indica el limite de una palabra, al igual que al principio de la expresion regular.
			Por lo tanto, esta expresion regular buscara todas las palabras en mayusculas con _ en medio, como por ejemplo MAX_VALUE, MIN_PRIORITY, PI_2, etc.
*/			
		
		//__________________________________________________________________________________	
		
		
		// Ejercicio 4
		// 4.	Busca numeros de telefono con prefijo espanol (el prefijo es opcional, se deben buscar telefonos con y sin prefijo).
		// ---Hecho en scss, que es parecido: ((\+34|0034|34)?[6789]\d{8})
		// ((\\+34|0034|34)?[6789]\\d{8})
		
/*		Esta expresion regular se divide en tres partes:

			(\+34|0034|34)?: esta parte es opcional y busca el prefijo espanol. Puede ser "+34", "0034" o simplemente "34".

			[6789]\d{8}: esta parte busca los numeros de telefono en si. El primer digito puede ser 6, 7, 8 o 9, seguido de otros 8 digitos.

			El uso de parentesis alrededor de toda la expresion regular indica que queremos capturar el numero de telefono completo, incluyendo el prefijo si existe.

			Un ejemplo de uso de esta expresion regular en Java podria ser el siguiente:
*/
		String textoTelefono = "Mi numero de telefono es +34678901234 y el de mi amigo es 678901234.";
	    Pattern patronTelefono = Pattern.compile("((\\+34|0034|34)?[6789]\\d{8})");
	    Matcher matcherTelefono = patronTelefono.matcher(textoTelefono);
	    while (matcherTelefono.find()) {
	      System.out.println(matcherTelefono.group());
	    }
/*	    Este codigo busca en el texto los numeros de telefono que coinciden con la expresion regular y los imprime por pantalla. En este ejemplo, el resultado seria:
	    +34678901234
	    678901234

		Nota: esta expresion regular puede encontrar numeros de telefono que no sean validos. 
		Por ejemplo, si un numero empieza con un prefijo espanol incorrecto, como "+35" o "0035", 
		tambien sera capturado por esta expresion regular. 
		Por lo tanto, es importante validar los numeros de telefono encontrados antes de utilizarlos en cualquier aplicacion real.
*/
	    
	    
		//__________________________________________________________________________________	
		
		// Ejercicio 5
		// 5.	Crea una expresion regular para buscar nombre y apellidos (el segundo apellido debe ser opcional).
		// ^(?=.*[A-Za-z])([A-Za-z]+)\\s+([A-Za-z]+)\\s?([A-Za-z]+)?$
			    
/* Para buscar nombres y apellidos con una expresion regular en Java, puedes utilizar la siguiente:
--- es en css:
String regex = "^(?=.*[A-Za-z])([A-Za-z]+)\\s+([A-Za-z]+)\\s?([A-Za-z]+)?$";
*/

/* Explicacion de la expresion regular:

^ : Indica el inicio de la cadena.
(?=.*[A-Za-z]) : Utiliza una lookahead assertion para asegurarse de que hay al menos una letra en la cadena. Esto es util para evitar que se hagan coincidencias con cadenas vacias o espacios en blanco.
([A-Za-z]+) : Coincide con uno o mas caracteres alfabeticos.
\\s+ : Coincide con uno o mas espacios en blanco.
([A-Za-z]+) : Coincide con uno o mas caracteres alfabeticos para el primer apellido.
\\s? : El segundo apellido es opcional, por lo que utilizamos ? para hacer coincidir cero o un espacio en blanco.
([A-Za-z]+)? : Coincide con uno o mas caracteres alfabeticos para el segundo apellido, si esta presente.
$ : Indica el final de la cadena.
Ejemplo de uso en Java:
*/
	    String inputNombreYApellidos = "Juan Perez Garcia";
	    Pattern patternNombreYApellidos = Pattern.compile("^(?=.*[A-Za-z])([A-Za-z]+)\\s+([A-Za-z]+)\\s?([A-Za-z]+)?$");
	    Matcher matcherNombreYApellidos = patternNombreYApellidos.matcher(inputNombreYApellidos);

	    if (matcherNombreYApellidos.find()) {
	      String firstName = matcherNombreYApellidos.group(1);
	      String lastName1 = matcherNombreYApellidos.group(2);
	      String lastName2 = matcherNombreYApellidos.group(3);

	      System.out.println("Nombre: " + firstName);
	      System.out.println("Apellido 1: " + lastName1);
	      if (lastName2 != null) {
	        System.out.println("Apellido 2: " + lastName2);
	      }
	    } else {
	      System.out.println("No se encontro una coincidencia.");
	    }
/*
Este ejemplo de codigo buscara el nombre y apellidos en la cadena "Juan Perez Garcia" 
y mostrara el resultado en la salida estandar. 
Si el segundo apellido no esta presente en la cadena, no se imprimira en la salida.
 */
		
		//__________________________________________________________________________________	
		
		// Ejercicio 6
/*		6.	Crea una expresion regular para buscar lineas donde se declara un String en Java. Esta expresion debe encontrar la declaracion completa en una linea.
		Ejemplo:
		String cadena = “Cadena de ejemplo”;
		El contenido de la cadena puede ser cualquiera, asi como el nombre de la variable donde se almacena.
*/
		// \\bString\\s+\\w+\\s*=\\s*\"[^\"]*\"\\s*;
		
	    String regexBuscaLineas = "\\bString\\s+\\w+\\s*=\\s*\"[^\"]*\"\\s*;";
/*
Explicacion:

\\bString\\b coincide con la palabra "String" de forma exacta.
\\s+ coincide con uno o mas espacios en blanco.
\\w+ coincide con uno o mas caracteres alfanumericos (letras o numeros) para representar el nombre de la variable.
\\s* coincide con cero o mas espacios en blanco.
\"[^\"]*\" coincide con cualquier contenido entre comillas dobles.
\\s*; coincide con cero o mas espacios en blanco seguido por un punto y coma.
Ejemplo de uso:

 */
	    String inputBuscaLineas = "String cadena = \"Cadena de ejemplo\";\n" +
	               "String otraCadena = \"Otra cadena\";";
	    Pattern patternBuscaLineas = Pattern.compile("\\bString\\s+\\w+\\s*=\\s*\"[^\"]*\"\\s*;");
	    Matcher matcherBuscaLineas = patternBuscaLineas.matcher(inputBuscaLineas);
	    while (matcherBuscaLineas.find()) {
	    	System.out.println(matcherBuscaLineas.group());
	    }

	    // La salida seria:
	    String cadena = "Cadena de ejemplo";
	    String otraCadena = "Otra cadena";

	    
		//__________________________________________________________________________________	
	
		

		
		
	}
	

}
