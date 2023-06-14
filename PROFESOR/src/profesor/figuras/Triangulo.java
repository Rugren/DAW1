package profesor.figuras;

// En esta clase Triangulo debemos completar todas las secciones de código marcadas con TODO

public class Triangulo extends Figura{
    public static final String COLOR = "ROJO";
    private String color;
    public Triangulo(String color, Punto posicion){
        super();
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void imprimirNombre(){
        System.out.println(super.getNombre());
    }
}
