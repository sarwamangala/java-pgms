package com.xworks.classday;
import java.util.Scanner;

public class ClassDay {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the nember");
		int day=in.nextInt();
		if (day==1) {
			System.out.println("today is sunday");
		}
		if(day==2) {
			System.out.println("today is monday");
		}
		if(day==3) {
			System.out.println("today is tuesday");
		}
		if(day==4 ){
			System.out.println("today is wednesday");
		}
		if(day==5) {
			System.out.println("today is  thursday");
		}
		if(day==6) {
			System.out.println("today is friday");
		}
		if(day==7) {
			System.out.println("today is saturday");
		} else if (day>7) {
				System.out.println("enter a valid number");
			}
		}

}
