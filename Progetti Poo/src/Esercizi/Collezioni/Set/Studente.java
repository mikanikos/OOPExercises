package Esercizi.Collezioni.Set;

/* DOMANDA 1
public class Studente {
	
	private String nome;
	
	public Studente(String nome) { this.nome = nome; }
	
	public String getNome() { return this.nome; }
	
	@Override
	public boolean equals(Object o) {
		Studente that = (Studente)o;
		return this.nome.equals(that);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
*/

/* DOMANDA 2
public class Studente {
	
	private String nome;
	
	public Studente(String nome) { this.nome = nome; }
	
	public String getNome() { return this.nome; }
}
*/

/* DOMANDA 3 */
public class Studente implements Comparable<Studente>{
	
	private String nome;
	
	public Studente(String nome) { this.nome = nome; }
	
	public String getNome() { return this.nome; }
	
	@Override
	public boolean equals(Object o) {
		Studente that = (Studente)o;
		return this.nome.equals(that);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public int compareTo(Studente s) {
		return this.nome.compareTo(s.getNome());
	}
}