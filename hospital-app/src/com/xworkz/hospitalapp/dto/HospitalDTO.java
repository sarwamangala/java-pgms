package com.xworkz.hospitalapp.dto;

public class HospitalDTO {
	private int hospitalId;
	private String hospitalName;
	private int totalBedNumber;
	private String address;
	
	public HospitalDTO() {
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public int getHospitald() {
		return hospitalId;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setTotalBedNumber(int totalBedNumber) {
		this.totalBedNumber = totalBedNumber;
	}
public int getTotalBedNumber() {
	return totalBedNumber;
}
	@Override
	public String toString() {
		return "HospitalDTO-[Id="+hospitalId+", "+" HospitalName="+this.hospitalName+","+"TotalBedNumber+"+this.totalBedNumber+","+"_Address="+this.address+"]";
		
	}
@Override
public boolean equals(Object obj) {
	HospitalDTO obj1=(HospitalDTO)obj ;
		
		if(this.hospitalName==obj1.hospitalName)
			return true;
		if(this.hashCode()==obj1.hashCode())
	return false;
		return false;
		
	}
}


