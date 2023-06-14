
package EjercicioClaseUsuario;

public class UsuarioElDeManu {

    private String user;
    private String password;
    private boolean estadoLogin;
    private String cuentaUser;

   /* public Usuario (){        Con este constructor podríamos hacer lo del registro,
                                crearíamos un usuario completamente sin alma y con el registro le daríamos los
                                parámetros, como si actuara como el constructor que tenemos debajo.
    }*/
    public UsuarioElDeManu(String user, String pass){
        this.user = user;
        this.password = pass;
        this.estadoLogin = false;
    }
    public String getUser(){
        return user;
    }
    public void setEstadoLogin(boolean estadoLogin){this.estadoLogin = estadoLogin;}
    public void setUser(String user){this.user = user;}
    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        String almacenador = " ";
        for (int i = 0; i < this.password.length(); i++){
            almacenador = almacenador + "*";
        }
        return almacenador;
    }

    public String login(String usuario, String password){
       if (this.estadoLogin == false) {
           if (usuario == this.user && password == this.password) {
               this.estadoLogin = true;
               return "CONECTADO";
           } else
               this.estadoLogin = false;
       }
       else {
           this.estadoLogin = true;
           return "Ya estás conectado";
       }
        return usuario;
    }

    public String logout(){
          if (this.estadoLogin == true) {
              this.estadoLogin = false;
              return "DESCONECTADO";
          }
          return "Ya estás desconectado";
    }

    /*public void registro(String user, String password){
        this.user = user;
        this.password = password;
        this.estadoLogin = false;
    }*/

    
}


