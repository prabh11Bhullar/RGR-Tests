
public class FizzBuzz {
	
	public boolean checkPrime(int num) {
 		boolean isPrime = true;
 		for (int i = 2; i < num-1; i++) {
 			if (num % i == 0) {
 				// number is NOT prime
 				isPrime = false;
 				break;
 			}
 		}
 		// debug, just to check that algo is working
 		System.out.println("num: " + num);
 		System.out.println("is num prime?" + isPrime);
 		
 		return isPrime;
 	}
 	
 	
 	public String buzzzzzz(int num) {
 		
 		// R5 implementation here
 		boolean isPrime = checkPrime(num);
 		
 		if (isPrime == true) {
 			return "whizz";
 		}
 		
 		// R1-4 below
	
 		if (num % 15 == 0 ) {
 			return "fizzbuzz";
 		}
 		else if (num % 5 == 0) {
 			return "buzz";
 		}
 		else if (num % 3 == 0) {
 			return "fizz";	
 		}
 		
 		// OPTION 1: concat an empty string
 		// to the number
 		// return num + "";
 		
 		// OPTION 2: Use Java built-in
 		// String.valueOf() function
 		// This function converts int to String
 		return String.valueOf(num);
 	}
 	
 

}
