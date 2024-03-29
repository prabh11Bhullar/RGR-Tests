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
	
	@Test
	
	public void testOddNumber()
	{
		// * R2. If n is odd, return false
		EvenOdd x=new EvenOdd();
		boolean actualOutput=x.isEven(115);
		assertEquals(false,actualOutput);
	}
	
@Test
	
	public void testNLessThanOne()
	{
		// * R3. If N < 1, then return false
		EvenOdd x=new EvenOdd();
		boolean actualOutput=x.isEven(-115);
		assertEquals(false,actualOutput);
	}

@Test

public void nGreaterThanOne()
{
	 //* R4. N must be > 1
	EvenOdd x=new EvenOdd();
	boolean actualOutput=x.isEven(-15);
	assertEquals(false,actualOutput);
	
}
	

}
