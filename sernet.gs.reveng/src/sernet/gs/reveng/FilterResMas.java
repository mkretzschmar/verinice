package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * FilterResMas generated by hbm2java
 */
public class FilterResMas implements java.io.Serializable {

	private FilterResMasId id;
	private short spid;

	public FilterResMas() {
	}

	public FilterResMas(FilterResMasId id, short spid) {
		this.id = id;
		this.spid = spid;
	}

	public FilterResMasId getId() {
		return this.id;
	}

	public void setId(FilterResMasId id) {
		this.id = id;
	}

	public short getSpid() {
		return this.spid;
	}

	public void setSpid(short spid) {
		this.spid = spid;
	}

}
