
public class EvenOdd {
	// function isEven(n) 
		// Accepts an integer, n > 1
		// Returns true:
		//		* if n is even
		// Returns false
		// 		* if n is odd
		//	 	* if n < 1	
	
	public boolean isEven(int n)
	{
		if(n<=0)
		{
			return false;
		}
		else
		{
			if(n%2==0)
			{
				return true;
			}
				
			else
			{
				return false;
			}
				
		}
	}

}
