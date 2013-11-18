import java.util.ArrayList;
import java.util.List;

/**
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 */

/**
 * @author Erik Johansson
 * 
 */

public class Problem7 {

	public static void main(String[] args) {
		int primeCount = 0;
		long count = 0;
		long prime = 0;

		while (primeCount != 10001) {
			if (isPrime(count)) {
				prime = count;
				primeCount++;
			}
			count++;
		}

		System.out.print(prime);
	}

	public static boolean isPrime(long n) {
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
