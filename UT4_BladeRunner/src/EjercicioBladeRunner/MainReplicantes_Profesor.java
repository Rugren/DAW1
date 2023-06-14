package EjercicioBladeRunner;

import java.util.LinkedList;

public class MainReplicantes_Profesor {
    public static void main(String[] args) {

        Replicante_Profesor roy = new Replicante_Profesor("Roy Batty", 20, 10);
        Replicante_Profesor laRubia = new Replicante_Profesor("La de Kill Bill", 15, 7);
        Replicante_Profesor caraTonto = new Replicante_Profesor("Cara Tonto", 3, 2);

        LinkedList<Replicante_Profesor> misRep = new LinkedList<>();
        misRep.add(roy);

        System.out.println(roy);

        Replicante_Profesor.addReplicante(roy);
    }
}
