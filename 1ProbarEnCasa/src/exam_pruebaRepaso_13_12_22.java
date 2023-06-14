
public class exam_pruebaRepaso_13_12_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String textoPrueba = "Hola MunDo";
		int longitud = textoPrueba.length();
		int numeroMayus = 0;
		int numeroEspacios = 0; // el "espacio", en codigo ascii es el 32.
		
		for (int i = 0; i < longitud; i++) {
			if ((int)textoPrueba.charAt(i) >= 65 && (int)textoPrueba.charAt(i)<=90) {
				numeroMayus++;
			}
			else if ((int)textoPrueba.charAt(i) == 32)
			// si est� entre 65 y 90 imprime mayusculas
			System.out.println(i + ": " + (int)textoPrueba.charAt(i));
			numeroEspacios ++;
		}
		System.out.println("El numero de mayusculas es: " + numeroMayus);
		System.out.println("El numero de espacios es: " + numeroEspacios);
		// codigo ascii conversi�n de letras a numeros.
		

		
		// Vamos a cambiar la letra a por la s.
		String frase = "Hola mi nombre es Pepe, el del huevo repe";
		int longitudfrase = frase.length();

		String nuevaFrase = frase.replace('a', 's');
		// hemos creado un nuevo String, donde mete la palabra cambiada
		
		System.out.println(nuevaFrase);
		//
		
		
		// Vamos a cambiar la letra a por la s. CON UN BUCLE
		
		String frase1 = "Oleee, como estas";
		int longitudfrase1 = frase1.length();

		String nuevaFrase1 = "";
		
		for (int i = 0; i < longitudfrase1; i++) {
			if (frase1.charAt(i) == 'e')
				nuevaFrase1 = nuevaFrase1 + 'x';
			else
				nuevaFrase1 = nuevaFrase1 + frase1.charAt(i);
		}
	
		System.out.println(nuevaFrase1);
		//
		
		
		
	}

}
