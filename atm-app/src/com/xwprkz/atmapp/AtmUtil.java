package com.xwprkz.atmapp;

import com.xwprkz.atmapp.dto.AtmDTO;

public class AtmUtil {
	public static void main(String []args) {
		
		AtmDTO dto=new AtmDTO();
		dto.setAtmId(23);
		dto.setAtmName("pragathi");
		dto.setAtmNumber(03245566775);
		System.out.println(dto.hashCode());
		
		
		AtmDTO dto1=new AtmDTO();
		dto1.setAtmId(22);
		dto1.setAtmName("Karnataka");
		dto1.setAtmNumber(03245566775);
		System.out.println(dto1.hashCode());
		
		AtmDTO dto2=new AtmDTO();
		dto2.setAtmId(24);
		dto2.setAtmName("Sbi");
		dto2.setAtmNumber(03245566775);
		System.out.println(dto2.hashCode());
		
	}
}
