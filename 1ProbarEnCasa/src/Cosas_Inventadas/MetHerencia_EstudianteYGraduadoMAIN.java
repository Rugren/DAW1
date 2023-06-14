package Cosas_Inventadas;

public class MetHerencia_EstudianteYGraduadoMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetHerencia_Estudiante estudiante1 = new MetHerencia_Estudiante("Juan", 28, "Universidad de Murcia");
		MetHerencia_EstudianteGraduado estudiante2 = new MetHerencia_EstudianteGraduado("Ruben", 30, "Universidad de Sevilla",
				"Maestria en Ciencias de la Informatica");

		System.out.println("Estudiante 1 - Nombre: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad()
				+ ", Universidad: " + estudiante1.getUniversidad());
		System.out.println("Estudiante 2 - Nombre: " + estudiante2.getNombre() + ", Edad: " + estudiante2.getEdad()
				+ ", Universidad: " + estudiante2.getUniversidad() + ", Programa de Graduacion: "
				+ estudiante2.getPrograma());	


	}

}
