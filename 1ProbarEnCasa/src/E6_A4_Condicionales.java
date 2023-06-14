import java.util.Random;

public class E6_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 6.	El modelo de color RGB tiene tres componentes, la componente roja (R), la verde (G) y la azul (B).
		Genera un color aleatorio válido (solo pueden ir desde 0 hasta 255).
		Indica qué tipo de color es, dependiendo de la mayor de sus componentes.

		Ejemplo:
		Si generamos el color R = 200, G = 312 y B = 0, el color tendrá más valor de verde (G), por lo que diremos que se trata de un color “Verde”.

		Otro ejemplo sería: R = 200, G = 200, B = 200, en cuyo caso, todas las componentes son iguales, por lo que tendríamos un color “Gris”. (Solo en caso de que coincidan al menos 2 de las 3 componentes).
		*/
		
		
		// como el color es del 0 hasta el 255, y el 0 si se cuenta, pondremos 256.
		// probado con nº 2 en random para comprobar que todos los parámetros están bien y todo ok 10/10.
		
		
 		Random ramdom = new Random();

		Random ramdomR = new Random();
		int R = ramdom.nextInt(256);
		System.out.println("Color Rojo: " + R);
		
		Random ramdomG = new Random();
		int G = ramdom.nextInt(256);
		System.out.println("Color Verde: " + G);
		
		Random ramdomB = new Random();
		int B = ramdom.nextInt(256);
		System.out.println("Color Azul: " + B);
		
		
		
		if (R == G || G == B || R == B) {
			System.out.println("Dos o tres colores son iguales, por tanto, el color es GRIS");
		}
		//puesto delante este if de iguales, porque así si son iguales no me dice que otro número de los de abajo es mayor.
		
		
		else if (R > G && R > B ) {
			System.out.println("El color Rojo es mayor: " + R);
		}
				
		else if (G > R && G > B ) {
			System.out.println("El color Verde es mayor: " + G);
		}

		else if (B > R && B > G ) {
			System.out.println("El color Azul es mayor: " + B);
		}
		
		
	
		
		
	/* probado con if (pero hacer que corte y no siga leyendo donde queramos; 
	   porque cuando 2 eran iguales lo ponía, pero luego además decía que tal color era mayor)
	   
	   	// como el color es del 0 hasta el 255, y el 0 si se cuenta, pondremos 256.
		// probado con nº 2 en random para comprobar que los parámetros esten ok.
		
		Random ramdomR = new Random();
		int colorAleatorioR = ramdom.nextInt(2);
		// System.out.println(colorAleatorioR);
		
		Random ramdomG = new Random();
		int colorAleatorioG = ramdom.nextInt(2);
		// System.out.println(colorAleatorioG);
		
		Random ramdomB = new Random();
		int colorAleatorioB = ramdom.nextInt(2);
		// System.out.println(colorAleatorioB);
	   
		int R = colorAleatorioR;
		int G = colorAleatorioG;
		int B = colorAleatorioB;
		System.out.println("Color Rojo: " + R);
		System.out.println("Color Verde: " + G);
		System.out.println("Color Azul: " + B);
		
		if (R > G && R > B ) {
			R = R;
			System.out.println("El color Rojo es mayor: " + R);
		}
		
		if (G > R && G > B ) {
			G = G;
			System.out.println("El color Verde es mayor: " + G);
		}

		if (B > R && B > G ) {
			B = B;
			System.out.println("El color Azul es mayor: " + B);
		}
		
		
		
		if (R == G && G == B) {
			System.out.println("Rojo, Verde y Azul son iguales, por tanto, el resultado de los 3 colores: " + R + " + " + B + " + " + G + " es GRIS");
		}

		else if (R == G) {
			// R = G; (se puede omitir esta línea)
			System.out.println("Rojo y Verde son iguales, por tanto, su valor: " + R + " y " + G + " da color GRIS");
		}
		else if (R == B) {
			// R = B; (se puede omitir esta línea)
			System.out.println("Rojo y Azul son iguales, por tanto, su valor: " + R + " y " + B + " da color GRIS");
		}
		else if (G == B) {
			// G = B; (se puede omitir esta línea)
			System.out.println("Verde y Azul son iguales, por tanto, su valor: " + G + " y " + B + " da GRIS");
		}
		
	*/

		
		
		
		
		/*
		else if (R == G || R == B || G == B ) {
			System.out.println("El color es GRIS");
		}
		*/
		
		
		/* ejemplo de 3 colores que utilicé para probar
		int R = 200;
		int G = 312;
		int B = 0;
		*/ 
		
		
	}

}
