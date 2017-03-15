
public class SpecialPythagoreanTriplet {
	public static boolean isAPythagoreanTriplet(int a, int b, int c){
		return (a*a + b*b) == c*c;
	}
	
	public static long specialPythagoreanTriplet(int sum){
		int a = 1, b = 0, c = 0;
		int aLimit = sum / 3 - 1, bLimit, remainder;
		while(a <= aLimit){
			remainder = sum - a;
			b = a + 1;
			bLimit = remainder / 2 - 1;
			c = remainder - b;
			while(b <= bLimit && !isAPythagoreanTriplet(a, b, c)){
				b++;
				c = remainder - b;
			}
			if(isAPythagoreanTriplet(a, b, c)){
				System.out.println("a = " + a + " b = " + b + " c = " + c);
				break;
			}
			a++;
		}
		return a*b*c;
	}
}
