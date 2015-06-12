package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMSchutzbedarfkategId generated by hbm2java
 */
public class StgMSchutzbedarfkategId implements java.io.Serializable {

	private Byte sbkId;
	private String link;
	private Byte metaNeu;
	private Integer metaVers;
	private Integer obsoletVers;
	private Integer notizId;
	private String guid;
	private Date timestamp;

	public StgMSchutzbedarfkategId() {
	}

	public StgMSchutzbedarfkategId(Byte sbkId, String link, Byte metaNeu,
			Integer metaVers, Integer obsoletVers, Integer notizId,
			String guid, Date timestamp) {
		this.sbkId = sbkId;
		this.link = link;
		this.metaNeu = metaNeu;
		this.metaVers = metaVers;
		this.obsoletVers = obsoletVers;
		this.notizId = notizId;
		this.guid = guid;
		this.timestamp = timestamp;
	}

	public Byte getSbkId() {
		return this.sbkId;
	}

	public void setSbkId(Byte sbkId) {
		this.sbkId = sbkId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

	public Integer getNotizId() {
		return this.notizId;
	}

	public void setNotizId(Integer notizId) {
		this.notizId = notizId;
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
		if (!(other instanceof StgMSchutzbedarfkategId))
			return false;
		StgMSchutzbedarfkategId castOther = (StgMSchutzbedarfkategId) other;

		return ((this.getSbkId() == castOther.getSbkId()) || (this.getSbkId() != null
				&& castOther.getSbkId() != null && this.getSbkId().equals(
				castOther.getSbkId())))
				&& ((this.getLink() == castOther.getLink()) || (this.getLink() != null
						&& castOther.getLink() != null && this.getLink()
						.equals(castOther.getLink())))
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
				&& ((this.getNotizId() == castOther.getNotizId()) || (this
						.getNotizId() != null && castOther.getNotizId() != null && this
						.getNotizId().equals(castOther.getNotizId())))
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
				+ (getSbkId() == null ? 0 : this.getSbkId().hashCode());
		result = 37 * result
				+ (getLink() == null ? 0 : this.getLink().hashCode());
		result = 37 * result
				+ (getMetaNeu() == null ? 0 : this.getMetaNeu().hashCode());
		result = 37 * result
				+ (getMetaVers() == null ? 0 : this.getMetaVers().hashCode());
		result = 37
				* result
				+ (getObsoletVers() == null ? 0 : this.getObsoletVers()
						.hashCode());
		result = 37 * result
				+ (getNotizId() == null ? 0 : this.getNotizId().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		return result;
	}

}
