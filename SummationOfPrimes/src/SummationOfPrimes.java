
public class SummationOfPrimes {
	public static long summationOfPrimes(int limit){
		if(limit <= 1)
			return 0;
		else if(limit == 2)
			return 2;
		else{
			long sum = 2;
			int n = 3;
			while(n <= limit){
				if(estPremier(n))
					sum += n;
				n += 2;
			}
			return sum;
		}
	}

	private static boolean estPremier(int n) {
		if(n <= 1)
			return false;
		else if(n == 2)
			return true;
		else if(n % 2 == 0)
			return false;
		else{
			double squareRoot = Math.sqrt(n);
			int i = 3;
			while(i <= squareRoot && n % i != 0)
				i += 2;
			if(i > squareRoot)
				return true;
			else
				return false;
		}
	}
}
