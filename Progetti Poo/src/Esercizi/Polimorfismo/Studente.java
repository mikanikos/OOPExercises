package Esercizi.Polimorfismo;

public class Studente implements Comparabile {
	
	private String nome;
	private int eta;
	
	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public String toString() {
		return "Studente [nome=" + this.nome + ", eta=" + this.eta + "]";
	}
	
	public boolean minoreDi(Comparabile c) {
		Studente s = (Studente)c;
		if (this.getEta() < s.getEta())
			return true;
		return false;
	}
	
	public int compara(Comparabile c) {
		Studente s = (Studente)c;
		if (this.getEta() < s.getEta())
			return -1;
		if (this.getEta() > s.getEta())
			return 1;
		return 0;
	}
	
	@Override
	public boolean equals(Object o){
		Studente s = (Studente) o;
		return this.getEta()==s.getEta();
	}
}
