
public class TheSmallestNumberThatCanBeDivided {
	public static int theSmallestNumberThatCanBeDivided(int n){
		if(n == 1 || n == 2)//The case 1 or 2 is evident
			return n;
		else{
			int i = 3;
			int theSmallestNumberThatCanBeDivided = 2;
			
			while(i != (n + 1)){
				int i_bis = i, theSmallestNumberThatCanBeDivided_bis = theSmallestNumberThatCanBeDivided, j = 2;
				double squareRoot = Math.sqrt(i_bis);
				while(j <= squareRoot){
					while(i_bis % j == 0 && theSmallestNumberThatCanBeDivided_bis % j == 0){
						i_bis /= j;
						theSmallestNumberThatCanBeDivided_bis /= j;
					}
					if(i_bis % j == 0 && theSmallestNumberThatCanBeDivided_bis % j != 0){
						while(i_bis % j == 0){
							i_bis /= j;
							theSmallestNumberThatCanBeDivided *= j;
						}
					}
					squareRoot = Math.sqrt(i_bis);
					j++;
				}
				if(i_bis != 1 && theSmallestNumberThatCanBeDivided % i_bis != 0)
					theSmallestNumberThatCanBeDivided *= i_bis;
				i++;
			}
			return theSmallestNumberThatCanBeDivided;
		}
	}
}
