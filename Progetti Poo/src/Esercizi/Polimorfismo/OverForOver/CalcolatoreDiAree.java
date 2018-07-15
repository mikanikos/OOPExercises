package Esercizi.Polimorfismo.OverForOver;

public class CalcolatoreDiAree implements Calcolatore{

	/*
	public float calcolaArea(Cerchio c) {
		return 3.14f * c.getRaggio() * c.getRaggio();
	}
	
	public float calcolaArea(Quadrato q) {
		return q.getLato() * q.getLato();
	}*/
	
	@Override
	public float calcola(Cerchio c) {
		return 3.14f * c.getRaggio() * c.getRaggio();
	}
	
	@Override
	public float calcola(Quadrato q) {
		return q.getLato() * q.getLato();
	}
	
	public static float sommaAll(CalcolatoreDiAree calcolatore, Forma[] forme) {
		float acc = 0;
		for(Forma forma : forme) {
			acc += forma.accetta(calcolatore);
			/* acc += calcolatore.calcolaArea(forma);
		     * non compila perche' non so su quale tipo viene invocato */
		}
		return acc;
	}
	
	public static void main(String[] args) {
		CalcolatoreDiAree calcolatore = new CalcolatoreDiAree();
		Forma c = new Cerchio(1);
		Forma q = new Quadrato(2);
		Forma[] forme = {c,q};
		//System.out.println(calcolatore.calcolaArea(c));
		//System.out.println(calcolatore.calcolaArea(q));
		/* viene dato errore a tempo statico perche' c'e' Forma: Java guarda il tipo statico */
		/*Cerchio c = new Cerchio(1);
		Quadrato q = new Quadrato(2);
		System.out.println(calcolatore.calcolaArea(c));
		System.out.println(calcolatore.calcolaArea(q));
		cosi' compila */
		System.out.println(Calcolatore.sommaAll(calcolatore, forme));
	}
	
}
