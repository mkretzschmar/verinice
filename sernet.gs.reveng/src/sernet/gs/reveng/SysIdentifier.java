package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * SysIdentifier generated by hbm2java
 */
public class SysIdentifier implements java.io.Serializable {

	private SysIdentifierId id;
	private Date timestamp;
	private SysImport sysImport;
	private int ideCurrentId;
	private String guid;

	public SysIdentifier() {
	}

	public SysIdentifier(SysIdentifierId id, SysImport sysImport,
			int ideCurrentId) {
		this.id = id;
		this.sysImport = sysImport;
		this.ideCurrentId = ideCurrentId;
	}

	public SysIdentifier(SysIdentifierId id, SysImport sysImport,
			int ideCurrentId, String guid) {
		this.id = id;
		this.sysImport = sysImport;
		this.ideCurrentId = ideCurrentId;
		this.guid = guid;
	}

	public SysIdentifierId getId() {
		return this.id;
	}

	public void setId(SysIdentifierId id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public SysImport getSysImport() {
		return this.sysImport;
	}

	public void setSysImport(SysImport sysImport) {
		this.sysImport = sysImport;
	}

	public int getIdeCurrentId() {
		return this.ideCurrentId;
	}

	public void setIdeCurrentId(int ideCurrentId) {
		this.ideCurrentId = ideCurrentId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

}
