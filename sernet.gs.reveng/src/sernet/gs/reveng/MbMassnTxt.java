package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.sql.Clob;
import java.util.Date;

/**
 * MbMassnTxt generated by hbm2java
 */
public class MbMassnTxt implements java.io.Serializable {

	private MbMassnTxtId id;
	private Date timestamp;
	private MbMassn mbMassn;
	private MSprache MSprache;
	private String name;
	private Clob beschreibung;
	private Clob htmltext;
	private String guid;
	private Byte impNeu;
	private String guidOrg;
	private String abstract_;
	private Date changedOn;
	private String changedBy;

	public MbMassnTxt() {
	}

	public MbMassnTxt(MbMassnTxtId id, MbMassn mbMassn, MSprache MSprache,
			String name, String guid) {
		this.id = id;
		this.mbMassn = mbMassn;
		this.MSprache = MSprache;
		this.name = name;
		this.guid = guid;
	}

	public MbMassnTxt(MbMassnTxtId id, MbMassn mbMassn, MSprache MSprache,
			String name, Clob beschreibung, Clob htmltext, String guid,
			Byte impNeu, String guidOrg, String abstract_, Date changedOn,
			String changedBy) {
		this.id = id;
		this.mbMassn = mbMassn;
		this.MSprache = MSprache;
		this.name = name;
		this.beschreibung = beschreibung;
		this.htmltext = htmltext;
		this.guid = guid;
		this.impNeu = impNeu;
		this.guidOrg = guidOrg;
		this.abstract_ = abstract_;
		this.changedOn = changedOn;
		this.changedBy = changedBy;
	}

	public MbMassnTxtId getId() {
		return this.id;
	}

	public void setId(MbMassnTxtId id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public MbMassn getMbMassn() {
		return this.mbMassn;
	}

	public void setMbMassn(MbMassn mbMassn) {
		this.mbMassn = mbMassn;
	}

	public MSprache getMSprache() {
		return this.MSprache;
	}

	public void setMSprache(MSprache MSprache) {
		this.MSprache = MSprache;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Clob getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(Clob beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Clob getHtmltext() {
		return this.htmltext;
	}

	public void setHtmltext(Clob htmltext) {
		this.htmltext = htmltext;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public Date getChangedOn() {
		return this.changedOn;
	}

	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

}