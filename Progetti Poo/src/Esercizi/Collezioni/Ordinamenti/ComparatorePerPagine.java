package Esercizi.Collezioni.Ordinamenti;

import java.util.*;

public class ComparatorePerPagine implements Comparator<Libro> {
	
	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getPagine() - l2.getPagine();
	}
}
