package Quiz.Collezioni;

import java.util.*;

class ComparatoreLibri implements Comparator<Libro3> {
    public int compare(Libro3 l1, Libro3 l2) {
        return (l1.getAnno()- l2.getAnno());
    }
}

class Libro3 implements Comparable<Libro3> {
    public int anno;
    public String titolo;

    public Libro3(String titolo, int anno) {
        this.anno = anno;
        this.titolo = titolo;
    }

    public int compareTo(Libro3 o) {
        return this.titolo.compareTo(o.getTitolo());
    }

    public int getAnno(){
        return this.anno;
    }

    public String getTitolo(){
        return this.titolo;
    }
}

public class Quiz {
    public static void main(String[] args) {
        List<Libro3> biblioteca = new LinkedList<Libro3>();

        biblioteca.add(new Libro3("Cronosisma", 2003));
        biblioteca.add(new Libro3("Zorro", 2000));
        biblioteca.add(new Libro3("Zorro", 1800));
        biblioteca.add(new Libro3("Mostri", 1999));
        Collections.sort(biblioteca, new ComparatoreLibri());

        for(Libro3 libro : biblioteca)
            System.out.print(libro.getTitolo()+" ");
    }
}