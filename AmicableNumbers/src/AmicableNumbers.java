import java.util.Iterator;
import java.util.LinkedList;

public class AmicableNumbers {
	
	public static int getSumUnder(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		LinkedList<Integer> numbers = amicablesNumberUnder(n);
		Iterator<Integer> it = numbers.iterator();
		Integer current;
		while(it.hasNext()){
			current = it.next();
			sum += current;
		}
		return sum;
	}

	private static LinkedList<Integer> amicablesNumberUnder(int n) {
		LinkedList<Integer> numbers = new LinkedList();
		for(int i = 1; i <= n; i++){
			if(isAmicableNumber(i)){
				numbers.add(i);
			}
		}
		return numbers;
	}

	private static boolean isAmicableNumber(int n) {
		// TODO Auto-generated method stub
		int intermediateSum = sumOfDivisors(n);
		return n != intermediateSum && n == sumOfDivisors(intermediateSum);
	}

	public static int sumOfDivisors(int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return -1;
		if(n == 1)
			return 0;
		int sumOfDivisors = 1;
		double sqrt = Math.sqrt(n);
		int i = 2;
		while(i < sqrt){
			if(n % i == 0){
				sumOfDivisors += i + n/i;
			}
			i++;
		}
		if(i * i == n)
			sumOfDivisors += i;
		return sumOfDivisors;
	}

}
