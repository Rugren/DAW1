package EjercicioBladeRunner;

public class MainBladeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Personaje creado:
		ClaseBladeRunner RickDeckard = new ClaseBladeRunner ("RickDeckard", 5, 10, enumEstado.VIVO);
		ClaseBlaster BlasterDeRickDeckard = new ClaseBlaster (5, 10, 1);
		System.out.println(RickDeckard.getNombre() + ": tiene " + RickDeckard.getBlaster() + " disparos, " 
		+ RickDeckard.getEscudo() + " de escudo" + " y su estado es " + RickDeckard.getEstado());
		
// *BORRAR CUANDO LO HAGA: 1.1 borrar "laRubia" cuando solucione abajo lo de atacar
// 1.2 ClaseBladeRunner laRubia = new ClaseBladeRunner("La de Kill Bill", 15, 7);
		
		// Replicantes creados:
		ClaseReplicante RoyBattyReplicante1 = new ClaseReplicante ("RoyBattyReplicante1", enumEstado.VIVO);
		//1.1 si creo varios replicantes, con este contador me los iria sumando...
		//1.2 (ir poniendo un syso debajo de cada nueva creacion para saber cuantos tenemos en cada momento):
		System.out.println("Replicante " + RoyBattyReplicante1.getNombreReplicante() + " creado");
		System.out.println("Numero de replicantes en partida: " + ClaseReplicante.getNumReplicantes());
		
		//Creamos otro nuevo replicante:
		ClaseReplicante Replicante2 = new ClaseReplicante ("Replicante2", enumEstado.VIVO);
		ClaseReplicante Replicante3 = new ClaseReplicante ("Replicante3", enumEstado.VIVO);
		//Suma al contador de replicantes Replicante2 y con Replicante3 ya tendriamos 3 replicantes:
		System.out.println("Replicante " + Replicante2.getNombreReplicante() + " creado");
		System.out.println("Replicante " + Replicante3.getNombreReplicante() + " creado");
		System.out.println("Numero de replicantes en partida: " + ClaseReplicante.getNumReplicantes());

		BlasterDeRickDeckard.disparar(BlasterDeRickDeckard);
		System.out.println(RickDeckard.getNombre() + " ha disparado(Numero de disparos disponibles: " 
		+ BlasterDeRickDeckard.getDisparosDisponibles() + ")" );
		
		
		
		//1.1 Sin disparar, supongamos que un BladeRunner muere (para comprobar si funciona 
		//1.2 nuestro contador "numBladeRunners") que cuenta los BladeRunner disponibles.
		RickDeckard.setEstado(enumEstado.MUERTO);
		System.out.println("El estado de " + RickDeckard.getNombre() + " es " + RickDeckard.getEstado());
		
// NO CONSIGO QUE RESTEN en el contador con el "comoSeEncuentraElBladeRunner"		
		System.out.println("BladeRunner disponibles: " + ClaseBladeRunner.getComoSeEncuentraElBladeRunner());		
		System.out.println("BladeRunner disponibles: " + ClaseBladeRunner.getNumBladeRunners());
		
		
		//1.3 Sin disparar, supongamos que un Replicante muere (para comprobar si funciona 
		//1.4 nuestro contador "numReplicante") que cuenta los Replicante disponibles.
		RoyBattyReplicante1.setEstado(enumEstado.MUERTO);
		System.out.println("El estado de " + RoyBattyReplicante1.getNombreReplicante() + " es " + RoyBattyReplicante1.getEstado());
		System.out.println("Replicantes disponibles: " + ClaseReplicante.getNumReplicantes());

		
		
/*	solucionar lo de atacar unos con otros, si tiene que estar en la misma clase o no.		
		System.out.println("\nATACANDO");
		RoyBattyReplicante1.atacarAReplicante(Replicante3);
		System.out.println(RoyBattyReplicante1.getAtacarAReplicante());
		System.out.println(Replicante3.getAtacarAReplicante());
		System.out.println("Replicantes disponibles despues de ataques: " + ClaseReplicante.getNumReplicantes());
		
		RickDeckard.atacarABladeRunner(RickDeckard);
		System.out.println(RickDeckard.getAtacarABladeRunner());
		System.out.println(RickDeckard.getComoSeEncuentraElBladeRunner());
*/		
		
		
		// solucionar para que puedan atacar los replicantes y otra ne clasebladerunner que tambien pueda atacar
// tendría que hacer uno de atacar en ClaseReplicantes y otro wn clasebladerunner.
		/*
		RickDeckard.atacar(caraTonto);
		System.out.println("El ataque de " + RickDeckard.getNombre() + ": " + RickDeckard.atacar(caraTonto));
		System.out.println("Numero de replicante final: " + ClaseReplicante.getNumReplicantes());

		// cambiar vitalidad por estado.VIVO || (es o) estado.HERIDO que ataque
		while (RickDeckard.getVitalidad() > 0) {
			laRubia.atacar(RickDeckard);
		}
*/		
		
		
/*
		roy.atacar(caraTonto);
		System.out.println("El ataque de " + roy.getNombre() + ": " + roy.atacar(caraTonto));
		System.out.println("Numero de replicante final: " + Replicante_mio.getNumReplicantes());

		
		while (roy.getVitalidad() > 0) {
			laRubia.atacar(roy);
		}
 */
		

	}

}
