package Varie;

interface Veicolo {
	public void func(Veicolo v);
	public void func(Autotreno a);
}

public class Autotreno implements Veicolo {
	public void func(Veicolo v) {
		System.out.println("Autotreno.func(Veicolo) ");
	}
	public void func(Autotreno a) {
		System.out.println("Autotreno.func(Autotreno) ");
	}
	public static void main(String args[]) {
		Veicolo a = new Autotreno();
		Autotreno b = new Autotreno();
		a.func(b);
		a.func(a);
	}
}