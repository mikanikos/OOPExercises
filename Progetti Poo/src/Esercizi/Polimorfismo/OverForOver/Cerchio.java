package Esercizi.Polimorfismo.OverForOver;

public class Cerchio implements Forma {

	private int raggio;

	public Cerchio(int raggio) {
		this.raggio = raggio;
	}

	public int getRaggio() {
		return raggio;
	}

	@Override
	public float accetta(Calcolatore calcolatore) {
		return calcolatore.calcola(this);
		/* this ha tipo statico Cerchio */
	}

}
