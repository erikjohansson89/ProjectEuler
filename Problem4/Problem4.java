import java.util.ArrayList;

/**
 * @author Erik Johansson
 *
 */

/**
 *  Problem 4: 
 */
public class Problem4 {

	public static void main(String[] args) {
		int combined = 0;
		int largestPallindrome = 0;
		String nrAsString = "";
		ArrayList<Integer> pallindromes = new ArrayList<Integer>();
		
		for(int i = 100; i < 1000; i ++){
			for(int j = 100; j < 1000; j++){
				combined = i*j;
				nrAsString = Integer.toString(combined);
				int stringLength = nrAsString.length();
				boolean result = true;

				for(int k = 0; k < (stringLength/2) + 1; ++k){
					if(nrAsString.charAt(k) != nrAsString.charAt(stringLength - k - 1)){
						result = false;
						break;
					}
				}
				if(result){
					pallindromes.add(Integer.parseInt(nrAsString));
				}
				
			}
		}
		largestPallindrome = pallindromes.get(0);
		for(int i = 0; i < pallindromes.size() - 1; i++){
			if(pallindromes.get(i) > largestPallindrome){
				largestPallindrome = pallindromes.get(i);
			}
		}
		
		System.out.print(largestPallindrome);

	}

}
