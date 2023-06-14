package EjercicioClasePersonaje;

public class ClasePersonajePosicion {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	private int x;
	private int y;
// tambien se podria poner: private int x, y;
	
		 public ClasePersonajePosicion(int x, int y) {
		    this.x = x;
		    this.y = y;
		 }

		 public int getX() {
		    return x;
		 }

		 public int getY() {
		    return y;
		 }

		 public void setX(int x) {
		    this.x = x;
		 }

		 public void setY(int y) {
		    this.y = y;
		 }

		 public void mover(int x, int y) {
		    this.x += x;
		    this.y += y;
		 }

		 @Override
		 public String toString() {
		    return "[" + x + ", " + y + "]";
		 }

}
