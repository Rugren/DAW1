package jugadores;

	public abstract class Equipo {
		
		private int salario;
		private String nombre;
		
		public Equipo(String nombre, int salario) {
			this.nombre = nombre;
			this.salario = salario;
	}
		
	    public String getNombre() {
	        return nombre;
	    }
		
		public int getSalario() {
			return salario;
		}

}
