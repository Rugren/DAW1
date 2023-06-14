package Objetos;

public class Punto {
	
	private int x;
	private int y;

	public Punto(int paramX, int paramY) {
		this.x = paramX;
		this.y = paramY;
	}
	
//	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public int getX() {
			return this.x;
			// si pongo "return x" es lo mismo que si ponemos "return this.x".
			// el this siempre se refiere a un atributo.
		}
		
		public int getY() {
			return this.y;
		}

		
		public void desplazar(int x, int y) {
			this.x = x;
			this.y = y;
		}
			
		private int z ;
		public void cambiaPosicion() {
			this.z = this.x;
			this.x = this.y;
			this.y = z;
		}


	
}
