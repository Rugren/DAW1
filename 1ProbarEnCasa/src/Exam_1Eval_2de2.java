import java.util.Scanner;

public class Exam_1Eval_2de2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		B. Años bisiestos (5 ptos)
		Pide al usuario dos años, entre 1500 y 2022 y calcula el número de años bisiestos entre ambos años introducidos.
		Se debe mostrar por pantalla todos y cada uno de los años bisiestos, cada uno en una nueva línea.
		Un año bisiesto cumple las siguientes condiciones:
		- No es divisible por 100 o es divisible por 400
		- Es divisible por 4
		Ambas condiciones anteriores se deben cumplir para que un año sea bisiesto.
		*/
		
		Scanner entrada = new Scanner (System.in);
		
		int contadorBisiestos = 0;
		
		System.out.println("Introduce un año entre 1500 y 2022");
		int anioUno = entrada.nextInt();
		
		System.out.println("Introduce otro año entre 1500 y 2022");
		int anioDos = entrada.nextInt();
		
		if (anioUno >= anioDos) {
			for (int i = anioDos; i <= anioUno; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
					System.out.println(i);
					contadorBisiestos++;
				}
			}
		}
		
		if (anioDos > anioUno) {
			for (int i = anioUno; i <= anioDos; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
					System.out.println(i);
					contadorBisiestos++;
				}
			}
		}
		System.out.println("Hay " + contadorBisiestos + " años bisiestos");
		        
	}

}
