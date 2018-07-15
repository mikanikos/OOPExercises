package Quiz.Richiami;

public class Sequenza {
    private int[] sequenza;
    
    public Sequenza(int n){
        sequenza = new int[n];
    }
    
    public int massimo(){
        int max;
        // scrivere il codice di questo metodo:
        // deve restituire il valore piu' grande 
        // presente nell'array sequenza
        max = this.sequenza[0];
        for(int current : this.sequenza)
            if(current > max)
                max = current;
        return max;
    }    

    public void setElemento(int indice, int valore) {
        sequenza[indice] = valore;
    }

    public int getElemento(int indice) {
        return sequenza[indice];
    }
    
    public static void main(String[] args) {
    	Sequenza a = new Sequenza(3);
    	a.setElemento(0,13333);
    	a.setElemento(1,21);
    	a.setElemento(2,113);
    	System.out.println(a.massimo());
    }
}