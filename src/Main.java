/*
 * 
 * https://projecteuler.net/problem=58
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		int[] primeCache;
		int i, j, k;
		
		/*
		 *  PHASE 1: BUILD A CACHE OF COMPOSITE AND PRIME NUMBERS FOR FAST PRIMALITY TESTING
		 */
		primeCache = new int[500];
		for(i = 1; i < primeCache.length; i++) {
			primeCache[i] = 1;
			if(i > 2 && (i & 1) == 0) {
				primeCache[i] = 0;
			}
			for(j = 3; j < Math.sqrt(i); j += 2) {
				if(i % j == 0) {
					primeCache[i] = 0;
					break;
				}
			}
		}
		
		for(i = 0; i < primeCache.length; i++) {
			System.out.println(i + " is " + primeCache[i]);
		}
	}
}
