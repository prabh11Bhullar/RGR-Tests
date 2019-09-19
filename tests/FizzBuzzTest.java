import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	//R1: If number divisible by 3, return "fizz"
	 	@Test
	 	public void testDivisibleBy3() {
	 		FizzBuzz b = new FizzBuzz();
	 		// choose any number that's divisible by 3
	 		String result = b.buzzzzzz(27);
	 		assertEquals("fizz", result);
	 	}
	 
	 	//R2: If number is divisible by 5, return "buzz"
	 	@Test
	 	public void testDivisibleBy5() {
	 		FizzBuzz b = new FizzBuzz();
	 		// choose any number that's divisible by 5
	 		
	 		// we changed the input from 5 to 10 because
	 		// we don't want a conflict with R5
	 		String result = b.buzzzzzz(10);
	 		assertEquals("buzz", result);
	 	}
	 	//R3: If number is divisible by 3 & 5, return "fizzbuzz"
	 	@Test
	 	public void testDivisibleBy3and5() {
	 		FizzBuzz b = new FizzBuzz();
	 		// choose any number that's divisible by 3 & 5
	 		String result = b.buzzzzzz(15);
	 		assertEquals("fizzbuzz", result);
	 	}
	 	
	 	// R4: If no other requirement fulfilled, return the number
	 	@Test
	 	public void testOtherNumber() {
	 		FizzBuzz b = new FizzBuzz();
	 		// choose any number that's divisible by 5
	 		String result = b.buzzzzzz(4);
	 		assertEquals("4", result);
	 	}
	 	
	 	// R5: If number is prime, return WHIZZ
	 	@Test
	 	public void testPrimeNumber() {
	 		FizzBuzz b = new FizzBuzz();
			// choose any number that's divisible by 5
			// choose any number that's prime
	 		String result = b.buzzzzzz(11);
	 		assertEquals("whizz", result);
	 	}
	 	
		// R6: If number if prime + divisible by 3, 
		// append WHIZZ to end
		// Expectedoutput: 3 = > FIZZWHIZZ
		// Expectedoutput: 5 = > BUZZWHIZZ
		@Test
		public void testAppendWhizz() {
			FizzBuzz b = new FizzBuzz();
	
			// test prime + div by 3
			String result = b.buzzzzzz(3);
			assertEquals("fizzwhizz", result);
			
			// test prime + div by 5
			result = b.buzzzzzz(5);
			assertEquals("buzzwhizz", result);
		}
}