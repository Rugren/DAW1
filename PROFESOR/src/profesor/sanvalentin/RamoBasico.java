package profesor.sanvalentin;

public class RamoBasico extends Ramo implements ICementerable{

    private String mensaje;
    public RamoBasico(String mensaje, Flor... flores) {
        super(flores);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void colocarEnTumba() {
        System.out.println("Ramo " + this.getFlores() + " colocado en tumba");
    }

    @Override
    public void colocarEnPanteon() {
        System.out.println("Ramo " + this.getFlores() + " colocado en panteón");
    }
}
