package Esercizi.Collezioni;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
	
	private Collection<Integer> c;
	private Collection<Integer> t;
	
	@Before
	public void setUp () {
		c = new LinkedList<Integer>();
		t = new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		t.add(1);
		t.add(2);
	}
	
	@Test
	public void testRemoveAll() {
		assertTrue(c.removeAll(t));
		Iterator<Integer> it = c.iterator();
		assertTrue(it.hasNext());
		assertEquals(3,it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testIndexOf() {
		assertSame(0, ((LinkedList<Integer>) c).indexOf(1));
		Integer a = 4;
		Integer b = 4;
		c.add(a);
		c.add(b);
		assertSame(3, ((LinkedList<Integer>) c).indexOf(4));
		assertSame(3, ((LinkedList<Integer>) c).indexOf(a));
		assertSame(3, ((LinkedList<Integer>) c).indexOf(b)); // prende il primo riferimento in base ad equals
	}
	
	@Test
	public void testContains() {
		assertTrue(c.contains(1));
		Integer a = 4;
		Integer b = 4;
		c.add(a);
		c.add(b);
		assertTrue(c.contains(4));
		assertTrue(c.contains(a));
		assertTrue(c.contains(b)); // prende il primo riferimento in base ad equals
	}
	
	@Test
	public void testRetainAll() {
		assertTrue(c.retainAll(t));
		Iterator<Integer> it = c.iterator();
		assertTrue(it.hasNext());
		assertEquals(1,it.next().intValue());
		assertTrue(it.hasNext());
		assertEquals(2,it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testContainsAll() {
		assertTrue(c.containsAll(t));
		t.add(4);
		assertFalse(c.containsAll(t));
	}
	
	
	
	
}