package clases_dia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class clase_23_02_22_LibroMain {
    public static void main(String[] args) {
        HashMap<String, clase_23_02_22_Libro> libros = new HashMap<>();
        libros.put("Dune", new clase_23_02_22_Libro("Dune", 686));
        libros.put("La sirenita", new clase_23_02_22_Libro("La sirenita", 120));
        libros.put("EDurne", new clase_23_02_22_Libro("EDurne 2", 100));
        libros.put("EDurne", new clase_23_02_22_Libro("EDurne 3", 20));


        System.out.println(libros.get("EDurne"));

        System.out.println(libros.keySet());

        System.out.println(libros.values());

        System.out.println(libros.containsValue(new clase_23_02_22_Libro("Dune2", 23987423)));
        // ¿el libro "Dune" contiene 686 paginas¿, como es que si, devuelve true.
        System.out.println(libros.containsValue(new clase_23_02_22_Libro("Dune", 686)));
    }
}
