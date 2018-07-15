package Quiz.Richiami;


import static org.junit.Assert.*;
import org.junit.Test;

import Quiz.Richiami.Persone;

public class PersoneTest {
	
	private Persone persone(String...p) {
		Persone a = new Persone(p.length);
		for(int i=0; i<p.length; i++)
			a.aggiungiNome(i, p[i]);
		return a;
	}
	
	@Test(expected = java.util.NoSuchElementException.class)
	public void testContaOmonimiDiSequenzaVuota() {
		persone().contaOmonimiDi("ciao");
	}
	
	@Test
	public void testContaOmonimiDiSingletonVera() {
		assertEquals(1, persone("nome").contaOmonimiDi("nome"));
	}
	
	@Test
	public void testContaOmonimiDiSingletonFalsa() {
		assertEquals(0, persone("nome").contaOmonimiDi("ciao"));
	}
	
	@Test
	public void testContaOmonimiDiSequenzaConNull() {
		assertEquals(1, persone(null,"nome").contaOmonimiDi("nome"));
	}
	
	@Test
	public void testContaOmonimiDiParametroNull() {
		assertEquals(1, persone("nome",null).contaOmonimiDi(null));
	}
	
	@Test
	public void testContaOmonimiDiSeuenzaEParametroNull() {
		assertEquals(2, persone(null,null).contaOmonimiDi(null));
	}
	
	@Test
	public void testContaOmonimiDiSeuenzaConPiuElementiCercati() {
		assertEquals(2, persone("Andrea","Fabio","Andrea").contaOmonimiDi("Andrea"));
	}
}
