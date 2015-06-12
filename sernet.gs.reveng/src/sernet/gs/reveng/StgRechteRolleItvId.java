package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgRechteRolleItvId generated by hbm2java
 */
public class StgRechteRolleItvId implements java.io.Serializable {

	private Integer rerId;
	private Integer itvId;
	private Integer itvImpId;
	private Byte rechtItv;
	private Byte rechtZob;
	private Byte rechtItvBau;
	private Byte rechtZobBau;
	private Date timestamp;

	public StgRechteRolleItvId() {
	}

	public StgRechteRolleItvId(Integer rerId, Integer itvId, Integer itvImpId,
			Byte rechtItv, Byte rechtZob, Byte rechtItvBau, Byte rechtZobBau,
			Date timestamp) {
		this.rerId = rerId;
		this.itvId = itvId;
		this.itvImpId = itvImpId;
		this.rechtItv = rechtItv;
		this.rechtZob = rechtZob;
		this.rechtItvBau = rechtItvBau;
		this.rechtZobBau = rechtZobBau;
		this.timestamp = timestamp;
	}

	public Integer getRerId() {
		return this.rerId;
	}

	public void setRerId(Integer rerId) {
		this.rerId = rerId;
	}

	public Integer getItvId() {
		return this.itvId;
	}

	public void setItvId(Integer itvId) {
		this.itvId = itvId;
	}

	public Integer getItvImpId() {
		return this.itvImpId;
	}

	public void setItvImpId(Integer itvImpId) {
		this.itvImpId = itvImpId;
	}

	public Byte getRechtItv() {
		return this.rechtItv;
	}

	public void setRechtItv(Byte rechtItv) {
		this.rechtItv = rechtItv;
	}

	public Byte getRechtZob() {
		return this.rechtZob;
	}

	public void setRechtZob(Byte rechtZob) {
		this.rechtZob = rechtZob;
	}

	public Byte getRechtItvBau() {
		return this.rechtItvBau;
	}

	public void setRechtItvBau(Byte rechtItvBau) {
		this.rechtItvBau = rechtItvBau;
	}

	public Byte getRechtZobBau() {
		return this.rechtZobBau;
	}

	public void setRechtZobBau(Byte rechtZobBau) {
		this.rechtZobBau = rechtZobBau;
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
		if (!(other instanceof StgRechteRolleItvId))
			return false;
		StgRechteRolleItvId castOther = (StgRechteRolleItvId) other;

		return ((this.getRerId() == castOther.getRerId()) || (this.getRerId() != null
				&& castOther.getRerId() != null && this.getRerId().equals(
				castOther.getRerId())))
				&& ((this.getItvId() == castOther.getItvId()) || (this
						.getItvId() != null && castOther.getItvId() != null && this
						.getItvId().equals(castOther.getItvId())))
				&& ((this.getItvImpId() == castOther.getItvImpId()) || (this
						.getItvImpId() != null
						&& castOther.getItvImpId() != null && this
						.getItvImpId().equals(castOther.getItvImpId())))
				&& ((this.getRechtItv() == castOther.getRechtItv()) || (this
						.getRechtItv() != null
						&& castOther.getRechtItv() != null && this
						.getRechtItv().equals(castOther.getRechtItv())))
				&& ((this.getRechtZob() == castOther.getRechtZob()) || (this
						.getRechtZob() != null
						&& castOther.getRechtZob() != null && this
						.getRechtZob().equals(castOther.getRechtZob())))
				&& ((this.getRechtItvBau() == castOther.getRechtItvBau()) || (this
						.getRechtItvBau() != null
						&& castOther.getRechtItvBau() != null && this
						.getRechtItvBau().equals(castOther.getRechtItvBau())))
				&& ((this.getRechtZobBau() == castOther.getRechtZobBau()) || (this
						.getRechtZobBau() != null
						&& castOther.getRechtZobBau() != null && this
						.getRechtZobBau().equals(castOther.getRechtZobBau())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRerId() == null ? 0 : this.getRerId().hashCode());
		result = 37 * result
				+ (getItvId() == null ? 0 : this.getItvId().hashCode());
		result = 37 * result
				+ (getItvImpId() == null ? 0 : this.getItvImpId().hashCode());
		result = 37 * result
				+ (getRechtItv() == null ? 0 : this.getRechtItv().hashCode());
		result = 37 * result
				+ (getRechtZob() == null ? 0 : this.getRechtZob().hashCode());
		result = 37
				* result
				+ (getRechtItvBau() == null ? 0 : this.getRechtItvBau()
						.hashCode());
		result = 37
				* result
				+ (getRechtZobBau() == null ? 0 : this.getRechtZobBau()
						.hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		return result;
	}

}
