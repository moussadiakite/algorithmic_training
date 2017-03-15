
public class LargeSum {

	public static long getSum(String[] numbers) {
		// TODO Auto-generated method stub
		long sum = 0;
		int length = numbers.length;
		int beginIndex = 40;
		int endIndex = 50;
		long retenue = 0;
		for(int j = 0; j < 5; j++){
			for(int i = 0; i < length; i++){
				sum += Long.parseLong(numbers[i].substring(beginIndex, endIndex));
			}
			retenue = sum / 10000000000l;
			if(j != 4)
				sum = retenue;
			beginIndex -= 10;
			endIndex -= 10;
		}
		return sum;
	}

}
