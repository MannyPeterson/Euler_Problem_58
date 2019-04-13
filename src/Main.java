/*
 * Manny Peterson's Solution to Euler Project Problem #58
 * https://projecteuler.net/problem=58
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n > 2 && (n & 1) == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int next = 0, current = 1, cycle = 0;
		double ratio = 0, primes = 0, numbers = 0;
		for (int i = 0; i < 60000; i++) {
			if (Main.isPrime(current))
				primes++;
			numbers++;
			ratio = primes / numbers;
			if (ratio > 0.0 & ratio < 0.1)
				break;
			if (i % 4 == 0)
				cycle++;
			next = current + (cycle * 2);
			current = next;
		}
		System.out.format("ANSWER: RATIO = %f%%, LENGTH = %d", ratio * 100, cycle * 2 + 1);
	}
}