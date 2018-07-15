package Quiz.Estensioni;

class Persona {
}

class Studente extends Persona {
}

public class Organizzazione {
	public void immatricola(Studente p) {
		System.out.println("Organizzazione.immatricola(Studente)");
	}

	static public void main(String args[]) {
		Persona p = new Persona();
		Persona ps = new Studente();
		Studente s = new Studente();
		Organizzazione org = new Organizzazione();
		Organizzazione studi = new Universita();
		Universita rm3 = new Universita();
		//org.immatricola(p); // ERRORE: NON COMPILA
		//org.immatricola(ps); // ERRORE: NON COMPILA
		org.immatricola(s);
		//studi.immatricola(p); // ERRORE: NON COMPILA
		//studi.immatricola(ps);// ERRORE: NON COMPILA
		studi.immatricola(s);
		rm3.immatricola(p);
		rm3.immatricola(ps);
		rm3.immatricola(s);
	}
}

class Universita extends Organizzazione {
	public void immatricola(Persona s) {
		System.out.println("Universita.immatricola(Persona)");
	}
}
