package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * StgMapSchId generated by hbm2java
 */
public class StgMapSchId implements java.io.Serializable {

	private int altId;
	private int altImpId;
	private int neuId;
	private int neuImpId;
	private boolean inserted;

	public StgMapSchId() {
	}

	public StgMapSchId(int altId, int altImpId, int neuId, int neuImpId,
			boolean inserted) {
		this.altId = altId;
		this.altImpId = altImpId;
		this.neuId = neuId;
		this.neuImpId = neuImpId;
		this.inserted = inserted;
	}

	public int getAltId() {
		return this.altId;
	}

	public void setAltId(int altId) {
		this.altId = altId;
	}

	public int getAltImpId() {
		return this.altImpId;
	}

	public void setAltImpId(int altImpId) {
		this.altImpId = altImpId;
	}

	public int getNeuId() {
		return this.neuId;
	}

	public void setNeuId(int neuId) {
		this.neuId = neuId;
	}

	public int getNeuImpId() {
		return this.neuImpId;
	}

	public void setNeuImpId(int neuImpId) {
		this.neuImpId = neuImpId;
	}

	public boolean isInserted() {
		return this.inserted;
	}

	public void setInserted(boolean inserted) {
		this.inserted = inserted;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMapSchId))
			return false;
		StgMapSchId castOther = (StgMapSchId) other;

		return (this.getAltId() == castOther.getAltId())
				&& (this.getAltImpId() == castOther.getAltImpId())
				&& (this.getNeuId() == castOther.getNeuId())
				&& (this.getNeuImpId() == castOther.getNeuImpId())
				&& (this.isInserted() == castOther.isInserted());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAltId();
		result = 37 * result + this.getAltImpId();
		result = 37 * result + this.getNeuId();
		result = 37 * result + this.getNeuImpId();
		result = 37 * result + (this.isInserted() ? 1 : 0);
		return result;
	}

}
