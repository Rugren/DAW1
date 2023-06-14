package Cosas_Inventadas;

	// Clase derivada para estudiantes graduados que extiende de Estudiante

	public class MetHerencia_EstudianteGraduado extends MetHerencia_Estudiante {
	    private String programa;

	    public MetHerencia_EstudianteGraduado(String nombre, int edad, String universidad, String programa) { //programa seria como el programa de estudios
	        super(nombre, edad, universidad);
	        this.programa = programa;
	    }

	    public String getPrograma() {
	        return programa;
	    }
	
}
