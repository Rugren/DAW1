package Cosas_Inventadas;

	// Ahora, podemos crear una nueva clase llamada "Estudiante" 
	// que herede de la clase "Persona". 
	// Esta nueva clase tendrá su propio atributo "carrera" y 
	// también tendrá un método adicional llamado "estudiar":

	public class MetHerencia_PersonaEstudiante extends MetHerencia_Persona {
	    private String carrera;
	    
	    public MetHerencia_PersonaEstudiante(String nombre, int edad, String carrera) {
	        super(nombre, edad); // para coger el mismo nombre y edad que Persona al crearlo
	        this.carrera = carrera;
	    }
	    
	    public void estudiar() {
	        System.out.println(nombre + " esta estudiando " + carrera + ".");
	    }
	    
	    public void cambiarCarrera(String nuevaCarrera) {
	        carrera = nuevaCarrera;
	    }
	}



