package examen;

import java.util.LinkedList;


public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Este es el MAIN de las Clases Bando, Bugs y Developers.

		// Juego Developers vs Bugs (basado en Plantas vs Zombies)
		
		// Creacion de personajes Developers:
		Developers developers1 = new Developers("DevelopersNumero1", 50, 150, 500);
        System.out.println(developers1);
		Developers developers2 = new Developers("DevelopersNumero2", 60, 250, 600);
        System.out.println(developers2);
		Developers developers3 = new Developers("DevelopersNumero3", 70, 350, 700);
        System.out.println(developers3);

     
        LinkedList<Developers> misDevelopers = new LinkedList<>();
        misDevelopers.add(developers1);
//        System.out.println(developers1);
        misDevelopers.add(developers2);
        misDevelopers.add(developers3);
       
        
  // HAY QUE HACER ESTO PERO NO ENCUENTRO PORQUE NO ME FUNCIONA.      
//        Developers.addDevelopers(developers1);
        
        
        // .clone
        
        

		// Creacion de personajes Bugs:
        System.out.println("\n");
        
		Bugs Bugs1 = new Bugs("BugsFiera1", 30, 100, 300);
        System.out.println(Bugs1);
		Bugs Bugs2 = new Bugs("BugsFiera2", 40, 120, 400);
        System.out.println(Bugs2);
		Bugs Bugs3 = new Bugs("BugsFiera3", 50, 140, 500);
        System.out.println(Bugs3);
        
        LinkedList<Bugs> misBugs = new LinkedList<>();       
        misBugs.add(Bugs1);
//        System.out.println(Bugs1);
        misBugs.add(Bugs2);
        misBugs.add(Bugs3);

	}

}
