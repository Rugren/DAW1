package profesor.sanvalentin;

public class Video {
    private String nombre;
    private int duracionSegundos;
    private int[] calidad;

    public Video(String nombre, int duracion, int[] calidad){
        if (calidad == null)
            this.calidad = new int[]{1920, 1080};
        else
            this.calidad = calidad;
        this.duracionSegundos = duracion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public int[] getCalidad() {
        return calidad;
    }
}
