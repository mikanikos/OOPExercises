package Quiz.Collezioni;

import java.util.*;

class Libro {
    private String titolo;
    private String autore;

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getAutore() {
        return this.autore;
    }

    public String getTitolo() {
        return this.titolo;
    }

}


public class RaggruppatoreLibriPerAutore {
    private List<Libro> elencoLibri;

    public RaggruppatoreLibriPerAutore(){
        this.elencoLibri = new ArrayList<Libro>();
    }

    public void aggiungiLibro(Libro libro) {
        this.elencoLibri.add(libro);
    }

    public Map<String, List<Libro>> autore2libri() {
        Map<String, List<Libro>> autore2libri = new HashMap<String, List<Libro>>();
        // completare questo metodo
        List<Libro> lista;
        for (Libro l : this.elencoLibri) {
            lista = autore2libri.get(l.getAutore());
            if (lista == null) {
                lista = new ArrayList<Libro>();
                autore2libri.put(l.getAutore(), lista);
            }
            lista.add(l);
        }
        return autore2libri;
    }
}