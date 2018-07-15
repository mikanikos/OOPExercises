package Esercizi.Polimorfismo.OverForOver;

public class CalcolatoreDiPerimetri implements Calcolatore{

	@Override
	public float calcola(Cerchio c) {
		return 2 *  3.14f * c.getRaggio();
	}

	@Override
	public float calcola(Quadrato q) {
		return q.getLato() * 4;
	}
	
	public static void main(String[] args) {
		CalcolatoreDiPerimetri calcolatore = new CalcolatoreDiPerimetri();
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
