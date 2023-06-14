package profesor.musica;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integrante> beatles = new LinkedList<>();
        List<Integrante> pearlJam = new LinkedList<>();

        Integrante ringo = new Integrante("Ringo",
                new Instrumento("bateria", Familia.PERCUSION));
        Integrante paul = new Integrante("Paul",
                new Instrumento("bajo", Familia.CUERDA));

        Integrante eddie = new Integrante("Eddie",
                new Instrumento("guitarra", Familia.CUERDA));


        Integrante phil = new Integrante("Phil",
                new Instrumento("bateria", Familia.PERCUSION));

        beatles.add(ringo);
        beatles.add(paul);
        pearlJam.add(eddie);

        /*for (Integrante integrante: beatles) {
            System.out.println(integrante);
        }

        for (Integrante integrante: pearlJam) {
            System.out.println(integrante);
        }*/

        HashMap<String, List<Integrante>> grupos = new HashMap<>();
        grupos.put("The Beatles", beatles);
        grupos.put("Pearl Jam", pearlJam);

        Integrante integranteEliminar = new Integrante("Ringo",
                new Instrumento("bateria", Familia.PERCUSION));

        grupos.get("The Beatles").remove(integranteEliminar);
        grupos.get("The Beatles").add(phil);


        /*HashMap<String, Integer> nueva = new HashMap<>();
        nueva.put("Alberto", 33);
        nueva.put("Breyner", 51);
        nueva.put("Manuel", 85);

        System.out.println(nueva.values());
        System.out.println(nueva.keySet());

        System.out.println(nueva.get("Alberto"));*/

        System.out.println(grupos.values());


    }
}
