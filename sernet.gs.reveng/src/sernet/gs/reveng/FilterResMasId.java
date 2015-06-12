package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * FilterResMasId generated by hbm2java
 */
public class FilterResMasId implements java.io.Serializable {

	private int searchId;
	private int masImpId;
	private int masId;
	private int col;

	public FilterResMasId() {
	}

	public FilterResMasId(int searchId, int masImpId, int masId, int col) {
		this.searchId = searchId;
		this.masImpId = masImpId;
		this.masId = masId;
		this.col = col;
	}

	public int getSearchId() {
		return this.searchId;
	}

	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}

	public int getMasImpId() {
		return this.masImpId;
	}

	public void setMasImpId(int masImpId) {
		this.masImpId = masImpId;
	}

	public int getMasId() {
		return this.masId;
	}

	public void setMasId(int masId) {
		this.masId = masId;
	}

	public int getCol() {
		return this.col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FilterResMasId))
			return false;
		FilterResMasId castOther = (FilterResMasId) other;

		return (this.getSearchId() == castOther.getSearchId())
				&& (this.getMasImpId() == castOther.getMasImpId())
				&& (this.getMasId() == castOther.getMasId())
				&& (this.getCol() == castOther.getCol());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSearchId();
		result = 37 * result + this.getMasImpId();
		result = 37 * result + this.getMasId();
		result = 37 * result + this.getCol();
		return result;
	}

}
