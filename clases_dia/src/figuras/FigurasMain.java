package figuras;

import Objetos.Punto;

public class FigurasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// FIGURAS PUNTO:		
		Color c1 = Color.AZUL;
		FigurasPunto p1 = new FigurasPunto(3, 1, c1, "p1");
		
		FigurasPunto p2 = new FigurasPunto(2, 2, c1, "p2");
		FigurasPunto p3 = new FigurasPunto(1, 1, c1, "p3");
		FigurasPunto p4 = new FigurasPunto(5, 10, c1, "p4");
		
		// *arreglar System.out.println(p1.getContadorPuntos());
		
		
//		System.out.println("(" + p1.getX() + "," + p1.getY());
		p1.moverAPunto(p2);
		p2.moverAPunto(p3);
		
	
		
		
		//_____________
// FIGURAS PUNTO 3D:		
		
		FigurasPunto3D p1_3D = new FigurasPunto3D(3, 1, 0);
		FigurasPunto3D p2_3D = new FigurasPunto3D(5, 6, 3);
		p1_3D.moverAPunto(p2_3D);
		
	}

}
