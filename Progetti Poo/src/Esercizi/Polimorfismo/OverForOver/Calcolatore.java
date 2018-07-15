package Esercizi.Polimorfismo.OverForOver;

public interface Calcolatore {

	
	/* traduco la chiamata in una chiamata polimorfa in modo 
	 * funziona solo se non si tocca piu' il codice (non aggiungendo piu' nuove forme)  
	 */
	public float calcola(Cerchio c);
	public float calcola(Quadrato q);
	public static float sommaAll(Calcolatore calcolatore, Forma[] forme) {
		float acc = 0;
		for(Forma forma : forme) {
			acc += forma.accetta(calcolatore);
			/* acc += calcolatore.calcolaArea(forma);
		     * non compila perche' non so su quale tipo viene invocato */
		}
		return acc;
	}
}
