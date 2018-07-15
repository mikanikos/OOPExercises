package Quiz.Richiami;

public class Persone {
    private String[] nomi;
    
    public Persone(int n) {
        this.nomi = new String[n];
    }
    
    public int contaOmonimiDi(String nome) {
        // deve restituire il numero di nomi dell'array che 
        // sono uguali al nome passato come parametro
    	if(this.nomi.length == 0)
    		throw new java.util.NoSuchElementException();
        int cont = 0;
        for(String current : this.nomi)
            if((current == null && nome == null) || (current != null && current.equals(nome)))
                cont++;
        return cont;
    }
    
    public void aggiungiNome(int indice, String nome){
        this.nomi[indice] = nome;
    }
    
    public static void main(String[] args) {
    	Persone b = new Persone(5);
    	b.aggiungiNome(0,null);
    	b.aggiungiNome(3,"Luigi");
    	b.aggiungiNome(4,"Andrea");
    	b.aggiungiNome(1,null);
    	b.aggiungiNome(2,null);
    	System.out.println(b.contaOmonimiDi("Andrea"));
    }
}
