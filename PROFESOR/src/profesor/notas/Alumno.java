package profesor.notas;

import java.util.Random;

public class Alumno {
    private String nombre;
    private int nota;
    private Random rnd;

    public Alumno(String nombre){
        this.nombre = nombre;
        rnd = new Random();
        this.nota = rnd.nextInt(10) + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota() {
        this.nota = rnd.nextInt(10) + 1;
    }
}
