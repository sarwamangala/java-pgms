package com.xwork.courtcase;

import com.xwork.courtcase.dto.CourtCaseDTO;

public class CourtCaseUtil {
	public static void main(String[]args) {
		
		CourtCaseDTO dto=new CourtCaseDTO();
		dto.setCaseId(2);
		dto.setCaseNumber(20);
		dto.setCaseType("Criminal");
		dto.setTown("Banglore");
		System.out.println(dto);
		
		CourtCaseDTO dto1=new CourtCaseDTO();
		dto1.setCaseId(3);
		dto1.setCaseNumber(30);
		dto1.setCaseType("Crivil");
		dto1.setTown("Mysore");
		System.out.println(dto1);
		
		CourtCaseDTO dto2=new CourtCaseDTO();
		dto2.setCaseId(4);
		dto2.setCaseNumber(40);
		dto2.setCaseType("Familyl");
		dto2.setTown("gulbarga");
		System.out.println(dto2);
		
		
		
		
	}

}
