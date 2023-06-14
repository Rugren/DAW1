
public class E2_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumaPares = 0;
		int sumaImpares = 0;
		
		for (int i = 1; i <= 100; i++) {

			if ( i % 2 == 0) {
			sumaPares = sumaPares + i;
			}
		else {
			sumaImpares = sumaImpares + i;
			
		}
		}
		System.out.println("Suma de todos los pares: " + sumaPares);
		System.out.println("Suma de todos los impares: " + sumaImpares);
	
	}
	

}
