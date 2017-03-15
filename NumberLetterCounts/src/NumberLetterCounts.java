
public class NumberLetterCounts {
	static String[] units = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	static String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	static String[] particular = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	
	public static int count(int n){
		int result = 0;
		for(int i = 0; i <= n; i++){
			result += numberOfLetters(numberToLetters(i)); 
		}
		return result;
	}

	public static int numberOfLetters(String chaine) {
		int length = chaine.length();
		int numberOfLetters = 0;
		char currentChar;
		for(int i = 0; i < length; i++){
			currentChar = chaine.charAt(i);
			if(currentChar != ' ' && currentChar != '-')
				numberOfLetters++;
		}
		return numberOfLetters;
	}

	private static String numberToLetters(int i) {
		// TODO Auto-generated method stub
		String result = "";
		int units_i = i % 10;
		int tens_i = (i % 100) / 10;
		int cents_i = i / 100;
		if(i == 1000)
			result += "one thousand";
		else{
			if(cents_i != 0){
				result += units[cents_i - 1] + " hundred";
				if(tens_i != 0 || units_i != 0)
					result += " and ";
			}
			if(tens_i != 0){
				if(tens_i > 1 || units_i == 0){
					result += tens[tens_i - 1];
					if(units_i != 0)
						result += "-" + units[units_i - 1];
				} else {
					result += particular[units_i - 1];
				}
			} else {
				if(units_i != 0)
					result += units[units_i - 1];
			}
		}
		System.out.println(result);
		return result;
	}
}
