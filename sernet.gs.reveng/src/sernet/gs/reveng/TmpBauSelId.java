package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * TmpBauSelId generated by hbm2java
 */
public class TmpBauSelId implements java.io.Serializable {

	private short spid;
	private int bauImpId;
	private int bauId;

	public TmpBauSelId() {
	}

	public TmpBauSelId(short spid, int bauImpId, int bauId) {
		this.spid = spid;
		this.bauImpId = bauImpId;
		this.bauId = bauId;
	}

	public short getSpid() {
		return this.spid;
	}

	public void setSpid(short spid) {
		this.spid = spid;
	}

	public int getBauImpId() {
		return this.bauImpId;
	}

	public void setBauImpId(int bauImpId) {
		this.bauImpId = bauImpId;
	}

	public int getBauId() {
		return this.bauId;
	}

	public void setBauId(int bauId) {
		this.bauId = bauId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpBauSelId))
			return false;
		TmpBauSelId castOther = (TmpBauSelId) other;

		return (this.getSpid() == castOther.getSpid())
				&& (this.getBauImpId() == castOther.getBauImpId())
				&& (this.getBauId() == castOther.getBauId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSpid();
		result = 37 * result + this.getBauImpId();
		result = 37 * result + this.getBauId();
		return result;
	}

}
