package Esercizi.Polimorfismo.OverForOver;

public class Quadrato implements Forma {
	
	private int lato;

	public Quadrato(int lato) {
		this.lato = lato;
	}
	
    public int getLato() {
		return lato;
	}

	@Override
	public float accetta(Calcolatore calcolatore) {
		return calcolatore.calcola(this);
		/* this ha tipo statico Quadrato */
	}
}
