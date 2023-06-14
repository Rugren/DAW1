package profesor.sanvalentin;

import java.util.Arrays;

public class MainSanValentin {
    public static void main(String[] args) {

        Flor rosa = new Flor(Color.ROJO, 2.3f, "Rosa");
        Flor lirio = new Flor(Color.AMARILLO, 2f, "Lirio");
        Flor tulipan = new Flor(Color.AMARILLO, 1f, "Tulipán");
        //int[] nuevoArray = {2000, 1000};
        Video video = new Video("videofelicitacion.mkv", 30, null);

        RamoBasico rb = new RamoBasico("Te odio");
        RamoPremium rp = new RamoPremium(video, rosa, lirio, tulipan);

        System.out.println(Arrays.toString(rp.getVideo().getCalidad()));
        rb.colocarEnTumba();

        rb.getFlores().add(new Flor(Color.ROJO, 20f, "Rosa"));
        //Flor nuevaFlor = rb.getFlores().get(0);
        rb.colocarEnTumba();
    }
}
