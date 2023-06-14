package clases_dia;

import java.util.Objects;

public class clase_23_02_22_Libro {
    private String nombre;
    private int cantidadPaginas;

    public clase_23_02_22_Libro(String nombre, int cantidadPaginas){
        this.nombre = nombre;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        clase_23_02_22_Libro libro = (clase_23_02_22_Libro) o;
        return cantidadPaginas == libro.cantidadPaginas && Objects.equals(nombre, libro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidadPaginas);
    }
}
