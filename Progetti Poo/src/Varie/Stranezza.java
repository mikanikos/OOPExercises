package Varie;

public class Stranezza {
	public int cambioStrano(Integer numero){
		numero = new Integer(3);
		return numero;
	}
	public static void main(String[] args) {
		Stranezza s = new Stranezza();
		Integer valore = new Integer(8);
		System.out.println(valore);
		s.cambioStrano(valore);
		System.out.println(valore);
	}
}
