package Esercizi.Collezioni;

public class Coppias {

	public static <T> void reverse(Coppia<T> c) {
		T tmp;
		tmp = c.getPrimo();
		c.setPrimo(c.getSecondo());
		c.setSecondo(tmp);
	}

	public static <T> void fill( Coppia<? super T> coppia, T elemento) {
		coppia.setPrimo(elemento);
		coppia.setSecondo(elemento);
	}

	static <T> void copy(Coppia<? super T> dest, Coppia<? extends T> src) {
		dest.setPrimo(src.getPrimo());
		dest.setSecondo(src.getSecondo());
	}

}
