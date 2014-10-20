import static org.junit.Assert.*;

import org.junit.Test;


public class RatNumberTest {

	@Test
	public void test() {
		RatNumber rn1 = new RatNumber(1, 3);
		assertEquals(rn1.getNumer(), 1);
	}
	
	public void testGetNumer() {
		RatNumber rn1 = new RatNumber(2, 4);
		assertEquals(rn1.getNumer(), 2);
	}
	
	public void testGetDenom() {
		RatNumber rn1 = new RatNumber(3, 5);
		assertEquals(rn1.getNumer(), 3);
	}
	
	public void testAdd() {
		RatNumber rn1 = new RatNumber(4, 6);
		assertEquals(rn1.getNumer(), 4);
	}
	
	public void testSubtract() {
		RatNumber rn1 = new RatNumber(5, 7);
		assertEquals(rn1.getNumer(), 5);
	}
	
	public void testMultiply() {
		RatNumber rn1 = new RatNumber(6, 8);
		assertEquals(rn1.getNumer(), 6);
	}
	
	public void testDivide() {
		RatNumber rn1 = new RatNumber(7, 9);
		assertEquals(rn1.getNumer(), 7);
	}
}