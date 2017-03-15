
public class SumSquareDifference {
	public static int squareOfSum(int n){
		return n*n*(n + 1)*(n+1)/4;
	}
	
	public static int sumOfSquare(int n){
		return n*(n + 1)*(2*n+1)/6;
	}
	
	public static int sumSquareDifference(int n){
		return squareOfSum(n) - sumOfSquare(n);
	}
}
