
public class FactorialDigitSum {

	public static int getSum(int n) {
		assert(n > -1);
		if(n == 0 || n == 1)
			return 1;
		int sum = 0;
		String digits = factorielle(n);
		int length = digits.length();
		for(int i = 0; i < length; i++)
			sum += digits.charAt(i) - '0';
		return sum;
	}

	private static String factorielle(int n) {
		// TODO Auto-generated method stub
		String result = "1";
		for(int i = 2; i <= n; i++){
			result = multiply(result, i);
		}
		return result;
	}

	private static String multiply(String toMult, int factor) {
		// TODO Auto-generated method stub
		int carry = 0;
		int digit;
		String result = "";
		int length = toMult.length();
		for(int i = length - 1; i > -1; i--){
			digit = (toMult.charAt(i) - '0') * factor + carry;
			carry = digit / 10;
			digit = digit % 10;
			result = digit + result;
		}
		if(carry != 0)
			result = carry + result;
		return result;
	}

}
