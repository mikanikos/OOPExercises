package Esercizi.Collezioni.Map;

public class Studente {
	
	private String matricola;
	private String meseDiNascita;
	
	public Studente(String matricola, String meseDiNascita) {
		this.matricola = matricola;
		this.meseDiNascita = meseDiNascita;
	}
	
	public String getMatricola() { return this.matricola; }
	
	public String getMeseDiNascita() { return this.meseDiNascita; }
	
	@Override
	public int hashCode() { return this.matricola.hashCode(); }
	
	@Override
	public boolean equals(Object o) {
		Studente that = (Studente)o;
		return this.getMatricola().equals(that.getMatricola());
	}
}
