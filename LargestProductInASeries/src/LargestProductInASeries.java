
public class LargestProductInASeries {
	public static long largestProductInAseries(int n, String theDigits){
		int numberOfDigits = theDigits.length();
		int[] theDigitsInt = new int[numberOfDigits];
		for(int i = 0; i != numberOfDigits; i++)
			theDigitsInt[i] = Character.getNumericValue(theDigits.charAt(i));
		int lastDigit = numberOfDigits - n;
		//for the first thirteen number
		long product = 1;
		for(int j = 0; j != n; j++)
			product *= theDigitsInt[j];
		long theLargestProductInASeries = product;
		for(int i = 1; i <= lastDigit; i++){
			product = 1;
			for(int j = 0; j != n; j++)
				product *= theDigitsInt[j + i];
			if(product > theLargestProductInASeries)
				theLargestProductInASeries = product;
		}
		return theLargestProductInASeries;
	}
}
