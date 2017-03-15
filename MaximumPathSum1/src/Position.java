
public class Position {
	int ligne;
	int colonne;
	
	public Position(int ligne, int colonne) {
		super();
		this.ligne = ligne;
		this.colonne = colonne;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + colonne;
		result = prime * result + ligne;
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
		Position other = (Position) obj;
		if (colonne != other.colonne)
			return false;
		if (ligne != other.ligne)
			return false;
		return true;
	}
}
