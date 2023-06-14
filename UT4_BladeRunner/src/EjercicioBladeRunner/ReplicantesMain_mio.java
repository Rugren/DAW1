package EjercicioBladeRunner;

import java.util.LinkedList;
public class ReplicantesMain_mio {

	public static void main(String[] args) { // Esto ponerlo "throws InterruptedException {" cuando en el otro tuviese el "try")

		// TODO Auto-generated method stub

		Replicante_mio roy = new Replicante_mio ("Roy Batty", 20, 10);
		Replicante_mio laRubia = new Replicante_mio("La de Kill Bill", 15, 7);
		
		System.out.println(Replicante_mio.getNumReplicantes());
		
		Replicante_mio caraTonto = new Replicante_mio ("Cara Tonto", 3, 2);
		System.out.println(Replicante_mio.getNumReplicantes());
		
		roy.atacar(caraTonto);
		System.out.println("El ataque de " + roy.getNombre() + ": " + roy.atacar(caraTonto));
		System.out.println("Numero de replicante final: " + Replicante_mio.getNumReplicantes());

		
		while (roy.getVitalidad() > 0) {
			laRubia.atacar(roy);
		}
		
/*	Comentada la lista porque algo no iba, pero estaba bien redactada, no daba fallo.
		LinkedList<Replicante> misRep = new LinkedList<>();
		misRep.add(roy);
		Replicante.addReplicante(roy);
*/		
		
	}

}
