/**
 * Выводит все простые числа, находящиеся в промежутке от 2 до 100
 */
public class Primes {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * Возвращает true если число простое, в противном случае false
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
