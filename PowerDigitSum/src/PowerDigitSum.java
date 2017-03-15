
public class PowerDigitSum {

	public static int powerDigitSum(int twoPower) {
		// TODO Auto-generated method stub
		assert(twoPower > -1);
		if(twoPower == 0)
			return 1;
		String result = "2";
		for(int i = 1; i < twoPower; i++){
			result = doubleResult(result);
		}
		System.out.println(result);
		return sumOfDigits(result);
	}

	private static int sumOfDigits(String result) {
		// TODO Auto-generated method stub
		int length = result.length();
		int sum = 0;
		for(int i = 0; i < length; i++)
			sum += result.charAt(i) - '0';
		return sum;
	}

	private static String doubleResult(String result) {
		String resultBis = "";
		int carry = 0;
		int currentValue;
		int length = result.length();
		for(int i = length - 1; i > -1; i--){
			currentValue = 2 * ( result.charAt(i)- '0' ) + carry;
			carry = currentValue / 10;
			currentValue %= 10;
			resultBis = currentValue + resultBis;
		}
		if(carry != 0)
			resultBis = carry + resultBis;
		return resultBis;
	}

}
