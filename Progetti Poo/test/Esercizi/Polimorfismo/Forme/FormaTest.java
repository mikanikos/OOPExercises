package Esercizi.Polimorfismo.Forme;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class FormaTest {
	
	private Punto origine;
	private GruppoDiForme semplice;
	private Cerchio cUnitario;
	private Rettangolo rUnitario;

	@Before
	public void setUp() throws Exception {
		origine = new Punto(0, 0);
		this.cUnitario = new Cerchio(origine, 1);
		this.rUnitario = new Rettangolo(origine, 1, 1);
		this.semplice = new GruppoDiForme();
	}

	@Test
	public void testInsiemeForme() {
		Set<AbstractForma> set = new HashSet<>();
		assertEquals(0, set.size());
		set.add(cUnitario);
		assertEquals(1, set.size());
		set.add(rUnitario);
		assertEquals(2, set.size());
		set.add(semplice);
		assertEquals(3, set.size());
		semplice.aggiungiForma(cUnitario);
		assertEquals(3, set.size());
		semplice.aggiungiForma(rUnitario);
		assertEquals(3, set.size());
	}
	
	@Test
	public void testEqualsPuntoForme() {
		Rettangolo r = new Rettangolo(origine, 0, 2); 
		assertEquals(r, origine);
		assertEquals(origine, r);
		r = new Rettangolo(origine, 1, 0); 
		assertEquals(r, origine);
		assertEquals(origine, r);
		Cerchio c = new Cerchio(origine, 0);
		assertEquals(c, origine);
		assertEquals(origine, c);
	}
	
}
