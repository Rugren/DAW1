package EjercicioClaseUsuario;

public class MainUsuario {

	public static void main(String[] args) {
		Usuario ruben = new Usuario("ruben", "1234");
		//ruben.registro("ruben", "1234");
		//System.out.println(ruben.login("ruben", "1234"));
		
		System.out.println("Ruben se logea/esta logeado "+ ruben.login("ruben", "1234"));
		System.out.println("Usuario Ruben: " + ruben.getUsuario());
		System.out.println("Contrasena Ruben: " + ruben.getPassword());
		System.out.println("Contrasena Ruben pixelada: " + ruben.devolverContrasena());
		
	}

}
