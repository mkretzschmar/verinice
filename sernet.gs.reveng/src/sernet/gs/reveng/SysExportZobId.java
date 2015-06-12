package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * SysExportZobId generated by hbm2java
 */
public class SysExportZobId implements java.io.Serializable {

	private int expId;
	private int zobImpId;
	private int zobId;

	public SysExportZobId() {
	}

	public SysExportZobId(int expId, int zobImpId, int zobId) {
		this.expId = expId;
		this.zobImpId = zobImpId;
		this.zobId = zobId;
	}

	public int getExpId() {
		return this.expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
	}

	public int getZobImpId() {
		return this.zobImpId;
	}

	public void setZobImpId(int zobImpId) {
		this.zobImpId = zobImpId;
	}

	public int getZobId() {
		return this.zobId;
	}

	public void setZobId(int zobId) {
		this.zobId = zobId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SysExportZobId))
			return false;
		SysExportZobId castOther = (SysExportZobId) other;

		return (this.getExpId() == castOther.getExpId())
				&& (this.getZobImpId() == castOther.getZobImpId())
				&& (this.getZobId() == castOther.getZobId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getExpId();
		result = 37 * result + this.getZobImpId();
		result = 37 * result + this.getZobId();
		return result;
	}

}
