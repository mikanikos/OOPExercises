package Esercizi.Polimorfismo;

public class Orario implements Comparabile{
	
	private int ore;
	private int minuti;
	
	public Orario(int ore, int minuti) {
		this.ore = ore;
		this.minuti = minuti;
	}
	
	public int getOre() {
		return this.ore;
	}
	
	public int getMinuti() {
		return this.minuti;
	}
	
	public boolean minoreDi(Comparabile c) {
		Orario o = (Orario)c;
		if (this.getOre() > o.getOre())
			return false;
		if (this.getOre() == o.getOre())
			return (this.getMinuti() < o.getMinuti());
		return true;
	}
	
	public int compara(Comparabile c) {
		Orario o = (Orario)c;
		if (this.getOre() > o.getOre())
			return 1;
		if (this.getOre() == o.getOre()) {
			if(this.getMinuti() > o.getMinuti())
				return 1;
			if(this.getMinuti() < o.getMinuti())
				return -1;
			return 0;
		}
		return -1;
	}
	
	public String toString() {
		return this.getOre()+":"+this.getMinuti();
	}
	
	@Override
	public boolean equals(Object o){
		Orario orario = (Orario) o;
		return this.getOre()==orario.getOre() && this.getMinuti()==orario.getMinuti();
	}
}