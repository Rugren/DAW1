package profesor.animales;

import java.util.LinkedList;

public class MainAnimales {
    public static void main(String[] args) {
        LinkedList<Animal> arca = new LinkedList<>();

        Cabra cabrallo = new Cabra("Azules", "Ano", 4, 6, 40);
        Mirlo pepe = new Mirlo("Amarillos", "Cloaca", 2, "Negro");

        arca.add(cabrallo);
        arca.add(pepe);

        for (Animal a: arca) {
            System.out.println(a);
        }
    }
}
