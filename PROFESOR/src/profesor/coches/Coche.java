package profesor.coches;

public class Coche {
    // Atributos
    private int velocidad;
    private Color color; // Elemento que queremos que tenga un valor concreto dentro de una lista de valores
    private int marcha;
    // Constante VELOCIDAD_MAXIMA
    private static final int VELOCIDAD_MAXIMA = 250;

    // Constructor
    public Coche(Color paramColor){
        this.color = paramColor;
        this.velocidad = 0;
        this.marcha = 0;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void acelerar(int km){
        int nuevaVelocidad = this.velocidad + km;
        if (nuevaVelocidad <= VELOCIDAD_MAXIMA)
            this.velocidad = nuevaVelocidad;
        else
            this.velocidad = VELOCIDAD_MAXIMA;
    }

    public void frenar(int km){
        int nuevaVelocidad = this.velocidad - km;
        if (nuevaVelocidad >= 0)
            this.velocidad = nuevaVelocidad;
        else
            this.velocidad = 0;
    }
}
