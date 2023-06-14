package miercoles5;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAlumnos = 25;
		System.out.println(numAlumnos >= 25);
		
		float numeroDecimal = 3f/2;
				System.out.println(numeroDecimal);
				
		int numeroEntero = 3;
		float numeroTresPuntoCero = 3.00f;
		System.out.println(numeroEntero == numeroTresPuntoCero);
		
		Boolean iguales = 3.15 == 3;
		System.out.println(iguales);
		
		int suma = 6;
		int suma2 = 3 + 3;
		System.out.println(suma2);
		
		int edad = 20;
		edad = edad + 5;
		System.out.println(edad); // aqu� imprime 25
		
		edad = edad + 1; // el "edad + 1" es 26
		edad++; // al 26 anterior suma +1 con "edad++" y da 27
		System.out.println(edad);
		
		edad = edad - 1; // 27 - 1 = 26
		edad--; // 26 de anterior y "edad--" vuelve a restar -1, da 25. Ok.
		System.out.println(edad);
		
		int numero = 10;
		float nuevo = numero/3f;
		System.out.println(nuevo);
		
		double myDouble = nuevo;
		System.out.println("Mi variable myDouble vale: " + myDouble);
		
		
		// MARTES 11/10/22 Constantes
		
		// concatenar n�meros y letras 
		int numeroDni = 48703997;
		String letraDni = "V";
		System.out.println(numeroDni + letraDni);
				
		int a1 = 5; 
		System.out.println(a1++);
		System.out.println(a1);
		
		boolean aprobado = true;
		System.out.println(aprobado);
		
		boolean calculoErroneo = 3 == 2;
		System.out.println(calculoErroneo);
		
		int a = 3;
		int b = 5;
		String cadena = "hola";
		System.out.println( !( (a > b) || !(b == a)) ); // ver que es falso y qu� verdadero en libreta 11/10/2022 
		
		boolean tengoPrisa = true;
		int edad2 = 20;
		String nombre = "Pepe"; 
		System.out.println(! tengoPrisa && edad2 >= 18);
		
		// CASTINGS 
		
		float f = 2.2748f;
		double d = f; // CASTING TIPO Widening (es meter una cosa peque�a en otra m�s grande)
		System.out.println("�es un casting? " +  d);
		
		double m = 3.16;
		float g = (float) m; // CASTING Tipo Narrowing (Expl�cito); meter una cosa grande en una peque�a)
		System.out.println(g);
		
		/*
		 * Barra y asterisco es comentario multil�nea.
		 */
		
		// El "\n" baja a la siguiente l�nea cuando imprime la pantalla)
		
		
		// Del archivo DiaSemana creado en la clase: 25/10/22
		
		DiaSemana miDiaDeLaSemana = DiaSemana. LUNES;
		System.out.println(miDiaDeLaSemana);
		
		if (miDiaDeLaSemana == DiaSemana.SABADO || 
			miDiaDeLaSemana == DiaSemana.DOMINGO)
			System.out.println("Es fin de semana");
		else if (miDiaDeLaSemana == DiaSemana.INVALIDO)
			System.out.println("Valor inv�lido");
		else
			System.out.println("Entre semana");
			
		String miString = "Pepe";
		String miString2 = "Pepe, el grande";
		System.out.println(miString.length());
		System.out.println(miString2.length());
		 // en el miString2 CUENTA LOS ESPACIOS de "Pepe el grande".
		
		System.out.println(miString2.charAt(4)); // es del texto "Pepe el grande".
		// me coge la quinta posici�n, 
		//es decir, me coge la coma "," porque est� en esa posici�n)
		
		
		String mensajeMayuscula = "Hola may�scula";
		System.out.println(mensajeMayuscula.toUpperCase());
	//te pasa el texto a may�sculas
		System.out.println(mensajeMayuscula.replace(' ', '*'));
	//remplaza algo, hemos reemplazado el espacio en blanco por el asterisco "*".
		
		int hora = 9;
		FaseDia fase;
		
		if(hora >= 6 && hora < 14) {
			fase = FaseDia.MANYANA;
		}
		else if ( hora >= 14 && hora < 20)
			fase = FaseDia.TARDE;
		else if (( hora >=20 || hora <6) && hora >=0 && hora <=24)
			//aqu� est� hecho as� porque no puede ser mayor de 20 
			//y luego menos de 6, 
			//porque se tragar�a la m�quina el n�27, por ejemplo.
			fase = FaseDia.NOCHE;
		else
			fase = FaseDia.INVALIDO;
		System.out.println(fase);
		
		
	}

}