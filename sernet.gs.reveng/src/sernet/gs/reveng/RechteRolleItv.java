package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * RechteRolleItv generated by hbm2java
 */
public class RechteRolleItv implements java.io.Serializable {

	private RechteRolleItvId id;
	private Date timestamp;
	private NZielobjekt NZielobjekt;
	private RechteRolle rechteRolle;
	private Byte rechtItv;
	private Byte rechtZob;
	private Byte rechtItvBau;
	private Byte rechtZobBau;

	public RechteRolleItv() {
	}

	public RechteRolleItv(RechteRolleItvId id, NZielobjekt NZielobjekt,
			RechteRolle rechteRolle) {
		this.id = id;
		this.NZielobjekt = NZielobjekt;
		this.rechteRolle = rechteRolle;
	}

	public RechteRolleItv(RechteRolleItvId id, NZielobjekt NZielobjekt,
			RechteRolle rechteRolle, Byte rechtItv, Byte rechtZob,
			Byte rechtItvBau, Byte rechtZobBau) {
		this.id = id;
		this.NZielobjekt = NZielobjekt;
		this.rechteRolle = rechteRolle;
		this.rechtItv = rechtItv;
		this.rechtZob = rechtZob;
		this.rechtItvBau = rechtItvBau;
		this.rechtZobBau = rechtZobBau;
	}

	public RechteRolleItvId getId() {
		return this.id;
	}

	public void setId(RechteRolleItvId id) {
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

	public RechteRolle getRechteRolle() {
		return this.rechteRolle;
	}

	public void setRechteRolle(RechteRolle rechteRolle) {
		this.rechteRolle = rechteRolle;
	}

	public Byte getRechtItv() {
		return this.rechtItv;
	}

	public void setRechtItv(Byte rechtItv) {
		this.rechtItv = rechtItv;
	}

	public Byte getRechtZob() {
		return this.rechtZob;
	}

	public void setRechtZob(Byte rechtZob) {
		this.rechtZob = rechtZob;
	}

	public Byte getRechtItvBau() {
		return this.rechtItvBau;
	}

	public void setRechtItvBau(Byte rechtItvBau) {
		this.rechtItvBau = rechtItvBau;
	}

	public Byte getRechtZobBau() {
		return this.rechtZobBau;
	}

	public void setRechtZobBau(Byte rechtZobBau) {
		this.rechtZobBau = rechtZobBau;
	}

}
