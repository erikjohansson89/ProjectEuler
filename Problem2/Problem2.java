/**
 * @author Erik Johansson
 *
 */
/*
 * Problem 2: 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 */
public class Problem2 {

	public static final int MAX = 4000000;
	
	public static void main(String[] args) {
		int firstNr = 1;
		int secondNr = 1;
		int next = 3;
		int sum = 0;
		

		for(int i = 0; i < MAX; i = next){
			if(i%2 == 0){
				sum += i;
			}
			next = firstNr + secondNr;
			firstNr = secondNr;
			secondNr = next;
		}
		
		System.out.print(sum);

	}

}
