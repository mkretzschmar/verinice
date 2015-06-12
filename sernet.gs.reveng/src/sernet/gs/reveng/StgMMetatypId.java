package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMMetatypId generated by hbm2java
 */
public class StgMMetatypId implements java.io.Serializable {

	private Byte mtyId;
	private String guid;
	private Date timestamp;

	public StgMMetatypId() {
	}

	public StgMMetatypId(Byte mtyId, String guid, Date timestamp) {
		this.mtyId = mtyId;
		this.guid = guid;
		this.timestamp = timestamp;
	}

	public Byte getMtyId() {
		return this.mtyId;
	}

	public void setMtyId(Byte mtyId) {
		this.mtyId = mtyId;
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
		if (!(other instanceof StgMMetatypId))
			return false;
		StgMMetatypId castOther = (StgMMetatypId) other;

		return ((this.getMtyId() == castOther.getMtyId()) || (this.getMtyId() != null
				&& castOther.getMtyId() != null && this.getMtyId().equals(
				castOther.getMtyId())))
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
				+ (getMtyId() == null ? 0 : this.getMtyId().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		return result;
	}

}
