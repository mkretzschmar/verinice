package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * TmpZosSelId generated by hbm2java
 */
public class TmpZosSelId implements java.io.Serializable {

	private short spid;
	private int zosImpId;
	private int zotId;
	private int zosId;

	public TmpZosSelId() {
	}

	public TmpZosSelId(short spid, int zosImpId, int zotId, int zosId) {
		this.spid = spid;
		this.zosImpId = zosImpId;
		this.zotId = zotId;
		this.zosId = zosId;
	}

	public short getSpid() {
		return this.spid;
	}

	public void setSpid(short spid) {
		this.spid = spid;
	}

	public int getZosImpId() {
		return this.zosImpId;
	}

	public void setZosImpId(int zosImpId) {
		this.zosImpId = zosImpId;
	}

	public int getZotId() {
		return this.zotId;
	}

	public void setZotId(int zotId) {
		this.zotId = zotId;
	}

	public int getZosId() {
		return this.zosId;
	}

	public void setZosId(int zosId) {
		this.zosId = zosId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpZosSelId))
			return false;
		TmpZosSelId castOther = (TmpZosSelId) other;

		return (this.getSpid() == castOther.getSpid())
				&& (this.getZosImpId() == castOther.getZosImpId())
				&& (this.getZotId() == castOther.getZotId())
				&& (this.getZosId() == castOther.getZosId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSpid();
		result = 37 * result + this.getZosImpId();
		result = 37 * result + this.getZotId();
		result = 37 * result + this.getZosId();
		return result;
	}

}
