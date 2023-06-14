package figurasProfesor;

// En esta clase Triangulo debemos completar todas las secciones de código marcadas con TODO

public class figurasProfesorTriangulo {

    // Atributos
    private figurasProfesorPunto p1;
    private figurasProfesorPunto p2;
    private figurasProfesorPunto p3;

    //TODO Este constructor debe asignar los puntos p1, p2 y p3 pasados como parámetros a los
    // atributos del punto que se va a crear
    public figurasProfesorTriangulo(figurasProfesorPunto p1, figurasProfesorPunto p2, figurasProfesorPunto p3){

    }

    //TODO Crea otro constructor de Triangulo, esta vez sin parámetros, que coloque los
    // puntos del Triangulo que se va a crear en las posiciones (0, 0) (1, 0) y (1, 2)

    //TODO Crea los métodos get de p1, p2 y p3

    //TODO Crea los métodos set de p1, p2 y p3

    public boolean comprobarTriangulo(){
        int a = (int) Math.ceil(Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2)));
        int b = (int) Math.ceil(Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(), 2)));
        int c = (int) Math.ceil(Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2)));

        return (a == b && b == c);
    }
}
