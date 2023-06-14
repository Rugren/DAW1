package profesor.notas;

import java.util.Arrays;
import java.util.Random;

public class MainNotas {
	// ver ejercicio clase_23_02_01_Arrays_for_Iva_hacerAsiSIEMPRE
    public static void main(String[] args) {
        int[] notas = new int[29];
        Random rnd = new Random();

        for(int i = 0; i < notas.length; i++){
            notas[i] = rnd.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(notas));

        int suspensos = 0;
        for (int nota: notas) {
            if(nota < 5)
                suspensos++;
        }

        System.out.println("Hay " + suspensos + " suspensos. Juju!");
    }
}
