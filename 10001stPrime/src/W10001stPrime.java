
public class W10001stPrime {
	public static int w10001stPrime(int n) {
		if(n == 1)
			return 2;
		int i = 1;
		int j = 1;
		while(i != n){
			j += 2;
			if(isPrimary(j))
				i++;
		}
		return j;
	}

	public static boolean isPrimary(int n) {
		// TODO Auto-generated method stub
		if(n <= 1)
			return false;
		else if(n == 2)
			return true;
		else{
			if(n % 2 == 0)
				return false;
			else{
				int i = 3;
				double squareRoot = Math.sqrt(n);
				while(i <= squareRoot && n % i != 0){
					i += 2;
				}
				if(i > squareRoot)
					return true;
				else
					return false;
			}
		}
	}
}
