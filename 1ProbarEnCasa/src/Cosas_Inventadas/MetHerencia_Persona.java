package Cosas_Inventadas;

	// un ejemplo de herencia en Java:
	// Supongamos que tenemos una clase llamada "Persona"...
	// ...que tiene los siguientes atributos y métodos:

	public class MetHerencia_Persona {
		protected String nombre; // se paso de private a protected para poder cogerlo en el metido estudiar.
	    private int edad;
	    
	    // ESTE public MetHerencia_Persona TIENE QUE TENER EL MISMO NOMBRE QUE LE HEMOS PUESTO A LA public class, este; public class MetHerencia_Persona {
	    public MetHerencia_Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }
	    
	    public void saludar() {
	        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " anios.");
	    }
	    
	    public void cumplirAnios() {
	        edad++;
	    }
	}


