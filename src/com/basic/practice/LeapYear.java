package com.basic.practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
       
		// This the program to check it is a leap year or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check it is leap year or not");

		int year = sc.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
			System.out.println("it is leap year:" + year);
		else {
			System.out.println("it is not leap year :" + year);
		}

	}

}
