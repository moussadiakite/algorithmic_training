
public class LargestProductInAGrid {
	public static long LargestProductInAGrid(String grid, int n, int gridSize){
		int[][] integerGrid = stringGridToIntegerGrid(grid, gridSize);
		long max = 0;
		max = downMax(max, integerGrid, n, gridSize);
		max = rightMax(max, integerGrid, n, gridSize);
		max = diagonalTopLeftToBottomRightMax(max, integerGrid, n, gridSize);
		max = diagonalBottomLeftToTopRightMax(max, integerGrid, n, gridSize);
		return max;
	}

	private static long diagonalTopLeftToBottomRightMax(long max, int[][] integerGrid, int n, int gridSize) {
		long product;
		long new_max = max;
		for(int i = gridSize - 4; i >= 0; i--){
			for(int j = 0; j < gridSize - i - 3; j++){
				int k = i + j;
				int l = j;
				int limit = k + n;
				product = 1;
				while(k < limit){
					product *= integerGrid[k][l];
					k++;
					l++;
				}
				if(product > new_max)
					new_max = product;
			}
		}
		for(int j = gridSize - 4; j >= 1; j--){
			for(int i = 0; i < gridSize - j - 3; i++){
				int k = j + i;
				int l = i;
				int limit = k + n;
				product = 1;
				while(k < limit){
					product *= integerGrid[k][l];
					k++;
					l++;
				}
				if(product > new_max)
					new_max = product;
			}
		}
		return new_max;
	}
	
	private static long diagonalBottomLeftToTopRightMax(long max, int[][] integerGrid, int n, int gridSize) {
		long product;
		long new_max = max;
		for(int j = gridSize - 4; j >= 0; j--){
			for(int i = gridSize - 1; i > j + 2; i--){
				int k = i;
				int l = j + gridSize - 1 - i;
				int limit = k - n;
				product = 1;
				while(k > limit){
					product *= integerGrid[k][l];
					k--;
					l++;
				}
				if(product > new_max)
					new_max = product;
			}
		}
		for(int i = gridSize - 2; i >= 3; i--){
			for(int j = 0; j <= i - 3; j++){
				int k = i - j;
				int l = j;
				int limit = k - n;
				product = 1;
				while(k > limit){
					product *= integerGrid[k][l];
					k--;
					l++;
				}
				if(product > new_max)
					new_max = product;
			}
		}
		return new_max;
	}

	private static long rightMax(long max, int[][] integerGrid, int n, int gridSize) {
		long product;
		long new_max = max;
		for(int i = 0; i < gridSize; i++){
			for(int j = 0; j < gridSize - n; j++){
				product = 1;
				for(int k = j; k < j + n; k++){
					product *= integerGrid[i][k];
				}
				if(product > new_max)
					new_max = product;
			}
		}
		return new_max;
	}

	private static long downMax(long max, int[][] integerGrid, int n, int gridSize) {
		long product;
		long new_max = max;
		for(int j = 0; j < gridSize; j++){
			for(int i = 0; i < gridSize - n; i++){
				product = 1;
				for(int k = i; k < i + n; k++){
					product *= integerGrid[k][j];
				}
				if(product > new_max)
					new_max = product;
			}
		}
		return new_max;
	}
	
	private static int[][] stringGridToIntegerGrid(String grid, int gridSize) {
		// TODO Auto-generated method stub
		String[] gridSplitted = grid.split(" ");
		int[][] integerGrid = new int[gridSize][gridSize];
		for(int i = 0; i < gridSize; i++)
			for(int j = 0; j < gridSize; j ++)
				integerGrid[i][j] = Integer.parseInt(gridSplitted[i * gridSize + j]);
		return integerGrid;
	}
}