
public class BoletinCondicionalesBucles_E26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int contadorNumeros = 0;
		
		for (int i = 10; i < 45; i++) {
			
			System.out.println(i);
			
			int divisiblePor3 = i;
			if ( divisiblePor3 %3 == 0) {
			System.out.println(i + " Es divisible por 3");
			}
	
			contadorNumeros++;
		}
		

		
	}

}
