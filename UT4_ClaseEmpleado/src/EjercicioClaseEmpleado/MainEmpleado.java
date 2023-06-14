package EjercicioClaseEmpleado;

public class MainEmpleado {

	public static void main(String[] args) {
		
																			// Requisitos para cobrar el plus (mas de 30 años y cobrar una comision de mas de 200 euros)
		Comercial comercial1 = new Comercial("Ruben", 30, 1500.00, 500);	// Cobraria el plus
		Comercial comercial2 = new Comercial("Manu", 18, 1400.00, 300);		// No cobraria el plus
		Comercial comercial3 = new Comercial("Miguel", 30, 1000.00, 150);	// No cobraria el plus
		Comercial comercial4 = new Comercial("Pedro", 30, 1000.00, 200);	// Cobraria el plus (30 años y 200 euros, los mismos numeros ambos inclusive para ganarla)

																						// Requisitos para cobrar el plus (menos de 25 años y repartir en la “zona 3”)
		Repartidor Repartidor1 = new Repartidor("Ruben Garcia", 25, 1300.00, "zona 3");	// Cobraria el plus (25 años justos y zona 3)
		Repartidor Repartidor2 = new Repartidor("Federico Po", 20, 1100.00, "zona 13");	// No cobraria el plus (Por: zona 13, no es zona 3)
		Repartidor Repartidor3 = new Repartidor("Mikel Ander", 26, 1200.00, "zona 3");	// No cobraria el plus (Por: 26 años, se pasa de 25)
		Repartidor Repartidor4 = new Repartidor("Jimmy Ruiz", 19, 1080.00, "zona 3");	// Cobraria el plus (19 años y zona 3)

		
		System.out.println("__________________________________________________");
		System.out.println("COMERCIALES: ");
		System.out.println("El comercial: " + comercial1.getNombre() + " con edad de " + comercial1.getEdad() + " tiene un sueldo de " + comercial1.getSalario() + " y una comision de " + comercial1.getComision() + " euros. Por lo que el plus es: " + comercial1.plus() + "\n");
		System.out.println("El comercial: " + comercial2.getNombre() + " con edad de " + comercial2.getEdad() + " tiene un sueldo de " + comercial2.getSalario() + " y una comision de " + comercial2.getComision() + " euros. Por lo que el plus es: " + comercial2.plus() + "\n");
		
		System.out.println("__________________________________________________");
		System.out.println("REPARTIDORES: ");
		System.out.println("El repartidor: " + Repartidor1.getNombre() + " con edad de " + Repartidor1.getEdad() + " tiene un sueldo de " + Repartidor1.getSalario() + " y reparte en " + Repartidor1.getZona() + ". Por lo que el plus es: " + Repartidor1.plus() + "\n");
		System.out.println("El repartidor: " + Repartidor2.getNombre() + " con edad de " + Repartidor2.getEdad() + " tiene un sueldo de " + Repartidor2.getSalario() + " y reparte en " + Repartidor2.getZona() + ". Por lo que el plus es: " + Repartidor2.plus() + "\n");
		System.out.println("El repartidor: " + Repartidor3.getNombre() + " con edad de " + Repartidor3.getEdad() + " tiene un sueldo de " + Repartidor3.getSalario() + " y reparte en " + Repartidor3.getZona() + ". Por lo que el plus es: " + Repartidor3.plus() + "\n");

// 		System.out.println("\n");

		
		
	}

}
