package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * DtsPackageTxtId generated by hbm2java
 */
public class DtsPackageTxtId implements java.io.Serializable {

	private String dtsId;
	private short sprId;

	public DtsPackageTxtId() {
	}

	public DtsPackageTxtId(String dtsId, short sprId) {
		this.dtsId = dtsId;
		this.sprId = sprId;
	}

	public String getDtsId() {
		return this.dtsId;
	}

	public void setDtsId(String dtsId) {
		this.dtsId = dtsId;
	}

	public short getSprId() {
		return this.sprId;
	}

	public void setSprId(short sprId) {
		this.sprId = sprId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DtsPackageTxtId))
			return false;
		DtsPackageTxtId castOther = (DtsPackageTxtId) other;

		return ((this.getDtsId() == castOther.getDtsId()) || (this.getDtsId() != null
				&& castOther.getDtsId() != null && this.getDtsId().equals(
				castOther.getDtsId())))
				&& (this.getSprId() == castOther.getSprId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDtsId() == null ? 0 : this.getDtsId().hashCode());
		result = 37 * result + this.getSprId();
		return result;
	}

}
