package profesor.sanvalentin;

public class Flor {
    private Color color;
    private Float precio;
    private String nombre;

    public Flor(Color color, Float precio, String nombre){
        this.color = color;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Color getColor() {
        return color;
    }

    public Float getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        Flor f;
        try {
            f = (Flor) obj;
        } catch(Exception e){
            return false;
        }
        return this.nombre.equals(f.nombre) && this.color == f.color;
    }

    @Override
    public String toString() {
        return "{nombre: " + this.nombre +
                ", precio: " + this.precio +
                ", color: " + this.color
                + "}";
    }
}
