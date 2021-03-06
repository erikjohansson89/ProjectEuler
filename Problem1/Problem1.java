/**
 * @author Erik Johansson
 *
 */
/**
 * 
 * Problem 1: Multiples of 3 and 5
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class Problem1 {

	public static final int MAX = 1000;
	public static final int three = 3;
	public static final int five = 5;
	
	public static void main(String[] args) {
		int counter = 0;
		for(int i = 0; i < MAX; i++){
			if(i%three == 0 || i%five == 0){
				counter += i;
			}
		}
		
		System.out.print(counter);

	}

}
