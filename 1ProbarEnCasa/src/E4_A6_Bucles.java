import java.util.Scanner;

public class E4_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 4 A6 Bucles.
		
		System.out.println("Escribe el numero de ventas: ");
		Scanner cuantasVentas = new Scanner (System.in);
		int numeroVentas = cuantasVentas.nextInt();
	
		float valorVenta = 0;
		float sumaVentas = 0;
		
		for (int i = 1; i <= numeroVentas; i++) {
			
			System.out.println("Que valor tiene tu venta: ");
			valorVenta = cuantasVentas.nextInt();
			sumaVentas = sumaVentas + valorVenta;
			
		}
		System.out.println("Cantidad de ventas totales: " + sumaVentas);
		
		cuantasVentas.close();
		
		
	}

}
