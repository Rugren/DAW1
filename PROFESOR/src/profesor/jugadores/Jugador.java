package profesor.jugadores;

// Ver " package jugadores; / public class jugador ", mejor hecho ahí.

public class Jugador {

    private String nombre;
    private int edad;

    public Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
