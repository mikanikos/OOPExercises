package Esercizi.Polimorfismo.Forme;

import java.util.*;

public class GruppoDiForme extends AbstractForma {

	private static final int MAX_FORME = 10;
	private Set<AbstractForma> componenti;

	public GruppoDiForme() {
		super(new Punto(0,0));
		this.componenti = new HashSet<>(MAX_FORME);
	}

	@Override
	public void trasla(int deltaX, int deltaY) {
		for (AbstractForma f : this.componenti) {
			f.trasla(deltaX, deltaY);
			this.aggiornaMedia();
		}
	}

	public void aggiungiForma(AbstractForma nuova) {
		if (this.componenti.size() < MAX_FORME)
			this.componenti.add(nuova);
		this.aggiornaMedia();
	}

	private void aggiornaMedia() {
		int sumX = 0;
		int sumY = 0;
		for (AbstractForma f : this.componenti) {
			sumX += f.getRiferimento().getX();
			sumY += f.getRiferimento().getY();
		}
		this.setRiferimento(new Punto(sumX/this.componenti.size(), sumY/this.componenti.size()));
	}

	public int getNumeroComponenti() {
		return this.componenti.size();
	}

	public Set<AbstractForma> getComponenti() {
		return this.componenti;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.getClass().hashCode() + this.getComponenti().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && this.getComponenti().equals(((GruppoDiForme)obj).getComponenti());
	}
}
