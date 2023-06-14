package profesor.musica;

import java.util.Objects;

public class Integrante {

    private String nombre;
    private Instrumento instrumento;

    public Integrante(String nombre, Instrumento instrumento){
        this.nombre = nombre;
        this.instrumento = instrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + nombre + '\'' +
                ", instrumento=" + instrumento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return Objects.equals(nombre, that.nombre) && instrumento.equals(that.instrumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, instrumento);
    }
}
