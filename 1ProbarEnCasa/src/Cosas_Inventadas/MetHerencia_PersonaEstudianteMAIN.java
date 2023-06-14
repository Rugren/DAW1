package Cosas_Inventadas;

import java.util.ArrayList;
import java.util.List;

public class MetHerencia_PersonaEstudianteMAIN {
	
	// Aqui vemos Metodos, herencia y listas en este ejercicio

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// una vez lo tengamos todo en archivo: Metodos_herencia_y_listas
		// Ahora podemos crear objetos de la clase "Estudiante"...
		// ...y utilizar tanto los métodos de la clase "Persona"...
		// ... como los nuevos métodos de la clase "Estudiante". Por ejemplo:

		MetHerencia_PersonaEstudiante estudiante1 = new MetHerencia_PersonaEstudiante("ruben", 30, "informatica");
		estudiante1.saludar();
		estudiante1.estudiar();
		estudiante1.cambiarCarrera("Medicina"); // Ahora estudia Medicina.
		estudiante1.estudiar();
		estudiante1.cumplirAnios();
		estudiante1.saludar();
		
		MetHerencia_PersonaEstudiante estudiante2 = new MetHerencia_PersonaEstudiante("Juan", 20, "Ingeniería");
			
			/*
			 Este código creará un objeto "Estudiante" llamado "estudiante" con nombre "Juan", 
			 edad 20 y carrera "Ingeniería". 
			 Luego, se llaman a los métodos "saludar" y "estudiar" de la clase "Estudiante". 
			 Después, se cambia la carrera del estudiante a "Medicina" 
			 y se llama nuevamente al método "estudiar". 
			 Finalmente, se llama al método "cumplirAnios" de la clase 
			 "Persona" y luego al método "saludar" para mostrar que la edad ha aumentado en 1.
			 */

			
			// Ahora creamos 3 personas y las metemos en una lista

			MetHerencia_Persona persona1 = new MetHerencia_Persona("Ana", 25);
			MetHerencia_Persona persona2 = new MetHerencia_Persona("Carlos", 30);
			MetHerencia_Persona persona3 = new MetHerencia_Persona("Luisa", 20);

			List<MetHerencia_Persona> listaPersonas = new ArrayList<>();
			listaPersonas.add(persona1);
			listaPersonas.add(persona2);
			listaPersonas.add(persona3);

			// Iteramos sobre la lista para imprimir los datos de cada persona
			for (MetHerencia_Persona persona : listaPersonas) {
				persona.saludar();
			}

			/* En este ejemplo, creamos 3 objetos de la clase "Persona" con los nombres y edades indicados. 
			 Luego, creamos una lista llamada "listaPersonas" de tipo "Persona" 
			 y agregamos los 3 objetos creados anteriormente a la lista utilizando el método "add()". 
			 Finalmente, iteramos sobre la lista utilizando un bucle "for-each" 
			 y llamamos al método "saludar()" de cada objeto de la lista para imprimir sus datos.
			 */
		
		}


}
