import java.util.ArrayList;
import java.util.List;

/**
 * @author Erik Johansson
 *
 */
/**
 * 
 * Problem 3: What is the largest prime factor of the number 600851475143 ?
 *
 */
public class Problem3 {

	public static final long n = 600851475143L;
	
	public static int checkLargestPrime(long nr){
		long largestFactor = 2;
		long prime = 3; //Börjar vid prim 3, o går sedan upp.
		long div = nr;
		
		//Kolla om nr är delbart med 2.
		if(div % 2 == 0) {
			div = div/2;
			largestFactor = 2;
			while(div%2 == 0){
				div = div/2;
			}
		}
		else {
			largestFactor = 1;
		}
		
		//Så länge som div inte är 1. (Då e den klar).
		while(div != 1){
			while(div%prime == 0){
				largestFactor = prime;
				div = div/prime;
			}
			prime += 2;
		}
		return (int)largestFactor;
	}
	public static void main(String[] args) {
		int largest = checkLargestPrime(n);
		
		System.out.print(largest);
	
	}

}
