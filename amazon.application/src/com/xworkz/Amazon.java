package com.xworkz;

public class Amazon {
public String brand;
public String company;
public String color;
public String  type;
public long totalAssets;
public int founded;
public boolean good;

public Amazon(String bran , String comp,String col,boolean gd)
{
	System.out.println("invoking amazon constructor");
	brand=bran;
	company=comp;
	color=col;
	good=gd;
}
public void defence() {
	System.out.println("good company");
	System.out.println( company+"\t"+color);
}
public void famous() {
	System.out.println(" good clothes");
	
	
		
	}
	
	
}
}
