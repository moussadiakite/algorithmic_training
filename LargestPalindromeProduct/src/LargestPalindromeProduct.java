
public class LargestPalindromeProduct {
	public static long numberLength(long number){
		if(number < 0)
			number *= -1;
		long i = 10, j = 1;
		while((number % i) != number){
			i *= 10;
			j++;
		}
		return j;
	}
	
	public static boolean isPalindrome(long number){
		long numberLength = numberLength(number);
		long powerOfTen = (long)Math.pow(10, numberLength - 1);
		return RecursiveIsPalindrome(number, numberLength, powerOfTen);
	}
	
	private static boolean RecursiveIsPalindrome(long number, long numberLength, long powerOfTen){
		if(numberLength == 0 || numberLength == 1){
			return true;
		} else {
			long leftDigit = number / powerOfTen, rightDigit = number % 10;
			if(leftDigit == rightDigit){
				number = ((number % powerOfTen) - (number % 10)) / 10;
				return RecursiveIsPalindrome(number, numberLength - 2, powerOfTen / 100);
			} else {
				return false;
			}
		}
	}
	
	public static long largestPalindromeProduct(long n){
		int k = (int)Math.pow(10, n - 1) - 1;
		int  i = (k + 1) * 10 - 1;
		int j = i;
		int product = j * i, largestPalindromeProduct = 0;
		while(i >= 100){
			if(isPalindrome(product) && product > largestPalindromeProduct)
				largestPalindromeProduct = product;
			if(j == k){
				i--;
				j = i + 1;
			}
			j--;
			product = j * i;
		}
		return largestPalindromeProduct;
	}
}
