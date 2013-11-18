import java.util.ArrayList;

/**
 * @author Erik Johansson
 *
 */

/**
* 
*The sum of the squares of the first ten natural numbers is,
*1^2 + 2^2 + ... + 10^2 = 385
*
*The square of the sum of the first ten natural numbers is,
*(1 + 2 + ... + 10)^2 = 552 = 3025
*
*Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
*
*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. 
* 
*/

public class Problem6 {
	
	public static final int MAX = 100;
	
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		int squareSum = 0;
		int sum = 0;
		int squareOfSquareSum = 0;
		int result = 0;

		for(int i = 1; i <= MAX; i++){
			squareSum += Math.pow(i, 2);
			sum+= i;
		}
		
		squareOfSquareSum = (int)Math.pow(sum, 2);
		result = squareOfSquareSum - squareSum;
		System.out.println(result);
		double duration = System.currentTimeMillis() - startTime;
		System.out.print(duration/1000);
	}

}
