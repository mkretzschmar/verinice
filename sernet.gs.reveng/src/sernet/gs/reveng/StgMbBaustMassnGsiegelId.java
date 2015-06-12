package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMbBaustMassnGsiegelId generated by hbm2java
 */
public class StgMbBaustMassnGsiegelId implements java.io.Serializable {

	private Integer bauId;
	private Integer bauImpId;
	private Integer masId;
	private Integer masImpId;
	private Short gruId;
	private Integer prio;
	private Boolean opt;
	private Integer reihenfolge;
	private Byte metaNeu;
	private Integer metaVers;
	private Integer obsoletVers;
	private String guid;
	private Date timestamp;
	private Date loeschDatum;
	private String erfasstDurch;
	private String geloeschtDurch;
	private Byte zykId;
	private Byte impNeu;
	private String guidOrg;

	public StgMbBaustMassnGsiegelId() {
	}

	public StgMbBaustMassnGsiegelId(Integer bauId, Integer bauImpId,
			Integer masId, Integer masImpId, Short gruId, Integer prio,
			Boolean opt, Integer reihenfolge, Byte metaNeu, Integer metaVers,
			Integer obsoletVers, String guid, Date timestamp, Date loeschDatum,
			String erfasstDurch, String geloeschtDurch, Byte zykId,
			Byte impNeu, String guidOrg) {
		this.bauId = bauId;
		this.bauImpId = bauImpId;
		this.masId = masId;
		this.masImpId = masImpId;
		this.gruId = gruId;
		this.prio = prio;
		this.opt = opt;
		this.reihenfolge = reihenfolge;
		this.metaNeu = metaNeu;
		this.metaVers = metaVers;
		this.obsoletVers = obsoletVers;
		this.guid = guid;
		this.timestamp = timestamp;
		this.loeschDatum = loeschDatum;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtDurch = geloeschtDurch;
		this.zykId = zykId;
		this.impNeu = impNeu;
		this.guidOrg = guidOrg;
	}

	public Integer getBauId() {
		return this.bauId;
	}

	public void setBauId(Integer bauId) {
		this.bauId = bauId;
	}

	public Integer getBauImpId() {
		return this.bauImpId;
	}

	public void setBauImpId(Integer bauImpId) {
		this.bauImpId = bauImpId;
	}

	public Integer getMasId() {
		return this.masId;
	}

	public void setMasId(Integer masId) {
		this.masId = masId;
	}

	public Integer getMasImpId() {
		return this.masImpId;
	}

	public void setMasImpId(Integer masImpId) {
		this.masImpId = masImpId;
	}

	public Short getGruId() {
		return this.gruId;
	}

	public void setGruId(Short gruId) {
		this.gruId = gruId;
	}

	public Integer getPrio() {
		return this.prio;
	}

	public void setPrio(Integer prio) {
		this.prio = prio;
	}

	public Boolean getOpt() {
		return this.opt;
	}

	public void setOpt(Boolean opt) {
		this.opt = opt;
	}

	public Integer getReihenfolge() {
		return this.reihenfolge;
	}

	public void setReihenfolge(Integer reihenfolge) {
		this.reihenfolge = reihenfolge;
	}

	public Byte getMetaNeu() {
		return this.metaNeu;
	}

	public void setMetaNeu(Byte metaNeu) {
		this.metaNeu = metaNeu;
	}

	public Integer getMetaVers() {
		return this.metaVers;
	}

	public void setMetaVers(Integer metaVers) {
		this.metaVers = metaVers;
	}

	public Integer getObsoletVers() {
		return this.obsoletVers;
	}

	public void setObsoletVers(Integer obsoletVers) {
		this.obsoletVers = obsoletVers;
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

	public Date getLoeschDatum() {
		return this.loeschDatum;
	}

	public void setLoeschDatum(Date loeschDatum) {
		this.loeschDatum = loeschDatum;
	}

	public String getErfasstDurch() {
		return this.erfasstDurch;
	}

	public void setErfasstDurch(String erfasstDurch) {
		this.erfasstDurch = erfasstDurch;
	}

	public String getGeloeschtDurch() {
		return this.geloeschtDurch;
	}

	public void setGeloeschtDurch(String geloeschtDurch) {
		this.geloeschtDurch = geloeschtDurch;
	}

	public Byte getZykId() {
		return this.zykId;
	}

	public void setZykId(Byte zykId) {
		this.zykId = zykId;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMbBaustMassnGsiegelId))
			return false;
		StgMbBaustMassnGsiegelId castOther = (StgMbBaustMassnGsiegelId) other;

		return ((this.getBauId() == castOther.getBauId()) || (this.getBauId() != null
				&& castOther.getBauId() != null && this.getBauId().equals(
				castOther.getBauId())))
				&& ((this.getBauImpId() == castOther.getBauImpId()) || (this
						.getBauImpId() != null
						&& castOther.getBauImpId() != null && this
						.getBauImpId().equals(castOther.getBauImpId())))
				&& ((this.getMasId() == castOther.getMasId()) || (this
						.getMasId() != null && castOther.getMasId() != null && this
						.getMasId().equals(castOther.getMasId())))
				&& ((this.getMasImpId() == castOther.getMasImpId()) || (this
						.getMasImpId() != null
						&& castOther.getMasImpId() != null && this
						.getMasImpId().equals(castOther.getMasImpId())))
				&& ((this.getGruId() == castOther.getGruId()) || (this
						.getGruId() != null && castOther.getGruId() != null && this
						.getGruId().equals(castOther.getGruId())))
				&& ((this.getPrio() == castOther.getPrio()) || (this.getPrio() != null
						&& castOther.getPrio() != null && this.getPrio()
						.equals(castOther.getPrio())))
				&& ((this.getOpt() == castOther.getOpt()) || (this.getOpt() != null
						&& castOther.getOpt() != null && this.getOpt().equals(
						castOther.getOpt())))
				&& ((this.getReihenfolge() == castOther.getReihenfolge()) || (this
						.getReihenfolge() != null
						&& castOther.getReihenfolge() != null && this
						.getReihenfolge().equals(castOther.getReihenfolge())))
				&& ((this.getMetaNeu() == castOther.getMetaNeu()) || (this
						.getMetaNeu() != null && castOther.getMetaNeu() != null && this
						.getMetaNeu().equals(castOther.getMetaNeu())))
				&& ((this.getMetaVers() == castOther.getMetaVers()) || (this
						.getMetaVers() != null
						&& castOther.getMetaVers() != null && this
						.getMetaVers().equals(castOther.getMetaVers())))
				&& ((this.getObsoletVers() == castOther.getObsoletVers()) || (this
						.getObsoletVers() != null
						&& castOther.getObsoletVers() != null && this
						.getObsoletVers().equals(castOther.getObsoletVers())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())))
				&& ((this.getLoeschDatum() == castOther.getLoeschDatum()) || (this
						.getLoeschDatum() != null
						&& castOther.getLoeschDatum() != null && this
						.getLoeschDatum().equals(castOther.getLoeschDatum())))
				&& ((this.getErfasstDurch() == castOther.getErfasstDurch()) || (this
						.getErfasstDurch() != null
						&& castOther.getErfasstDurch() != null && this
						.getErfasstDurch().equals(castOther.getErfasstDurch())))
				&& ((this.getGeloeschtDurch() == castOther.getGeloeschtDurch()) || (this
						.getGeloeschtDurch() != null
						&& castOther.getGeloeschtDurch() != null && this
						.getGeloeschtDurch().equals(
								castOther.getGeloeschtDurch())))
				&& ((this.getZykId() == castOther.getZykId()) || (this
						.getZykId() != null && castOther.getZykId() != null && this
						.getZykId().equals(castOther.getZykId())))
				&& ((this.getImpNeu() == castOther.getImpNeu()) || (this
						.getImpNeu() != null && castOther.getImpNeu() != null && this
						.getImpNeu().equals(castOther.getImpNeu())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBauId() == null ? 0 : this.getBauId().hashCode());
		result = 37 * result
				+ (getBauImpId() == null ? 0 : this.getBauImpId().hashCode());
		result = 37 * result
				+ (getMasId() == null ? 0 : this.getMasId().hashCode());
		result = 37 * result
				+ (getMasImpId() == null ? 0 : this.getMasImpId().hashCode());
		result = 37 * result
				+ (getGruId() == null ? 0 : this.getGruId().hashCode());
		result = 37 * result
				+ (getPrio() == null ? 0 : this.getPrio().hashCode());
		result = 37 * result
				+ (getOpt() == null ? 0 : this.getOpt().hashCode());
		result = 37
				* result
				+ (getReihenfolge() == null ? 0 : this.getReihenfolge()
						.hashCode());
		result = 37 * result
				+ (getMetaNeu() == null ? 0 : this.getMetaNeu().hashCode());
		result = 37 * result
				+ (getMetaVers() == null ? 0 : this.getMetaVers().hashCode());
		result = 37
				* result
				+ (getObsoletVers() == null ? 0 : this.getObsoletVers()
						.hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		result = 37
				* result
				+ (getLoeschDatum() == null ? 0 : this.getLoeschDatum()
						.hashCode());
		result = 37
				* result
				+ (getErfasstDurch() == null ? 0 : this.getErfasstDurch()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtDurch() == null ? 0 : this.getGeloeschtDurch()
						.hashCode());
		result = 37 * result
				+ (getZykId() == null ? 0 : this.getZykId().hashCode());
		result = 37 * result
				+ (getImpNeu() == null ? 0 : this.getImpNeu().hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		return result;
	}

}
