package Varie;

class Albero2 {
	public void innesta(Albero2 a) {
		System.out.print("Albero.innesta(Albero) ");
		altezza();
	}
	public void innesta(Pero2 b) {
		System.out.print("Albero.innesta(Pero) ");
		altezza();
	}
	public void altezza() {
		System.out.print("Albero.altezza()");
	}
}
class Pero2 extends Albero2 {
	public void innesta(Albero2 a) {
		System.out.print("Pero.innesta(Albero) ");
		altezza();
	}
	public void innesta(Pero2 b) {
		System.out.print("Pero.innesta(Pero) ");
		altezza();
	}
	public void altezza() {
		System.out.print("Pero.altezza()");
	}
}
public class Quiz {
	public static void main(String args[]) {
		Albero2 a = new Pero2();
		Albero2 b = new Albero2();
		a.innesta(b);
	}
}