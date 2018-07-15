package Esercizi.ClassiOggetti;
import it.uniroma3.diadia.attrezzi.*;
import it.uniroma3.diadia.ambienti.Stanza;

public class AttrezzoTest {
	
	public static void main(String[] args) {
		System.out.println("Due nuovi attrezzi: ");
		Attrezzo scudo = new Attrezzo("scudo",4);
		Attrezzo cacciavite = new Attrezzo("cacciavite",1);
		System.out.println(scudo.toString());
		System.out.println(cacciavite.toString());
		System.out.println("Peso complessivo degli attrezzi = " + (scudo.getPeso()+cacciavite.getPeso()));
		System.out.print("L'attrezzo piu' pesante e' ");
		if(scudo.getPeso() > cacciavite.getPeso())
			System.out.println("lo " + scudo.getNome());
		else
			System.out.println("il" + cacciavite.getNome());
		
		
		// !!! ESERCIZI SU OGGETTI E RIFERIMENTI //
		String a1 = "n10"; 
		String a2 = "fsjdvk";
		Stanza s = new Stanza(a1);
		a1 = a2;
		System.out.println(s.toString());
		
		Attrezzo a = new Attrezzo("spada", 40);
		Attrezzo b = new Attrezzo("lancia", 10);
		s = new Stanza("N10");
		s.addAttrezzo(a);
		a = b;
		System.out.println(s.toString()); //quale attrezzo è presente nella stanza s?
		
		Attrezzo[] attrezzi;
		attrezzi = new Attrezzo[5];
		Attrezzo c = new Attrezzo("spada", 40);
		Attrezzo d = new Attrezzo("scudo", 30);
		attrezzi[0] = c;
		attrezzi[1] = d;
		c = d;
		System.out.println(attrezzi[0].toString());
		
		attrezzi = new Attrezzo[5];
		Attrezzo e = new Attrezzo("spada", 40);
		Attrezzo f = new Attrezzo("scudo", 30);
		attrezzi[0] = e;
		attrezzi[1] = f;
		attrezzi[0] = attrezzi[1];
		System.out.println(attrezzi[0].toString());
	}

}
