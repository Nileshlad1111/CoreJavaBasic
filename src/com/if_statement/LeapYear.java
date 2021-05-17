package com.if_statement;

public class LeapYear {

	public static void main(String[] args) {
		//VARIABLE
		int year=2000;
		
		//IF STATEMENT
		if(((year%4==0)&& (year % 100 !=0)) || (year % 400==0)) {
			System.out.println("leap year");
		}else {
			System.out.println("comman year");
						
			
		}
		
	}
}
