package aptitudePreparation;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println(isPrime(42));
	}
	
	/* Objective: To find if a number is prime or not in an
	 *            optimised way.
	 *    Inputs:
	 *         n: The number to check if prime or not
	 *    Output: True, if n is prime
	 *            False, if n is not prime
	 *  Approach: We divide n by numbers in the range (2, sqrt(n)).
	 *            If n is divisible by any of them, it is not prime.
	 *            Else, it is prime. 
	 * 
	 */
	private static boolean isPrime(int n){
		if(n < 2){
			return false;
		}
		
		int i = 2;
		
		// This loops over numbers in range(2, sqrt(n))
		while(i*i <= n){
			if(n % i == 0){
				return false;
			}
			i++;
		}
		return true;
	}

}
