package profesor.naves;

import java.util.Objects;

public abstract class Nave {
    private String nombre;
    protected int potenciaAtaque;
    protected int cantidadDefensas;
    private int velocidad;

    public Nave(String nombre, int pA, int cD, int vel){
        this.nombre = nombre;
        this.potenciaAtaque = pA;
        this.cantidadDefensas = cD;
        this.velocidad = vel;
    }

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public int getCantidadDefensas() {
        return cantidadDefensas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPotenciaAtaque(int potenciaAtaque) {
        this.potenciaAtaque = potenciaAtaque;
    }

    public void setCantidadDefensas(int cantidadDefensas) {
        this.cantidadDefensas = cantidadDefensas;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public abstract boolean disparar(Nave rival);

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", potenciaAtaque=" + potenciaAtaque +
                ", cantidadDefensas=" + cantidadDefensas +
                ", velocidad=" + velocidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return potenciaAtaque == nave.potenciaAtaque && cantidadDefensas == nave.cantidadDefensas && velocidad == nave.velocidad && Objects.equals(nombre, nave.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, potenciaAtaque, cantidadDefensas, velocidad);
    }


}
