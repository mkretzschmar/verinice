package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * StgMbZosZusatzId generated by hbm2java
 */
public class StgMbZosZusatzId implements java.io.Serializable {

	private Integer zosImpId;
	private Integer zotId;
	private Integer zosId;
	private Integer zosZusId;
	private String name;
	private Integer dtyId;
	private Short prec;
	private Short scale;
	private Short length;
	private Boolean muss;
	private String wertZeichen;
	private BigDecimal wertWaehrung;
	private Date wertDatum;
	private BigDecimal wertDezimal;
	private Integer wertGanzzahl;
	private Integer waeId;
	private Integer waeImpId;
	private String guid;
	private String guidOrg;
	private Byte impNeu;
	private Integer usn;
	private Date erstelltAm;
	private String erstelltDurch;
	private Date geaendertAm;
	private String geaendertDurch;
	private Date geloeschtAm;
	private String geloeschtDurch;

	public StgMbZosZusatzId() {
	}

	public StgMbZosZusatzId(Integer zosImpId, Integer zotId, Integer zosId,
			Integer zosZusId, String name, Integer dtyId, Short prec,
			Short scale, Short length, Boolean muss, String wertZeichen,
			BigDecimal wertWaehrung, Date wertDatum, BigDecimal wertDezimal,
			Integer wertGanzzahl, Integer waeId, Integer waeImpId, String guid,
			String guidOrg, Byte impNeu, Integer usn, Date erstelltAm,
			String erstelltDurch, Date geaendertAm, String geaendertDurch,
			Date geloeschtAm, String geloeschtDurch) {
		this.zosImpId = zosImpId;
		this.zotId = zotId;
		this.zosId = zosId;
		this.zosZusId = zosZusId;
		this.name = name;
		this.dtyId = dtyId;
		this.prec = prec;
		this.scale = scale;
		this.length = length;
		this.muss = muss;
		this.wertZeichen = wertZeichen;
		this.wertWaehrung = wertWaehrung;
		this.wertDatum = wertDatum;
		this.wertDezimal = wertDezimal;
		this.wertGanzzahl = wertGanzzahl;
		this.waeId = waeId;
		this.waeImpId = waeImpId;
		this.guid = guid;
		this.guidOrg = guidOrg;
		this.impNeu = impNeu;
		this.usn = usn;
		this.erstelltAm = erstelltAm;
		this.erstelltDurch = erstelltDurch;
		this.geaendertAm = geaendertAm;
		this.geaendertDurch = geaendertDurch;
		this.geloeschtAm = geloeschtAm;
		this.geloeschtDurch = geloeschtDurch;
	}

	public Integer getZosImpId() {
		return this.zosImpId;
	}

	public void setZosImpId(Integer zosImpId) {
		this.zosImpId = zosImpId;
	}

	public Integer getZotId() {
		return this.zotId;
	}

	public void setZotId(Integer zotId) {
		this.zotId = zotId;
	}

	public Integer getZosId() {
		return this.zosId;
	}

	public void setZosId(Integer zosId) {
		this.zosId = zosId;
	}

	public Integer getZosZusId() {
		return this.zosZusId;
	}

	public void setZosZusId(Integer zosZusId) {
		this.zosZusId = zosZusId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDtyId() {
		return this.dtyId;
	}

	public void setDtyId(Integer dtyId) {
		this.dtyId = dtyId;
	}

	public Short getPrec() {
		return this.prec;
	}

	public void setPrec(Short prec) {
		this.prec = prec;
	}

	public Short getScale() {
		return this.scale;
	}

	public void setScale(Short scale) {
		this.scale = scale;
	}

	public Short getLength() {
		return this.length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	public Boolean getMuss() {
		return this.muss;
	}

	public void setMuss(Boolean muss) {
		this.muss = muss;
	}

	public String getWertZeichen() {
		return this.wertZeichen;
	}

	public void setWertZeichen(String wertZeichen) {
		this.wertZeichen = wertZeichen;
	}

	public BigDecimal getWertWaehrung() {
		return this.wertWaehrung;
	}

	public void setWertWaehrung(BigDecimal wertWaehrung) {
		this.wertWaehrung = wertWaehrung;
	}

	public Date getWertDatum() {
		return this.wertDatum;
	}

	public void setWertDatum(Date wertDatum) {
		this.wertDatum = wertDatum;
	}

	public BigDecimal getWertDezimal() {
		return this.wertDezimal;
	}

	public void setWertDezimal(BigDecimal wertDezimal) {
		this.wertDezimal = wertDezimal;
	}

	public Integer getWertGanzzahl() {
		return this.wertGanzzahl;
	}

	public void setWertGanzzahl(Integer wertGanzzahl) {
		this.wertGanzzahl = wertGanzzahl;
	}

	public Integer getWaeId() {
		return this.waeId;
	}

	public void setWaeId(Integer waeId) {
		this.waeId = waeId;
	}

	public Integer getWaeImpId() {
		return this.waeImpId;
	}

	public void setWaeImpId(Integer waeImpId) {
		this.waeImpId = waeImpId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public Integer getUsn() {
		return this.usn;
	}

	public void setUsn(Integer usn) {
		this.usn = usn;
	}

	public Date getErstelltAm() {
		return this.erstelltAm;
	}

	public void setErstelltAm(Date erstelltAm) {
		this.erstelltAm = erstelltAm;
	}

	public String getErstelltDurch() {
		return this.erstelltDurch;
	}

	public void setErstelltDurch(String erstelltDurch) {
		this.erstelltDurch = erstelltDurch;
	}

	public Date getGeaendertAm() {
		return this.geaendertAm;
	}

	public void setGeaendertAm(Date geaendertAm) {
		this.geaendertAm = geaendertAm;
	}

	public String getGeaendertDurch() {
		return this.geaendertDurch;
	}

	public void setGeaendertDurch(String geaendertDurch) {
		this.geaendertDurch = geaendertDurch;
	}

	public Date getGeloeschtAm() {
		return this.geloeschtAm;
	}

	public void setGeloeschtAm(Date geloeschtAm) {
		this.geloeschtAm = geloeschtAm;
	}

	public String getGeloeschtDurch() {
		return this.geloeschtDurch;
	}

	public void setGeloeschtDurch(String geloeschtDurch) {
		this.geloeschtDurch = geloeschtDurch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMbZosZusatzId))
			return false;
		StgMbZosZusatzId castOther = (StgMbZosZusatzId) other;

		return ((this.getZosImpId() == castOther.getZosImpId()) || (this
				.getZosImpId() != null && castOther.getZosImpId() != null && this
				.getZosImpId().equals(castOther.getZosImpId())))
				&& ((this.getZotId() == castOther.getZotId()) || (this
						.getZotId() != null && castOther.getZotId() != null && this
						.getZotId().equals(castOther.getZotId())))
				&& ((this.getZosId() == castOther.getZosId()) || (this
						.getZosId() != null && castOther.getZosId() != null && this
						.getZosId().equals(castOther.getZosId())))
				&& ((this.getZosZusId() == castOther.getZosZusId()) || (this
						.getZosZusId() != null
						&& castOther.getZosZusId() != null && this
						.getZosZusId().equals(castOther.getZosZusId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getDtyId() == castOther.getDtyId()) || (this
						.getDtyId() != null && castOther.getDtyId() != null && this
						.getDtyId().equals(castOther.getDtyId())))
				&& ((this.getPrec() == castOther.getPrec()) || (this.getPrec() != null
						&& castOther.getPrec() != null && this.getPrec()
						.equals(castOther.getPrec())))
				&& ((this.getScale() == castOther.getScale()) || (this
						.getScale() != null && castOther.getScale() != null && this
						.getScale().equals(castOther.getScale())))
				&& ((this.getLength() == castOther.getLength()) || (this
						.getLength() != null && castOther.getLength() != null && this
						.getLength().equals(castOther.getLength())))
				&& ((this.getMuss() == castOther.getMuss()) || (this.getMuss() != null
						&& castOther.getMuss() != null && this.getMuss()
						.equals(castOther.getMuss())))
				&& ((this.getWertZeichen() == castOther.getWertZeichen()) || (this
						.getWertZeichen() != null
						&& castOther.getWertZeichen() != null && this
						.getWertZeichen().equals(castOther.getWertZeichen())))
				&& ((this.getWertWaehrung() == castOther.getWertWaehrung()) || (this
						.getWertWaehrung() != null
						&& castOther.getWertWaehrung() != null && this
						.getWertWaehrung().equals(castOther.getWertWaehrung())))
				&& ((this.getWertDatum() == castOther.getWertDatum()) || (this
						.getWertDatum() != null
						&& castOther.getWertDatum() != null && this
						.getWertDatum().equals(castOther.getWertDatum())))
				&& ((this.getWertDezimal() == castOther.getWertDezimal()) || (this
						.getWertDezimal() != null
						&& castOther.getWertDezimal() != null && this
						.getWertDezimal().equals(castOther.getWertDezimal())))
				&& ((this.getWertGanzzahl() == castOther.getWertGanzzahl()) || (this
						.getWertGanzzahl() != null
						&& castOther.getWertGanzzahl() != null && this
						.getWertGanzzahl().equals(castOther.getWertGanzzahl())))
				&& ((this.getWaeId() == castOther.getWaeId()) || (this
						.getWaeId() != null && castOther.getWaeId() != null && this
						.getWaeId().equals(castOther.getWaeId())))
				&& ((this.getWaeImpId() == castOther.getWaeImpId()) || (this
						.getWaeImpId() != null
						&& castOther.getWaeImpId() != null && this
						.getWaeImpId().equals(castOther.getWaeImpId())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())))
				&& ((this.getImpNeu() == castOther.getImpNeu()) || (this
						.getImpNeu() != null && castOther.getImpNeu() != null && this
						.getImpNeu().equals(castOther.getImpNeu())))
				&& ((this.getUsn() == castOther.getUsn()) || (this.getUsn() != null
						&& castOther.getUsn() != null && this.getUsn().equals(
						castOther.getUsn())))
				&& ((this.getErstelltAm() == castOther.getErstelltAm()) || (this
						.getErstelltAm() != null
						&& castOther.getErstelltAm() != null && this
						.getErstelltAm().equals(castOther.getErstelltAm())))
				&& ((this.getErstelltDurch() == castOther.getErstelltDurch()) || (this
						.getErstelltDurch() != null
						&& castOther.getErstelltDurch() != null && this
						.getErstelltDurch()
						.equals(castOther.getErstelltDurch())))
				&& ((this.getGeaendertAm() == castOther.getGeaendertAm()) || (this
						.getGeaendertAm() != null
						&& castOther.getGeaendertAm() != null && this
						.getGeaendertAm().equals(castOther.getGeaendertAm())))
				&& ((this.getGeaendertDurch() == castOther.getGeaendertDurch()) || (this
						.getGeaendertDurch() != null
						&& castOther.getGeaendertDurch() != null && this
						.getGeaendertDurch().equals(
								castOther.getGeaendertDurch())))
				&& ((this.getGeloeschtAm() == castOther.getGeloeschtAm()) || (this
						.getGeloeschtAm() != null
						&& castOther.getGeloeschtAm() != null && this
						.getGeloeschtAm().equals(castOther.getGeloeschtAm())))
				&& ((this.getGeloeschtDurch() == castOther.getGeloeschtDurch()) || (this
						.getGeloeschtDurch() != null
						&& castOther.getGeloeschtDurch() != null && this
						.getGeloeschtDurch().equals(
								castOther.getGeloeschtDurch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getZosImpId() == null ? 0 : this.getZosImpId().hashCode());
		result = 37 * result
				+ (getZotId() == null ? 0 : this.getZotId().hashCode());
		result = 37 * result
				+ (getZosId() == null ? 0 : this.getZosId().hashCode());
		result = 37 * result
				+ (getZosZusId() == null ? 0 : this.getZosZusId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getDtyId() == null ? 0 : this.getDtyId().hashCode());
		result = 37 * result
				+ (getPrec() == null ? 0 : this.getPrec().hashCode());
		result = 37 * result
				+ (getScale() == null ? 0 : this.getScale().hashCode());
		result = 37 * result
				+ (getLength() == null ? 0 : this.getLength().hashCode());
		result = 37 * result
				+ (getMuss() == null ? 0 : this.getMuss().hashCode());
		result = 37
				* result
				+ (getWertZeichen() == null ? 0 : this.getWertZeichen()
						.hashCode());
		result = 37
				* result
				+ (getWertWaehrung() == null ? 0 : this.getWertWaehrung()
						.hashCode());
		result = 37 * result
				+ (getWertDatum() == null ? 0 : this.getWertDatum().hashCode());
		result = 37
				* result
				+ (getWertDezimal() == null ? 0 : this.getWertDezimal()
						.hashCode());
		result = 37
				* result
				+ (getWertGanzzahl() == null ? 0 : this.getWertGanzzahl()
						.hashCode());
		result = 37 * result
				+ (getWaeId() == null ? 0 : this.getWaeId().hashCode());
		result = 37 * result
				+ (getWaeImpId() == null ? 0 : this.getWaeImpId().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		result = 37 * result
				+ (getImpNeu() == null ? 0 : this.getImpNeu().hashCode());
		result = 37 * result
				+ (getUsn() == null ? 0 : this.getUsn().hashCode());
		result = 37
				* result
				+ (getErstelltAm() == null ? 0 : this.getErstelltAm()
						.hashCode());
		result = 37
				* result
				+ (getErstelltDurch() == null ? 0 : this.getErstelltDurch()
						.hashCode());
		result = 37
				* result
				+ (getGeaendertAm() == null ? 0 : this.getGeaendertAm()
						.hashCode());
		result = 37
				* result
				+ (getGeaendertDurch() == null ? 0 : this.getGeaendertDurch()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtAm() == null ? 0 : this.getGeloeschtAm()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtDurch() == null ? 0 : this.getGeloeschtDurch()
						.hashCode());
		return result;
	}

}
