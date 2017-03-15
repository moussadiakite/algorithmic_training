
public class MultipleOf3Or5 {

	public static int sum(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++){
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}

}
