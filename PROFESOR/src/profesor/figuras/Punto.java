package profesor.figuras;

// En esta clase Punto debemos completar todas las secciones de código marcadas con TODO
// Para probar toda la funcionalidad, crea una clase Main, con un método main y dentro,
// crea varios puntos, cada punto en una posición distinta. Prueba todos los métodos.

public class Punto {
    // Atributos
    private float x;
    private float y;
    private static int contadorPuntos;

    // Métodos
    // [visibilidad] [nombre_clase]([lista_parametros_separados_por_comas]) {}
    public Punto(float pX, float pY){
        contadorPuntos++;
        this.x = pX;
        this.y = pY;
    }

    // TODO: Crea un constructor de Punto sin parámetros, que cree un punto en la posición (0, 0)

    // Métodos get
    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    //TODO: Basándote en el método setX, crea el método setY para

    public void setX(float pX){
        this.x = pX;
    }

    public static int getContadorPuntos() {
        return contadorPuntos;
    }

    public void moverAPunto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    //TODO: Crea un método desplazarPunto, que reciba como parámetro un número pX y un número pY
    // El método debe desplazar el atributo x sumando pX y el y sumando pY

    //TODO: Crea un método moverACentro, que no recibe ningún parámetro y mueve el punto a las
    // coordenadas (0, 0)
}
