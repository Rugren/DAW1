package clases_dia;

import java.util.Scanner;

public class clase_22_11_07_login_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String login, pwd, myLogin, myPwd;
		//2 string, una de login y otra de Password. 
		 // es como si pusieras una l�nea de String login
		 // y otra l�nea de String pwd
		myLogin = "Ruben";
		myPwd = "1234";
		
		boolean connected = false;
		int numTriesAvailables = 3; // hemos puesto la variable int numIntentosDisponibles, que lo hemos escrito en ingl�s.
		
		Scanner myScanner = new Scanner(System.in);
		
		
		while (!connected && numTriesAvailables > 0) {
		// el no(!) connected es lo mismo que: connected == false
		//numTriesAvailables es 3, es mayor que 0, es verdadero.
			
		//es necesario poner todo esto dentro del while. Que el while lo pusimos despu�s
			System.out.println("Introduzca su Login: ");
			login = myScanner.next();
			System.out.println("Pwd: ");
			pwd = myScanner.next();
			
			if (login.equals(myLogin) && pwd.equals(myPwd)) {
				// el equals es para que me coja de mis valores introducidos.
				System.out.println("Bienvenido " + login + "!");
				connected = true;
				//el connected este que es true, 
				 //est� para que cuando ponga Usuario correcto que no me siga dejando poner intentos hasta 3 veces.
			}
			else  {
				System.out.println("Usuario o contrase�a incorrectos");
			}
			
			numTriesAvailables--; // hemos puesto que el n� de intentos decrementa, 
			//es decir, que vaya restando a cada respuesta incorrecta hasta cumplir las 3 de m�ximo de intentos.
			System.out.println(numTriesAvailables);
			
		}
		
		if (numTriesAvailables == 0 && !connected) {
			System.out.println("N�mero de intentos agotado");
			// ponemos este if fuera para que me lo diga una vez que gasta los 3 intentos,
			    // (ver en el while de arriba, cuando sean numTriesAvailables(n� de intentos) menor que 0
					}
		
		myScanner.close();
	}

}
