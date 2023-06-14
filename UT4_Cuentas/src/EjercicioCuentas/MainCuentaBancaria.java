package EjercicioCuentas;

import java.util.Scanner;

public class MainCuentaBancaria {

	public static void main(String[] args) {

/*		
		- Crear cuenta
		- Mostrar saldo cuenta
		- Hacer ingreso en cuenta
		- Hacer transferencia
		- Mostrar datos de la cuenta
*/
		
		System.out.println("Pulsa los siguientes numeros para realizar tu operacion:\r\n"
				+ "1: Crear cuenta\r\n"
				+ "2: Mostrar saldo cuenta\r\n"
				+ "3: Hacer ingreso en cuenta\r\n"
				+ "4: Hacer transferencia\r\n"
				+ "5: Mostrar datos de la cuenta");
		
		
		Scanner usuarioQuiere = new Scanner(System.in);
		int opcionUsuario = usuarioQuiere.nextInt();

		if (opcionUsuario == 1) {
			System.out.println("Has elegido crear cuenta. Escriba su nombre");		
			Scanner crearCuenta = new Scanner(System.in);	
			String nombreCliente = crearCuenta.nextLine();
			System.out.println("El nombre de la cuenta pertene a: " + nombreCliente);
			
			CuentaBancaria cuenta1 = new CuentaBancaria(nombreCliente, "001A", 00.00); // Hemos puesto 0,00 de saldo inicial, porque poniendo el "saldoInicial" daba problemas, porque se mezclaba con saldo y el otro archivo: "class MainCuentaBancaria_TransferenciaTotal".
			
		    System.out.println("Cuenta de " + cuenta1.getNombreCliente() + " con Numero de cuenta(" + cuenta1.getNumeroDeCuenta() + ")" + " creada con exito");
		    
		    System.out.println("+ Desea algo mas?\r\n"
					+ "2: Mostrar saldo cuenta\r\n"
					+ "3: Hacer ingreso en cuenta\r\n"
					+ "4: Hacer transferencia\r\n"
					+ "5: Mostrar datos de la cuenta");
		    Scanner continuar = new Scanner(System.in);
		    int queMasQuiereHacer = continuar.nextInt();
		    
		    if (queMasQuiereHacer == 2) {
				System.out.println("2.0 Mostrar saldo cuenta");
				System.out.println("Este es tu saldo: " + cuenta1.getSaldo() + " euros");
		    }
			if (queMasQuiereHacer == 3) {
				System.out.println("Hacer ingreso en cuenta. Escriba el importe a ingresar:");
				Scanner importeAIngresar = new Scanner(System.in);	
				double elIngreso = importeAIngresar.nextDouble();
/*				
				cuenta1.setIngreso(elIngreso); // Este setIngreso coge "elIngreso"(que es lo que ha escrito el usuario) y lo suma a nuestro saldo para cuando lo mostremos con el getIngreso.
				System.out.println("Tu cuenta " + cuenta1.getNumeroDeCuenta() + " ahora dispone de " + cuenta1.getIngreso() + " euros.");
*/
				cuenta1.setSaldo(elIngreso); // Este setSaldo coge "elIngreso"(que es lo que ha escrito el usuario) y lo suma a nuestro saldo para cuando lo mostremos con el getSaldo.
				System.out.println("Se ha podido realizar la operacion: " + cuenta1.ingreso(elIngreso)); // el cuenta1.ingreso(elIngreso) es el boolean. Que el ejercicio pide que diga true si se ha podido realizar y false si no. Hemos puesto minimo 5 euros a ingresar.
				// hay un fallo, si ingreso menos de 5, por ejemplo 4, no deberia dejar ingresar, sin embargo devuelve false el "public boolean ingreso", pero en la cuenta con get.Saldo() aparecerian los 4 euros ingresados.
				System.out.println("Has ingresado " + elIngreso + " euros en tu cuenta");			
				System.out.println("Tu cuenta " + cuenta1.getNumeroDeCuenta() + " ahora dispone de " + cuenta1.getSaldo() + " euros.");
			}
			
			if (queMasQuiereHacer == 4) {
				
				System.out.println("Para hacer una transferencia primero debes crear otra cuenta. Escriba el nombre de la cuenta a crear");
//				Scanner crearCuenta2 = new Scanner(System.in);			// no hace falta crear otro escaner, simplemente cogemos el primero de crearCuenta y para no repetir la variable nombreCliente1 ponemos nombreCliente2;
				String nombreCliente2 = crearCuenta.nextLine();
				System.out.println("El nombre de la nueva cuenta creada pertene a: " + nombreCliente2);
				CuentaBancaria cuenta2 = new CuentaBancaria(nombreCliente2, "002B", 0.00); 

			    System.out.println("Cuenta de " + cuenta2.getNombreCliente() + " con Numero de cuenta(" + cuenta2.getNumeroDeCuenta() + ")" + " creada con exito");
			    
				System.out.println("Ahora para hacer una transferencia escriba el -Numero de cuenta- donde quiera transferir el dinero: "); 
				
//*1.1 DUDA: NO ME DEJA AVANZAR, no me coge al poner la cuenta 001A(cuenta1) o la 002B(cuenta2)				
				Scanner cuentaATransferir = new Scanner(System.in);
				String laCuentaDondeSeTransfiere = cuentaATransferir.nextLine();
				
				if (laCuentaDondeSeTransfiere == cuenta1.getNumeroDeCuenta()) {
					cuenta2.transferencia(cuenta1);
					
					System.out.println("Ahora escriba el importe a transferir: "); 	
					Scanner importeATransferir = new Scanner(System.in);	
					double transfiere = importeATransferir.nextDouble();
					System.out.println("Has transferido " + transfiere + " euros a la cuenta " + cuenta1.getNumeroDeCuenta() + " de " + cuenta1.getNombreCliente());
					System.out.println(cuenta1.getNombreCliente() + " ahora tiene " + cuenta1.getSaldo());
					System.out.println("Transferencia realizada correctamente");
				}
				
				if (laCuentaDondeSeTransfiere == cuenta2.getNumeroDeCuenta()) {
					cuenta1.transferencia(cuenta2);
					
					System.out.println("Ahora escriba el importe a transferir: "); 	
					Scanner importeATransferir = new Scanner(System.in);	
					double transfiere = importeATransferir.nextDouble();
					System.out.println("Has transferido " + transfiere + " euros a la cuenta " + cuenta2.getNumeroDeCuenta() + " de " + cuenta2.getNombreCliente());
					System.out.println(cuenta2.getNombreCliente() + " ahora tiene " + cuenta2.getSaldo());
					System.out.println("Transferencia realizada correctamente");
				}
			}
//1.2 (Ver duda para arreglar el 1.1 de arriba).			
			 // HACER; Tu cuenta tiene ahora: xxxx hacer que haga la sumatoria de un ingreso: " c1.transferencia(c2); " y luego un syso con los get y set que devuelvan el ingreso que hemnso hecho.
			
			
			if (queMasQuiereHacer == 5) {
				System.out.println("Estos son los datos de la cuenta:\r\n"
					+ "Titular: " + cuenta1.getNombreCliente() + "\r\n"
					+ "Numero de Cuenta bancaria: " + cuenta1.getNumeroDeCuenta() + "\r\n"
					+ "Tipo de Interes: " + cuenta1.getTipoDeInteres() + "\r\n"
					+ "Saldo de la cuenta: " + cuenta1.getSaldo() );
			}			
		} // Cierre del primer if, el: "if (opcionUsuario == 1) {"
	
		    
		
		else if (opcionUsuario == 2) {
			System.out.println("2- Tiene que crear una cuenta primero");
			}
//*2.0 DUDA: Hacer un bucle o algo que mande al apartado 1 de crear cuenta.
		
		else if (opcionUsuario == 3) {
			System.out.println("3- Tiene que crear una cuenta primero");
		}
		
		else if (opcionUsuario == 4) {
			System.out.println("4- Tiene que crear una cuenta primero");
		}
		
		else if (opcionUsuario == 5) {
			System.out.println("5- Tiene que crear una cuenta primero");
		}
		
		else {
		System.out.println("Te has equivocado de numero. Vuelve a introducir un numero del 1 al 5.");
		}
	
		
		
		usuarioQuiere.close();
		
		
		

	}

}
