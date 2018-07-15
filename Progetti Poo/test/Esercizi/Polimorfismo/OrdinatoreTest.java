package Esercizi.Polimorfismo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrdinatoreTest {
	
	private Orario[] listaOrari;
	private Studente[] listaStudenti;
	private Orario[] listaOrariVuota;
	private Studente[] listaStudentiVuota;
	private Orario[] listaOrariSingleton;
	private Studente[] listaStudentiSingleton;
	
	@Before
	public void setUp() {
		Orario[] orari = {new Orario(12,30), new Orario(21,40), new Orario(9,20),
				new Orario(4,00), new Orario(1,35)};
		Studente[] studenti = {new Studente("Marco",30), new Studente("Simone",22), 
				new Studente("Alessio",19), new Studente("Gianluca",26), new Studente("Filippo",40)};
		this.listaOrari = orari;
		this.listaStudenti = studenti;
		this.listaOrariVuota = new Orario[0];
		this.listaStudentiVuota = new Studente[0];
		this.listaOrariSingleton = new Orario[1];
		this.listaStudentiSingleton = new Studente[1];
		this.listaOrariSingleton[0] = new Orario(18,20);
		this.listaStudentiSingleton[0] = new Studente("Federico",21);
	}

	@Test
	public void testOrdinatoreOrario_Ordina() {
		Orario[] listaOrdinata = {new Orario(1,35), new Orario(4,00), new Orario(9,20),
				new Orario(12,30), new Orario(21,40)};
		Ordinatore.ordina(this.listaOrari);	
		for(int i=0; i<listaOrdinata.length;i++){
			assertArrayEquals(listaOrdinata, this.listaOrari);
		}
	}
	
	@Test
	public void testOrdinatoreStudente_Ordina() {
		Studente[] listaOrdinata = {new Studente("Alessio",19), new Studente("Simone",22), 
				new Studente("Gianluca",26), new Studente("Marco",30), new Studente("Filippo",40)};
		Ordinatore.ordina(this.listaStudenti);	
		assertArrayEquals(listaOrdinata, this.listaStudenti);
	}
	
	@Test
	public void testOrdinatoreOrario_Ordina_Singleton() {
		Orario[] listaOrdinata = {new Orario(18,20)};
		Ordinatore.ordina(this.listaOrariSingleton);	
		assertArrayEquals(listaOrdinata, this.listaOrariSingleton);
	}
	
	@Test
	public void testOrdinatoreStudente_Ordina_Singleton() {
		Studente[] listaOrdinata = {new Studente("Federico",21)};
		Ordinatore.ordina(this.listaStudentiSingleton);	
		assertArrayEquals(listaOrdinata, this.listaStudentiSingleton);
	}
	
	@Test
	public void testOrdinatoreOrario_Ordina_ArrayVuoto() {
		Orario[] listaOrdinata = {};
		Ordinatore.ordina(this.listaOrariVuota);	
		assertArrayEquals(listaOrdinata, this.listaOrariVuota);
	}
	
	@Test
	public void testOrdinatoreStudente_Ordina_ArrayVuoto() {
		Studente[] listaOrdinata = {};
		Ordinatore.ordina(this.listaStudentiVuota);	
		assertArrayEquals(listaOrdinata, this.listaStudentiVuota);
	}
	
	@Test
	public void testOrdinatoreOrario_RicercaBinaria_Verificato() {
		assertEquals(2, Ordinatore.ricercaBinaria(this.listaOrari, new Orario(9,20)));
	}
	
	@Test
	public void testOrdinatoreStudente_RicercaBinaria_Verificato() {
		assertEquals(3, Ordinatore.ricercaBinaria(this.listaStudenti, new Studente("Marco",30)));
	}
	
	@Test
	public void testOrdinatoreOrario_RicercaBinaria_NonVerificato() {
		assertEquals(-1, Ordinatore.ricercaBinaria(this.listaOrari, new Orario(7,20)));
	}
	
	@Test
	public void testOrdinatoreStudente_RicercaBinaria_NonVerificato() {
		assertEquals(-1, Ordinatore.ricercaBinaria(this.listaStudenti, new Studente("Giuseppe",29)));
	}
	
	@Test
	public void testOrdinatoreOrario_RicercaBinaria_Singleton_Verificato() {
		assertEquals(0, Ordinatore.ricercaBinaria(this.listaOrariSingleton, new Orario(18,20)));
	}
	
	@Test
	public void testOrdinatoreStudente_RicercaBinaria_Singleton_Verificato() {
		assertEquals(0, Ordinatore.ricercaBinaria(this.listaStudentiSingleton, new Studente("Federico",21)));
	}
	
	@Test
	public void testOrdinatoreOrario_RicercaBinaria_Singleton_NonVerificato() {
		assertEquals(-1, Ordinatore.ricercaBinaria(this.listaOrariSingleton, new Orario(22,10)));
	}
	
	@Test
	public void testOrdinatoreStudente_RicercaBinaria_Singleton_NonVerificato() {
		assertEquals(-1, Ordinatore.ricercaBinaria(this.listaStudentiSingleton, new Studente("Paolino",60)));
	}
	
	@Test
	public void testOrdinatoreOrario_RicercaBinaria_ArrayVuoto() {
		assertEquals(-1, Ordinatore.ricercaBinaria(this.listaOrariVuota, new Orario(9,20)));
	}
	
	@Test
	public void testOrdinatoreStudente_RicercaBinaria_ArrayVuoto() {
		assertEquals(-1, Ordinatore.ricercaBinaria(this.listaStudentiVuota, new Studente("Marco",30)));
	}
	
}
