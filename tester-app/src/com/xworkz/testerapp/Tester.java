package com.xworkz.testerapp;

public class Tester {
	public static void main(String [] args) {
		String scentence="helo";
		System.out.println(scentence);
		int i=10;
		System.out.println(i=toString());
Integer i1=i; //auto-boxing
System.out.println(i1.toString());
System.out.println(i1.hashCode());
short ty=56;
Short y1=ty;
Number number=new Integer(12);
System.out.println(number);
Number number1=new Long(12);
		
		//String to byte
		String tea="15";
		byte teaRs=Byte.parseByte(tea);
		System.out.println("String to byte="+teaRs);
	
		
		//String to short
		String total="143";
		Short total1=Short.parseShort(total);
		System.out.println("string to short="+total1);

	//string to int
		String marks="488";
		int marks1=Integer.parseInt(marks);
		System.out.println("string to long"+marks1);
		
		//string to long
		String contactNo="20393094400";
		long contact=Long.parseLong(contactNo);
		System.out.println("string to long"+contact);
		
		//string to float
		String percentage="95.08";
		float per=Float.parseFloat(percentage);
		System.out.println("string to float"+per);
		
	
	//	String to double
		String laptopPrice="84884.33";
		double lapPrice=Double.parseDouble(laptopPrice);
		System.out.println("string to double"+lapPrice);
		
		//String to boolean
		String isGgHaveGF="true";
		boolean gGf=Boolean.parseBoolean(isGgHaveGF);
		System.out.println("string to boolean type"+"is ganeshhaving gf="+gGf);
		
		
		
	}
}
