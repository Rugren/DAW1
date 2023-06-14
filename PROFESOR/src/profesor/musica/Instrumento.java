package profesor.musica;

import java.util.Objects;

public class Instrumento {
    private String nombre;
    private Familia familia;

    public Instrumento(String nombre, Familia familia){
        this.nombre = nombre;
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "nombre='" + nombre + '\'' +
                ", familia=" + familia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrumento that = (Instrumento) o;
        return Objects.equals(nombre, that.nombre) && familia == that.familia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, familia);
    }
}
