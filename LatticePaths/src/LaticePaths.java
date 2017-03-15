import java.util.HashMap;

public class LaticePaths {
	private static HashMap<Point, Long> memo = new HashMap();
	
	public static long getNumberOfRoutes(int gridSize) {
		memo.put(new Point(1, 1), 2l);
		memo.put(new Point(0, 1), 1l);
		for(int i = 0; i <= gridSize; i ++){
			memo.put(new Point(0, i), 1l);
			memo.put(new Point(i, 0), 1l);
		}
		return computePath(new Point(gridSize, gridSize));
	}

	private static long computePath(Point point) {
		if(memo.containsKey(point))
			return memo.get(point);
		long value = computePath(new Point(point.getX() - 1, point.getY())) + computePath(new Point(point.getX(), point.getY() - 1));
		memo.put(point, value);
		return value;
	}
}
