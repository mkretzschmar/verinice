package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MbDelGefahr generated by hbm2java
 */
public class MbDelGefahr implements java.io.Serializable {

	private MbDelGefahrId id;
	private Date timestamp;
	private SysImport sysImport;
	private MbGefaehr mbGefaehr;
	private String guid;
	private String geloeschtDurch;
	private Byte impNeu;

	public MbDelGefahr() {
	}

	public MbDelGefahr(MbDelGefahrId id, SysImport sysImport,
			MbGefaehr mbGefaehr, String guid, String geloeschtDurch) {
		this.id = id;
		this.sysImport = sysImport;
		this.mbGefaehr = mbGefaehr;
		this.guid = guid;
		this.geloeschtDurch = geloeschtDurch;
	}

	public MbDelGefahr(MbDelGefahrId id, SysImport sysImport,
			MbGefaehr mbGefaehr, String guid, String geloeschtDurch, Byte impNeu) {
		this.id = id;
		this.sysImport = sysImport;
		this.mbGefaehr = mbGefaehr;
		this.guid = guid;
		this.geloeschtDurch = geloeschtDurch;
		this.impNeu = impNeu;
	}

	public MbDelGefahrId getId() {
		return this.id;
	}

	public void setId(MbDelGefahrId id) {
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

	public MbGefaehr getMbGefaehr() {
		return this.mbGefaehr;
	}

	public void setMbGefaehr(MbGefaehr mbGefaehr) {
		this.mbGefaehr = mbGefaehr;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getGeloeschtDurch() {
		return this.geloeschtDurch;
	}

	public void setGeloeschtDurch(String geloeschtDurch) {
		this.geloeschtDurch = geloeschtDurch;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

}
