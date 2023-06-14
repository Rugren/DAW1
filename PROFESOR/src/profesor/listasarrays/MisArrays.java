package profesor.listasarrays;

import java.util.Arrays;
import java.util.LinkedList;

public class MisArrays {
    public static void main(String[] args) {

        Pokemon charmander = new Pokemon();
        Pokemon squirtle = new Pokemon();
        Pokemon bulbasaur = new Pokemon();
        Pokemon celebi = new Pokemon();
        Pokemon mew = new Pokemon();
        Pokemon garchomp = new Pokemon();

        Pokemon rattata = new Pokemon();
        Pokemon pidgey = new Pokemon();
        Pokemon metapod = new Pokemon();
        Pokemon zubat = new Pokemon();
        Pokemon caterpie = new Pokemon();
        Pokemon magickarp = new Pokemon();

        Pokemon[] miEquipo = {caterpie, squirtle, bulbasaur, celebi, mew, garchomp};
        Pokemon[] equipoRival = {caterpie, pidgey, metapod, zubat, charmander, magickarp};

        Pokemon pokemonActualEquipo1 = miEquipo[0];
        Pokemon pokemonActualEquipo2 = equipoRival[0];

        pokemonActualEquipo1 = miEquipo[2];

        caterpie.subirNivel();

        System.out.println(caterpie.getNivel());
        System.out.println(miEquipo[0].getNivel());
        System.out.println(equipoRival[0].getNivel());








    }
}
