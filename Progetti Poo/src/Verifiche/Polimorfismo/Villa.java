package Verifiche.Polimorfismo;

/*
Obiettivo: verifica comprensione tipi statici e dinamici

Il seguente programma contiene molti errori.
- quali?
- compialre il programma e verificare le proprie risposte

*/

interface Edificio{}

public class Villa implements Edificio {
	void numeroPiani(){}

	public static void main(String[] argc){

		Edificio e = new Villa(); // corretto Edificio con Villa perché nella inizializzazione supertipo non ha costruttore
		Villa v = new Villa();
		Edificio e1 = new Villa();

		e=v;
		v=(Villa)e1; // aggiunto downcasting a Villa
		((Villa) e1).numeroPiani(); // aggiunto downcasting a Villa
		e = new Villa(); // corretto Palazzo (inesistente) con Villa
		v=(Villa)e; // aggiunto downcasting a Villa
	}

}
