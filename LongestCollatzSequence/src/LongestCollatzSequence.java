
public class LongestCollatzSequence {

	public static int getLongestChaine(int n) {
		int longestSequenceLength = 0;
		int currentSequenceLength = 0;
		long number;
		int specialStartingNumber = 1;
		for(int startingNumber = 1; startingNumber <= n; startingNumber++){
			currentSequenceLength = 1;
			number = startingNumber;
			while(number != 1){
				if(number % 2 == 0)
					number /= 2;
				else
					number = 3 * number + 1;
				currentSequenceLength++;
			}
			if(currentSequenceLength > longestSequenceLength){
				longestSequenceLength = currentSequenceLength;
				specialStartingNumber = startingNumber;
			}
		}
		return specialStartingNumber;
	}

}
