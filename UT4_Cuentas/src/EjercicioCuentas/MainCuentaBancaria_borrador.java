package EjercicioCuentas;

import java.util.Scanner;

public class MainCuentaBancaria_borrador {

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
		String operacionMaquina = null;
		
//		CuentaBancaria cuenta1 = null; // para que lo coga en todos los case del switch. Pero luego aparece como duplicada la variable.


		switch (opcionUsuario) {
		case 1:
			// 1.1 el if aqui arriba(encima de " operacionMaquina = "Cuenta creada con exito"; ") que asi si pulsa 1 que cree una cuenta con y acceda al nombre que haya introducido. 
			// 1.2 Y asi, despues de hacer el 1, que muestre el mensaje de "Cuenta creada con exito".
			System.out.println("Has elegido crear cuenta");		
			
			if (opcionUsuario == 1) {
				System.out.println("Escriba su nombre");
				Scanner crearCuenta = new Scanner(System.in);	
				String nombreCliente = crearCuenta.nextLine();
				System.out.println("El nombre de la cuenta pertene a: " + nombreCliente);
				
// 1.0 QUE EL NOMBRE QUE PONGA SE PONGA LUEGO para cuando escriba 2, que se haya guardado y pueda consultarlo.
				
		//+++	CuentaBancaria cuenta1 = new CuentaBancaria(crearCuenta.next(), crearCuenta.nextDouble()); 
		// Un escaner para que me diga su nombre y otro para que me ponga el dinero. // El escaner que me dijo Miguel Angel.
			CuentaBancaria cuenta1 = new CuentaBancaria(nombreCliente, "001A", 0.00); // Hemos puesto 0,00 de saldo inicial, porque poniendo el "saldoInicial" daba problemas, porque se mezclaba con saldo y el otro archivo: "class MainCuentaBancaria_TransferenciaTotal".
			
		    System.out.println("Cuenta de: " + cuenta1.getNombreCliente());
			}

			operacionMaquina = "Cuenta creada con exito";
			break;
			
		case 2:
			System.out.println("Mostrar saldo cuenta");
			
			if (opcionUsuario == 2)
			// aqui que me devuelva         System.out.println("Cuenta con: " + cuenta1.getSaldo() + " euros");
			
// *nO ME COGE cuenta1. si esta fuera del case 1			System.out.println("Cuenta de " + cuenta1.getNombreCliente());
// *nO ME COGE cuenta1. si esta fuera del case 1			System.out.println("Saldo que tengo disponible: " + cuenta1.getSaldo());

//---- �COMO COGER EL cuenta1 en el case 2 o en los demas case?
//			System.out.println("Saldo actual: " + cuenta1.getSaldo() );

			operacionMaquina = "Ese es tu saldo";
		
			break;
			
		case 3:
			System.out.println("Hacer ingreso en cuenta");
					
			if (opcionUsuario == 3) {
				System.out.println("Escriba el importe a ingresar");
				Scanner importeAIngresar = new Scanner(System.in);	
				double elIngreso = importeAIngresar.nextDouble();
				System.out.println("Has ingresado " + elIngreso + " euros en la cuenta " ); // Que continue: " euros en la cuenta" + "c1.getIngreso" );
				
			operacionMaquina = "Se ha realizado el ingreso correctamente";
			break;}
			
		case 4:
			System.out.println("Hacer transferencia");
			
			if (opcionUsuario == 4) {
				System.out.println("Escriba el importe a transferir a la Cuenta"); // a transferir a la Cuenta2" (pero tiene que estar creada una segunda cuenta.) 
				// CREAR UNA 2� cuenta para hacer esto.
				Scanner importeATransferir = new Scanner(System.in);	
				double transfiere = importeATransferir.nextDouble();
				System.out.println("Has transferido " + transfiere + " euros " ); // Que continue: " euros en la cuenta" + "c2.getNumeroDeCuenta" );
			}
			
			operacionMaquina = "Se ha realizado la transferencia correctamente";
			break;
			
		case 5:
			System.out.println("Mostrar datos de la cuenta");
			if (opcionUsuario == 5) {
				// que muestre el todo lo de nuestra cuenta, seria algo asi: System.out.println( c1.getNombreCliente() + c1.getNumeroDeCuenta + c1.getTipoDeInteres + c1.getSaldo() );
				
			}
		
			
			
			operacionMaquina = "Estos son los datos de tu cuenta";
			break;
			
		default:
			System.out.println("Te has equivocado de numero. Vuelve a introducir un numero del 1 al 5.");
		/*	buscar alguna manera de que si se equivoca, que se reinicie y se ponga de nuevo el volver a hacerlo
			operacionMaquina = ("Vuelve a introducir los numeros de nuevo:\r\n"
					+ "1: Crear cuenta\r\n"
					+ "2: Mostrar saldo cuenta\r\n"
					+ "3: Hacer ingreso en cuenta\r\n"
					+ "4: Hacer transferencia\r\n"
					+ "5: Mostrar datos de la cuenta");
			
			Scanner usuarioQuiere2 = new Scanner(System.in);
			int opcionUsuario2 = usuarioQuiere2.nextInt();
		*/				
			operacionMaquina = "";
			break;
		}
		System.out.println(operacionMaquina);
	
	
		 // hacer que haga la sumatoria de un ingreso: " c1.transferencia(c2); " y luego un syso con los get y set que devuelvan el ingreso que hemnso hecho.

		

		// CERRAR TODOS LOS ESCANERES QUE CREE:
		usuarioQuiere.close();
		//.close();
		
		
	}

}
