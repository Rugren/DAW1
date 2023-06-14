package UT5_Arrays1;

public class Clase7 {
	
	/* EJERCICIO 7
	Teniendo un vector con los valores que queramos, crea otro de la misma longitud,
	aquellos que sean pares y mayores que 25. Después, mostrar el vector de origen y el de
	destino, solo los numeros introducidos.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] VectorOrigen = { 5, 10, 15, 20, 25, 30, 35, 40, 42, 45, 48, 50};
		int[] VectorDestino = new int[VectorOrigen.length];
		int indice = 0;

		for (int i = 0; i < VectorOrigen.length; i++) {
			
			if (VectorOrigen[i] % 2 == 0 && VectorOrigen[i] > 25) {
				VectorDestino[indice] = VectorOrigen[i];
				indice++;
			}
		}

//	1.0-Syso Dejar este syso y el de dentro del for, porque; (Dejar los 4 sysos que hay, sin tocarlos)
//	1.1 Si ponia: System.out.print("Vector de VectorOrigen: " + VectorOrigen[i] + " ");
//	1.2 Imprimia en consola 2 veces por el bucle, salia: Vector de VectorOrigen: 30 Vector de VectorOrigen: 40 
	
		System.out.print("Vector de Origen: "); // No tocar este syso (ver arriba el 1.0-Syso)

		for (int i = 0; i < VectorOrigen.length; i++) {
			if (VectorOrigen[i] % 2 == 0 && VectorOrigen[i] > 25) {
				System.out.print(VectorOrigen[i] + " "); // No tocar este syso (ver arriba el 1.0-Syso)
			}
		}
		System.out.println(); // No tocar este syso (ver arriba el 1.0-Syso)

		System.out.print("Vector de Destino: "); // No tocar este syso (ver arriba el 1.0-Syso)
		for (int i = 0; i < indice; i++) {
			System.out.print(VectorDestino[i] + " ");
		}
		System.out.println(); // No tocar este syso (ver arriba el 1.0-Syso)
		
	}

}
