package Varie;

interface Edificio {
	public int altezza();
}

class Palazzo implements Edificio {
	private int altezza;
	public Palazzo(int altezza) {this.altezza = altezza;}
	public int altezza() {return this.altezza;}
}

public class Coloratore {
	public void colora(Edificio e) {
		System.out.println("Colorato Edificio");
	}
	public void colora(Palazzo p) {
		System.out.println("Colorato Palazzo");
	}
	public static void main(String args[]) {
		Palazzo p = new Palazzo(4);
		Edificio e = new Palazzo(3);
		Coloratore c = new Coloratore();
		c.colora(p);
		c.colora(e);
	}
}