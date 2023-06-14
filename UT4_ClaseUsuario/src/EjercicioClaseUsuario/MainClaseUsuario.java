package EjercicioClaseUsuario;

public class MainClaseUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseUsuario usuario1;
		String Ruben = null;
		String passRuben12345 = null;
		usuario1 = new ClaseUsuario(Ruben, passRuben12345);
		
        System.out.println("(Syso1) Usuario: " + usuario1.User() + " (Usuario 1)");
        System.out.println("(Syso2) Password: " + usuario1.Password());

		
	}

}
