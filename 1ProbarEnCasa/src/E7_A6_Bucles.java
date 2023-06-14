import java.util.Scanner;

public class E7_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

		 System.out.println("Escribe una palabra que sea capicua.");
		 String capicua = sc.nextLine();

		 int mideTexto = capicua.length();
		 int texto = mideTexto / 2;
		 
		 char seLeeIgualHaciaDelante;
		 char seLeeIgualHaciaAtras;

		 for (int i = 0; i <= texto; i++) {

			for (int j = (mideTexto - 1); j > texto ; j--) {

				seLeeIgualHaciaDelante = capicua.charAt(i);
				seLeeIgualHaciaAtras = capicua.charAt(j);

				if (seLeeIgualHaciaDelante == seLeeIgualHaciaAtras) {
				System.out.println("Correcto, es una palabra capicua.");
				}

		        }
		    	}
		
		 
	}

}
