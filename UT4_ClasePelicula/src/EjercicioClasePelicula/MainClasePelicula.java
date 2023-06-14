package EjercicioClasePelicula;

public class MainClasePelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LA PELICULA 1:
		ClasePelicula pelicula1 = new ClasePelicula();
		
		System.out.println("Pelicula 1 (Mostraremos el titulo, el Numero de votos actual y el Numero de votos despues de votar nosotros la pelicula 1): ");
		
		pelicula1.setTitulo("Avatar: The Way of Water");
		System.out.println("Titulo de la pelicula 1: " + pelicula1.getTitulo());
		
		pelicula1.setAnio(2022);
		pelicula1.setDuracion(192);
		
		//1.1 Orden de las votaciones
		pelicula1.setNumVotos(14384);
		System.out.println("+ Numero de votos: " + pelicula1.getNumVotos());
		
		//1.2
		pelicula1.setVotarPelicula(9);
//		System.out.println("Nuestro voto: " + pelicula1.getVotarPelicula()); 
		// Sale 0 nuestro voto, ver que pasa,...
		// ...Pero el contador de lo que pide el ejercicio esta bien.

		//1.3
		System.out.println("+ Numero de votos despues de realizar un voto nosotros: " + pelicula1.getNumVotos());
		
		
		
		// 2.0 Numero de criticas y el contador de criticas cuando nosotros hacemos una, mejorar
		pelicula1.setCriticas(221);
		//2.1
		//System.out.println("- Numero de criticas: " + pelicula1.getCriticas());
		
		pelicula1.setCrearCritica("No me gustaron los efectos 3D");
		//2.2
		//System.out.println("- Numero de criticas despues de realizar una critica nosotros: " +pelicula1.getCrearCritica());
		
		pelicula1.setCritica("Espectacular peli");
		//2.3
		//System.out.println("- Nuestra critica: " + pelicula1.getCritica());
		//2.4
		//System.out.println("- Numero de criticas despues de realizar una critica nosotros: " + pelicula1.getCriticas());

		pelicula1.setPuntuacion(7);
		
		
		// LA PELICULA 2:
		ClasePelicula pelicula2 = new ClasePelicula();
		
// 		(Una prueba que queria hacer): porque este syso me devuelve null en la Console?
//		System.out.println(pelicula2.getTitulo()); // Saber porque da mal el syso de get (da null en la Console) ??
//		System.out.println(pelicula2.setTitulo()); // Saber porque da mal el syso de set (da 0 en la Console) ??
		
//		Y esto por que daria 0 en console?
//		System.out.println(pelicula2.getCriticas());
		
		pelicula2.setTitulo("The Godfather");
		pelicula2.setAnio(1972);
		pelicula2.setDuracion(175);
		pelicula2.setNumVotos(173518);
		pelicula2.setCriticas(662);
		pelicula2.setCritica("De las mejores peliculas que existen");
		pelicula2.setPuntuacion(9);
		pelicula2.setVotarPelicula(8);

		if (pelicula1.getPuntuacion() >= pelicula2.getPuntuacion()) {
			System.out.println("\n La pelicula con mayor puntuacion es: " + pelicula1.getTitulo());
		} 
		else {
			System.out.println("\nLa pelicula con mayor puntuacion es: " + pelicula2.getTitulo());
		}

	}
	
	

}


//OTROS: (cosas que se pueden hacer)
		// poner el "crearCritica" del java clasepelicula.
		
		// 1.0 poner una critica (al margen de "pelicula1.setCritica", 
		// 1.1 poner con "crearCritica" para ver si sube el numero(con el "+" que le he puesto).

		// HACER numvotos dividido entre puntuacion para hacer como sea la media (aunque un voto pueda ser 1 y otro un 10, pero no sale la media realmente).
		// CUANDO VOTEMOS TENDRA QUE SUMAR A LA Critica y 
		
