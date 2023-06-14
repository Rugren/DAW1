package profesor.usuarios;


public class Usuario {
    private Boolean conectado;
    private String usuario;
    private String password;

    private Cuenta cuenta;

    public Usuario(String nombre, String pass, Cuenta cuenta){
        this.registro(nombre, pass);
        this.cuenta = cuenta;
    }

    public Usuario(String nombre, String pass){
        this.usuario = nombre;
        this.password = pass;
        this.cuenta = new Cuenta();
    }

    public Usuario(String nombre, String pass, float saldo){
        this.usuario = nombre;
        this.password = pass;
        this.cuenta = new Cuenta(saldo);
    }

    private void registro(String nombre, String pass){
        this.conectado = false;
        this.usuario = nombre;
        this.password = pass;
    }

    public Boolean getEstado() {
        return conectado;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean login(String usuario, String pass){
        if(usuario.equals(this.usuario) && pass.equals(this.password)){
            this.conectado = true;
        }
        return this.conectado;
    }

    public boolean logout(){
        if (this.conectado){
            this.conectado = false;
            return true;
        }
        return false;
    }

    public boolean bizum(Usuario usuarioReceptor, float cantidad){
        if (cantidad == 0)
            return false;

        float cantidadActualCuenta = this.cuenta.getSaldo() - cantidad;

        if (cantidadActualCuenta < 0)
            return false;
        else {
            this.cuenta.setSaldo(cantidadActualCuenta);
            float saldoAntiguo = usuarioReceptor.getCuenta().getSaldo();
            usuarioReceptor.getCuenta().setSaldo(saldoAntiguo + cantidad);
            return true;
        }
    }
}
