package figurasDia230116;

public class Dia230116Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p = new Punto(0, 5);
		Dia230116triangulo t1 = new Dia230116triangulo();
		System.out.println(Dia230116triangulo.COLOR);
		System.out.println(t1.getColor());
		System.out.println(t1.getPosicion().getX());
		System.out.println(t1.getNombre());
		t1.imprimirNombre();
	}

}
