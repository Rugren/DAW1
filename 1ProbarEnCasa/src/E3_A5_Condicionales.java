import java.util.Scanner;

public class E3_A5_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ejercicio 3: Realiza un programa que contenga un menú, de forma que muestre las cuatro
		operaciones matemáticas básicas: sumar, restar, multiplicar y dividir. Se le
		debe solicitar dos números al usuario y la opción a aplicar entre esos dos
		números (puede ser utilizando el símbolo concreto: + - * / u opciones
		numéricas → 1 para sumar, 2 para restar, etc. Muestra el resultado en función
		de la opción seleccionada.
		*/
		
		System.out.println("Escriba dos numeros y luego te diremos la operacion a realizar");
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		int numIntroducido1 = num1.nextInt();
		System.out.println("Tu primer numero elegido es: " + numIntroducido1);
		
		int numIntroducido2 = num2.nextInt();
		System.out.println("Tu segundo numero elegido es: " + numIntroducido2);
		
		
		
		System.out.println("Para el calculo que desea realizar introduzca una de estas 4 opciones: 1 = suma, 2 = resta, 3= multiplicar, 4 = dividir");
		Scanner calculoIntroducidoUsuario = new Scanner(System.in);
		
		int calculoUsuario = calculoIntroducidoUsuario.nextInt();
				
		/* int suma = 1;
		int resta = 2;
		int multiplicar = 3;
		int dividir = 4;
		*/
		
		switch (calculoUsuario) {
		case 1:
			System.out.println("Has SUMADO, el resultado de la suma es: " + (numIntroducido1 + numIntroducido2));
			break;
		case 2:
			System.out.println("Has RESTADO, el resultado de la resta es: " + (numIntroducido1 - numIntroducido2));
			break;
		case 3:
			System.out.println("Has MULTIPLICADO, el resultado de la multiplicacion es: " + (numIntroducido1 * numIntroducido2));
			break;
		case 4:
			System.out.println("Has DIVIDIDO, el resultado de la division es: " + (numIntroducido1 / numIntroducido2));
			break;		
		default:
			System.out.println("No has introducido ninguna de las opciones matematicas disponibles: ERROR");
			break;
	}

		
		num1.close();
		num2.close();
		
		
// PREGUNTAR AL PROFESOR COMO SE HACE CON TEXTO, para que coja el texto si pongo "suma" y que luego con la condicion suma, haga algo.
		/* sería algo así?
		
		System.out.println("Para el calculo que desea realizar introduzca una de estas 4 opciones: suma, resta, multiplicar, dividir");
		Scanner calculoIntroducidoUsuario = new Scanner(System.in);
		
		String calculoUsuario = calculoIntroducidoUsuario.nextLine().toLowerCase(); //el .toLowerCase() para que nos lea entre mayusulas y minuculas y no nos de error el texto.
		
		String suma = "suma";
		String resta = "resta";
		String multiplicar = "multiplicar";
		String dividir = "dividir";
		
		switch (calculoUsuario) {
		case suma:
			System.out.println("Has SUMADO, el resultado de la suma es: " + (numIntroducido1 + numIntroducido2));
			break;
		case resta:
			System.out.println("Has RESTADO, el resultado de la resta es: " + (numIntroducido1 - numIntroducido2));
			break;
		case multiplicar:
			System.out.println("Has MULTIPLICADO, el resultado de la multiplicacion es: " + (numIntroducido1 * numIntroducido2));
			break;
		case dividir:
			System.out.println("Has DIVIDIDO, el resultado de la division es: " + (numIntroducido1 / numIntroducido2));
		default:
			System.out.println("No has introducido ninguna de las opciones matematicas disponibles: ERROR");
			break;
	}

		 */
	
		
		
		
/*		
		// *Ver como se hace que si pongo "suma" al introducirla en el escaner, que luego suma lo coja abajo y calcule en el syso.
		if (calculoUsuario == "suma") {
			System.out.println("Has SUMADO, el resultado de la suma es: " + (numIntroducido1 + numIntroducido2));
		}
		else if (calculoUsuario == "resta") {
			System.out.println("Has RESTADO, el resultado de la resta es: " + (numIntroducido1 - numIntroducido2));
		}
		else if (calculoUsuario == "multiplicar") {
			System.out.println("Has MULTIPLICADO, el resultado de la multiplicacion es: " + (numIntroducido1 * numIntroducido2));
		}
		else if (calculoUsuario == "dividir") {
			System.out.println("Has DIVIDIDO, el resultado de la division es: " + (numIntroducido1 / numIntroducido2));
		}
		
		else {
			System.out.println("No has introducido ninguna de las opciones matematicas disponibles: ERROR");
		}

	
	
		// hacer un if, de si ha elegido division, que el syso marque que divida.
		
		int resultadoDivision = (numIntroducido1 / numIntroducido2) ;
		System.out.println("El resultado de la division es: " + resultadoDivision);
 */
		
		
		
	}

}
