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
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int current = 0, prior = 1, cycle = 0;
		double ratio = 0, primes = 0, numbers = 0;

		for (int i = 0; i < 54000; i++) {
			if (Main.isPrime(prior)) {
				primes++;
			}
			numbers++;
			ratio = primes / numbers;
			System.out.format("%4f %4f %4f\n", primes, numbers, ratio);
			if (ratio < 0.1) {
				break;
			}
			if (i % 4 == 0) {
				cycle++;
			}
			current = prior + (cycle * 2);
			prior = current;
		}
	}

}
