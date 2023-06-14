package EjercicioClaseLibro;

public class MainLibro {

	public static void main(String[] args) {
		
		// Constructor con parametros
		Libro libro1 = new Libro ("El Quijote", "Cervantes", 5, 1); // Hay 5 libros y se ha prestado 1.
		
		// Constructor por defecto
		Libro libroCualquiera = new Libro ();

		
		// Constructor con parametros
		System.out.println("Constructor con parametros:");
		System.out.println("Nombre del libro: " + libro1.getTituloLibro() + ". Autor: " + libro1.getAutor() + ". Numero total de ejemplares de este libro: " + libro1.getNumEjemplaresDeUnLibro() + ". Numero de ejemplares prestados de este libro: " + libro1.getNumEjemplaresDeUnLibroPrestado() + "\n");
		
		// Constructor por defecto
		System.out.println("Constructor por defecto:");		
		System.out.println("Nombre del libro: " + libroCualquiera.getTituloLibro() + ". Autor: " + libroCualquiera.getAutor() + ". Numero total de ejemplares de este libro: " + libroCualquiera.getNumEjemplaresDeUnLibro() + ". Numero de ejemplares prestados de este libro: " + libroCualquiera.getNumEjemplaresDeUnLibroPrestado() + "\n");
		//	System.out.println("Numero de ejemplares del libro" + "(" + libroCualquiera.getTituloLibro() + "): " + libroCualquiera.getNumEjemplaresDeUnLibro());
		//	System.out.println("Numero de ejemplares del libro prestado" + "(" + libroCualquiera.getTituloLibro() + "): " + libroCualquiera.getNumEjemplaresDeUnLibroPrestado());
		

System.out.println("______________________________________________________");		
		libro1.anadirMasEjemplares(3); // anadido 3 ejemplares del libro1 El Quijote a los 5 que habian, en total ahora = 8.
		libro1.anadirMasEjemplares(-1); // anadido -1 ejemplares del libro1 El Quijote, a los 8 que habian(linea anterior que doy +3), en total ahora = 7.
		
		libro1.EjemplaresDeUnLibroPrestado(1); // 1 libro prestado que he puesto, mas 1 que puse prestado al crear el libro1 El Quijote, en total ahora prestados = 2.
		libro1.EjemplaresDeUnLibroPrestado(2); // vuelvo a prestar 2 libros mas del libro1 El Quijote, en total ahora prestados = 4.		

		System.out.println("1- Numero de ejemplares del libro" + "(" + libro1.getTituloLibro() + "): " + libro1.getNumEjemplaresDeUnLibro());
		System.out.println("2- Numero de ejemplares del libro" + "(" + libro1.getTituloLibro() + ") prestados: " + libro1.getNumEjemplaresDeUnLibroPrestado());

		System.out.println("3- Se ha podido prestar: " + libro1.prestamo()); // este "numEjemplaresDeUnLibroPrestado" solo devolvera verdadero o falso.
		
		// Me tiene que devolver 3. Porque hay 7 disponibles y 4 prestados. Hecha la resta en el metodo "NumeroEjemplaresDeUnLibroDisponibles".
		System.out.println("4- Si quedan ejemplares disponibles, estos son: " + libro1.NumeroEjemplaresDeUnLibroDisponibles());
		
		// Si no hay libros prestados no se pueden devolver.
		System.out.println("5- Devolucion: " + libro1.devolucion());


System.out.println("______________________________________________________");		
		// Libro 2:
//		Libro libro2 = new Libro ("La casa de Bernarda Alba", "Federico Garcia Lorca", 10, 3); // Hay 10 libros y se han prestado 3.	
System.out.println("______________________________________________________");		
		



/*	Esta bien, pero creo que no lo pide el ejercicio:
	Estos 2 import ponerlos arriba encima del "public class MainLibro". 
 		import java.util.Scanner;
		import java.util.ArrayList; 

		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> biblioteca = new ArrayList<Libro>();
*/		
		
/*		SUSTITUIDO elQuijote por libro1 arriba, porque es mejor para crear libro2, libro3, etc.
		Libro_casa elQuijote = new Libro_casa ("El Quijote", "Cervantes", 2, 1);
		Libro_casa libroCualquiera = new Libro_casa ();

		System.out.println("Nombre del libro: " + elQuijote.getTituloLibro() + ". Autor: " + elQuijote.getAutor());
		System.out.println("Nombre del libro: " + libroCualquiera.getTituloLibro() + ". Autor: " + libroCualquiera.getAutor());
		
		
		
		elQuijote.setNumEjemplaresLibros(3); // anadido 3 ejemplares del libro El Quijote.
		System.out.println("Numero de ejemplares del libro" + "(" + elQuijote.getTituloLibro() + "): " + elQuijote.getNumEjemplaresLibros());
	//	System.out.println("Numero de ejemplares del libro" + "(" + libroCualquiera.getTituloLibro() + "): " + libroCualquiera.getNumEjemplaresLibros());

		
	//+ System.out.println(elQuijote.numEjemplaresDeUnLibroPrestado()); // este "numEjemplaresDeUnLibroPrestado" solo devolvera verdadero o falso.
		System.out.println("Numero de ejemplares del libro prestado" + "(" + elQuijote.getTituloLibro() + "): " + elQuijote.getNumEjemplaresDeUnLibroPrestado());
	//	System.out.println("Numero de ejemplares del libro prestado" + "(" + libroCualquiera.getTituloLibro() + "): " + libroCualquiera.getNumEjemplaresDeUnLibroPrestado());
*/

	}

}
