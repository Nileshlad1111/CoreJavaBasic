package com.switch_statemnet;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		System.out.println("Enter the week days numbers"); 
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		
		switch (number) {
		case 1:System.out.println("Sunday");
			
			break;
		case 2:System.out.println("Monday");
		
		break;
		
		case 3:System.out.println("Tuesday");
		
		break;
		case 4:System.out.println("Wednesday");
		
		break;

		case 5:System.out.println("Thursday");
		
		break;
		case 6:System.out.println("Friday");
		
		break;
		case 7:System.out.println("	Saturday");
		
		break;
		default:System.out.println("given only 1 to 7 number ");
			break;
		}
	}
}
