import java.util.HashMap;

public class MaximumPathSum2 {
	static HashMap<Position, Integer> memo = new HashMap();
	public static int maximumTotal(int numberOfRows, int[] triangle) {
		int max = 0;
		memo.put(new Position(0, 0), 0);
		memo.put(new Position(0, 1), 0);
		for(int i = 1; i <= numberOfRows; i ++){
			memo.put(new Position(i, 0), 0);
			memo.put(new Position(i, i + 1), 0);
		}
		for(int i = 1; i <= numberOfRows; i++){
			int pathValue = computePath(numberOfRows, i, triangle);
			if(pathValue > max)
				max = pathValue;
		}
		return max;
	}
	
	private static int computePath(int line, int column, int[] triangle) {
		// TODO Auto-generated method stub
		Position pos = new Position(line, column);
		if(!memo.containsKey(pos))
			memo.put(pos, Math.max(computePath(line - 1, column - 1, triangle), computePath(line - 1, column, triangle)) + triangle[line * (line - 1) / 2 + column - 1]);
		return memo.get(pos);
	}
}