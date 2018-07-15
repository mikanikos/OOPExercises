package Esercizi.Polimorfismo.Forme;

public abstract class AbstractForma implements Forma {
	
	private Punto riferimento;

	public AbstractForma(Punto reference) {
		this.riferimento = reference;
	}
	
	public void trasla(int deltaX, int deltaY) {
		this.getRiferimento().setX(this.getRiferimento().getX() + deltaX);
		this.getRiferimento().setY(this.getRiferimento().getY() + deltaY);
	}
	
	public Punto getRiferimento() { return this.riferimento; }
	
	public void setRiferimento(Punto riferimento) {
		this.riferimento = riferimento;
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + this.getRiferimento().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if( obj == null || this.getClass() != obj.getClass()) return false;
		AbstractForma that = (AbstractForma)obj;
		return this.getRiferimento().equals(that.getRiferimento());
	}

}
