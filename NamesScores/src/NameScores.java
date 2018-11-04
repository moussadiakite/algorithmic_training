import java.util.ArrayList;
import java.util.Collections;

public class NameScores {
	public static long sum(ArrayList<String> names) {
		int length = names.size();
		long sum = 0;
		sort(names);
		for(int i = 0; i < length; ++i){
			System.out.println(names.get(i) + ", score = " + score(names.get(i)) + ", length = " + names.get(i).length());
			sum += score(names.get(i)) * (i + 1);
		}
		return sum;
	}

	private static int score(String name) {
		int score = 0;
		for(int i = 1; i < name.length() - 1; ++i)
			score += name.charAt(i) - 'A' + 1;
		return score;
	}

	private static void sort(ArrayList<String> names) {
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
	}
}
