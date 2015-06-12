package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMYesnoId generated by hbm2java
 */
public class StgMYesnoId implements java.io.Serializable {

	private Byte yesId;
	private String guid;
	private Date timestamp;

	public StgMYesnoId() {
	}

	public StgMYesnoId(Byte yesId, String guid, Date timestamp) {
		this.yesId = yesId;
		this.guid = guid;
		this.timestamp = timestamp;
	}

	public Byte getYesId() {
		return this.yesId;
	}

	public void setYesId(Byte yesId) {
		this.yesId = yesId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMYesnoId))
			return false;
		StgMYesnoId castOther = (StgMYesnoId) other;

		return ((this.getYesId() == castOther.getYesId()) || (this.getYesId() != null
				&& castOther.getYesId() != null && this.getYesId().equals(
				castOther.getYesId())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getYesId() == null ? 0 : this.getYesId().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		return result;
	}

}
