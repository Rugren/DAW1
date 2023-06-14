package UT5_ExpresionesRegulares;

public class UT5_ExpresionesRegulares_Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Estas serian las expresiones regulares para buscar: \n");
		
		// Crea expresiones regulares para buscar los siguientes textos. Se debe utilizar...
		
		
		// Ejercicio 1
		// 1.	Busca matriculas con el formato: AB 7354 B.
		// ^[A-Z]{2}\\s\\d{4}\\s[A-Z]$
		System.out.println("-Matriculas con el formato (AB 7354 B): " + "^[A-Z]{2}\\s\\d{4}\\s[A-Z]$");
		//__________________________________________________________________________________	
		
		
		// Ejercicio 2
		// 2.	Busca texto con formato dni.
		// \\b\\d{8}[A-HJ-NP-TV-Z]\\b
		System.out.println("-Texto con formato DNI: " + "\\b\\d{8}[A-HJ-NP-TV-Z]\\b");
	
		//__________________________________________________________________________________	
	
		
		// Ejercicio 3
		// 3.	Busca palabras en mayusculas con _ en medio (formato de constantes en Java).
		// \\b[A-Z]+(_[A-Z]+)+\\b
		System.out.println("-Buscar palabras en mayusculas con _ en medio: " + "\\b[A-Z]+(_[A-Z]+)+\\b");
		//__________________________________________________________________________________	
		
		
		// Ejercicio 4
		// 4.	Busca numeros de telefono con prefijo espanol (el prefijo es opcional, se deben buscar telefonos con y sin prefijo).
		// ((\\+34|0034|34)?[6789]\\d{8})
		System.out.println("-Busca numeros de telefono con prefijo espanol(el prefijo es opcional, se buscan telefonos con y sin prefijo): " + "((\\+34|0034|34)?[6789]\\d{8})");
		//__________________________________________________________________________________	
		
		
		// Ejercicio 5
		// 5.	Crea una expresion regular para buscar nombre y apellidos (el segundo apellido debe ser opcional).
		// ^(?=.*[A-Za-z])([A-Za-z]+)\\s+([A-Za-z]+)\\s?([A-Za-z]+)?$
		System.out.println("-Busca nombres y apellidos (el segundo apellido es opcional): " + "^(?=.*[A-Za-z])([A-Za-z]+)\\s+([A-Za-z]+)\\s?([A-Za-z]+)?$");
		//__________________________________________________________________________________	
		
		
		// Ejercicio 6
/*		6.	Crea una expresion regular para buscar lineas donde se declara un String en Java. Esta expresion debe encontrar la declaracion completa en una linea.
		Ejemplo:
		String cadena = “Cadena de ejemplo”;
		El contenido de la cadena puede ser cualquiera, asi como el nombre de la variable donde se almacena.
*/
		// \\bString\\s+\\w+\\s*=\\s*\"[^\"]*\"\\s*;
		
		String cadena = "Cadena de ejemplo";
		String otraCadena = "Otra cadena";
		
		System.out.println("-Busca lineas donde se declara un String: " + "\\bString\\s+\\w+\\s*=\\s*\"[^\"]*\"\\s*;");		
		//__________________________________________________________________________________	
		
		
	}

}
