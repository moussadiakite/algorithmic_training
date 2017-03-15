package largestPrimeNumber;

public class LargestPrimeNumber {
	public static long largestPrimeNumber(long n){
		if(n <= 1l)
			return -1;
		else{
			long theGreatestPrimeFactor = 1;
			while(n % 2 == 0){
				n /= 2;
				theGreatestPrimeFactor = 2;
			}
			double squareRoot = Math.sqrt(n);
			int i = 3;
			while(i <= squareRoot){
					while(n % i == 0){
						n /= i;
						theGreatestPrimeFactor = i;
					}
					squareRoot = Math.sqrt(n);
					i += 2;
			}
			if(n == 1)
				return theGreatestPrimeFactor;
			else
				return n;
		}
	}
}
