package profesor.replicantes;

import java.util.LinkedList;

public class MainReplicantes {
    public static void main(String[] args) {

        Replicante roy = new Replicante("Roy Batty", 20, 10);
        Replicante laRubia = new Replicante("La de Kill Bill", 15, 7);
        Replicante caraTonto = new Replicante("Cara Tonto", 3, 2);

        LinkedList<Replicante> misRep = new LinkedList<>();
        misRep.add(roy);

        System.out.println(roy);

        Replicante.addReplicante(roy);
    }
}
