package Esercizi.Polimorfismo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudenteTest {

private Studente studenteDefault;
	
	@Before
	public void setUp() {
		this.studenteDefault = new Studente("Andrea",20);
	}
	
	@Test
	public void testMinoreDi_Uguali() {
		assertFalse(this.studenteDefault.minoreDi(new Studente("Luca",20)));
	}
	
	@Test
	public void testMinoreDi_Verificato() {
		assertTrue(this.studenteDefault.minoreDi(new Studente("Paolo",35)));
	}
	
	@Test
	public void testMinoreDi_NonVerificato() {
		assertFalse(this.studenteDefault.minoreDi(new Studente("Gianni",17)));
	}

}
