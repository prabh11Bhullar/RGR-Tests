import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenOddTest {

	/* function isEven(n) {}
	 * Accepts 1 integer value, n
	 * 
	 * R1. If n is even, return true
	 * R2. If n is odd, return false
	 * R3. If N < 1, then return false
	 * R4. N must be > 1
	 */
	@Test
	 
	
	public void testEvenNumber()
	{
		//R1. If n is even, return true
		EvenOdd x = new EvenOdd();
		boolean actualOutput = x.isEven(120);
		assertEquals(true, actualOutput);
	}
	

}
