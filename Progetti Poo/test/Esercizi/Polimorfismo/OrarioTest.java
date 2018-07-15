package Esercizi.Polimorfismo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrarioTest {

	private Orario orarioDefault;
	
	@Before
	public void setUp() {
		this.orarioDefault = new Orario(12,34);
	}
	
	@Test
	public void testMinoreDi_Uguali() {
		assertFalse(this.orarioDefault.minoreDi(new Orario(12,34)));
	}
	
	@Test
	public void testMinoreDi_VerificatoPerMinuti() {
		assertTrue(this.orarioDefault.minoreDi(new Orario(12,35)));
	}
	
	@Test
	public void testMinoreDi_VerificatoPerOre() {
		assertTrue(this.orarioDefault.minoreDi(new Orario(21,00)));
	}
	
	@Test
	public void testMinoreDi_NonVerificatoPerMinuti() {
		assertFalse(this.orarioDefault.minoreDi(new Orario(12,01)));
	}
	
	@Test
	public void testMinoreDi_NonVerificatoPerOre() {
		assertFalse(this.orarioDefault.minoreDi(new Orario(02,23)));
	}
	
}
