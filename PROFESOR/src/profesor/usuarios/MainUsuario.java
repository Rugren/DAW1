package profesor.usuarios;

public class MainUsuario {

    public static void main(String[] args) {
        Usuario pepe = new Usuario("Pepe", "1234");
        //pepe.registro("Pepe", "1234");
        System.out.println(pepe.login("Pepe", "1234"));
    }
}
