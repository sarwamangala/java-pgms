package com.xwork.courtcase.dto;

public class CourtCaseDTO {
	private int caseId;
	private int caseNumber;
	private String caseType;
	private String town;
	
	public CourtCaseDTO() {
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	public int getCaseId() {
		return caseId;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getCaseType() {
		return caseType;
	}
public void setTown(String town) {
	this.town = town;
}
public String getTown() {
	return town;
}
	

}
