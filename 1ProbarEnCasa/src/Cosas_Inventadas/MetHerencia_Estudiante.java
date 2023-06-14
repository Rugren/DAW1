package Cosas_Inventadas;

public class MetHerencia_Estudiante {	// el metodo herencia para crear estudiantes
	
	// Clase base para estudiantes
    private String nombre;
    private int edad;
    private String universidad;

    public MetHerencia_Estudiante(String nombre, int edad, String universidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getUniversidad() {
        return universidad;
    }
}
