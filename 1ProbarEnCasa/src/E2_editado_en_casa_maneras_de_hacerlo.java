
public class E2_editado_en_casa_maneras_de_hacerlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 2
		
		int sueldoBase = 1200;
		int bono = 200;
		
		int sueldoConBono;
		if (sueldoBase + bono == 1400)
			sueldoConBono = sueldoBase + bono;
		else 
			sueldoConBono = sueldoBase;
		System.out.println(sueldoConBono);
	// no me dice si es con bono o sin bono, porque si cambio salario base me pone el salario.
	// en plan, cómo sé yo si es con bono o sin bono.	
		
		/*
		int sueldoConBono;
		if (sueldoBase + bono == 1400)
			sueldoConBono = sueldoBase + bono;
		else 
			sueldoConBono = sueldoBase;
		System.out.println("Salario final: " + sueldoConBono); */
	// no me dice si es con bono o sin bono, porque si cambio salario base me pone el salario.
	// en plan, cómo sé yo si es con bono o sin bono.	
		
		
		/* valido+++? o no? int sueldoConBono;
		if (sueldoBase + bono == 1400)
			sueldoConBono = sueldoBase + bono;
		else 
			sueldoConBono = sueldoBase;
		
		System.out.println("Sueldo con Bono: " + sueldoConBono);
		*/	
		
		/*
		int sueldoConBono = sueldoBase + bono;
		System.out.println(sueldoConBono);
		*/
		
		/*
		int sueldoSiBonoONoBono = (sueldoBase <= 1500) ? (sueldoBase + bono) : sueldoBase;
		System.out.println(sueldoSiBonoONoBono);
		*/
		
		/*
		int sueldoSiBonoONoBono;
		if (sueldoBase <= 1500)
			sueldoSiBonoONoBono = sueldoBase + bono;
		else 
			sueldoSiBonoONoBono = sueldoBase;
		
		System.out.println(sueldoSiBonoONoBono);
		*/
		
		/* mal
		int sueldoConBono = 1450;
		if (sueldoBase + bono == 1700)
			sueldoConBono = sueldoBase + bono;
		System.out.println(sueldoConBono);
		*/
				
		/*
		String sueldoSiBonoONoBono;
		if (sueldoBase + bono == 1400)
			sueldoSiBonoONoBono = "Sueldo con bono: " + sueldoBase + bono;
		else 
			sueldoSiBonoONoBono = "Sueldo sin bono: " + sueldoBase;
		
		System.out.println(sueldoSiBonoONoBono);
		*/
		
		
		/*---
		int sueldoConBono;
		if (sueldoBase + bono == 1400)
			sueldoSiBonoONoBono = sueldoBase + bono;
		else 
			sueldoSiBonoONoBono = sueldoBase;
		
		System.out.println(sueldoConBono);
		---*/
		
	}

}
