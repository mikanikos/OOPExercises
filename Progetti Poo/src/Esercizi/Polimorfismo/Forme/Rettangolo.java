package Esercizi.Polimorfismo.Forme;

public class Rettangolo extends AbstractForma {
	private int altezza, base;
	
	public Rettangolo(Punto vertice, int altezza, int base) {
		super(vertice);
		this.altezza = altezza;
		this.base = base;
	}
	
	public int getBase() { return this.base; }
	public int getAltezza() { return this.altezza; }
	
	@Override
	public int hashCode() {
		return super.hashCode() + this.getClass().hashCode() + this.getBase() + this.getAltezza();
	}

	@Override
	public boolean equals(Object obj) {
		if( (this.getAltezza() == 0 || this.getBase() == 0) && obj.getClass() == Punto.class && this.getRiferimento().equals(obj)) return true;
		return super.equals(obj) && this.getBase() == ((Rettangolo)obj).getBase() && this.getAltezza() == ((Rettangolo)obj).getAltezza();
	}
}