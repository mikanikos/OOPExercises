package Esercizi.ClassiOggetti;
import it.uniroma3.diadia.ambienti.Direzione;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest2 {
	
	public static void main(String[] args) {
		
		Stanza bar = new Stanza("bar");
		Stanza mensa = new Stanza("mensa");
		
		Attrezzo tazzina = new Attrezzo("tazzina", 3);
		Attrezzo piatto = new Attrezzo("piatto", 2);
		
		bar.impostaStanzaAdiacente(Direzione.valueOf("nord"), mensa);
		mensa.impostaStanzaAdiacente(Direzione.valueOf("sud"), bar);
		
		bar.addAttrezzo(tazzina);
		mensa.addAttrezzo(piatto);
		
		for(Attrezzo curr : bar.getStanzaAdiacente(Direzione.valueOf("nord")).getAttrezzi().values())
			if(curr != null)
		        System.out.println(curr.toString());
		for(Attrezzo curr : mensa.getStanzaAdiacente(Direzione.valueOf("sud")).getAttrezzi().values())
			if(curr != null)
		        System.out.println(curr.toString());
		
	}

}
