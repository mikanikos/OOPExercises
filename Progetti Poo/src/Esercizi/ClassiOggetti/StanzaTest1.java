package Esercizi.ClassiOggetti;
import it.uniroma3.diadia.ambienti.Direzione;
import it.uniroma3.diadia.ambienti.Stanza;

public class StanzaTest1 {
	
	public static void main(String[] args) {
		
		Stanza bar = new Stanza("bar");
		Stanza mensa = new Stanza("mensa");
		
		bar.impostaStanzaAdiacente(Direzione.valueOf("nord"), mensa);
		mensa.impostaStanzaAdiacente(Direzione.valueOf("sud"), bar);
		
		System.out.println(bar.getStanzaAdiacente(Direzione.valueOf("nord")).toString());
		System.out.println(mensa.getStanzaAdiacente(Direzione.valueOf("sud")).toString());
	}

}
