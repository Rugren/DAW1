package EjercicioClaseUsuario;

public class Usuario {
	private Boolean conectado;
	private String usuario;
	private String password;
	
	public Usuario(String user, String pass) {
		this.usuario = user;
		this.password = pass;
		this.conectado = false;
	}
	
	public Boolean getEstado() {
		return conectado;
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
	
/* +++ Tambien es valido pero solo con ruben (o con el usuario que le demos)
 * 	public void estadoUsuario() {
		if (this.usuario.equals("ruben")) {
			this.conectado = true;
		}
		else
			this.conectado = false;
*/
	
	public boolean login(String usuario, String pass) {
		if(usuario.equals(this.usuario) && pass.equals(this.password)) {
			this.conectado = true;
		}
		return this.conectado;
	}
	
/* otra manera de hacer el login, mejor la de arriba: "public boolean login(String usuario, String pass) { ..."
 	public void login(String usuario, String password) {
		if (this.estadoLogin == false) {
			if (usuario == this.user && password == this.password){
			this.estadoLogin = true;
		}
		
		else {
			this.estadoLogin = false;
		}
		}
	
		else 
			this.estadoLogin = true;
		}
 */
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword() {
		this.password = password;
	}


	public String devolverContrasena(){
		String almacenador = " ";
		for (int i = 0; i < this.password.length(); i++){
			almacenador = almacenador + "*";
		}
		return almacenador;
	}
	
/*	
	public void registro(String nombre, String pass) {
		this.conectado = false;
		this.usuario = nombre;
		
	}
	
	public Boolean getEstado() {
		return conectado;
	}
*/

	}


