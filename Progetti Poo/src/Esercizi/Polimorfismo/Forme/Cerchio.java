package Esercizi.Polimorfismo.Forme;

public class Cerchio extends AbstractForma {
	
	private int raggio;
	
	public Cerchio(Punto centro, int raggio) {
		super(centro);
		this.raggio = raggio;
	}
	
	public int getRaggio() { return this.raggio; }

	@Override
	public int hashCode() {
		return super.hashCode() + this.getClass().hashCode() + this.getRaggio();
	}

	@Override
	public boolean equals(Object obj) {
		if(this.getRaggio() == 0 && obj.getClass() == Punto.class && this.getRiferimento().equals(obj)) return true;
		return super.equals(obj) && this.getRaggio() == ((Cerchio)obj).getRaggio();
	}
	
}