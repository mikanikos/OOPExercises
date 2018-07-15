package Esercizi.Collezioni.Set;

import java.util.*;

/* PRIMA DOMANDA
public class Aula {
	
	private Set<Studente> studenti;
	
	public Aula() { 
		this.studenti = new HashSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
}
*/

/* DOMANDA 2
public class Aula {
	
	private Set<Studente> studenti;
	
	public Aula() { 
		this.studenti = new TreeSet<Studente>(new ComparatoreStudenti());
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
}
*/

/* DOMANDA 3 */
public class Aula {
	
	private Set<Studente> studenti;
	
	public Aula() { 
		this.studenti = new TreeSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
}

