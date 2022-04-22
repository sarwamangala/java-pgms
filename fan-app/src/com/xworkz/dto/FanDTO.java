package com.xworkz.dto;
public class FanDTO {
	public static void main(String []args) {

FanDTO dto=new FanDTO();
dto.noOfWings(4);
dto.brandName("usha");
dto.color("white");
System.out.println(dto);

FanDTO dto1=new FanDTO();
dto1.noOfWings(4);
dto1.brandName("orbit");
dto1.color("brown");
System.out.println(dto1);

FanDTO dto2=new FanDTO();
dto2.noOfWings(4);
dto2.brandName("oreient");
dto2.color("black");
System.out.println(dto2);
}
}