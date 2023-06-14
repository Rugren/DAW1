package jugadores;

// Utilizar este. En el del paquete "package profesor.jugadores;" hay menos cosas

public class jugador {
	private Equipo equipo;
	
	private String nombre;
	private int edad;

	public String getNombre(String nombre) {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad(int edad) {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	// ____________
	
	public jugador(Equipo equipo) {
		this.equipo = equipo;
	}
	
	public Equipo getEquipo() {
		return equipo;
	}

}
