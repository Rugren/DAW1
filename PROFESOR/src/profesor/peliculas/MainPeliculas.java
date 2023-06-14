package profesor.peliculas;


public class MainPeliculas {
    public static void main(String[] args) {

        int[] enteros = new int[5];
        enteros[0] = 3;
        enteros[1] = 6;
        enteros[2] = 9;
        enteros[3] = 21;
        enteros[4] = 1;

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = 5;
        }

        for (int i: enteros) {
            System.out.println(i);
        }


        for (int i: enteros) {
            i = 7;
        }

        for (int i: enteros) {
            System.out.println(i);
        }






    }
}
