package Profesor_jugadores;

public abstract class Prof_Equipo {
    private int salario;
    private String nombre;

    public Prof_Equipo(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }
}
