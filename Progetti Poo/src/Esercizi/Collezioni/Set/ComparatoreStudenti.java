package Esercizi.Collezioni.Set;

import java.util.Comparator;

public class ComparatoreStudenti implements Comparator<Studente>{
	
	@Override
	public int compare(Studente s1, Studente s2) {
		return s1.getNome().compareTo(s2.getNome());
	}
	
}
