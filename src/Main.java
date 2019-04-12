/*
 * 
 * https://projecteuler.net/problem=58
 * 
 * 
 * 
 */

public class Main {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n > 2 && (n & 1) == 0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] diagQuads;
		int i, j;

		/*
		 * PHASE 1: BUILD DIAGNALS FOR THE FOUR QUADRANTS OF THE BOX / SQUARE
		 */
		diagQuads = new int[4][100];
		diagQuads[0][0] = 3;
		diagQuads[1][0] = 5;
		diagQuads[2][0] = 7;
		diagQuads[3][0] = 9;
		i = 10;
		for (j = 1; j < diagQuads[0].length; j++) {
			diagQuads[0][j] = diagQuads[0][j - 1] + i;
			i += 2;
			diagQuads[1][j] = diagQuads[1][j - 1] + i;
			i += 2;
			diagQuads[2][j] = diagQuads[2][j - 1] + i;
			i += 2;
			diagQuads[3][j] = diagQuads[3][j - 1] + i;
			i += 2;
		}

		for (i = 0; i < diagQuads[0].length; i++) {
			System.out.format("%4d   %4d   %4d   %4d\n", diagQuads[0][i], diagQuads[1][i], diagQuads[2][i],
					diagQuads[3][i]);
		}
	}
}
