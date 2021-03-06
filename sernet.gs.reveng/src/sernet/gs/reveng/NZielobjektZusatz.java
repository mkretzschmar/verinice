package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * NZielobjektZusatz generated by hbm2java
 */
public class NZielobjektZusatz implements java.io.Serializable {

	private NZielobjektZusatzId id;
	private Date timestamp;
	private NZielobjekt NZielobjekt;
	private MbWaehrungen mbWaehrungen;
	private String name;
	private String nameOrg;
	private Integer nameSame;
	private int dtyId;
	private Short prec;
	private Short scale;
	private Short length;
	private String wertZeichen;
	private BigDecimal wertWaehrung;
	private Date wertDatum;
	private BigDecimal wertDezimal;
	private Integer wertGanzzahl;
	private Byte impNeu;
	private int usn;
	private String guid;
	private String guidOrg;
	private Date loeschDatum;
	private Integer altZusId;
	private String erfasstDurch;
	private String geloeschtDurch;
	private Date changedOn;
	private String changedBy;
	private Integer altZosZusId;

	public NZielobjektZusatz() {
	}

	public NZielobjektZusatz(NZielobjektZusatzId id, NZielobjekt NZielobjekt,
			String name, int dtyId, int usn, String guid) {
		this.id = id;
		this.NZielobjekt = NZielobjekt;
		this.name = name;
		this.dtyId = dtyId;
		this.usn = usn;
		this.guid = guid;
	}

	public NZielobjektZusatz(NZielobjektZusatzId id, NZielobjekt NZielobjekt,
			MbWaehrungen mbWaehrungen, String name, String nameOrg,
			Integer nameSame, int dtyId, Short prec, Short scale, Short length,
			String wertZeichen, BigDecimal wertWaehrung, Date wertDatum,
			BigDecimal wertDezimal, Integer wertGanzzahl, Byte impNeu, int usn,
			String guid, String guidOrg, Date loeschDatum, Integer altZusId,
			String erfasstDurch, String geloeschtDurch, Date changedOn,
			String changedBy, Integer altZosZusId) {
		this.id = id;
		this.NZielobjekt = NZielobjekt;
		this.mbWaehrungen = mbWaehrungen;
		this.name = name;
		this.nameOrg = nameOrg;
		this.nameSame = nameSame;
		this.dtyId = dtyId;
		this.prec = prec;
		this.scale = scale;
		this.length = length;
		this.wertZeichen = wertZeichen;
		this.wertWaehrung = wertWaehrung;
		this.wertDatum = wertDatum;
		this.wertDezimal = wertDezimal;
		this.wertGanzzahl = wertGanzzahl;
		this.impNeu = impNeu;
		this.usn = usn;
		this.guid = guid;
		this.guidOrg = guidOrg;
		this.loeschDatum = loeschDatum;
		this.altZusId = altZusId;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtDurch = geloeschtDurch;
		this.changedOn = changedOn;
		this.changedBy = changedBy;
		this.altZosZusId = altZosZusId;
	}

	public NZielobjektZusatzId getId() {
		return this.id;
	}

	public void setId(NZielobjektZusatzId id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public NZielobjekt getNZielobjekt() {
		return this.NZielobjekt;
	}

	public void setNZielobjekt(NZielobjekt NZielobjekt) {
		this.NZielobjekt = NZielobjekt;
	}

	public MbWaehrungen getMbWaehrungen() {
		return this.mbWaehrungen;
	}

	public void setMbWaehrungen(MbWaehrungen mbWaehrungen) {
		this.mbWaehrungen = mbWaehrungen;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOrg() {
		return this.nameOrg;
	}

	public void setNameOrg(String nameOrg) {
		this.nameOrg = nameOrg;
	}

	public Integer getNameSame() {
		return this.nameSame;
	}

	public void setNameSame(Integer nameSame) {
		this.nameSame = nameSame;
	}

	public int getDtyId() {
		return this.dtyId;
	}

	public void setDtyId(int dtyId) {
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

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public int getUsn() {
		return this.usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
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

	public Date getLoeschDatum() {
		return this.loeschDatum;
	}

	public void setLoeschDatum(Date loeschDatum) {
		this.loeschDatum = loeschDatum;
	}

	public Integer getAltZusId() {
		return this.altZusId;
	}

	public void setAltZusId(Integer altZusId) {
		this.altZusId = altZusId;
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

	public Integer getAltZosZusId() {
		return this.altZosZusId;
	}

	public void setAltZosZusId(Integer altZosZusId) {
		this.altZosZusId = altZosZusId;
	}

}
