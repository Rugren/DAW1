package miercoles5;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operador ternario
		int hora = 16;
		String tiempo = (hora >= 14) ? "Tarde" : "Mañana";
		System.out.println(tiempo);
		
		int nota = 7;
		Boolean aprobado = (nota >=5) ? true: false;
		System.out.println(aprobado);
		
		// Como 21 es mayor a 20, te da el primer resultado (1500.68). Trabajas más y cobras menos
		int numHorasTrabajadas = 21;
		Float sueldo = (numHorasTrabajadas > 20) ? 1500.68f : 2000.24f;
		System.out.println(sueldo);
		
		//Practicando con el operador Ternario (4 ejercicios)
		// Ejercicio 1
		Boolean tieneCertificadoCovid = true;
		String entrada = (tieneCertificadoCovid) ? "Entrada permitida": "Entrada denegada";
		System.out.println(entrada);
		
		// Ejercicio 2 (hacer la primera, porque es sólo números"
		
		String numero = "uno";
		int contador = (numero == "uno") ? 1 : 0;
		System.out.println(contador);
		
		String numero_ = "uno";
		String contador_ = (numero_ == "uno") ? "1" : "0";
		System.out.println(contador_);
		
		// Ejercicio 3
		int numero1x = 4;
		String esPar = (numero1x % 2 == 0) ? "Par" : "Impar";
		System.out.println(esPar);
		
		// Ejercicio 4
		String diaSemana = "Lunes";
		String ocupado = (diaSemana == "Sabado" || diaSemana == "Domingo") ? "Libre" : "Ocupado";
		System.out.println(ocupado);
		
		
		
		// CONDICIONALES (if / else)
		
		System.out.println("\n CONDICIONALES if / else: ");
		
		int edad = 22;
		if (edad >= 18) {
			System.out.println("Es +18");
		}
		else {
			System.out.println("Es menor de edad");
		}

		/* En este ejemplo de la pag.10 de "UD2. Estructuras de control"
		Empieza con "Mayor de 10", "Mayor de 50" y "Mayor que 80", entonces da la primera corrección, da mayor que 10, aunque pongamos 90 y sea mayor de 80 sigue dando "Mayor de 10".
		Por eso hemos corregido y puesto así, porque ejecuta la primera y no da las restantes, por eso especificar ordenadamete.
		La condición más restrictiva la hemos puesto la primera.
		 */
		
		int num1 = 70;
		if (num1 > 80) {
			System.out.println("Mayor que 80");
		}
		
		else if (num1 > 50) {
			System.out.println("Mayor de 50");
		}
		
		else if (num1 > 10) {
			System.out.println("Mayor de 10");
		}
		
		// TAREAS "DAW-GarciaRuiz_Ruben-48703997W-A2_Boolean"
		
		int numero1 = 5;
		int numero2 = 3;
		int numero3 = 8;
		
		System.out.println(numero1 >= numero2 && (numero1 + numero2) == numero3);
		
		boolean operacion = true;
		System.out.println(operacion = numero1 == numero2);
		System.out.println(operacion = !(numero1 != numero2));
		
		// Ejercio 3 de boolean
		System.out.println("\nEjercio 3 de boolean");
		boolean opcion1 = true;
		boolean opcion2 = false;
		boolean opcion3 = false;
		boolean opcion4 = true;
		
		// cuando es && (que significa "y") cuando es "y" e "y", como no se cumplen los 2, coge la falsa, que en este caso es la segunda opción, la false
		System.out.println(opcion1 && opcion2 && opcion3 && opcion4);
		// cuando es || (que significa "o") prima el primero que pongas (porque es uno u otro, vale el primero) 
		System.out.println(opcion1 || opcion2 || opcion3 || opcion4);
		
		System.out.println((opcion1 || opcion2) && (opcion3 || opcion4));
		System.out.println((!opcion1 || opcion2) && (opcion3 || opcion4));
		System.out.println((!opcion1 || opcion2) && (opcion3 || !opcion4));
		System.out.println((!opcion1 && opcion2)&& opcion3);
		System.out.println((!opcion1 && opcion2)&& (!opcion3));
		
		
	}

}
