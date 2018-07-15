package Esercizi.Collezioni.Map;

import java.util.*;

public class Aula {
	private Set<Studente> studenti;
	
	public Aula() {
		this.studenti = new HashSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
	
	public Map<String, List<Studente>> meseDiNascita2studenti() {
		List<Studente> l;
		Map<String, List<Studente>> m = new HashMap<>();
		for(Studente stud : this.studenti) {
			l = m.get(stud.getMeseDiNascita());
			if (l == null) {
				l = new ArrayList<Studente>();
			    m.put(stud.getMatricola(), l);
			}
			l.add(stud);
		}
		return m;
	}
}
