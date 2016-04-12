package com.acadgild.session.two;

import java.util.Scanner;

public class NoOfDaysInMonth {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter month:"); 
		int month = input.nextInt(); 
		String monthName = null;
		System.out.print("Enter year:"); 
		int year = input.nextInt();  
		int daysNum = 0;  

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0); 
		switch (month){ 
		case 1: 
			daysNum = 31; 
			monthName = "January";
			break; 
		case 2: 
			monthName = "February";
			if (isLeapYear) 
				daysNum = 29; 
			else 
				daysNum = 28; 
				break; 
		case 3: 
			daysNum = 31; 
			monthName = "March";
			break; 
		case 4: 
			daysNum = 30; 
			monthName = "April";
			break; 
		case 5: 
			daysNum = 31;
			monthName = "May";
			break; 
		case 6: 
			daysNum = 30; 
			monthName = "June";
			break; 
		case 7: 
			daysNum = 31; 
			monthName = "July";
			break; 
		case 8: 
			daysNum = 31; 
			monthName = "August";
			break; 
		case 9: 
			daysNum = 30; 
			monthName = "September";
			break; 
		case 10: 
			daysNum = 31; 
			monthName = "October";
			break; 
		case 11: 
			daysNum = 30; 
			monthName = "November";
			break; 
		case 12: 
			daysNum = 31; 
			monthName = "December";
			break; 
		default:
			System.out.println("Please enter valid month (1 to 12) or year" );
			break;
		
		} 
		
		System.out.println("There are " +daysNum+ " days in month of " + monthName +" of year " +year ) ;
		
		}
			
	}


