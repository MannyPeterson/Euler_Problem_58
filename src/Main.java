/*
 * 
 * https://projecteuler.net/problem=58
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		int[][] diagQuads;
		int[] primeCache;
		int i, j, k;

		/*
		 * PHASE 1: BUILD A CACHE OF COMPOSITE AND PRIME NUMBERS FOR FAST PRIMALITY
		 * TESTING
		 */
		primeCache = new int[500];
		for (i = 1; i < primeCache.length; i++) {
			primeCache[i] = 1;
			if (i > 2 && (i & 1) == 0) {
				primeCache[i] = 0;
			}
			for (j = 3; j < Math.sqrt(i); j += 2) {
				if (i % j == 0) {
					primeCache[i] = 0;
					break;
				}
			}
		}

		/*
		 * PHASE 2: BUILD DIAGNALS FOR THE FOUR QUADRANTS OF THE BOX / SQUARE
		 */
		diagQuads = new int[4][100];
		i = 10;
		diagQuads[0][0] = 3;
		diagQuads[1][0] = 5;
		diagQuads[2][0] = 7;
		diagQuads[3][0] = 9;
		for(j = 1; j < 100; j++) {
			diagQuads[0][j] = diagQuads[0][j - 1] + i;
			i += 2;
			diagQuads[1][j] = diagQuads[0][j - 1] + i;
			i += 2;
			diagQuads[2][j] = diagQuads[0][j - 1] + i;
			i += 2;
			diagQuads[3][j] = diagQuads[0][j - 1] + i;
			i += 2;
		}


	}
}
