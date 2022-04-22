package com.xworkz.apartment.dto;

import java.security.PublicKey;

public class ApartmentDTO {
	
	
	private int apartmentNo;
	private String apartmentId;
	private int  apartmentNoOfFlats;
	private double  apartmentPrice;
	
	
	public ApartmentDTO() {
		}


	public ApartmentDTO(int apartmentNo, String apartmentId, int apartmentNoOfFlats, double apartmentPrice) {
		super();
		this.apartmentNo = apartmentNo;
	this.	apartmentId = apartmentId;
	this.	apartmentNoOfFlats = apartmentNoOfFlats;
	this.	apartmentPrice = apartmentPrice;
	}


	public int getApartmentNo() {
		return apartmentNo;
	}


	public void setApartmentNo(int apartmentNo) {
		this.apartmentNo = apartmentNo;
	}


	public String getApartmentId() {
		return apartmentId;
	}


	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}


	public int getApartmentNoOfFlats() {
		return apartmentNoOfFlats;
	}


	public void setApartmentNoOfFlats(int apartmentNoOfFlats) {
		this.apartmentNoOfFlats = apartmentNoOfFlats;
	}


	public double getApartmentPrice() {
		return apartmentPrice;
	}


	public void setApartmentPrice(double apartmentPrice) {
		this.apartmentPrice = apartmentPrice;
	}
}


