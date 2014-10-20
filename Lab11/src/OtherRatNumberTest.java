import static org.junit.Assert.*; 

import org.junit.Test;


public class OtherRatNumberTest {

	 @Test
	  public void testGetNumer() {
	   RatNumber rn1 = new RatNumber(1, 3);
	   assertEquals(rn1.getNumer(), 1);
	  }
	  
	  public void testGetDenom() {
	   RatNumber rn2 = new RatNumber(1, 3);
	   assertEquals(rn2.getDenom(), 3);
	  }
	   
	  public void testAdd() {
	   RatNumber rnA = new RatNumber(3, 5);
	   assertEquals(rnA.add(3, 5));
	  }
	   
	  public void testSubtract() {
	   RatNumber rnS = new RatNumber(7, 3);
	   assertEquals(rnS.subtract(rn));
	  }
	   
	  public void testMultiply() {
	   RatNumber rnM = new RatNumber(3, 6);
	   assertEquals(rnM.mult(rn));
	  }
	   
	  public void testDivide() {
	   RatNumber rnD = new RatNumber(8, 2);
	   assertEquals(rnD.divide(rn));
	  }
}