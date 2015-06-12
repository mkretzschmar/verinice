package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * BrBerichtVorlageId generated by hbm2java
 */
public class BrBerichtVorlageId implements java.io.Serializable {

	private int repId;
	private short sprId;
	private int styId;

	public BrBerichtVorlageId() {
	}

	public BrBerichtVorlageId(int repId, short sprId, int styId) {
		this.repId = repId;
		this.sprId = sprId;
		this.styId = styId;
	}

	public int getRepId() {
		return this.repId;
	}

	public void setRepId(int repId) {
		this.repId = repId;
	}

	public short getSprId() {
		return this.sprId;
	}

	public void setSprId(short sprId) {
		this.sprId = sprId;
	}

	public int getStyId() {
		return this.styId;
	}

	public void setStyId(int styId) {
		this.styId = styId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BrBerichtVorlageId))
			return false;
		BrBerichtVorlageId castOther = (BrBerichtVorlageId) other;

		return (this.getRepId() == castOther.getRepId())
				&& (this.getSprId() == castOther.getSprId())
				&& (this.getStyId() == castOther.getStyId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRepId();
		result = 37 * result + this.getSprId();
		result = 37 * result + this.getStyId();
		return result;
	}

}
