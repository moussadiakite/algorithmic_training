
public class HighlyDivisibleTriangularNumber {
	public static long getFirst(int n){
		int nextNumber = 2;
		int currentTriangularNumber = 1;
		while(nbDiviseurs(currentTriangularNumber) < n){
			currentTriangularNumber += nextNumber;
			nextNumber++;
		}
		return currentTriangularNumber;
	}

	public static int nbDiviseurs(long currentTriangularNumber) {
		if(currentTriangularNumber == 1)
			return 1;
		int nbDiviseurs = 2;
		double square = Math.sqrt(currentTriangularNumber);
		int i = 2;
		while(i <= square){
			if(currentTriangularNumber % i == 0){
				nbDiviseurs += 2;
			}
			if(i * i == currentTriangularNumber)
				nbDiviseurs--;
			i++;
		}
		System.out.println(currentTriangularNumber + ": " + nbDiviseurs + " diviseurs");
		return nbDiviseurs;
	}
}
