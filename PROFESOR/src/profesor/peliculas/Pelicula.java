package profesor.peliculas;

public class Pelicula {
    private float puntuacion;
    private String nombre;
    private String criticas;

    public Pelicula(String nombre, float puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.criticas = "";
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCriticas() {
        return criticas;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula compararPuntuacion(Pelicula peliculaAComparar){
        if (this.puntuacion >= peliculaAComparar.puntuacion) {
            return this;
        }
        else
            return peliculaAComparar;
    }

    public static String compararPuntuacionStatic(Pelicula p1, Pelicula p2){
        if (p1.puntuacion >= p2.puntuacion)
            return p1.nombre;
        else
            return p2.nombre;
    }

    public void criticar(String critica){
        this.criticas += critica + "\n------------------\n";
    }

    public String criticar(){
        return this.criticas;
    }

    /*@Override
    public String toString() {
        return "[" + this.nombre + ", " + this.puntuacion + "]";
    }*/

    @Override
    public String toString() {
        return "Pelicula{" +
                "puntuacion=" + puntuacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
