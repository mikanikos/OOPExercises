package Quiz.Collezioni;

import java.util.*;

class Libro2 implements Comparable<Libro2> {
	private String titolo;

	public Libro2(String titolo){
		this.titolo    = titolo;
	} 

	public String getTitolo() {
		return this.titolo;
	}

	public int compareTo(Libro2 libro){
		return this.titolo.compareTo(libro.getTitolo());
	}

	public boolean equals(Object o){
		return this.titolo.equals(((Libro2)o).getTitolo());
	}
}

public class QuizSet {

	public static void main(String[] args) {
		Set<Libro2> libri = new HashSet<Libro2>();
		Libro2 l = new Libro2("Karenina");
		libri.add(l);
		l = new Libro2("Zorro");
		libri.add(l);
		l = new Libro2("Karenina");
		libri.add(l);
		l = new Libro2("Bovary");
		libri.add(l);
		libri.add(l);

		List<Libro2> listaLibri = new ArrayList<Libro2>(libri);
		Collections.sort(listaLibri);
		for(Libro2 libro : listaLibri) {
			System.out.println(libro.getTitolo());
		}
	}
}