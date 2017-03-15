
public class Point {
	private int x;
	private int y;
	
	private static long nbChemins = 0l;
	
	public static long getNbChemins(){
		return nbChemins;
	}
	
	public static void incrementNbChemins(){
		nbChemins++;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	public boolean canGoDown(int gridSize) {
		return this.y < gridSize;
	}

	public void toDown(int gridSize) {
		this.y++;
	}

	public boolean canGoRight(int gridSize) {
		return this.x < gridSize;
	}

	public void toRight(int gridSize) {
		this.x++;
	}

	public Point clone() {
		// TODO Auto-generated method stub
		return new Point(this.x, this.y);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
