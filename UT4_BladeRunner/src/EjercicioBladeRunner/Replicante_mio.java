package EjercicioBladeRunner;
import java.util.LinkedList;

public class Replicante_mio {
	
	// es el ejercicio de BladeRunner (UT4_BladeRunner)

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		private static int numReplicantes = 0;
		public static LinkedList<Replicante_mio> listaReplicante;
		private String nombre;
		private int vitalidad;
		private int escudo;
		private int potencia;
		
		// public static Replicante = 0;
		
		
		public Replicante_mio (String nombre, int vitalidad, int potencia) { //int escudo) {
			this.nombre = nombre;
			this.vitalidad = vitalidad;
			this.potencia = potencia;
//			this.escudo = escudo;			
			numReplicantes++;
		//	listaReplicantes.add(this); // porque esta hecho abajo
		}
		
		public boolean atacar(Replicante_mio enemigo) {
			enemigo.vitalidad = enemigo.vitalidad - this.potencia;
			if (enemigo.vitalidad <= 0) {
				numReplicantes--;
				return true;
			}
			return false;
		}
	
		
		// esta bien pero hecho por el profesor de otra manera. Solo ha puesto: "Thread.sleep(100);"
		// poner arriba "throws InterruptedException" en el Main "ReplicantesMain"
/*
		public boolean atacar(Replicante enemigo) { // throws InterruptedException {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Ataque en otro momento");
			} //esto del "try" es por si peta que diga eso, en plan "Venga en otro momento".
			
			enemigo.vitalidad = enemigo.vitalidad - this.potencia;
			if (enemigo.vitalidad <= 0) {
				numReplicantes--;
				return true;
			}
			return false;
		}
*/		
		
		// ESTA MAL asi:, LOS get no tienen parametros (lo del parentesis)
//		public static int getNumReplicantes(int numReplicantes) {
//			return numReplicantes;
//		}
		
		// el numReplicantes es static, sino en el main petaria si quito de aqui static.
		public static int getNumReplicantes() {
			return numReplicantes;
		}
	
		public String getNombre() {
			return nombre;
		}

		
		public int getVitalidad() {
			return this.vitalidad;
			// el profesor puso "return vitalidad;"
		}
		public void setVitalidad(int vitalidad) {
			this.vitalidad = vitalidad;
		}
		
		//QUITAR LAS LISTAS, porque petan
/*	Comentada la lista porque algo no iba, pero estaba bien redactada, no daba fallo.
		public static void addReplicante(Replicante rep) {
			listaReplicante.add(rep);
		}
		public static LinkedList<Replicante> getListReplicante(){
			return (LinkedList<Replicante>) listaReplicante.clone();
		}
*/
		
/*		
		@override
		public toString() {
			dsfsddfssf
		}
*/
		
}
