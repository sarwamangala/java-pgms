package com.xworkz.fan;

public class Fan {
	public byte noOfWings;
	public String brandName;
	public String color;
	
	public Fan() {
		System.out.println("Invoking default Fan constrructor");
		noOfWings=noOfWings;
	}
	public Fan(String bName) {
		System.out.println("Invoking single paramFan constrructor");
		brandName=bName;
	}
	public Fan(byte nOfWings, String bName, String col) {
		this(bName);
		System.out.println("Invoking param Fan constrructor");
		color=col;
	}
	@Override
	public String toString() {
		return "NoOfWinngs ("+noOfWings +"  \t  BrandName "+brandName+"/t color"+color+")";
		
	
		
	}

}
