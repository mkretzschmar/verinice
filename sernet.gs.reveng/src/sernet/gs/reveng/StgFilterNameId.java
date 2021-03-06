package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgFilterNameId generated by hbm2java
 */
public class StgFilterNameId implements java.io.Serializable {

	private Integer fltId;
	private Integer impId;
	private String sucheId;
	private Short uid;
	private String name;
	private Integer nameSame;
	private String nameOrg;
	private Integer searchId;
	private Boolean common;
	private String guid;
	private Date timestamp;
	private Integer fltZobIdFk;
	private Integer fltGruIdFk;
	private Integer fltUstIdFk;
	private Byte fltSbkIdGesamtFk;

	public StgFilterNameId() {
	}

	public StgFilterNameId(Integer fltId, Integer impId, String sucheId,
			Short uid, String name, Integer nameSame, String nameOrg,
			Integer searchId, Boolean common, String guid, Date timestamp,
			Integer fltZobIdFk, Integer fltGruIdFk, Integer fltUstIdFk,
			Byte fltSbkIdGesamtFk) {
		this.fltId = fltId;
		this.impId = impId;
		this.sucheId = sucheId;
		this.uid = uid;
		this.name = name;
		this.nameSame = nameSame;
		this.nameOrg = nameOrg;
		this.searchId = searchId;
		this.common = common;
		this.guid = guid;
		this.timestamp = timestamp;
		this.fltZobIdFk = fltZobIdFk;
		this.fltGruIdFk = fltGruIdFk;
		this.fltUstIdFk = fltUstIdFk;
		this.fltSbkIdGesamtFk = fltSbkIdGesamtFk;
	}

	public Integer getFltId() {
		return this.fltId;
	}

	public void setFltId(Integer fltId) {
		this.fltId = fltId;
	}

	public Integer getImpId() {
		return this.impId;
	}

	public void setImpId(Integer impId) {
		this.impId = impId;
	}

	public String getSucheId() {
		return this.sucheId;
	}

	public void setSucheId(String sucheId) {
		this.sucheId = sucheId;
	}

	public Short getUid() {
		return this.uid;
	}

	public void setUid(Short uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNameSame() {
		return this.nameSame;
	}

	public void setNameSame(Integer nameSame) {
		this.nameSame = nameSame;
	}

	public String getNameOrg() {
		return this.nameOrg;
	}

	public void setNameOrg(String nameOrg) {
		this.nameOrg = nameOrg;
	}

	public Integer getSearchId() {
		return this.searchId;
	}

	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}

	public Boolean getCommon() {
		return this.common;
	}

	public void setCommon(Boolean common) {
		this.common = common;
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

	public Integer getFltZobIdFk() {
		return this.fltZobIdFk;
	}

	public void setFltZobIdFk(Integer fltZobIdFk) {
		this.fltZobIdFk = fltZobIdFk;
	}

	public Integer getFltGruIdFk() {
		return this.fltGruIdFk;
	}

	public void setFltGruIdFk(Integer fltGruIdFk) {
		this.fltGruIdFk = fltGruIdFk;
	}

	public Integer getFltUstIdFk() {
		return this.fltUstIdFk;
	}

	public void setFltUstIdFk(Integer fltUstIdFk) {
		this.fltUstIdFk = fltUstIdFk;
	}

	public Byte getFltSbkIdGesamtFk() {
		return this.fltSbkIdGesamtFk;
	}

	public void setFltSbkIdGesamtFk(Byte fltSbkIdGesamtFk) {
		this.fltSbkIdGesamtFk = fltSbkIdGesamtFk;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgFilterNameId))
			return false;
		StgFilterNameId castOther = (StgFilterNameId) other;

		return ((this.getFltId() == castOther.getFltId()) || (this.getFltId() != null
				&& castOther.getFltId() != null && this.getFltId().equals(
				castOther.getFltId())))
				&& ((this.getImpId() == castOther.getImpId()) || (this
						.getImpId() != null && castOther.getImpId() != null && this
						.getImpId().equals(castOther.getImpId())))
				&& ((this.getSucheId() == castOther.getSucheId()) || (this
						.getSucheId() != null && castOther.getSucheId() != null && this
						.getSucheId().equals(castOther.getSucheId())))
				&& ((this.getUid() == castOther.getUid()) || (this.getUid() != null
						&& castOther.getUid() != null && this.getUid().equals(
						castOther.getUid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getNameSame() == castOther.getNameSame()) || (this
						.getNameSame() != null
						&& castOther.getNameSame() != null && this
						.getNameSame().equals(castOther.getNameSame())))
				&& ((this.getNameOrg() == castOther.getNameOrg()) || (this
						.getNameOrg() != null && castOther.getNameOrg() != null && this
						.getNameOrg().equals(castOther.getNameOrg())))
				&& ((this.getSearchId() == castOther.getSearchId()) || (this
						.getSearchId() != null
						&& castOther.getSearchId() != null && this
						.getSearchId().equals(castOther.getSearchId())))
				&& ((this.getCommon() == castOther.getCommon()) || (this
						.getCommon() != null && castOther.getCommon() != null && this
						.getCommon().equals(castOther.getCommon())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())))
				&& ((this.getFltZobIdFk() == castOther.getFltZobIdFk()) || (this
						.getFltZobIdFk() != null
						&& castOther.getFltZobIdFk() != null && this
						.getFltZobIdFk().equals(castOther.getFltZobIdFk())))
				&& ((this.getFltGruIdFk() == castOther.getFltGruIdFk()) || (this
						.getFltGruIdFk() != null
						&& castOther.getFltGruIdFk() != null && this
						.getFltGruIdFk().equals(castOther.getFltGruIdFk())))
				&& ((this.getFltUstIdFk() == castOther.getFltUstIdFk()) || (this
						.getFltUstIdFk() != null
						&& castOther.getFltUstIdFk() != null && this
						.getFltUstIdFk().equals(castOther.getFltUstIdFk())))
				&& ((this.getFltSbkIdGesamtFk() == castOther
						.getFltSbkIdGesamtFk()) || (this.getFltSbkIdGesamtFk() != null
						&& castOther.getFltSbkIdGesamtFk() != null && this
						.getFltSbkIdGesamtFk().equals(
								castOther.getFltSbkIdGesamtFk())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFltId() == null ? 0 : this.getFltId().hashCode());
		result = 37 * result
				+ (getImpId() == null ? 0 : this.getImpId().hashCode());
		result = 37 * result
				+ (getSucheId() == null ? 0 : this.getSucheId().hashCode());
		result = 37 * result
				+ (getUid() == null ? 0 : this.getUid().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getNameSame() == null ? 0 : this.getNameSame().hashCode());
		result = 37 * result
				+ (getNameOrg() == null ? 0 : this.getNameOrg().hashCode());
		result = 37 * result
				+ (getSearchId() == null ? 0 : this.getSearchId().hashCode());
		result = 37 * result
				+ (getCommon() == null ? 0 : this.getCommon().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		result = 37
				* result
				+ (getFltZobIdFk() == null ? 0 : this.getFltZobIdFk()
						.hashCode());
		result = 37
				* result
				+ (getFltGruIdFk() == null ? 0 : this.getFltGruIdFk()
						.hashCode());
		result = 37
				* result
				+ (getFltUstIdFk() == null ? 0 : this.getFltUstIdFk()
						.hashCode());
		result = 37
				* result
				+ (getFltSbkIdGesamtFk() == null ? 0 : this
						.getFltSbkIdGesamtFk().hashCode());
		return result;
	}

}
