package com;

import   com. xworkz. StringPgm. demo;

public class tester
{
public static void main(String []args)
{
	String res= demo.name;
	System.out.println("my String="+res);
	
	char ch=res. charAt(1);
	System.out.println( "charAt(1)="+ ch);
	
	int index=res.indexOf("welcome");
	System.out.println("indexOf="+index);
	int inde=res.indexOf("hi");
	System.out.println(inde);
	
	String res1=demo .name1;
	boolean boo=res.isEmpty();
	System.out.println("is empty="+boo);
	boolean bool=res1.isEmpty();
	System.out.println("is empty="+bool);
	
	int lengthOf=res.length();
	System.out.println("Length of my string="+lengthOf);
	
	
	String stringReplace=res.replace('e','c');
	System.out.println("replacing e to c="+stringReplace);
	
	
	String lower=res.toLowerCase();
	System.out.println(lower);
	
	
	String upper=res.toUpperCase();
	System.out.println(upper);
	
	
	
	
	
	
	
	
}

}
