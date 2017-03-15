package fibo;

public class Fibo {
	public final static int N = 1000000;
	public static int fibo(int n){
		int[] memo = new int[n + 1];//to memoize the values
		memo[0] = 0;
		memo[1] = 1;
		//fill memo with -1
		for(int  i = 2; i < (n + 1); i++){
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];
	}
	
	public static int sum(int max){
		int[] memo = new int[N + 1];//to memoize the values
		int sum = 0;
		memo[0] = 0;
		memo[1] = 1;
		int nextValue = memo[1] + memo[0];
		int i = 2;
		while(nextValue <= max){
			memo[i] = nextValue;
			if(i % 3 == 0){
				sum += memo[i];
			}
			nextValue = memo[i] + memo[i - 1];
			i++;
		}
		return sum;
	}
}
