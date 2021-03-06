package Esercizi.Polimorfismo.Forme;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class CerchioTest {
	
	private Punto origine;
	private Cerchio unitario;

	@Before
	public void setUp() throws Exception {
		origine = new Punto(0, 0);
		this.unitario = new Cerchio(origine, 1);
	}
	
	@Test
	public void testTrasla_TraslazioneNulla() {
		this.unitario.trasla(0, 0);
		assertEquals(new Punto(0, 0), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuXPositive() {
		this.unitario.trasla(1, 0);
		assertEquals(new Punto(1, 0), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuXNegative() {
		this.unitario.trasla(-1, 0);
		assertEquals(new Punto(-1, 0), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuYPositive() {
		this.unitario.trasla(0, 1);
		assertEquals(new Punto(0, 1), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuYNegative() {
		this.unitario.trasla(0, -1);
		assertEquals(new Punto(0, -1), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuXYPositive() {
		this.unitario.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuXYNegative() {
		this.unitario.trasla(-1, -1);
		assertEquals(new Punto(-1, -1), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuXPositiveYNegative() {
		this.unitario.trasla(1, -1);
		assertEquals(new Punto(1, -1), this.unitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_TraslazioneUnitariaSuXNegativeYPositive() {
		this.unitario.trasla(-1, 1);
		assertEquals(new Punto(-1, 1), this.unitario.getRiferimento());
	}
	
	@Test
	public void testEquals_Omogenee() {
		assertEquals(new Cerchio(origine, 1), this.unitario);
		assertNotEquals(new Cerchio(origine, 2), this.unitario);
		assertNotEquals(new Cerchio(new Punto(1,1), 1), this.unitario);
		assertEquals(new Cerchio(new Punto(0,0), 1), this.unitario);
	}
	
	@Test
	public void testEquals_CollezioniOmogenee() {
		Set<Cerchio> set = new HashSet<>();
		set.add(unitario);
		assertEquals(1, set.size());
		set.add(unitario);
		assertEquals(1, set.size());
		set.add(new Cerchio(origine, 1));
		assertEquals(1, set.size());
		set.add(new Cerchio(origine, 2));
		assertEquals(2, set.size());
		set.add(new Cerchio(new Punto(0,0), 1));
		assertEquals(2, set.size());
	}
	
	@Test
	public void testEquals_FormeDiverse() {
		assertNotEquals(new Rettangolo(origine, 1, 1), this.unitario);
		assertNotEquals(this.unitario, new Rettangolo(origine, 1, 1));
		GruppoDiForme a = new GruppoDiForme();
		a.aggiungiForma(new Rettangolo(origine, 1, 1));
		assertNotEquals(a, this.unitario);
		assertNotEquals(this.unitario, a);
		a = new GruppoDiForme();
		a.aggiungiForma(this.unitario);
		assertNotEquals(a, this.unitario);
		assertNotEquals(this.unitario, a);
		a = new GruppoDiForme();
		a.aggiungiForma(new Cerchio(new Punto(0,0), 1));
		assertNotEquals(a, this.unitario);
		assertNotEquals(this.unitario, a);
	}

}
