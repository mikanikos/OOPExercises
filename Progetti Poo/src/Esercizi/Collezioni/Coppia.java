package Esercizi.Collezioni;

public class Coppia<T> {

	private T primo;
	private T secondo;

	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}

	public T getPrimo() {
		return this.primo;
	}

	public T getSecondo() {
		return this.secondo;
	}

	public void setPrimo(T primo) {
		this.primo = primo;
	}

	public void setSecondo(T secondo) {
		this.secondo = secondo;
	}

	public static void main(String args[]) {
		Persona p = new Persona();
		Persona ps = new Studente();
		Studente s = new Studente();
		Coppia<Persona> cp = new Coppia<Persona>(p,ps);
		Coppia<Studente> cs = new Coppia<Studente>(s,s);
		System.out.println(cp.getPrimo());
		System.out.println(cs.getPrimo()); 
		cp.setPrimo(p);
		cp.setPrimo(s);
		cp.setPrimo(ps);
		cs.setPrimo(s);
	}
}

class Persona {
}

class Studente extends Persona {
}