/**
 * @author Erik Johansson
 *
 */

/**
 *  Problem 5: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *  VARNING: DENNA LÖSNING ÄR RIKTIGT LÅNGSAM, BEHÖVER FÖRBÄTTRAS!! tar ca 12sec.
 */
public class Problem5 {
	
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		
		int result = 0;
		int count = 1;
		boolean check = true;
		
		while(check){
			int min = 1;
			int max = 20;
			while(min < max){
				if(count%min != 0){
					break;
				}
				min++;
			}
			if(min == max){
				result = count;
				break;
			}
			count++;
		}
		System.out.println(result);
		double duration = System.currentTimeMillis() - startTime;
		System.out.print(duration/1000);
	}

}
