package UT5_Matrices;

import java.util.Arrays;

public class UT5_Matrices_Ejercicios {
	
	
	// Los arrays son matrices (Que en el ejercicio 5 hemos puesto matriz en vez de array)
	
//__________________________________________________________________________________	
	// Metodo del ejercicio 1:
    public static int[][] crearArray1(int fila, int columna, int tamano) {
        int[][] array = new int[tamano][tamano];
        
        // Este es para asignar los 1 en la FILA indicada
        for (int i = 0; i < tamano; i++) {
            array[fila][i] = 1;
        }
        
     // Y este es para asignar los 1 en la COLUMNA indicada
        for (int i = 0; i < tamano; i++) {
            array[i][columna] = 1; // el 1 este sera lo que queramos que aparezca en la posicion
        }
        
        return array;
    }
//__________________________________________________________________________________	
 
    
    
//__________________________________________________________________________________	
  	// Metodo del ejercicio 2:
	public static int[][] crearArray2(int tamano) {
		int[][] array = new int[tamano][tamano];

		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
			}
		}
		return array;
	}
      
//__________________________________________________________________________________	
   
	
	
//__________________________________________________________________________________	
	// Metodo del ejercicio 3:
	public static int[][] crearArray3LaCruzDiagonal(int filas, int columnas) {
	    int[][] Array3LaCruzDiagonal = new int[filas][columnas];
	    
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            if (i == j || i + j == filas - 1) {
	            	Array3LaCruzDiagonal[i][j] = 1;
	            } else {
	            	Array3LaCruzDiagonal[i][j] = 0;
	            }
	        }
	    }
	    
	    return Array3LaCruzDiagonal;
	}
      
//__________________________________________________________________________________	

	
	
//__________________________________________________________________________________	
	// Metodo del ejercicio 4:
	public static int[][] crearArray4LaCruzHorizontalYVertical(int filas, int columna) {
	    int[][] Array4LaCruzHorizontalYVertical = new int[filas][columna];
	    
	    // Aqui dibuja la linea horizontal (filas)
	    int laFila = filas / 2;
	    for (int j = 0; j < columna; j++) {
	    	Array4LaCruzHorizontalYVertical[laFila][j] = 1;
	    }
	    
	    // Aqui dibuja la linea vertical (columnas)
	    int laColumna = columna / 2;
	    for (int i = 0; i < filas; i++) {
	    	Array4LaCruzHorizontalYVertical[i][laColumna] = 1;
	    }
	    
	    return Array4LaCruzHorizontalYVertical;
	}
	
	
/*	 (otra manera de hacerlo, pero no fiable al maximo.)
	// Metodo del ejercicio 4.1:
	public static int[][] crearArray4(int tamano) {
		int[][] array = new int[tamano][tamano];

		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
				}
			}
		}
		return array;
	}
*/	
//__________________________________________________________________________________	

	
// __________________________________________________________________________________
	// Metodo del ejercicio 5:
	public static void dameLaMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println(); // este syso hace que no se junten luego una de otra.
        }
    }
	
	public static int[][] invertirMatriz(int[][] matrizOriginal) {
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;
        int[][] matrizInvertida = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[i][j] = (matrizOriginal[i][j] == 0) ? 1 : 0;
            }
        }
        
        return matrizInvertida;
    }
	
// __________________________________________________________________________________
    
    
    
	
	
	
	
	
	
	
    // El MAIN para ejecutar todos los ejercicios
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//__________________________________________________________________________________	
		// Ejercicio 1
		UT5_Matrices_Ejercicios ejercicio1 = new UT5_Matrices_Ejercicios();
		int[][] array1 = ejercicio1.crearArray1(2, 3, 5);	// el 3 de enmedio hace referencia a donde situaremos nuestro 1.
		
		int i1 = 0;
		System.out.println(Arrays.toString(array1[i1]));
		System.out.println("Fin Ejercicio 1 (array1)________________________________\n");
		// no se si esta bien, el enunciado es algo confuso.
//__________________________________________________________________________________	

		
	    
//__________________________________________________________________________________	
		// Ejercicio 2
		
		int tamanoEjercicio2 = 4;
		int[][] array2 = crearArray2(tamanoEjercicio2);
		for (int i = 0; i < tamanoEjercicio2; i++) {
		    for (int j = 0; j < tamanoEjercicio2; j++) {
		        System.out.print(array2[i][j] + " ");
		 //     System.out.print(array2[i][j] + "s "); // pone una s al final de cada fila y columna
		    }
		    System.out.println();	// este syso es para que se imprima en filas y columnas(debe estar entre estos dos: "}" "}". 
		}
//Hay que hacer un for para mostrar el syso, un syso solo muestra un error (Hay que hacer esos 2 sysos anteriores).
		System.out.println("Fin Ejercicio 2 (array2)________________________________\n");
//__________________________________________________________________________________	
		

		
//__________________________________________________________________________________	
		// Ejercicio 3
		int[][] LaCruzDiagonal = crearArray3LaCruzDiagonal(3, 3); // +++ funciona correctamente con (4, 4) tambien.
		
		for (int i = 0; i < LaCruzDiagonal.length; i++) {
		    for (int j = 0; j < LaCruzDiagonal[0].length; j++) {
		        System.out.print(LaCruzDiagonal[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("Fin Ejercicio 3 (LaCruzDiagonal)________________________________\n");
//__________________________________________________________________________________	
		
		

//__________________________________________________________________________________	
		// Ejercicio 4

		int[][] laCruzHorizontalYVertical = crearArray4LaCruzHorizontalYVertical(3, 3); 
		// +++ si pongo (5, 5) sale una cruz mas grande.
		for (int i = 0; i < laCruzHorizontalYVertical.length; i++) {
			for (int j = 0; j < laCruzHorizontalYVertical[i].length; j++) {
				System.out.print(laCruzHorizontalYVertical[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Fin Ejercicio 4 (laCruzHorizontalYVertical)________________________________\n");

/*		 (otra manera de hacerlo, pero no fiable al maximo.) 
 		// hacer como lo tengo en "Ejercicio 4".
		// Ejercicio 4.1
		int tamanoEjercicio4 = 3; // si pongo 4 ya no funciona
		int[][] array4 = crearArray4(tamanoEjercicio4);
		for (int i = 0; i < tamanoEjercicio4; i++) {
		    for (int j = 0; j < tamanoEjercicio4; j++) {
		        System.out.print(array4[i][j] + " ");
		    }
		    System.out.println();	// este syso es para que se imprima en filas y columnas(debe estar entre estos dos: "}" "}". 
		}
		
		System.out.println("Fin Ejercicio 4.1 (array4)________________________________\n");
*/
//__________________________________________________________________________________	
		
		

//__________________________________________________________________________________	
		// Ejercicio 5
		int[][] matrizOriginal = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        int[][] matrizInvertida = invertirMatriz(matrizOriginal);
        
        System.out.println("Matriz Original: ");
        dameLaMatriz(matrizOriginal);
        
        System.out.println("Matriz Invertida o inversa: ");
        dameLaMatriz(matrizInvertida);
        System.out.println("\nFin Ejercicio 5 (Array o matrices; original e inversa)______\n");      
//__________________________________________________________________________________	
		


		
	}


}	




//		PRUEBAS Y ENUNCIADOS DE LOS EJERCICIOS:
	    
		// 1.1 ver como el ejercicio de la Clase: Ejercicio3Main_MATRIX_matrices
		// 1.2 pero este esta hecho sin metodos.

		/*	
		int [][] array1 = new int[4][4];
		// CREA 4 FILAS Y 4 COLUMNAS
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				
				if(j==1)
					array1[i][j] = 1;
			}
		}

		for (int i = 0; i < array1.length; i++)
		System.out.println(Arrays.toString(array1[i]));
		System.out.println("Fin matrix__________________________________________\n");
		*/
		
/* 		
Resuelve los siguientes ejercicios utilizando arrays bidimensionales. Crea una clase y métodos static que devuelvan un array bidimensional con la estructura que se indica en cada ejercicio.

1.	Crea un método que recibe tres enteros, uno para indicar la fila, otro para indicar la columna y un último parámetro para indicar el tamaño en filas y columnas. Devuelve un array bidimensional del tamaño indicado con 1’s en la fila y en la columna indicada.

2.	Crea un método que recibe un entero para indicar el tamaño en columnas y filas. Este método debe devolver un array con 1’s en todas las posiciones que tengan una coordenada par (considera el 0 como par).
Ejemplo:
[1 1 1 1]
[1 0 1 0]
[1 1 1 1]
[1 0 1 0]

3.	Crea un método que recibe el tamaño en columnas y filas. Este método debe devolver un array bidimensional con una cruz en diagonal.
Ejemplo:
[1 0 1]
[0 1 0]
[1 0 1]

4.	Crea un método que recibe el tamaño en columnas y filas. Este método debe devolver un array bidimensional con una cruz (horizontal y vertical).
Ejemplo:
[0 1 0]
[1 1 1]
[0 1 0]

5.	Crea un método que recibe como parámetro un array bidimensional y devuelve otro array bidimensional invirtiendo los 1’s y los 0’s. Donde tengamos un 0 en la original, tendremos un 1 en la nueva y, donde tengamos un 1 en la original, tendremos un 0.
 */
		
		

