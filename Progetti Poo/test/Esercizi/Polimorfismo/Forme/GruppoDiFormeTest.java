package Esercizi.Polimorfismo.Forme;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class GruppoDiFormeTest {

	private Punto origine, origine2;
	private GruppoDiForme vuoto;
	private GruppoDiForme semplice;
	private GruppoDiForme composito;
	private GruppoDiForme complesso;
	private Cerchio cUnitario;
	private Rettangolo rUnitario;

	@Before
	public void setUp() throws Exception {
		origine = new Punto(0, 0);
		origine2 = new Punto(0,0);
		this.cUnitario = new Cerchio(origine2, 1);
		this.rUnitario = new Rettangolo(origine, 1, 1);
		this.vuoto = new GruppoDiForme();
		this.semplice = new GruppoDiForme();
		this.composito = new GruppoDiForme();
		this.complesso = new GruppoDiForme();
		this.semplice.aggiungiForma(cUnitario);
		this.composito.aggiungiForma(this.semplice);
		this.complesso.aggiungiForma(this.composito);
	}

	@Test
	public void testIGruppiVuotiNonHannoComponenti() {
		assertEquals(0, this.vuoto.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiForma_GruppoVuoto() {
		assertEquals(0, this.vuoto.getNumeroComponenti());
		this.vuoto.aggiungiForma(this.rUnitario);
		assertEquals(1, this.vuoto.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiForma_GruppoSemplice() {
		assertEquals(1, this.semplice.getNumeroComponenti());
		this.semplice.aggiungiForma(this.rUnitario);
		assertEquals(2, this.semplice.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiForma_GruppoComposito() {
		assertEquals(1, this.composito.getNumeroComponenti());
		this.composito.aggiungiForma(this.rUnitario);
		assertEquals(2, this.composito.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiForma_GruppoComplesso() {
		assertEquals(1, this.complesso.getNumeroComponenti());
		this.complesso.aggiungiForma(this.rUnitario);
		assertEquals(2, this.complesso.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiForma_Pieno() {
		assertEquals(0, this.vuoto.getNumeroComponenti());
		for(int i=0; i<10; i++)
		    this.complesso.aggiungiForma(this.rUnitario);
		assertEquals(2, this.complesso.getNumeroComponenti());
		this.complesso.aggiungiForma(this.cUnitario);
		assertEquals(3, this.complesso.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiGruppo_GruppoVuoto() {
		assertEquals(0, this.vuoto.getNumeroComponenti());
		this.vuoto.aggiungiForma(this.semplice);
		assertEquals(1, this.vuoto.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiGruppo_GruppoSemplice() {
		assertEquals(1, this.semplice.getNumeroComponenti());
		this.semplice.aggiungiForma(this.semplice);
		assertEquals(2, this.semplice.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiGruppo_GruppoComposito() {
		assertEquals(1, this.composito.getNumeroComponenti());
		this.composito.aggiungiForma(this.semplice);
		assertEquals(1, this.composito.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiGruppo_GruppoComplesso() {
		assertEquals(1, this.complesso.getNumeroComponenti());
		this.complesso.aggiungiForma(this.semplice);
		assertEquals(2, this.complesso.getNumeroComponenti());
	}
	
	@Test
	public void testTrasla_GruppoVuoto() {
		this.vuoto.trasla(1, 1);
	}
	
	@Test
	public void testTrasla_GruppoSemplice_TraslazioneNulla() {
		this.semplice.trasla(0, 0);
		assertEquals(new Punto(0, 0), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoSemplice_TraslazioneUnitariaSuXY() {
		this.semplice.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoComposito_TraslazioneNulla() {
		this.composito.trasla(0, 0);
		assertEquals(new Punto(0, 0), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoComposito_TraslazioneUnitariaSuXY() {
		this.composito.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoComplesso_TraslazioneNulla() {
		this.complesso.trasla(0, 0);
		assertEquals(new Punto(0, 0), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoComplesso_TraslazioneUnitariaSuXY() {
		this.complesso.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoConPrimaFormaInPosizineDiversa_TraslazioneNulla() {
		GruppoDiForme nuovo = new GruppoDiForme();
		nuovo.aggiungiForma(this.vuoto);
		nuovo.aggiungiForma(this.cUnitario);
		nuovo.trasla(0, 0);
		assertEquals(new Punto(0, 0), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoConPrimaFormaInPosizineDiversa_TraslazioneUnitariaSuXY() {
		GruppoDiForme nuovo = new GruppoDiForme();
		nuovo.aggiungiForma(this.vuoto);
		nuovo.aggiungiForma(this.rUnitario);
		nuovo.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.rUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoConPiuForme_TraslazioneUnitariaSuXY() {
		GruppoDiForme nuovo = new GruppoDiForme();
		nuovo.aggiungiForma(this.rUnitario);
		nuovo.aggiungiForma(this.cUnitario);
		nuovo.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.rUnitario.getRiferimento());
		assertEquals(new Punto(1, 1), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testTrasla_GruppoConPiuForme_PiuTraslazioniSuStessiElementi() {
		GruppoDiForme nuovo = new GruppoDiForme();
		nuovo.aggiungiForma(this.rUnitario);
		nuovo.aggiungiForma(this.complesso);
		nuovo.aggiungiForma(this.vuoto);
		nuovo.aggiungiForma(this.cUnitario);
		nuovo.aggiungiForma(this.composito);
		nuovo.trasla(1, 1);
		assertEquals(new Punto(1, 1), this.rUnitario.getRiferimento());
		assertEquals(new Punto(3, 3), this.cUnitario.getRiferimento());
	}
	
	@Test
	public void testEquals_Omogenee() {
		GruppoDiForme a = new GruppoDiForme();
		a.aggiungiForma(cUnitario);
		assertEquals(a, this.semplice);
		a = new GruppoDiForme();
		a.aggiungiForma(rUnitario);
		assertNotEquals(a, this.semplice);
		a.aggiungiForma(cUnitario);
		assertNotEquals(a, this.semplice);
		a = new GruppoDiForme();
		a.aggiungiForma(new Cerchio(origine, 2));
		assertNotEquals(a, this.semplice);
		a = new GruppoDiForme();
		a.aggiungiForma(new Cerchio(new Punto(1,1), 1));
		assertNotEquals(a, this.semplice);
		a = new GruppoDiForme();
		a.aggiungiForma(new Cerchio(new Punto(0,0), 1));
		assertEquals(a, this.semplice);
	}
	
	@Test
	public void testEquals_CollezioniOmogenee() {
		Set<GruppoDiForme> set = new HashSet<>();
		set.add(semplice);
		assertEquals(1, set.size());
		set.add(semplice);
		assertEquals(1, set.size());
		GruppoDiForme a = new GruppoDiForme();
		a.aggiungiForma(rUnitario);
		set.add(a);
		assertEquals(2, set.size());
		a = new GruppoDiForme();
		a.aggiungiForma(new Cerchio(new Punto(1,1), 1));
		set.add(a);
		assertEquals(3, set.size());
		a = new GruppoDiForme();
		a.aggiungiForma(new Cerchio(new Punto(0,0), 1));
		set.add(a);
		assertEquals(3, set.size());
	}
	
	@Test
	public void testEquals_FormeDiverse() {
		assertNotEquals(new Rettangolo(origine, 1, 1), this.semplice);
		assertNotEquals(this.semplice, new Rettangolo(origine, 1, 1));
		assertNotEquals(new Cerchio(origine, 1), this.semplice);
		assertNotEquals(this.semplice, new Cerchio(origine, 1));
	}
	
	
}
