package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.dto.HospitalDTO;
public class HospitalUtil {
	public static void main(String []args) {

	 
				HospitalDTO dto=new HospitalDTO();
				dto.setHospitalId(2);
				dto.setHospitalName("Kanva");
				dto.setTotalBedNumber(500);
				dto.setAddress("Banglore");
				System.out.println(dto);
				
				
				HospitalDTO dto1=new HospitalDTO();
			dto1.setHospitalId(2);
			dto1.setHospitalName("Ragava");
			dto1.setTotalBedNumber(700);
			dto1.setAddress("Baglkot");
			System.out.println(dto1);
			
			HospitalDTO dto2=new HospitalDTO();
		dto2.setHospitalId(4);
		dto2.setHospitalName("basweshwar");
		dto2.setTotalBedNumber(800);
		dto2.setAddress("gulbarga");
		System.out.println(dto2);


		}


}
