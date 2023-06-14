package profesor.figuras;

public abstract class Figura {
    private Punto posicion;
    private String nombre;

    public Figura(Punto posicion){
        this.posicion = posicion;
        this.nombre = "figura";
    }

    public Figura(){
        this.posicion = new Punto(0, 0);
        this.nombre = "figura";
    }

    public Punto getPosicion(){
        return this.posicion;
    }

    public String getNombre() {
        return nombre;
    }
}
