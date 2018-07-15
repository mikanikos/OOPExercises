package Quiz.Collezioni;

import java.util.*;

class Libro4 implements Comparable<Libro4> {
    //NON toccare il codice di questa classe
    private String isin;
    private int pagine;

    public Libro4(String isin, int p) {
        this.isin = isin;
        this.pagine = p;
    }
    //NON toccare il codice di questa classe
    public String getCodiceISIN() {
        return this.isin;
    }

    public int getNumeroPagine() {
        return this.pagine;
    }

    public int compareTo(Libro4 libro) {
        return this.getNumeroPagine() - libro.getNumeroPagine();
    }
    //NON toccare il codice di questa classe
}

class ComparatoreLibriPerPagineISIN implements Comparator<Libro4> {

    public int compare(Libro4 l1, Libro4 l2) {
        // scrivere il codice di questo metodo
        int a = l1.getNumeroPagine() - l2.getNumeroPagine();
        if (a == 0)
            return l1.getCodiceISIN().compareTo(l2.getCodiceISIN());
        return a;
    }
}

public class CatalogatoreLibri {
    private List<Libro4> elenco;

    public CatalogatoreLibri() {
        this.elenco = new ArrayList<Libro4>();
    }

    public void aggiungiLibro(Libro4 libro) {
        this.elenco.add(libro);
    }

    public List<Libro4> elencoOrdinatoPerPagineISIN() {
        List<Libro4> elencoOrdinato = new ArrayList<Libro4>();
        // scrivere il codice di questo metodo
        elencoOrdinato.addAll(this.elenco);
        Collections.sort(elencoOrdinato, new ComparatoreLibriPerPagineISIN());
        return elencoOrdinato;
    }
}
