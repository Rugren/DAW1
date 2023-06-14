package profesor.notas;

import java.util.Random;

public class MainAlumnos {
	// ver ejercicio clase_23_02_01_Arrays_for_Iva_hacerAsiSIEMPRE
    public static void main(String[] args) {
        Alumno[] misAlumnos = new Alumno[29];
        String[] nombres = {"Pepe", "María", "Juan"};

        Random rnd = new Random();
        for(int i = 0; i < misAlumnos.length; i++){
            int posicionNombres = rnd.nextInt(3);
            misAlumnos[i] = new Alumno(nombres[posicionNombres]);
        }

        for (Alumno alumno:misAlumnos) {
            System.out.println(alumno.getNombre() + ": " + alumno.getNota());
        }
    }
}
