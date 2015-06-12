package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * RechteRolleZotId generated by hbm2java
 */
public class RechteRolleZotId implements java.io.Serializable {

	private int rerId;
	private int zotImpId;
	private int zotId;

	public RechteRolleZotId() {
	}

	public RechteRolleZotId(int rerId, int zotImpId, int zotId) {
		this.rerId = rerId;
		this.zotImpId = zotImpId;
		this.zotId = zotId;
	}

	public int getRerId() {
		return this.rerId;
	}

	public void setRerId(int rerId) {
		this.rerId = rerId;
	}

	public int getZotImpId() {
		return this.zotImpId;
	}

	public void setZotImpId(int zotImpId) {
		this.zotImpId = zotImpId;
	}

	public int getZotId() {
		return this.zotId;
	}

	public void setZotId(int zotId) {
		this.zotId = zotId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RechteRolleZotId))
			return false;
		RechteRolleZotId castOther = (RechteRolleZotId) other;

		return (this.getRerId() == castOther.getRerId())
				&& (this.getZotImpId() == castOther.getZotImpId())
				&& (this.getZotId() == castOther.getZotId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRerId();
		result = 37 * result + this.getZotImpId();
		result = 37 * result + this.getZotId();
		return result;
	}

}
