/**
 * Сообщает являются ли указанные в параметрах строки полиндромами.
 */
public class Palindrome {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i] + " - " + isPalindrome(args[i]));
		}
	}

	/**
	 * Производит опреацию разворота строки. Возвращает развернутую строку.
	 */
	public static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		return reversed;
	}


	/**
	 * Проверяет является ли строка полиндромом. Возвращает true если является, в противном случае false.
	 */
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}
}
