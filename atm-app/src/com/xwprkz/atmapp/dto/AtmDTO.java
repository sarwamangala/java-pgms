package com.xwprkz.atmapp.dto;

public class AtmDTO {
	private int atmId;
	private String atmName;
	private long atmNumber;
	
	public AtmDTO() {
	}
	public void setAtmId(int atmId) {
		this.atmId = atmId;
	}
	public int getAtmId() {
		return atmId;
	}
	public void setAtmName(String atmName) {
		this.atmName = atmName;
	}
	public String getAtmName() {
		return atmName;
	}
	public void setAtmNumber(long atmNumber) {
		this.atmNumber = atmNumber;
	}
	public long getAtmNumber() {
		return atmNumber;
	}
@Override
public String toString() {
	return"AtmDTO-[Id="+atmId+""+"AtmName="+this.atmName+","+"AtmNumber="+this.atmNumber+"]";
}

}